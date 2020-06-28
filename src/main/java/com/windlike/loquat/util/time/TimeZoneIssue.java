package com.windlike.loquat.util.time;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeZoneIssue {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(now);
    }
}
