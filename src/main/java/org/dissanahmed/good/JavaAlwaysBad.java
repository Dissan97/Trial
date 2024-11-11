package org.dissanahmed.good;

public class JavaAlwaysBad {
    private JavaAlwaysBad() {}
    private static final boolean DEBUG = false;
    public static boolean bad() {
        return DEBUG;
    }
}
