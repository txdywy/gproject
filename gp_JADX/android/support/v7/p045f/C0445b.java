package android.support.v7.p045f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class C0445b {
    public static final Comparator f2533a = new C0446c();

    public static C0448e m2665a(C0447d c0447d) {
        return C0445b.m2667b(c0447d);
    }

    public static C0448e m2667b(C0447d c0447d) {
        int a = c0447d.mo3283a();
        int b = c0447d.mo3285b();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        arrayList2.add(new C0451h(a, b));
        int abs = (a + b) + Math.abs(a - b);
        int[] iArr = new int[(abs * 2)];
        int[] iArr2 = new int[(abs * 2)];
        List arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0451h c0451h = (C0451h) arrayList2.remove(arrayList2.size() - 1);
            C0452i a2 = C0445b.m2666a(c0447d, c0451h.f2545a, c0451h.f2546b, c0451h.f2547c, c0451h.f2548d, iArr, iArr2, abs);
            if (a2 != null) {
                C0451h c0451h2;
                if (a2.f2551c > 0) {
                    arrayList.add(a2);
                }
                a2.f2549a += c0451h.f2545a;
                a2.f2550b += c0451h.f2547c;
                if (arrayList3.isEmpty()) {
                    c0451h2 = new C0451h();
                } else {
                    c0451h2 = (C0451h) arrayList3.remove(arrayList3.size() - 1);
                }
                c0451h2.f2545a = c0451h.f2545a;
                c0451h2.f2547c = c0451h.f2547c;
                if (a2.f2553e) {
                    c0451h2.f2546b = a2.f2549a;
                    c0451h2.f2548d = a2.f2550b;
                } else if (a2.f2552d) {
                    c0451h2.f2546b = a2.f2549a - 1;
                    c0451h2.f2548d = a2.f2550b;
                } else {
                    c0451h2.f2546b = a2.f2549a;
                    c0451h2.f2548d = a2.f2550b - 1;
                }
                arrayList2.add(c0451h2);
                if (!a2.f2553e) {
                    c0451h.f2545a = a2.f2549a + a2.f2551c;
                    c0451h.f2547c = a2.f2550b + a2.f2551c;
                } else if (a2.f2552d) {
                    c0451h.f2545a = (a2.f2549a + a2.f2551c) + 1;
                    c0451h.f2547c = a2.f2550b + a2.f2551c;
                } else {
                    c0451h.f2545a = a2.f2549a + a2.f2551c;
                    c0451h.f2547c = (a2.f2550b + a2.f2551c) + 1;
                }
                arrayList2.add(c0451h);
            } else {
                arrayList3.add(c0451h);
            }
        }
        Collections.sort(arrayList, f2533a);
        return new C0448e(c0447d, arrayList, iArr, iArr2);
    }

    private static C0452i m2666a(C0447d c0447d, int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i2 - i <= 0 || i4 - i3 <= 0) {
            return null;
        }
        int i8 = i6 - i7;
        int i9 = ((i6 + i7) + 1) / 2;
        Arrays.fill(iArr, (i5 - i9) - 1, (i5 + i9) + 1, 0);
        Arrays.fill(iArr2, ((i5 - i9) - 1) + i8, ((i5 + i9) + 1) + i8, i6);
        Object obj = i8 % 2 != 0 ? 1 : null;
        int i10 = 0;
        while (i10 <= i9) {
            int i11;
            int i12 = -i10;
            while (i12 <= i10) {
                boolean z;
                if (i12 == (-i10) || (i12 != i10 && iArr[(i5 + i12) - 1] < iArr[(i5 + i12) + 1])) {
                    i11 = iArr[(i5 + i12) + 1];
                    z = false;
                } else {
                    i11 = iArr[(i5 + i12) - 1] + 1;
                    z = true;
                }
                int i13 = i11;
                i11 -= i12;
                while (i13 < i6 && i11 < i7 && c0447d.mo3284a(i + i13, i3 + i11)) {
                    i13++;
                    i11++;
                }
                iArr[i5 + i12] = i13;
                if (obj == null || i12 < (i8 - i10) + 1 || i12 > (i8 + i10) - 1 || iArr[i5 + i12] < iArr2[i5 + i12]) {
                    i12 += 2;
                } else {
                    C0452i c0452i = new C0452i();
                    c0452i.f2549a = iArr2[i5 + i12];
                    c0452i.f2550b = c0452i.f2549a - i12;
                    c0452i.f2551c = iArr[i5 + i12] - iArr2[i5 + i12];
                    c0452i.f2552d = z;
                    c0452i.f2553e = false;
                    return c0452i;
                }
            }
            i12 = -i10;
            while (i12 <= i10) {
                int i14 = i12 + i8;
                if (i14 == i10 + i8 || (i14 != (-i10) + i8 && iArr2[(i5 + i14) - 1] < iArr2[(i5 + i14) + 1])) {
                    i11 = iArr2[(i5 + i14) - 1];
                    z = false;
                } else {
                    i11 = iArr2[(i5 + i14) + 1] - 1;
                    z = true;
                }
                i13 = i11;
                i11 -= i14;
                while (i13 > 0 && i11 > 0 && c0447d.mo3284a((i + i13) - 1, (i3 + i11) - 1)) {
                    i13--;
                    i11--;
                }
                iArr2[i5 + i14] = i13;
                if (obj != null || i12 + i8 < (-i10) || i12 + i8 > i10 || iArr[i5 + i14] < iArr2[i5 + i14]) {
                    i12 += 2;
                } else {
                    c0452i = new C0452i();
                    c0452i.f2549a = iArr2[i5 + i14];
                    c0452i.f2550b = c0452i.f2549a - i14;
                    c0452i.f2551c = iArr[i5 + i14] - iArr2[i5 + i14];
                    c0452i.f2552d = z;
                    c0452i.f2553e = true;
                    return c0452i;
                }
            }
            i10++;
        }
        throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
    }
}
