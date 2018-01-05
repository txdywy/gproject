package com.google.android.libraries.performance.primes;

import com.google.android.libraries.p326c.p327a.C5916a;
import d.a.a.a.a.a.ab;
import d.a.a.a.a.a.ag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class ar implements as {
    public static final int[] f29671a = new int[]{0, 4, 8, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 150, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    public final int[] f29672b = new int[f29671a.length];
    public int f29673c;
    public int f29674d;
    public int f29675e;
    public int f29676f;

    ar() {
    }

    public final void mo5232a(int i, int i2) {
        C5916a.m27408a(i >= 0);
        this.f29674d++;
        if (i > i2) {
            this.f29673c++;
        }
        int[] iArr = this.f29672b;
        int binarySearch = Arrays.binarySearch(f29671a, i);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        iArr[binarySearch] = iArr[binarySearch] + 1;
        this.f29675e = Math.max(this.f29675e, i);
        this.f29676f += i;
    }

    public final boolean mo5233a() {
        return this.f29674d != 0;
    }

    public final ag mo5234b() {
        if (!mo5233a()) {
            return null;
        }
        ag agVar = new ag();
        agVar.a = Integer.valueOf(this.f29673c);
        agVar.b = Integer.valueOf(this.f29674d);
        agVar.d = Integer.valueOf(this.f29676f);
        agVar.c = Integer.valueOf(this.f29675e);
        int[] iArr = this.f29672b;
        List arrayList = new ArrayList();
        for (int i = 0; i < f29671a.length; i++) {
            if (iArr[i] > 0) {
                boolean z;
                int i2 = i + 1 == f29671a.length ? 1 : 0;
                int i3 = iArr[i];
                int i4 = f29671a[i];
                Integer valueOf = i2 != 0 ? null : Integer.valueOf(f29671a[i + 1] - 1);
                if (i3 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C5916a.m27408a(z);
                ab abVar = new ab();
                abVar.c = Integer.valueOf(i4);
                abVar.d = valueOf;
                abVar.b = Integer.valueOf(i3);
                arrayList.add(abVar);
            }
        }
        agVar.e = (ab[]) arrayList.toArray(new ab[0]);
        return agVar;
    }
}
