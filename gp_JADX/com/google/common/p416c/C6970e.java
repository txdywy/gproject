package com.google.common.p416c;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class C6970e {
    public static final Logger f34362a = Logger.getLogger(C6970e.class.getName());

    private C6970e() {
    }

    public static void m31821a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            f34362a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
        }
    }
}
