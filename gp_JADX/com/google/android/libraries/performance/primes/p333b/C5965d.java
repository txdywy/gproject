package com.google.android.libraries.performance.primes.p333b;

import com.google.android.libraries.p326c.p327a.C5916a;

public final class C5965d extends C5962e {
    public final C5964c f29733a;

    protected C5965d(int i, C5964c c5964c) {
        super(i);
        this.f29733a = (C5964c) C5916a.m27406a((Object) c5964c);
    }

    public final int mo5235a(C5970j c5970j) {
        return this.f29733a.f29732h;
    }

    public final int mo5236a(C5970j c5970j, int i) {
        C5964c c5964c = this.f29733a;
        int i2 = c5964c.f29732h;
        String str = "index";
        if (i >= 0 && i < i2) {
            return c5964c.m27689a(c5970j, (((this.i + c5970j.f29753b) + 4) + c5970j.f29753b) + 4, i);
        }
        String a;
        if (i < 0) {
            a = C5916a.m27407a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            a = C5916a.m27407a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public final String mo5237b(C5970j c5970j, int i) {
        String a;
        C5964c c5964c = this.f29733a;
        while (true) {
            int i2 = c5964c.f29732h;
            String str = "index";
            if (i >= 0 && i < i2) {
                if (i < c5964c.f29728d.length) {
                    return c5970j.m27707a(c5964c.f29728d[i]);
                }
                i -= c5964c.f29728d.length;
                c5964c = c5964c.f29731g;
            }
        }
        if (i < 0) {
            a = C5916a.m27407a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            a = C5916a.m27407a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo5238c(com.google.android.libraries.performance.primes.p333b.C5970j r10, int r11) {
        /*
        r9 = this;
        r5 = 35;
        r8 = 2;
        r7 = 1;
        r6 = 0;
        if (r11 < 0) goto L_0x00f5;
    L_0x0007:
        r0 = r9.f29733a;
        r0 = r0.f29732h;
        if (r11 >= r0) goto L_0x00f5;
    L_0x000d:
        r0 = r9.f29733a;
        r1 = r0;
        r0 = r11;
    L_0x0011:
        r2 = r1.f29732h;
        r3 = "index";
        if (r0 < 0) goto L_0x0019;
    L_0x0017:
        if (r0 < r2) goto L_0x0066;
    L_0x0019:
        r1 = new java.lang.IndexOutOfBoundsException;
        if (r0 >= 0) goto L_0x0031;
    L_0x001d:
        r2 = "%s (%s) must not be negative";
        r4 = new java.lang.Object[r8];
        r4[r6] = r3;
        r0 = java.lang.Integer.valueOf(r0);
        r4[r7] = r0;
        r0 = com.google.android.libraries.p326c.p327a.C5916a.m27407a(r2, r4);
    L_0x002d:
        r1.<init>(r0);
        throw r1;
    L_0x0031:
        if (r2 >= 0) goto L_0x004e;
    L_0x0033:
        r0 = new java.lang.IllegalArgumentException;
        r1 = 26;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r1);
        r1 = "negative size: ";
        r1 = r3.append(r1);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x004e:
        r4 = "%s (%s) must be less than size (%s)";
        r5 = 3;
        r5 = new java.lang.Object[r5];
        r5[r6] = r3;
        r0 = java.lang.Integer.valueOf(r0);
        r5[r7] = r0;
        r0 = java.lang.Integer.valueOf(r2);
        r5[r8] = r0;
        r0 = com.google.android.libraries.p326c.p327a.C5916a.m27407a(r4, r5);
        goto L_0x002d;
    L_0x0066:
        r2 = r1.f29728d;
        r2 = r2.length;
        if (r0 >= r2) goto L_0x00a2;
    L_0x006b:
        r0 = r9.f29733a;
        if (r1 != r0) goto L_0x00ab;
    L_0x006f:
        r0 = r9.f29733a;
        r0 = r0.m27691b(r10);
        r1 = r9.mo5237b(r10, r11);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 1;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r0 = r3.append(r0);
        r0 = r0.append(r5);
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x00a1:
        return r0;
    L_0x00a2:
        r2 = r1.f29731g;
        r1 = r1.f29728d;
        r1 = r1.length;
        r0 = r0 - r1;
        r1 = r2;
        goto L_0x0011;
    L_0x00ab:
        r0 = r9.f29733a;
        r0 = r0.m27691b(r10);
        r1 = r1.m27691b(r10);
        r2 = r9.mo5237b(r10, r11);
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 2;
        r4 = java.lang.String.valueOf(r1);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r0 = r4.append(r0);
        r3 = 58;
        r0 = r0.append(r3);
        r0 = r0.append(r1);
        r0 = r0.append(r5);
        r0 = r0.append(r2);
        r0 = r0.toString();
        goto L_0x00a1;
    L_0x00f5:
        r0 = r9.f29733a;
        r0 = r0.m27691b(r10);
        goto L_0x00a1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.b.d.c(com.google.android.libraries.performance.primes.b.j, int):java.lang.String");
    }
}
