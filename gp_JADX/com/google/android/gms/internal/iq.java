package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

final class iq implements Runnable {
    public /* synthetic */ AtomicReference f27012a;
    public /* synthetic */ zzcqw f27013b;
    public /* synthetic */ String f27014c;
    public /* synthetic */ il f27015d;

    iq(il ilVar, AtomicReference atomicReference, zzcqw com_google_android_gms_internal_zzcqw, String str) {
        this.f27015d = ilVar;
        this.f27012a = atomicReference;
        this.f27013b = com_google_android_gms_internal_zzcqw;
        this.f27014c = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r5 = this;
        r1 = r5.f27012a;
        monitor-enter(r1);
        r0 = r5.f27015d;	 Catch:{ RemoteException -> 0x0039 }
        r0 = r0.f27000b;	 Catch:{ RemoteException -> 0x0039 }
        if (r0 != 0) goto L_0x001d;
    L_0x0009:
        r0 = r5.f27015d;	 Catch:{ RemoteException -> 0x0039 }
        r0 = r0.mo4742p();	 Catch:{ RemoteException -> 0x0039 }
        r0 = r0.f26845d;	 Catch:{ RemoteException -> 0x0039 }
        r2 = "Discarding data. Failed to send event to service to bundle";
        r0.m24652a(r2);	 Catch:{ RemoteException -> 0x0039 }
        r0 = r5.f27012a;	 Catch:{ all -> 0x0036 }
        r0.notify();	 Catch:{ all -> 0x0036 }
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
    L_0x001c:
        return;
    L_0x001d:
        r2 = r5.f27012a;	 Catch:{ RemoteException -> 0x0039 }
        r3 = r5.f27013b;	 Catch:{ RemoteException -> 0x0039 }
        r4 = r5.f27014c;	 Catch:{ RemoteException -> 0x0039 }
        r0 = r0.mo4755a(r3, r4);	 Catch:{ RemoteException -> 0x0039 }
        r2.set(r0);	 Catch:{ RemoteException -> 0x0039 }
        r0 = r5.f27015d;	 Catch:{ RemoteException -> 0x0039 }
        r0.m24848u();	 Catch:{ RemoteException -> 0x0039 }
        r0 = r5.f27012a;	 Catch:{ all -> 0x0036 }
        r0.notify();	 Catch:{ all -> 0x0036 }
    L_0x0034:
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        goto L_0x001c;
    L_0x0036:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        throw r0;
    L_0x0039:
        r0 = move-exception;
        r2 = r5.f27015d;	 Catch:{ all -> 0x004d }
        r2 = r2.mo4742p();	 Catch:{ all -> 0x004d }
        r2 = r2.f26845d;	 Catch:{ all -> 0x004d }
        r3 = "Failed to send event to the service to bundle";
        r2.m24653a(r3, r0);	 Catch:{ all -> 0x004d }
        r0 = r5.f27012a;	 Catch:{ all -> 0x0036 }
        r0.notify();	 Catch:{ all -> 0x0036 }
        goto L_0x0034;
    L_0x004d:
        r0 = move-exception;
        r2 = r5.f27012a;	 Catch:{ all -> 0x0036 }
        r2.notify();	 Catch:{ all -> 0x0036 }
        throw r0;	 Catch:{ all -> 0x0036 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.iq.run():void");
    }
}
