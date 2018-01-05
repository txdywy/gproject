package com.google.android.finsky.utils;

import java.io.Closeable;
import java.io.IOException;

public final class C4679j {
    public static void m21814a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
