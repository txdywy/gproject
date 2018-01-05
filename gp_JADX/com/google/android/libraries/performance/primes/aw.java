package com.google.android.libraries.performance.primes;

import android.animation.TimeAnimator;
import android.animation.TimeAnimator.TimeListener;

final class aw implements TimeListener {
    public final /* synthetic */ int f29684a;
    public final /* synthetic */ int f29685b;
    public final /* synthetic */ av f29686c;

    aw(av avVar, int i, int i2) {
        this.f29686c = avVar;
        this.f29684a = i;
        this.f29685b = i2;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        if (j2 >= ((long) this.f29684a)) {
            av avVar;
            if (j2 > ((long) this.f29685b)) {
                avVar = this.f29686c;
                avVar.f29680b++;
            }
            avVar = this.f29686c;
            avVar.f29679a++;
            avVar = this.f29686c;
            avVar.f29681c += j2;
            this.f29686c.f29682d = Math.max(j2, this.f29686c.f29682d);
        }
    }
}
