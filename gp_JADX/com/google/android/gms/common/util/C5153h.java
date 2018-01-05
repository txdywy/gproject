package com.google.android.gms.common.util;

import android.os.SystemClock;

public final class C5153h implements C5147b {
    public static C5153h f26089a = new C5153h();

    private C5153h() {
    }

    public final long mo4629a() {
        return System.currentTimeMillis();
    }

    public final long mo4630b() {
        return SystemClock.elapsedRealtime();
    }
}
