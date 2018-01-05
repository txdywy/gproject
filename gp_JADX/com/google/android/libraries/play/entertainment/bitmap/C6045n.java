package com.google.android.libraries.play.entertainment.bitmap;

public final class C6045n {
    public static double m27942a(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    static int m27943b(double d) {
        return 65535 & ((int) Math.floor(65535.0d * d));
    }
}
