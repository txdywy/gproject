package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class in implements Runnable {
    public /* synthetic */ AtomicReference f27007a;
    public /* synthetic */ il f27008b;

    in(il ilVar, AtomicReference atomicReference) {
        this.f27008b = ilVar;
        this.f27007a = atomicReference;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r5 = this;
        r1 = r5.f27007a;
        monitor-enter(r1);
        r0 = r5.f27008b;	 Catch:{ RemoteException -> 0x005e }
        r0 = r0.f27000b;	 Catch:{ RemoteException -> 0x005e }
        if (r0 != 0) goto L_0x001d;
    L_0x0009:
        r0 = r5.f27008b;	 Catch:{ RemoteException -> 0x005e }
        r0 = r0.mo4742p();	 Catch:{ RemoteException -> 0x005e }
        r0 = r0.f26845d;	 Catch:{ RemoteException -> 0x005e }
        r2 = "Failed to get app instance id";
        r0.m24652a(r2);	 Catch:{ RemoteException -> 0x005e }
        r0 = r5.f27007a;	 Catch:{ all -> 0x005b }
        r0.notify();	 Catch:{ all -> 0x005b }
        monitor-exit(r1);	 Catch:{ all -> 0x005b }
    L_0x001c:
        return;
    L_0x001d:
        r2 = r5.f27007a;	 Catch:{ RemoteException -> 0x005e }
        r3 = r5.f27008b;	 Catch:{ RemoteException -> 0x005e }
        r3 = r3.mo4731e();	 Catch:{ RemoteException -> 0x005e }
        r4 = 0;
        r3 = r3.m24555a(r4);	 Catch:{ RemoteException -> 0x005e }
        r0 = r0.mo4756b(r3);	 Catch:{ RemoteException -> 0x005e }
        r2.set(r0);	 Catch:{ RemoteException -> 0x005e }
        r0 = r5.f27007a;	 Catch:{ RemoteException -> 0x005e }
        r0 = r0.get();	 Catch:{ RemoteException -> 0x005e }
        r0 = (java.lang.String) r0;	 Catch:{ RemoteException -> 0x005e }
        if (r0 == 0) goto L_0x004f;
    L_0x003b:
        r2 = r5.f27008b;	 Catch:{ RemoteException -> 0x005e }
        r2 = r2.mo4730d();	 Catch:{ RemoteException -> 0x005e }
        r2.m24774a(r0);	 Catch:{ RemoteException -> 0x005e }
        r2 = r5.f27008b;	 Catch:{ RemoteException -> 0x005e }
        r2 = r2.mo4743q();	 Catch:{ RemoteException -> 0x005e }
        r2 = r2.f26871i;	 Catch:{ RemoteException -> 0x005e }
        r2.m24689a(r0);	 Catch:{ RemoteException -> 0x005e }
    L_0x004f:
        r0 = r5.f27008b;	 Catch:{ RemoteException -> 0x005e }
        r0.m24848u();	 Catch:{ RemoteException -> 0x005e }
        r0 = r5.f27007a;	 Catch:{ all -> 0x005b }
        r0.notify();	 Catch:{ all -> 0x005b }
    L_0x0059:
        monitor-exit(r1);	 Catch:{ all -> 0x005b }
        goto L_0x001c;
    L_0x005b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x005b }
        throw r0;
    L_0x005e:
        r0 = move-exception;
        r2 = r5.f27008b;	 Catch:{ all -> 0x0072 }
        r2 = r2.mo4742p();	 Catch:{ all -> 0x0072 }
        r2 = r2.f26845d;	 Catch:{ all -> 0x0072 }
        r3 = "Failed to get app instance id";
        r2.m24653a(r3, r0);	 Catch:{ all -> 0x0072 }
        r0 = r5.f27007a;	 Catch:{ all -> 0x005b }
        r0.notify();	 Catch:{ all -> 0x005b }
        goto L_0x0059;
    L_0x0072:
        r0 = move-exception;
        r2 = r5.f27007a;	 Catch:{ all -> 0x005b }
        r2.notify();	 Catch:{ all -> 0x005b }
        throw r0;	 Catch:{ all -> 0x005b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.in.run():void");
    }
}
