package com.google.android.libraries.performance.primes.p339f;

import android.os.SystemClock;
import com.google.android.libraries.p326c.p327a.C5916a;
import java.util.Random;

public final class C5995b {
    public final float f30055a;
    public final Random f30056b;

    public C5995b(float f) {
        this(f, new Random(SystemClock.elapsedRealtime()));
    }

    private C5995b(float f, Random random) {
        boolean z = f > 0.0f && f <= 1.0f;
        C5916a.m27409a(z, (Object) "Sampling rate should be a floating number > 0 and <= 1.");
        this.f30055a = f;
        this.f30056b = random;
    }
}
