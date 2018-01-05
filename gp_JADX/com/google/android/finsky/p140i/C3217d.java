package com.google.android.finsky.p140i;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.finsky.aa.C0955b;

final class C3217d implements Runnable {
    public final /* synthetic */ C3216c f16546a;

    C3217d(C3216c c3216c) {
        this.f16546a = c3216c;
    }

    public final void run() {
        this.f16546a.f16542a = false;
        C3216c c3216c = this.f16546a;
        long longValue = ((Long) C0955b.fB.m28964b()).longValue();
        long intValue = (long) ((Integer) C0955b.fC.m28964b()).intValue();
        new Handler(Looper.getMainLooper()).postDelayed(new C3218e(c3216c, SystemClock.elapsedRealtime(), longValue, intValue), intValue);
    }
}
