package com.google.android.libraries.performance.primes.p333b.p334a;

import com.google.android.libraries.p326c.p327a.C5916a;
import java.util.Arrays;

public final class C5955a {
    public static final int[] f29694a = new int[]{5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 2147483629};
    public final int f29695b;
    public int f29696c;
    public int[] f29697d;
    public int[] f29698e;
    public int f29699f;

    static int m27655a(int i) {
        return (i << 1) - (i << 8);
    }

    public C5955a() {
        this((byte) 0);
    }

    private C5955a(byte b) {
        this.f29695b = -1;
        m27658a();
    }

    public final void m27658a() {
        this.f29696c = 0;
        this.f29697d = new int[f29694a[this.f29696c]];
        this.f29698e = new int[f29694a[this.f29696c]];
        Arrays.fill(this.f29698e, this.f29695b);
    }

    public final int m27657a(int i, int i2) {
        boolean z = true;
        C5916a.m27409a(i2 != this.f29695b, (Object) "Cannot add emptyValue to map");
        int d = m27656d(i);
        if (this.f29698e[d] != this.f29695b) {
            return this.f29698e[d];
        }
        this.f29697d[d] = i;
        this.f29699f++;
        this.f29698e[d] = i2;
        if (this.f29699f > this.f29697d.length / 2) {
            if (this.f29696c < f29694a.length - 1) {
                int[] iArr = this.f29697d;
                int[] iArr2 = this.f29698e;
                this.f29696c++;
                this.f29697d = new int[f29694a[this.f29696c]];
                this.f29698e = new int[f29694a[this.f29696c]];
                Arrays.fill(this.f29698e, this.f29695b);
                int i3 = this.f29699f;
                int length = iArr.length;
                this.f29699f = 0;
                for (d = 0; d < length; d++) {
                    if (iArr2[d] != this.f29695b) {
                        m27657a(iArr[d], iArr2[d]);
                    }
                }
                if (i3 != this.f29699f) {
                    z = false;
                }
                C5916a.m27410b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return this.f29695b;
    }

    public final int m27659b(int i) {
        return this.f29698e[m27656d(i)];
    }

    private final int m27656d(int i) {
        int length = this.f29697d.length;
        int a = (C5955a.m27655a(i) & Integer.MAX_VALUE) % length;
        while (this.f29698e[a] != this.f29695b && this.f29697d[a] != i) {
            a++;
            if (a >= length) {
                a = 0;
            }
        }
        return a;
    }

    public final boolean m27660c(int i) {
        return m27659b(i) != this.f29695b;
    }
}
