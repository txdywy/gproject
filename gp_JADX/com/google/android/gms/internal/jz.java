package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

public final class jz extends nd {
    public static volatile ec f27118a = null;
    public static final Object f27119b = new Object();
    public br f27120c = null;

    public jz(jp jpVar, String str, String str2, ci ciVar, int i, br brVar) {
        super(jpVar, str, str2, ciVar, i, 27);
        this.f27120c = brVar;
    }

    private static String m24998a(br brVar) {
        return (brVar == null || brVar.f26514b == null || ju.m24990b(brVar.f26514b.f26548a)) ? null : brVar.f26514b.f26548a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo4764a() {
        /*
        r10 = this;
        r3 = 3;
        r4 = 2;
        r1 = 1;
        r2 = 0;
        r0 = f27118a;
        if (r0 == 0) goto L_0x002a;
    L_0x0008:
        r0 = f27118a;
        r0 = r0.f26673b;
        r0 = com.google.android.gms.internal.ju.m24990b(r0);
        if (r0 != 0) goto L_0x002a;
    L_0x0012:
        r0 = f27118a;
        r0 = r0.f26673b;
        r5 = "E";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x002a;
    L_0x001e:
        r0 = f27118a;
        r0 = r0.f26673b;
        r5 = "0000000000000000000000000000000000000000000000000000000000000000";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x00af;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        if (r0 == 0) goto L_0x007a;
    L_0x002d:
        r5 = f27119b;
        monitor-enter(r5);
        r0 = r10.f27120c;	 Catch:{ all -> 0x0120 }
        r0 = m24998a(r0);	 Catch:{ all -> 0x0120 }
        r0 = com.google.android.gms.internal.ju.m24990b(r0);	 Catch:{ all -> 0x0120 }
        if (r0 != 0) goto L_0x00b2;
    L_0x003c:
        r0 = 4;
        r3 = r0;
    L_0x003e:
        r6 = r10.h;	 Catch:{ all -> 0x0120 }
        r7 = 0;
        r0 = 2;
        r8 = new java.lang.Object[r0];	 Catch:{ all -> 0x0120 }
        r0 = 0;
        r9 = r10.d;	 Catch:{ all -> 0x0120 }
        r9 = r9.f27072b;	 Catch:{ all -> 0x0120 }
        r8[r0] = r9;	 Catch:{ all -> 0x0120 }
        r9 = 1;
        if (r3 != r4) goto L_0x0111;
    L_0x004e:
        r0 = r1;
    L_0x004f:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0120 }
        r8[r9] = r0;	 Catch:{ all -> 0x0120 }
        r0 = r6.invoke(r7, r8);	 Catch:{ all -> 0x0120 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0120 }
        r1 = new com.google.android.gms.internal.ec;	 Catch:{ all -> 0x0120 }
        r1.<init>(r0);	 Catch:{ all -> 0x0120 }
        f27118a = r1;	 Catch:{ all -> 0x0120 }
        r0 = r1.f26673b;	 Catch:{ all -> 0x0120 }
        r0 = com.google.android.gms.internal.ju.m24990b(r0);	 Catch:{ all -> 0x0120 }
        if (r0 != 0) goto L_0x0076;
    L_0x006a:
        r0 = f27118a;	 Catch:{ all -> 0x0120 }
        r0 = r0.f26673b;	 Catch:{ all -> 0x0120 }
        r1 = "E";
        r0 = r0.equals(r1);	 Catch:{ all -> 0x0120 }
        if (r0 == 0) goto L_0x0079;
    L_0x0076:
        switch(r3) {
            case 3: goto L_0x0123;
            case 4: goto L_0x0114;
            default: goto L_0x0079;
        };	 Catch:{ all -> 0x0120 }
    L_0x0079:
        monitor-exit(r5);	 Catch:{ all -> 0x0120 }
    L_0x007a:
        r1 = r10.g;
        monitor-enter(r1);
        r0 = f27118a;	 Catch:{ all -> 0x0133 }
        if (r0 == 0) goto L_0x00ad;
    L_0x0081:
        r0 = r10.g;	 Catch:{ all -> 0x0133 }
        r2 = f27118a;	 Catch:{ all -> 0x0133 }
        r2 = r2.f26673b;	 Catch:{ all -> 0x0133 }
        r0.f26601w = r2;	 Catch:{ all -> 0x0133 }
        r0 = r10.g;	 Catch:{ all -> 0x0133 }
        r2 = f27118a;	 Catch:{ all -> 0x0133 }
        r2 = r2.f26674c;	 Catch:{ all -> 0x0133 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0133 }
        r0.f26555C = r2;	 Catch:{ all -> 0x0133 }
        r0 = r10.g;	 Catch:{ all -> 0x0133 }
        r2 = f27118a;	 Catch:{ all -> 0x0133 }
        r2 = r2.f26675d;	 Catch:{ all -> 0x0133 }
        r0.f26554B = r2;	 Catch:{ all -> 0x0133 }
        r0 = r10.g;	 Catch:{ all -> 0x0133 }
        r2 = f27118a;	 Catch:{ all -> 0x0133 }
        r2 = r2.f26676e;	 Catch:{ all -> 0x0133 }
        r0.f26565M = r2;	 Catch:{ all -> 0x0133 }
        r0 = r10.g;	 Catch:{ all -> 0x0133 }
        r2 = f27118a;	 Catch:{ all -> 0x0133 }
        r2 = r2.f26677f;	 Catch:{ all -> 0x0133 }
        r0.f26566N = r2;	 Catch:{ all -> 0x0133 }
    L_0x00ad:
        monitor-exit(r1);	 Catch:{ all -> 0x0133 }
        return;
    L_0x00af:
        r0 = r2;
        goto L_0x002b;
    L_0x00b2:
        r0 = r10.f27120c;	 Catch:{ all -> 0x0120 }
        r6 = m24998a(r0);	 Catch:{ all -> 0x0120 }
        r6 = com.google.android.gms.internal.ju.m24990b(r6);	 Catch:{ all -> 0x0120 }
        if (r6 == 0) goto L_0x010d;
    L_0x00be:
        if (r0 == 0) goto L_0x010d;
    L_0x00c0:
        r6 = r0.f26513a;	 Catch:{ all -> 0x0120 }
        if (r6 == 0) goto L_0x010d;
    L_0x00c4:
        r0 = r0.f26513a;	 Catch:{ all -> 0x0120 }
        r0 = r0.f26515a;	 Catch:{ all -> 0x0120 }
        r0 = r0.intValue();	 Catch:{ all -> 0x0120 }
        if (r0 != r3) goto L_0x010d;
    L_0x00ce:
        r0 = r1;
    L_0x00cf:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0120 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0120 }
        if (r0 == 0) goto L_0x010a;
    L_0x00d9:
        r0 = r10.d;	 Catch:{ all -> 0x0120 }
        r0 = r0.f27085o;	 Catch:{ all -> 0x0120 }
        if (r0 == 0) goto L_0x010f;
    L_0x00df:
        r0 = com.google.android.gms.internal.yu.f27765u;	 Catch:{ all -> 0x0120 }
        r6 = com.google.android.gms.ads.p270c.C4909c.m22927a();	 Catch:{ all -> 0x0120 }
        r6 = r6.f25267g;	 Catch:{ all -> 0x0120 }
        r0 = r6.m26014a(r0);	 Catch:{ all -> 0x0120 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0120 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0120 }
        if (r0 == 0) goto L_0x010f;
    L_0x00f3:
        r0 = com.google.android.gms.internal.yu.f27766v;	 Catch:{ all -> 0x0120 }
        r6 = com.google.android.gms.ads.p270c.C4909c.m22927a();	 Catch:{ all -> 0x0120 }
        r6 = r6.f25267g;	 Catch:{ all -> 0x0120 }
        r0 = r6.m26014a(r0);	 Catch:{ all -> 0x0120 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0120 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0120 }
        if (r0 == 0) goto L_0x010f;
    L_0x0107:
        r0 = r1;
    L_0x0108:
        if (r0 != 0) goto L_0x003e;
    L_0x010a:
        r3 = r4;
        goto L_0x003e;
    L_0x010d:
        r0 = r2;
        goto L_0x00cf;
    L_0x010f:
        r0 = r2;
        goto L_0x0108;
    L_0x0111:
        r0 = r2;
        goto L_0x004f;
    L_0x0114:
        r0 = f27118a;	 Catch:{ all -> 0x0120 }
        r1 = r10.f27120c;	 Catch:{ all -> 0x0120 }
        r1 = r1.f26514b;	 Catch:{ all -> 0x0120 }
        r1 = r1.f26548a;	 Catch:{ all -> 0x0120 }
        r0.f26673b = r1;	 Catch:{ all -> 0x0120 }
        goto L_0x0079;
    L_0x0120:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0120 }
        throw r0;
    L_0x0123:
        r0 = r10.m24999c();	 Catch:{ all -> 0x0120 }
        r1 = com.google.android.gms.internal.ju.m24990b(r0);	 Catch:{ all -> 0x0120 }
        if (r1 != 0) goto L_0x0079;
    L_0x012d:
        r1 = f27118a;	 Catch:{ all -> 0x0120 }
        r1.f26673b = r0;	 Catch:{ all -> 0x0120 }
        goto L_0x0079;
    L_0x0133:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0133 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jz.a():void");
    }

    private final String m24999c() {
        try {
            if (this.d.f27082l != null) {
                this.d.f27082l.get();
            }
            ci ciVar = this.d.f27081k;
            if (!(ciVar == null || ciVar.f26601w == null)) {
                return ciVar.f26601w;
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        return null;
    }
}
