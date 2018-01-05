package com.google.android.finsky.hygiene;

public final class C3209w {
    public static C3209w f16524a;

    public static synchronized C3209w m16257a() {
        C3209w c3209w;
        synchronized (C3209w.class) {
            if (f16524a == null) {
                f16524a = new C3209w();
            }
            c3209w = f16524a;
        }
        return c3209w;
    }
}
