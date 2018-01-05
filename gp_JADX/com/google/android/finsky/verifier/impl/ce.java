package com.google.android.finsky.verifier.impl;

final class ce implements Runnable {
    public final /* synthetic */ boolean f24531a;
    public final /* synthetic */ cd f24532b;

    ce(cd cdVar, boolean z) {
        this.f24532b = cdVar;
        this.f24531a = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r3 = this;
        r0 = r3.f24532b;
        r1 = r0.f24530b;
        monitor-enter(r1);
        r0 = r3.f24532b;	 Catch:{ all -> 0x0030 }
        r0 = r0.f24530b;	 Catch:{ all -> 0x0030 }
        r0 = r0.f24514w;	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
    L_0x000e:
        return;
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        r0 = r3.f24531a;
        if (r0 == 0) goto L_0x0033;
    L_0x0014:
        r0 = r3.f24532b;
        r0 = r0.f24530b;
        r1 = r3.f24532b;
        r1 = r1.f24529a;
        r0.m22249b(r1);
    L_0x001f:
        r0 = r3.f24532b;
        r1 = r0.f24530b;
        monitor-enter(r1);
        r0 = r3.f24532b;	 Catch:{ all -> 0x002d }
        r0 = r0.f24530b;	 Catch:{ all -> 0x002d }
        r2 = 0;
        r0.f24513v = r2;	 Catch:{ all -> 0x002d }
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        goto L_0x000e;
    L_0x002d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        throw r0;
    L_0x0030:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        throw r0;
    L_0x0033:
        r0 = r3.f24532b;
        r0 = r0.f24530b;
        r1 = 1;
        r0.m22241a(r1);
        r0 = r3.f24532b;
        r0 = r0.f24530b;
        r0.m22069l();
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.impl.ce.run():void");
    }
}
