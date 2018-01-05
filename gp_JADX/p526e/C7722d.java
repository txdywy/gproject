package p526e;

final class C7722d extends Thread {
    C7722d() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r12 = this;
        r10 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r1 = 0;
    L_0x0004:
        r2 = p526e.C7634a.class;
        monitor-enter(r2);	 Catch:{ InterruptedException -> 0x0033 }
        r0 = p526e.C7634a.f39533d;	 Catch:{ all -> 0x0030 }
        r0 = r0.f39535f;	 Catch:{ all -> 0x0030 }
        if (r0 != 0) goto L_0x0037;
    L_0x000d:
        r4 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0030 }
        r0 = p526e.C7634a.class;
        r6 = p526e.C7634a.f39531b;	 Catch:{ all -> 0x0030 }
        r0.wait(r6);	 Catch:{ all -> 0x0030 }
        r0 = p526e.C7634a.f39533d;	 Catch:{ all -> 0x0030 }
        r0 = r0.f39535f;	 Catch:{ all -> 0x0030 }
        if (r0 != 0) goto L_0x0035;
    L_0x001e:
        r6 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0030 }
        r4 = r6 - r4;
        r6 = p526e.C7634a.f39532c;	 Catch:{ all -> 0x0030 }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x0035;
    L_0x002a:
        r0 = p526e.C7634a.f39533d;	 Catch:{ all -> 0x0030 }
    L_0x002c:
        if (r0 != 0) goto L_0x005f;
    L_0x002e:
        monitor-exit(r2);	 Catch:{ all -> 0x0030 }
        goto L_0x0004;
    L_0x0030:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0030 }
        throw r0;	 Catch:{ InterruptedException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        goto L_0x0004;
    L_0x0035:
        r0 = r1;
        goto L_0x002c;
    L_0x0037:
        r4 = java.lang.System.nanoTime();	 Catch:{ all -> 0x0030 }
        r6 = r0.f39536g;	 Catch:{ all -> 0x0030 }
        r4 = r6 - r4;
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0055;
    L_0x0045:
        r6 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r6 = r4 / r6;
        r8 = r6 * r10;
        r4 = r4 - r8;
        r0 = p526e.C7634a.class;
        r3 = (int) r4;	 Catch:{ all -> 0x0030 }
        r0.wait(r6, r3);	 Catch:{ all -> 0x0030 }
        r0 = r1;
        goto L_0x002c;
    L_0x0055:
        r3 = p526e.C7634a.f39533d;	 Catch:{ all -> 0x0030 }
        r4 = r0.f39535f;	 Catch:{ all -> 0x0030 }
        r3.f39535f = r4;	 Catch:{ all -> 0x0030 }
        r3 = 0;
        r0.f39535f = r3;	 Catch:{ all -> 0x0030 }
        goto L_0x002c;
    L_0x005f:
        r3 = p526e.C7634a.f39533d;	 Catch:{ all -> 0x0030 }
        if (r0 != r3) goto L_0x0068;
    L_0x0063:
        r0 = 0;
        p526e.C7634a.f39533d = r0;	 Catch:{ all -> 0x0030 }
        monitor-exit(r2);	 Catch:{ all -> 0x0030 }
        return;
    L_0x0068:
        monitor-exit(r2);	 Catch:{ all -> 0x0030 }
        r0.mo6459a();	 Catch:{ InterruptedException -> 0x0033 }
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.run():void");
    }
}
