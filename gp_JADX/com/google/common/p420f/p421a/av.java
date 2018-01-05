package com.google.common.p420f.p421a;

import com.google.common.p414a.C6937m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class av extends FutureTask implements au {
    public final ad f34399a = new ad();

    public static av m31887a(Callable callable) {
        return new av(callable);
    }

    private av(Callable callable) {
        super(callable);
    }

    public final void mo5927a(Runnable runnable, Executor executor) {
        ad adVar = this.f34399a;
        C6937m.m31624a((Object) runnable, (Object) "Runnable was null.");
        C6937m.m31624a((Object) executor, (Object) "Executor was null.");
        synchronized (adVar) {
            if (adVar.f34387c) {
                ad.m31862a(runnable, executor);
                return;
            }
            adVar.f34386b = new ae(runnable, executor, adVar.f34386b);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void done() {
        /*
        r4 = this;
        r0 = 0;
        r2 = r4.f34399a;
        monitor-enter(r2);
        r1 = r2.f34387c;	 Catch:{ all -> 0x001c }
        if (r1 == 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r2);	 Catch:{ all -> 0x001c }
    L_0x0009:
        return;
    L_0x000a:
        r1 = 1;
        r2.f34387c = r1;	 Catch:{ all -> 0x001c }
        r1 = r2.f34386b;	 Catch:{ all -> 0x001c }
        r3 = 0;
        r2.f34386b = r3;	 Catch:{ all -> 0x001c }
        monitor-exit(r2);	 Catch:{ all -> 0x001c }
    L_0x0013:
        if (r1 == 0) goto L_0x001f;
    L_0x0015:
        r2 = r1.f34390c;
        r1.f34390c = r0;
        r0 = r1;
        r1 = r2;
        goto L_0x0013;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001c }
        throw r0;
    L_0x001f:
        if (r0 == 0) goto L_0x0009;
    L_0x0021:
        r1 = r0.f34388a;
        r2 = r0.f34389b;
        com.google.common.p420f.p421a.ad.m31862a(r1, r2);
        r0 = r0.f34390c;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.f.a.av.done():void");
    }
}
