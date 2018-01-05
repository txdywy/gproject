package com.google.android.play.image;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.play.utils.p354b.C6322j;

public final class by {
    public int f31549a;
    public boolean f31550b;
    public HandlerThread f31551c;
    public Handler f31552d;
    public Runnable f31553e = new bz();

    public by() {
        boolean z = VERSION.SDK_INT >= 11 && Runtime.getRuntime().availableProcessors() > 1 && ((Boolean) C6322j.f31608v.m28964b()).booleanValue();
        this.f31550b = z;
        if (this.f31550b) {
            this.f31551c = new HandlerThread("tentative-gc-runner", 10);
            this.f31551c.start();
            this.f31552d = new Handler(this.f31551c.getLooper());
        }
    }

    public final void m28937a(int i) {
        if (this.f31550b) {
            this.f31549a += i;
            if (i > 81920 && this.f31549a > 524288) {
                this.f31552d.post(this.f31553e);
                this.f31549a = 0;
            }
        }
    }
}
