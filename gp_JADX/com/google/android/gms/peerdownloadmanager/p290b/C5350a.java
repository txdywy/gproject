package com.google.android.gms.peerdownloadmanager.p290b;

import com.google.common.a.m;

public abstract class C5350a {
    public static final C5350a f27865a = new C5351b();
    public static C5350a f27866b = null;
    public static final Object f27867c = new Object();

    public abstract String mo4966b();

    public static C5350a m26079a() {
        C5350a c5350a;
        synchronized (f27867c) {
            if (f27866b == null) {
                f27866b = (C5350a) m.a(f27865a);
            }
            c5350a = f27866b;
        }
        return c5350a;
    }
}
