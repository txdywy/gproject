package com.google.android.libraries.performance.primes.p337d;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.libraries.performance.p328a.p329a.p330a.p331a.C5935b;
import com.google.android.libraries.performance.p328a.p329a.p330a.p331a.C5936c;
import com.google.android.libraries.performance.primes.C5989do;
import com.google.android.libraries.performance.primes.p338e.C5990a;
import com.google.protobuf.nano.C0757i;
import java.util.ArrayList;
import java.util.Random;

public final class C5987a {
    public final ArrayList f29935a;
    public final C5990a f29936b;
    public final double f29937c;
    public final int f29938d;
    public final Random f29939e;

    private C5987a(C5990a c5990a, C5936c c5936c, int i, Random random) {
        this.f29936b = c5990a;
        this.f29935a = new ArrayList();
        this.f29937c = 1.2d;
        this.f29938d = i;
        this.f29939e = random;
        m27810a(c5936c);
    }

    private C5987a(C5990a c5990a, int i) {
        C5936c c5936c = new C5936c();
        c5990a.m27834a("primes.miniheapdump.memorySamples", c5936c);
        if (!(c5936c.f29586b == null || c5936c.f29586b.intValue() == i)) {
            c5936c = new C5936c();
        }
        this(c5990a, c5936c, i, new Random(SystemClock.elapsedRealtime()));
    }

    public C5987a(SharedPreferences sharedPreferences, int i) {
        this(new C5990a(sharedPreferences), i);
    }

    private final void m27810a(C5936c c5936c) {
        for (C5935b c5935b : c5936c.f29585a) {
            this.f29935a.add(c5935b.f29584b);
        }
    }

    public final synchronized void m27811a(int i) {
        if (this.f29935a.size() + 1 > 100) {
            this.f29935a.remove(this.f29939e.nextInt(this.f29935a.size()));
        }
        this.f29935a.add(Integer.valueOf(i));
        C0757i c5936c = new C5936c();
        c5936c.f29586b = Integer.valueOf(this.f29938d);
        c5936c.f29585a = new C5935b[this.f29935a.size()];
        for (int i2 = 0; i2 < this.f29935a.size(); i2++) {
            C5935b c5935b = new C5935b();
            c5935b.f29584b = (Integer) this.f29935a.get(i2);
            c5936c.f29585a[i2] = c5935b;
        }
        if (!this.f29936b.m27835b("primes.miniheapdump.memorySamples", c5936c)) {
            C5989do.m27824a(3, "MhdMemorySampler", "Failed to save mini heap dump memory samples.", new Object[0]);
        }
    }
}
