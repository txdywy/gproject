package org.chromium.base;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;

final class C7889f {
    public final String f40515a;
    public final int f40516b = Process.myTid();
    public final long f40517c = C7889f.m37813a();
    public final long f40518d = SystemClock.currentThreadTimeMillis();
    public long f40519e;
    public long f40520f;

    C7889f(String str) {
        this.f40515a = str;
    }

    @SuppressLint({"NewApi"})
    static long m37813a() {
        if (VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
