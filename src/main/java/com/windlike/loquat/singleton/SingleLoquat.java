package com.windlike.loquat.singleton;

public enum SingleLoquat {

    INSTANCE;

    private Loquat loquat;

    SingleLoquat() {
        this.loquat = new Loquat();
    }

    public Loquat getLoquat() {
        return this.loquat;
    }
}
