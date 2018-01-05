package com.google.android.finsky.by.p132a;

final class C2220s implements Runnable {
    public final /* synthetic */ C2219r f11084a;

    C2220s(C2219r c2219r) {
        this.f11084a = c2219r;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r14 = this;
        r2 = 2;
        r3 = 0;
        r0 = r14.f11084a;
        r0 = r0.f11080j;
        if (r0 != 0) goto L_0x0016;
    L_0x0008:
        r1 = r14.f11084a;
        monitor-enter(r1);
        r0 = r14.f11084a;	 Catch:{ all -> 0x0078 }
        r0 = r0.f11079i;	 Catch:{ all -> 0x0078 }
        r0 = r0.size();	 Catch:{ all -> 0x0078 }
        if (r0 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
    L_0x0016:
        return;
    L_0x0017:
        r4 = r14.f11084a;	 Catch:{ all -> 0x0078 }
        r0 = r14.f11084a;	 Catch:{ all -> 0x0078 }
        r0 = r0.f11079i;	 Catch:{ all -> 0x0078 }
        r5 = 0;
        r0 = r0.remove(r5);	 Catch:{ all -> 0x0078 }
        r0 = (com.google.android.finsky.by.p132a.aa) r0;	 Catch:{ all -> 0x0078 }
        r4.f11080j = r0;	 Catch:{ all -> 0x0078 }
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
        r0 = r14.f11084a;
        r0 = r0.f11081k;
        if (r0 == 0) goto L_0x0039;
    L_0x002d:
        r0 = r14.f11084a;
        r1 = 0;
        r4 = r14.f11084a;
        r4 = r4.f11080j;
        r4 = r4.f10995c;
        r0.m11621a(r2, null, r1, r4);
    L_0x0039:
        r5 = new com.google.wireless.android.finsky.dfe.nano.cu;
        r5.<init>();
        r0 = r14.f11084a;
        r0 = r0.f11080j;
        r0 = r0.f10993a;
        r6 = r0.length;
        r0 = new com.google.wireless.android.finsky.b.p[r6];
        r5.b = r0;
        r4 = r3;
    L_0x004a:
        if (r4 >= r6) goto L_0x010b;
    L_0x004c:
        r7 = r5.b;
        r8 = r14.f11084a;
        r0 = r14.f11084a;
        r0 = r0.f11080j;
        r0 = r0.f10993a;
        r9 = r0[r4];
        r0 = r8.f11077g;
        r0 = r0.mo2793g(r9);
        r0 = (com.google.android.finsky.by.p132a.C2201e) r0;
        r10 = new com.google.wireless.android.finsky.b.p;
        r10.<init>();
        r1 = com.google.android.finsky.by.C2229h.f11120a;
        r1 = r1.equals(r9);
        if (r1 == 0) goto L_0x007b;
    L_0x006d:
        r1 = 3;
    L_0x006e:
        r10.c = r1;
        if (r9 != 0) goto L_0x00d2;
    L_0x0072:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0078:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
        throw r0;
    L_0x007b:
        r1 = com.google.android.finsky.by.C2229h.f11121b;
        r1 = r1.equals(r9);
        if (r1 == 0) goto L_0x0085;
    L_0x0083:
        r1 = 1;
        goto L_0x006e;
    L_0x0085:
        r1 = com.google.android.finsky.by.C2229h.f11122c;
        r1 = r1.equals(r9);
        if (r1 == 0) goto L_0x008f;
    L_0x008d:
        r1 = 4;
        goto L_0x006e;
    L_0x008f:
        r1 = com.google.android.finsky.by.C2229h.f11123d;
        r1 = r1.equals(r9);
        if (r1 == 0) goto L_0x0099;
    L_0x0097:
        r1 = r2;
        goto L_0x006e;
    L_0x0099:
        r1 = com.google.android.finsky.by.C2229h.f11124e;
        r1 = r1.equals(r9);
        if (r1 == 0) goto L_0x00a3;
    L_0x00a1:
        r1 = 6;
        goto L_0x006e;
    L_0x00a3:
        r1 = com.google.android.finsky.by.C2229h.f11125f;
        r1 = r1.equals(r9);
        if (r1 == 0) goto L_0x00ae;
    L_0x00ab:
        r1 = 10;
        goto L_0x006e;
    L_0x00ae:
        r1 = com.google.android.finsky.by.C2229h.m11637a(r9);
        if (r1 == 0) goto L_0x00b6;
    L_0x00b4:
        r1 = r3;
        goto L_0x006e;
    L_0x00b6:
        r1 = new java.lang.IllegalArgumentException;
        r2 = "Invalid libraryId: ";
        r0 = java.lang.String.valueOf(r9);
        r3 = r0.length();
        if (r3 == 0) goto L_0x00cc;
    L_0x00c4:
        r0 = r2.concat(r0);
    L_0x00c8:
        r1.<init>(r0);
        throw r1;
    L_0x00cc:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x00c8;
    L_0x00d2:
        r1 = r10.b;
        r1 = r1 | 1;
        r10.b = r1;
        r10.d = r9;
        r12 = r0.mo2794h();
        r10.f = r12;
        r0 = r0.mo2792g();
        r1 = r10.b;
        r1 = r1 | 4;
        r10.b = r1;
        r10.g = r0;
        r0 = r8.f11077g;
        r0 = r0.mo2791f(r9);
        if (r0 == 0) goto L_0x0104;
    L_0x00f4:
        if (r0 != 0) goto L_0x00fc;
    L_0x00f6:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x00fc:
        r1 = r10.b;
        r1 = r1 | 2;
        r10.b = r1;
        r10.e = r0;
    L_0x0104:
        r7[r4] = r10;
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x004a;
    L_0x010b:
        r0 = r5.a;
        r0 = r0 | 1;
        r5.a = r0;
        r5.c = r2;
        r0 = new com.google.android.finsky.by.a.w;
        r1 = r14.f11084a;
        r0.<init>(r1);
        r1 = r14.f11084a;
        r1 = r1.f11073c;
        r1.mo1572a(r5, r0, r0);
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.by.a.s.run():void");
    }
}
