package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

final class C5600q {
    public final Object f28525a = new Object();
    public Queue f28526b;
    public boolean f28527c;

    C5600q() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m26593a(com.google.android.gms.tasks.C5587d r3) {
        /*
        r2 = this;
        r1 = r2.f28525a;
        monitor-enter(r1);
        r0 = r2.f28526b;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f28527c;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = 1;
        r2.f28527c = r0;	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0011:
        r1 = r2.f28525a;
        monitor-enter(r1);
        r0 = r2.f28526b;	 Catch:{ all -> 0x0023 }
        r0 = r0.poll();	 Catch:{ all -> 0x0023 }
        r0 = (com.google.android.gms.tasks.C5593p) r0;	 Catch:{ all -> 0x0023 }
        if (r0 != 0) goto L_0x0029;
    L_0x001e:
        r0 = 0;
        r2.f28527c = r0;	 Catch:{ all -> 0x0023 }
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        goto L_0x000c;
    L_0x0023:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        throw r0;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
    L_0x0029:
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        r0.mo5054a(r3);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.q.a(com.google.android.gms.tasks.d):void");
    }

    public final void m26594a(C5593p c5593p) {
        synchronized (this.f28525a) {
            if (this.f28526b == null) {
                this.f28526b = new ArrayDeque();
            }
            this.f28526b.add(c5593p);
        }
    }
}
