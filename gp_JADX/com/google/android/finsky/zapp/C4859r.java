package com.google.android.finsky.zapp;

import android.content.Intent;

final class C4859r extends C4850h {
    public static final Intent f25167a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");

    C4859r() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.finsky.zapp.C4851i mo4423a(android.content.Context r7, java.util.List r8) {
        /*
        r6 = this;
        r3 = 1;
        r1 = 0;
        r2 = new com.google.android.finsky.zapp.utils.b;
        r2.<init>();
        r0 = f25167a;
        r0 = r7.bindService(r0, r2, r3);
        if (r0 != 0) goto L_0x0018;
    L_0x000f:
        r0 = "ZappPhoneskyConn";
        r2 = "Unable to bind to Phonesky";
        android.util.Log.e(r0, r2);
        r0 = r1;
    L_0x0017:
        return r0;
    L_0x0018:
        r3 = r2.m22749a();	 Catch:{ InterruptedException -> 0x0040 }
        if (r3 == 0) goto L_0x004c;
    L_0x001e:
        if (r3 == 0) goto L_0x004c;
    L_0x0020:
        r0 = "com.google.android.finsky.zapp.protocol.IPlayModuleService";
        r0 = r3.queryLocalInterface(r0);	 Catch:{ InterruptedException -> 0x0040 }
        r4 = r0 instanceof com.google.android.finsky.zapp.p267a.C4835d;	 Catch:{ InterruptedException -> 0x0040 }
        if (r4 == 0) goto L_0x003a;
    L_0x002a:
        r0 = (com.google.android.finsky.zapp.p267a.C4835d) r0;	 Catch:{ InterruptedException -> 0x0040 }
    L_0x002c:
        if (r0 != 0) goto L_0x004e;
    L_0x002e:
        r0 = "ZappPhoneskyConn";
        r3 = "Unable to connect to Phonesky";
        android.util.Log.e(r0, r3);	 Catch:{ InterruptedException -> 0x0040 }
        r7.unbindService(r2);	 Catch:{ IllegalStateException -> 0x00a3 }
    L_0x0038:
        r0 = r1;
        goto L_0x0017;
    L_0x003a:
        r0 = new com.google.android.finsky.zapp.a.f;	 Catch:{ InterruptedException -> 0x0040 }
        r0.<init>(r3);	 Catch:{ InterruptedException -> 0x0040 }
        goto L_0x002c;
    L_0x0040:
        r0 = move-exception;
        java.lang.Thread.currentThread();	 Catch:{ all -> 0x009e }
        java.lang.Thread.interrupted();	 Catch:{ all -> 0x009e }
        r7.unbindService(r2);	 Catch:{ IllegalStateException -> 0x00a7 }
    L_0x004a:
        r0 = r1;
        goto L_0x0017;
    L_0x004c:
        r0 = r1;
        goto L_0x002c;
    L_0x004e:
        r3 = new java.util.concurrent.ArrayBlockingQueue;	 Catch:{ InterruptedException -> 0x0040 }
        r4 = 1;
        r3.<init>(r4);	 Catch:{ InterruptedException -> 0x0040 }
        r4 = new com.google.android.finsky.zapp.s;	 Catch:{ InterruptedException -> 0x0040 }
        r4.<init>(r3);	 Catch:{ InterruptedException -> 0x0040 }
        r5 = r7.getPackageName();	 Catch:{ Exception -> 0x0079 }
        r0.mo4411a(r5, r8, r4);	 Catch:{ Exception -> 0x0079 }
        r4 = 90;
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0040 }
        r0 = r3.poll(r4, r0);	 Catch:{ InterruptedException -> 0x0040 }
        r0 = (com.google.android.finsky.zapp.C4851i) r0;	 Catch:{ InterruptedException -> 0x0040 }
        if (r0 != 0) goto L_0x0073;
    L_0x006c:
        r3 = "ZappPhoneskyConn";
        r4 = "Timed out waiting for zapp response";
        android.util.Log.w(r3, r4);	 Catch:{ InterruptedException -> 0x0040 }
    L_0x0073:
        r7.unbindService(r2);	 Catch:{ IllegalStateException -> 0x0077 }
        goto L_0x0017;
    L_0x0077:
        r1 = move-exception;
        goto L_0x0017;
    L_0x0079:
        r0 = move-exception;
        r3 = "ZappPhoneskyConn";
        r4 = "Zapp request failed: ";
        r0 = r0.getMessage();	 Catch:{ InterruptedException -> 0x0040 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ InterruptedException -> 0x0040 }
        r5 = r0.length();	 Catch:{ InterruptedException -> 0x0040 }
        if (r5 == 0) goto L_0x0098;
    L_0x008c:
        r0 = r4.concat(r0);	 Catch:{ InterruptedException -> 0x0040 }
    L_0x0090:
        android.util.Log.e(r3, r0);	 Catch:{ InterruptedException -> 0x0040 }
        r7.unbindService(r2);	 Catch:{ IllegalStateException -> 0x00a5 }
    L_0x0096:
        r0 = r1;
        goto L_0x0017;
    L_0x0098:
        r0 = new java.lang.String;	 Catch:{ InterruptedException -> 0x0040 }
        r0.<init>(r4);	 Catch:{ InterruptedException -> 0x0040 }
        goto L_0x0090;
    L_0x009e:
        r0 = move-exception;
        r7.unbindService(r2);	 Catch:{ IllegalStateException -> 0x00a9 }
    L_0x00a2:
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        goto L_0x0038;
    L_0x00a5:
        r0 = move-exception;
        goto L_0x0096;
    L_0x00a7:
        r0 = move-exception;
        goto L_0x004a;
    L_0x00a9:
        r1 = move-exception;
        goto L_0x00a2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.zapp.r.a(android.content.Context, java.util.List):com.google.android.finsky.zapp.i");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4424a(android.content.Context r7, java.util.ArrayList r8) {
        /*
        r6 = this;
        r3 = new com.google.android.finsky.zapp.utils.b;	 Catch:{ Exception -> 0x009a }
        r3.<init>();	 Catch:{ Exception -> 0x009a }
        r0 = f25167a;	 Catch:{ Exception -> 0x009a }
        r1 = 1;
        r0 = r7.bindService(r0, r3, r1);	 Catch:{ Exception -> 0x009a }
        if (r0 != 0) goto L_0x0016;
    L_0x000e:
        r0 = "ZappPhoneskyConn";
        r1 = "Unable to bind to Phonesky";
        android.util.Log.e(r0, r1);	 Catch:{ Exception -> 0x009a }
    L_0x0015:
        return;
    L_0x0016:
        r1 = r3.m22749a();	 Catch:{ InterruptedException -> 0x0082 }
        if (r1 != 0) goto L_0x002d;
    L_0x001c:
        r0 = 0;
        r2 = r0;
    L_0x001e:
        if (r2 != 0) goto L_0x0042;
    L_0x0020:
        r0 = "ZappPhoneskyConn";
        r1 = "Unable to connect to Phonesky";
        android.util.Log.e(r0, r1);	 Catch:{ InterruptedException -> 0x0082 }
        r7.unbindService(r3);	 Catch:{ IllegalStateException -> 0x002b }
        goto L_0x0015;
    L_0x002b:
        r0 = move-exception;
        goto L_0x0015;
    L_0x002d:
        r0 = "com.google.android.finsky.zapp.protocol.IPlayModuleService";
        r0 = r1.queryLocalInterface(r0);	 Catch:{ InterruptedException -> 0x0082 }
        r2 = r0 instanceof com.google.android.finsky.zapp.p267a.C4835d;	 Catch:{ InterruptedException -> 0x0082 }
        if (r2 == 0) goto L_0x003b;
    L_0x0037:
        r0 = (com.google.android.finsky.zapp.p267a.C4835d) r0;	 Catch:{ InterruptedException -> 0x0082 }
        r2 = r0;
        goto L_0x001e;
    L_0x003b:
        r0 = new com.google.android.finsky.zapp.a.f;	 Catch:{ InterruptedException -> 0x0082 }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x0082 }
        r2 = r0;
        goto L_0x001e;
    L_0x0042:
        r8 = (java.util.ArrayList) r8;	 Catch:{ Exception -> 0x005c }
        r4 = r8.size();	 Catch:{ Exception -> 0x005c }
        r0 = 0;
        r1 = r0;
    L_0x004a:
        if (r1 >= r4) goto L_0x008f;
    L_0x004c:
        r0 = r8.get(r1);	 Catch:{ Exception -> 0x005c }
        r1 = r1 + 1;
        r0 = (android.os.Bundle) r0;	 Catch:{ Exception -> 0x005c }
        r5 = r7.getPackageName();	 Catch:{ Exception -> 0x005c }
        r2.mo4410a(r5, r0);	 Catch:{ Exception -> 0x005c }
        goto L_0x004a;
    L_0x005c:
        r0 = move-exception;
        r1 = "ZappPhoneskyConn";
        r2 = "onModuleEvent() failed: ";
        r0 = r0.getMessage();	 Catch:{ InterruptedException -> 0x0082 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ InterruptedException -> 0x0082 }
        r4 = r0.length();	 Catch:{ InterruptedException -> 0x0082 }
        if (r4 == 0) goto L_0x007c;
    L_0x006f:
        r0 = r2.concat(r0);	 Catch:{ InterruptedException -> 0x0082 }
    L_0x0073:
        android.util.Log.e(r1, r0);	 Catch:{ InterruptedException -> 0x0082 }
        r7.unbindService(r3);	 Catch:{ IllegalStateException -> 0x007a }
        goto L_0x0015;
    L_0x007a:
        r0 = move-exception;
        goto L_0x0015;
    L_0x007c:
        r0 = new java.lang.String;	 Catch:{ InterruptedException -> 0x0082 }
        r0.<init>(r2);	 Catch:{ InterruptedException -> 0x0082 }
        goto L_0x0073;
    L_0x0082:
        r0 = move-exception;
        java.lang.Thread.currentThread();	 Catch:{ all -> 0x0095 }
        java.lang.Thread.interrupted();	 Catch:{ all -> 0x0095 }
        r7.unbindService(r3);	 Catch:{ IllegalStateException -> 0x008d }
        goto L_0x0015;
    L_0x008d:
        r0 = move-exception;
        goto L_0x0015;
    L_0x008f:
        r7.unbindService(r3);	 Catch:{ IllegalStateException -> 0x0093 }
        goto L_0x0015;
    L_0x0093:
        r0 = move-exception;
        goto L_0x0015;
    L_0x0095:
        r0 = move-exception;
        r7.unbindService(r3);	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x0099:
        throw r0;	 Catch:{ Exception -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        r1 = "ZappPhoneskyConn";
        r2 = "Unable to send log events to phonesky.";
        android.util.Log.w(r1, r2, r0);
        goto L_0x0015;
    L_0x00a4:
        r1 = move-exception;
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.zapp.r.a(android.content.Context, java.util.ArrayList):void");
    }
}
