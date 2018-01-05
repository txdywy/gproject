package com.google.android.libraries.performance.primes;

import android.os.SystemClock;
import com.google.android.libraries.p326c.p327a.C5916a;

public final class eq {
    public static final eq f30045c = new eq();
    public final long f30046a;
    public long f30047b;

    eq() {
        this(SystemClock.elapsedRealtime());
    }

    private eq(long j) {
        this.f30047b = -1;
        this.f30046a = j;
    }

    eq(long j, long j2) {
        int i;
        this.f30047b = -1;
        if (j2 >= j) {
            i = 1;
        } else {
            i = 0;
        }
        String str = "End time %s is before start time %s.";
        Object[] objArr = new Object[]{Long.valueOf(j2), Long.valueOf(j)};
        if (i == 0) {
            throw new IllegalArgumentException(C5916a.m27407a(str, objArr));
        }
        this.f30046a = j;
        this.f30047b = j2;
    }
}
