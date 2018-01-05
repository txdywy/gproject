package com.google.android.libraries.performance.primes.p333b.p334a;

import com.google.android.libraries.p326c.p327a.C5916a;

public final class C5957c {
    public int f29706a;
    public int[] f29707b;
    public Object[] f29708c;
    public int f29709d;

    public C5957c() {
        m27665a();
    }

    public final void m27665a() {
        this.f29706a = 0;
        this.f29707b = new int[C5955a.f29694a[this.f29706a]];
        this.f29708c = new Object[C5955a.f29694a[this.f29706a]];
    }

    public final Object m27664a(int i, Object obj) {
        boolean z = false;
        C5916a.m27406a(obj);
        int b = m27662b(i);
        if (this.f29708c[b] != null) {
            return this.f29708c[b];
        }
        this.f29707b[b] = i;
        this.f29709d++;
        this.f29708c[b] = obj;
        if (this.f29709d > this.f29707b.length / 2) {
            if (this.f29706a < C5955a.f29694a.length - 1) {
                int[] iArr = this.f29707b;
                Object[] objArr = this.f29708c;
                this.f29706a++;
                this.f29707b = new int[C5955a.f29694a[this.f29706a]];
                this.f29708c = new Object[C5955a.f29694a[this.f29706a]];
                int i2 = this.f29709d;
                int length = iArr.length;
                this.f29709d = 0;
                for (b = 0; b < length; b++) {
                    if (objArr[b] != null) {
                        m27664a(iArr[b], objArr[b]);
                    }
                }
                if (i2 == this.f29709d) {
                    z = true;
                }
                C5916a.m27410b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return null;
    }

    public final Object m27663a(int i) {
        return this.f29708c[m27662b(i)];
    }

    private final int m27662b(int i) {
        int length = this.f29707b.length;
        int a = (C5955a.m27655a(i) & Integer.MAX_VALUE) % length;
        while (this.f29708c[a] != null && this.f29707b[a] != i) {
            a++;
            if (a >= length) {
                a = 0;
            }
        }
        return a;
    }

    public final C5958d m27666b() {
        return new C5958d(this.f29707b, this.f29708c);
    }
}
