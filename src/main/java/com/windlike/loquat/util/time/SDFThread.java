package com.windlike.loquat.util.time;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * 以上代码也有改进空间，
 * SimpleDateFormat的创建过程可以改为延迟加载。
 */
public class SDFThread {

    /**
     * 使用ThreadLocal定义一个全局的SimpleDateFormat
     * 用 ThreadLocal 来实现其实是有点类似于缓存的思路，每个线程都有一个独享的对象，
     * 避免了频繁创建对象，也避免了多线程的竞争。
     */
    private static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };


    /**
     * 定义一个全局的SimpleDateFormat
     */
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 使用ThreadFactoryBuilder定义一个线程池
     */
    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("demo-pool-%d").build();

    private static ExecutorService pool = new ThreadPoolExecutor(5, 200,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

    /**
     * 定义一个CountDownLatch，保证所有子线程执行完之后主线程再执行
     */
    private static CountDownLatch countDownLatch = new CountDownLatch(100);

    public static void main(String[] args) throws InterruptedException {
        //定义一个线程安全的HashSet
        Set<String> dates = Collections.synchronizedSet(new HashSet<String>());
        for (int i = 0; i < 100; i++) {
            //获取当前时间
            Calendar calendar = Calendar.getInstance();
            int finalI = i;
            pool.execute(() -> {
                //时间增加
                calendar.add(Calendar.DATE, finalI);
                //通过simpleDateFormat把时间转换成字符串
                String dateString = simpleDateFormat.format(calendar.getTime());
                // 使用ThreadLocal  ThreadLocal 可以确保每个线程都可以得到单独的一个 SimpleDateFormat 的对象，那么自然也就不存在竞争问题了
                dateString = simpleDateFormatThreadLocal.get().format(calendar.getTime());
                //把字符串放入Set中
                dates.add(dateString);
                //countDown
                countDownLatch.countDown();
            });
        }

        // 使用局部变量，避免线程安全问题
        for (int i = 0; i < 100; i++) {
            //获取当前时间
            Calendar calendar = Calendar.getInstance();
            int finalI = i;
            pool.execute(() -> {
                // SimpleDateFormat声明成局部变量
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //时间增加
                calendar.add(Calendar.DATE, finalI);
                //通过simpleDateFormat把时间转换成字符串
                String dateString = simpleDateFormat.format(calendar.getTime());
                //把字符串放入Set中
                dates.add(dateString);
                //countDown
                countDownLatch.countDown();
            });
        }

        // 对共享变量加同步锁，解决线程安全问题
        for (int i = 0; i < 100; i++) {
            //获取当前时间
            Calendar calendar = Calendar.getInstance();
            int finalI = i;
            pool.execute(() -> {
                //时间增加
                calendar.add(Calendar.DATE, finalI);
                String dateString;
                synchronized (simpleDateFormat) {
                    //通过simpleDateFormat把时间转换成字符串
                    dateString = simpleDateFormat.format(calendar.getTime());
                }
                //把字符串放入Set中
                dates.add(dateString);
                //countDown
                countDownLatch.countDown();
            });
        }
        //阻塞，直到countDown数量为0
        countDownLatch.await();
        //输出去重后的时间个数
        System.out.println(dates.size());
    }
}
