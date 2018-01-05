package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;

final class C5197d implements Runnable {
    public final String f26233a;
    public final Bundle f26234b;
    public final C5199f f26235c;
    public final Messenger f26236d;
    public /* synthetic */ C0946b f26237e;

    C5197d(C0946b c0946b, String str, IBinder iBinder, Bundle bundle) {
        C5199f c5199f;
        this.f26237e = c0946b;
        this.f26233a = str;
        if (iBinder == null) {
            c5199f = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            c5199f = queryLocalInterface instanceof C5199f ? (C5199f) queryLocalInterface : new C5200g(iBinder);
        }
        this.f26235c = c5199f;
        this.f26234b = bundle;
        this.f26236d = null;
    }

    C5197d(C0946b c0946b, String str, Messenger messenger, Bundle bundle) {
        this.f26237e = c0946b;
        this.f26233a = str;
        this.f26236d = messenger;
        this.f26234b = bundle;
        this.f26235c = null;
    }

    private final boolean m23978a() {
        return this.f26236d != null;
    }

    public final void run() {
        m23979a(this.f26237e.mo1162a(new C5205l(this.f26234b)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m23979a(int r7) {
        /*
        r6 = this;
        r0 = r6.f26237e;
        r1 = r0.f5754h;
        monitor-enter(r1);
        r0 = r6.f26237e;	 Catch:{ RemoteException -> 0x00a2 }
        r0 = r0.f5759m;	 Catch:{ RemoteException -> 0x00a2 }
        r2 = r6.f26233a;	 Catch:{ RemoteException -> 0x00a2 }
        r3 = r6.f26237e;	 Catch:{ RemoteException -> 0x00a2 }
        r3 = r3.f5760n;	 Catch:{ RemoteException -> 0x00a2 }
        r0 = r0.m23977c(r2, r3);	 Catch:{ RemoteException -> 0x00a2 }
        if (r0 == 0) goto L_0x0041;
    L_0x0015:
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r0 = r0.f5759m;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26233a;	 Catch:{ all -> 0x0099 }
        r3 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r3 = r3.f5760n;	 Catch:{ all -> 0x0099 }
        r0.m23974b(r2, r3);	 Catch:{ all -> 0x0099 }
        r0 = r6.m23978a();	 Catch:{ all -> 0x0099 }
        if (r0 != 0) goto L_0x003f;
    L_0x0028:
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r0 = r0.f5759m;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r2.f5760n;	 Catch:{ all -> 0x0099 }
        r0 = r0.m23976c(r2);	 Catch:{ all -> 0x0099 }
        if (r0 != 0) goto L_0x003f;
    L_0x0036:
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r2.f5755i;	 Catch:{ all -> 0x0099 }
        r0.stopSelf(r2);	 Catch:{ all -> 0x0099 }
    L_0x003f:
        monitor-exit(r1);	 Catch:{ all -> 0x0099 }
    L_0x0040:
        return;
    L_0x0041:
        r0 = r6.m23978a();	 Catch:{ RemoteException -> 0x00a2 }
        if (r0 == 0) goto L_0x009c;
    L_0x0047:
        r0 = r6.f26236d;	 Catch:{ RemoteException -> 0x00a2 }
        r2 = android.os.Message.obtain();	 Catch:{ RemoteException -> 0x00a2 }
        r3 = 3;
        r2.what = r3;	 Catch:{ RemoteException -> 0x00a2 }
        r2.arg1 = r7;	 Catch:{ RemoteException -> 0x00a2 }
        r3 = new android.os.Bundle;	 Catch:{ RemoteException -> 0x00a2 }
        r3.<init>();	 Catch:{ RemoteException -> 0x00a2 }
        r4 = "component";
        r5 = r6.f26237e;	 Catch:{ RemoteException -> 0x00a2 }
        r5 = r5.f5758l;	 Catch:{ RemoteException -> 0x00a2 }
        r3.putParcelable(r4, r5);	 Catch:{ RemoteException -> 0x00a2 }
        r4 = "tag";
        r5 = r6.f26233a;	 Catch:{ RemoteException -> 0x00a2 }
        r3.putString(r4, r5);	 Catch:{ RemoteException -> 0x00a2 }
        r2.setData(r3);	 Catch:{ RemoteException -> 0x00a2 }
        r0.send(r2);	 Catch:{ RemoteException -> 0x00a2 }
    L_0x006d:
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r0 = r0.f5759m;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26233a;	 Catch:{ all -> 0x0099 }
        r3 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r3 = r3.f5760n;	 Catch:{ all -> 0x0099 }
        r0.m23974b(r2, r3);	 Catch:{ all -> 0x0099 }
        r0 = r6.m23978a();	 Catch:{ all -> 0x0099 }
        if (r0 != 0) goto L_0x0097;
    L_0x0080:
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r0 = r0.f5759m;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r2.f5760n;	 Catch:{ all -> 0x0099 }
        r0 = r0.m23976c(r2);	 Catch:{ all -> 0x0099 }
        if (r0 != 0) goto L_0x0097;
    L_0x008e:
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r2.f5755i;	 Catch:{ all -> 0x0099 }
        r0.stopSelf(r2);	 Catch:{ all -> 0x0099 }
    L_0x0097:
        monitor-exit(r1);	 Catch:{ all -> 0x0099 }
        goto L_0x0040;
    L_0x0099:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0099 }
        throw r0;
    L_0x009c:
        r0 = r6.f26235c;	 Catch:{ RemoteException -> 0x00a2 }
        r0.mo4639a(r7);	 Catch:{ RemoteException -> 0x00a2 }
        goto L_0x006d;
    L_0x00a2:
        r0 = move-exception;
        r2 = "GcmTaskService";
        r3 = "Error reporting result of operation to scheduler for ";
        r0 = r6.f26233a;	 Catch:{ all -> 0x00eb }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00eb }
        r4 = r0.length();	 Catch:{ all -> 0x00eb }
        if (r4 == 0) goto L_0x00e5;
    L_0x00b3:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x00eb }
    L_0x00b7:
        android.util.Log.e(r2, r0);	 Catch:{ all -> 0x00eb }
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r0 = r0.f5759m;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26233a;	 Catch:{ all -> 0x0099 }
        r3 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r3 = r3.f5760n;	 Catch:{ all -> 0x0099 }
        r0.m23974b(r2, r3);	 Catch:{ all -> 0x0099 }
        r0 = r6.m23978a();	 Catch:{ all -> 0x0099 }
        if (r0 != 0) goto L_0x0097;
    L_0x00cd:
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r0 = r0.f5759m;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r2.f5760n;	 Catch:{ all -> 0x0099 }
        r0 = r0.m23976c(r2);	 Catch:{ all -> 0x0099 }
        if (r0 != 0) goto L_0x0097;
    L_0x00db:
        r0 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r2.f5755i;	 Catch:{ all -> 0x0099 }
        r0.stopSelf(r2);	 Catch:{ all -> 0x0099 }
        goto L_0x0097;
    L_0x00e5:
        r0 = new java.lang.String;	 Catch:{ all -> 0x00eb }
        r0.<init>(r3);	 Catch:{ all -> 0x00eb }
        goto L_0x00b7;
    L_0x00eb:
        r0 = move-exception;
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r2.f5759m;	 Catch:{ all -> 0x0099 }
        r3 = r6.f26233a;	 Catch:{ all -> 0x0099 }
        r4 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r4 = r4.f5760n;	 Catch:{ all -> 0x0099 }
        r2.m23974b(r3, r4);	 Catch:{ all -> 0x0099 }
        r2 = r6.m23978a();	 Catch:{ all -> 0x0099 }
        if (r2 != 0) goto L_0x0116;
    L_0x00ff:
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r2 = r2.f5759m;	 Catch:{ all -> 0x0099 }
        r3 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r3 = r3.f5760n;	 Catch:{ all -> 0x0099 }
        r2 = r2.m23976c(r3);	 Catch:{ all -> 0x0099 }
        if (r2 != 0) goto L_0x0116;
    L_0x010d:
        r2 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r3 = r6.f26237e;	 Catch:{ all -> 0x0099 }
        r3 = r3.f5755i;	 Catch:{ all -> 0x0099 }
        r2.stopSelf(r3);	 Catch:{ all -> 0x0099 }
    L_0x0116:
        throw r0;	 Catch:{ all -> 0x0099 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.d.a(int):void");
    }
}
