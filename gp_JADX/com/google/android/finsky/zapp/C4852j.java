package com.google.android.finsky.zapp;

import android.content.Context;
import android.content.Intent;

final class C4852j {
    public static final Intent f25153a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");

    public static C4850h m22686a(Context context) {
        if (C4852j.m22687b(context)) {
            return new C4862u();
        }
        return new C4859r();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m22687b(android.content.Context r6) {
        /*
        r2 = 1;
        r1 = 0;
        r3 = new com.google.android.finsky.zapp.k;
        r3.<init>();
        r0 = f25153a;	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        r4 = 1;
        r0 = r6.bindService(r0, r3, r4);	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        if (r0 != 0) goto L_0x001c;
    L_0x0010:
        r0 = "ZappConnFactory";
        r2 = "Unable to bind to PlayStore";
        android.util.Log.e(r0, r2);	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        r6.unbindService(r3);	 Catch:{ IllegalStateException -> 0x0080 }
    L_0x001a:
        r0 = r1;
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = r3.f25154a;	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        r0 = (android.os.IBinder) r0;	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        if (r0 != 0) goto L_0x0032;
    L_0x0026:
        r0 = "ZappConnFactory";
        r2 = "Unable to connect to PlayStore";
        android.util.Log.e(r0, r2);	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        r6.unbindService(r3);	 Catch:{ IllegalStateException -> 0x0082 }
    L_0x0030:
        r0 = r1;
        goto L_0x001b;
    L_0x0032:
        r0 = r0.getInterfaceDescriptor();	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        r4 = "com.google.android.finsky.zapp.protocol.IWearPlayModuleService";
        r0 = r4.equals(r0);	 Catch:{ InterruptedException -> 0x0048, RemoteException -> 0x0055 }
        if (r0 == 0) goto L_0x0043;
    L_0x003e:
        r6.unbindService(r3);	 Catch:{ IllegalStateException -> 0x0084 }
    L_0x0041:
        r0 = r2;
        goto L_0x001b;
    L_0x0043:
        r6.unbindService(r3);	 Catch:{ IllegalStateException -> 0x0086 }
    L_0x0046:
        r0 = r1;
        goto L_0x001b;
    L_0x0048:
        r0 = move-exception;
        java.lang.Thread.currentThread();	 Catch:{ all -> 0x007b }
        java.lang.Thread.interrupted();	 Catch:{ all -> 0x007b }
        r6.unbindService(r3);	 Catch:{ IllegalStateException -> 0x0053 }
        goto L_0x0046;
    L_0x0053:
        r0 = move-exception;
        goto L_0x0046;
    L_0x0055:
        r0 = move-exception;
        r2 = "ZappConnFactory";
        r4 = "Failed interaction with service: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x007b }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x007b }
        r5 = r0.length();	 Catch:{ all -> 0x007b }
        if (r5 == 0) goto L_0x0075;
    L_0x0068:
        r0 = r4.concat(r0);	 Catch:{ all -> 0x007b }
    L_0x006c:
        android.util.Log.e(r2, r0);	 Catch:{ all -> 0x007b }
        r6.unbindService(r3);	 Catch:{ IllegalStateException -> 0x0073 }
        goto L_0x0046;
    L_0x0073:
        r0 = move-exception;
        goto L_0x0046;
    L_0x0075:
        r0 = new java.lang.String;	 Catch:{ all -> 0x007b }
        r0.<init>(r4);	 Catch:{ all -> 0x007b }
        goto L_0x006c;
    L_0x007b:
        r0 = move-exception;
        r6.unbindService(r3);	 Catch:{ IllegalStateException -> 0x0088 }
    L_0x007f:
        throw r0;
    L_0x0080:
        r0 = move-exception;
        goto L_0x001a;
    L_0x0082:
        r0 = move-exception;
        goto L_0x0030;
    L_0x0084:
        r0 = move-exception;
        goto L_0x0041;
    L_0x0086:
        r0 = move-exception;
        goto L_0x0046;
    L_0x0088:
        r1 = move-exception;
        goto L_0x007f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.zapp.j.b(android.content.Context):boolean");
    }
}
