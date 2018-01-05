package com.google.android.libraries.performance.primes;

import android.animation.TimeAnimator;
import android.annotation.TargetApi;
import com.google.android.libraries.p326c.p327a.C5917b;

@TargetApi(16)
final class av {
    public int f29679a;
    public int f29680b;
    public long f29681c;
    public long f29682d;
    public final TimeAnimator f29683e = new TimeAnimator();

    av(int i) {
        this.f29683e.setTimeListener(new aw(this, i - 1, i));
        if (C5917b.m27413a()) {
            this.f29683e.start();
        } else {
            C5917b.m27412a(new ax(this));
        }
    }

    final void m27650a() {
        if (this.f29683e != null) {
            if (C5917b.m27413a()) {
                this.f29683e.end();
            } else {
                C5917b.m27412a(new ay(this));
            }
        }
    }
}
