package org.chromium.net.impl;

final class bo implements Runnable {
    public final /* synthetic */ bn f40865a;

    bo(bn bnVar) {
        this.f40865a = bnVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r6 = this;
        r2 = 1;
        r3 = 0;
        r0 = r6.f40865a;
        r4 = r0.f40863c;
        monitor-enter(r4);
        r0 = r6.f40865a;	 Catch:{ all -> 0x0043 }
        r0 = r0.f40864d;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
    L_0x000e:
        return;
    L_0x000f:
        r0 = r6.f40865a;	 Catch:{ all -> 0x0043 }
        r0 = r0.f40863c;	 Catch:{ all -> 0x0043 }
        r0 = r0.pollFirst();	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x0043 }
        r5 = r6.f40865a;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0041;
    L_0x001d:
        r1 = r2;
    L_0x001e:
        r5.f40864d = r1;	 Catch:{ all -> 0x0043 }
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
    L_0x0021:
        if (r0 == 0) goto L_0x000e;
    L_0x0023:
        r0.run();	 Catch:{ all -> 0x0048 }
        r0 = r6.f40865a;
        r4 = r0.f40863c;
        monitor-enter(r4);
        r0 = r6.f40865a;	 Catch:{ all -> 0x003e }
        r0 = r0.f40863c;	 Catch:{ all -> 0x003e }
        r0 = r0.pollFirst();	 Catch:{ all -> 0x003e }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x003e }
        r5 = r6.f40865a;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0046;
    L_0x0039:
        r1 = r2;
    L_0x003a:
        r5.f40864d = r1;	 Catch:{ all -> 0x003e }
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        goto L_0x0021;
    L_0x003e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        throw r0;
    L_0x0041:
        r1 = r3;
        goto L_0x001e;
    L_0x0043:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0043 }
        throw r0;
    L_0x0046:
        r1 = r3;
        goto L_0x003a;
    L_0x0048:
        r0 = move-exception;
        r1 = r6.f40865a;
        r1 = r1.f40863c;
        monitor-enter(r1);
        r2 = r6.f40865a;	 Catch:{ all -> 0x0060 }
        r3 = 0;
        r2.f40864d = r3;	 Catch:{ all -> 0x0060 }
        r2 = r6.f40865a;	 Catch:{ RejectedExecutionException -> 0x0063 }
        r2 = r2.f40861a;	 Catch:{ RejectedExecutionException -> 0x0063 }
        r3 = r6.f40865a;	 Catch:{ RejectedExecutionException -> 0x0063 }
        r3 = r3.f40862b;	 Catch:{ RejectedExecutionException -> 0x0063 }
        r2.execute(r3);	 Catch:{ RejectedExecutionException -> 0x0063 }
    L_0x005e:
        monitor-exit(r1);	 Catch:{ all -> 0x0060 }
        throw r0;
    L_0x0060:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0060 }
        throw r0;
    L_0x0063:
        r2 = move-exception;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.bo.run():void");
    }
}
