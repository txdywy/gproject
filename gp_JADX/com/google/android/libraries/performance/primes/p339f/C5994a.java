package com.google.android.libraries.performance.primes.p339f;

import android.os.SystemClock;

public final class C5994a {
    public final Object f30051a = new Object();
    public final int f30052b;
    public int f30053c = 0;
    public long f30054d = 0;

    public C5994a(int i) {
        this.f30052b = i;
    }

    public final boolean m27857a() {
        boolean z = false;
        synchronized (this.f30051a) {
            if (SystemClock.elapsedRealtime() - this.f30054d > 1000) {
            } else if (this.f30053c >= this.f30052b) {
                z = true;
            }
        }
        return z;
    }
}
