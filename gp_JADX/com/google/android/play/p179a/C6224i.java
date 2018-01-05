package com.google.android.play.p179a;

import android.os.Handler;
import android.os.Looper;

final class C6224i extends Handler {
    public final /* synthetic */ C6223h f31155a;

    C6224i(C6223h c6223h, Looper looper) {
        this.f31155a = c6223h;
        super(looper);
    }

    public final void dispatchMessage(android.os.Message r11) {
        /* JADX: method processing error */
/*
Error: java.util.NoSuchElementException
	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1431)
	at java.util.HashMap$KeyIterator.next(HashMap.java:1453)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.applyRemove(BlockFinallyExtract.java:535)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.extractFinally(BlockFinallyExtract.java:175)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.processExceptionHandler(BlockFinallyExtract.java:79)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:51)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r10 = this;
        r5 = 4;
        r3 = 3;
        r2 = 1;
        r1 = 0;
        r0 = r11.getCallback();
        if (r0 == 0) goto L_0x0012;
    L_0x000a:
        r0 = r11.getCallback();
        r0.run();
    L_0x0011:
        return;
    L_0x0012:
        r4 = r10.f31155a;
        r0 = r11.what;
        switch(r0) {
            case 1: goto L_0x0029;
            case 2: goto L_0x0039;
            case 3: goto L_0x00f6;
            case 4: goto L_0x0134;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = "Unknown msg: %d";
        r2 = new java.lang.Object[r2];
        r3 = r11.what;
        r3 = java.lang.Integer.valueOf(r3);
        r2[r1] = r3;
        com.google.android.play.utils.PlayCommonLog.b(r0, r2);
        goto L_0x0011;
    L_0x0029:
        r0 = r4.f31125S;
        r0.m28707c(r2);
        r4.m28727c();
        r0 = r4.m28730f();
        r4.m28718a(r0);
        goto L_0x0011;
    L_0x0039:
        r0 = r11.obj;
        r0 = (com.google.android.play.p179a.p352a.ap) r0;
        r5 = r4.f31136h;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = r5.f31229i;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = r3.exists();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        if (r3 != 0) goto L_0x006b;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x0047:
        r3 = r5.f31233m;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        if (r3 == 0) goto L_0x0056;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x004b:
        r3 = "Logs directories were deleted unexpectedly, recreating...";	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r6 = 0;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r6 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        com.google.android.play.utils.PlayCommonLog.c(r3, r6);	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r5.m28739a();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x0056:
        r3 = r5.f31232l;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r6 = r3.f31098e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r7 = r3.f31098e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r7 = r7.f30745k;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r7 = r7 + 1;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r8 = r6.f30735a;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r8 = r8 | 128;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r6.f30735a = r8;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r6.f30745k = r7;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3.m28703a();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x006b:
        r3 = r5.f31225e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        if (r3 != 0) goto L_0x0076;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x006f:
        r5.m28740b();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = r5.f31225e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        if (r3 == 0) goto L_0x00a8;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x0076:
        r3 = r5.f31224d;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r6 = r5.f31226f;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3.mo5354a(r0, r6);	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = r5.f31226f;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3.flush();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = r5.f31225e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        if (r3 == 0) goto L_0x00be;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x0086:
        r3 = r5.f31225e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r6 = r3.length();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r8 = r5.f31221a;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        if (r3 < 0) goto L_0x00be;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x0092:
        r3 = r2;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x0093:
        if (r3 == 0) goto L_0x00c0;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x0095:
        r1 = r5.f31226f;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r1.close();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r1 = r5.f31227g;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = r5.f31225e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r1.add(r3);	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r5.m28740b();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r5.m28741c();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r1 = r2;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x00a8:
        if (r1 == 0) goto L_0x00b3;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x00aa:
        r1 = r4.f31125S;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r2 = 2;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r1.m28707c(r2);	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r4.m28727c();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x00b3:
        r1 = r4.f31110D;
        if (r1 != 0) goto L_0x0011;
    L_0x00b7:
        r1 = r4.f31137i;
        r1.m28733a(r0);
        goto L_0x0011;
    L_0x00be:
        r3 = r1;
        goto L_0x0093;
    L_0x00c0:
        r2 = r5.f31225e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        if (r2 == 0) goto L_0x00a8;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
    L_0x00c4:
        r2 = r5.f31232l;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = r5.f31225e;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r6 = r3.length();	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r3 = (int) r6;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r2.m28706b(r3);	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        goto L_0x00a8;
    L_0x00d1:
        r1 = move-exception;
        r1 = "Could not write an event into file";	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r2 = 0;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r2 = new java.lang.Object[r2];	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        com.google.android.play.utils.PlayCommonLog.c(r1, r2);	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r1 = r4.f31125S;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r2 = 3;	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r1.m28704a(r2);	 Catch:{ IOException -> 0x00d1, all -> 0x00eb }
        r1 = r4.f31110D;
        if (r1 != 0) goto L_0x0011;
    L_0x00e4:
        r1 = r4.f31137i;
        r1.m28733a(r0);
        goto L_0x0011;
    L_0x00eb:
        r1 = move-exception;
        r2 = r4.f31110D;
        if (r2 != 0) goto L_0x00f5;
    L_0x00f0:
        r2 = r4.f31137i;
        r2.m28733a(r0);
    L_0x00f5:
        throw r1;
    L_0x00f6:
        r0 = r4.f31138j;
        r0.removeMessages(r3);
        r0 = r4.f31122P;
        if (r0 != 0) goto L_0x0103;
    L_0x00ff:
        r0 = r4.f31124R;
        if (r0 == 0) goto L_0x0160;
    L_0x0103:
        r0 = r4.f31136h;
        r0 = r0.m28744f();
    L_0x0109:
        r2 = r4.f31122P;
        if (r2 == 0) goto L_0x0116;
    L_0x010d:
        if (r0 == 0) goto L_0x0116;
    L_0x010f:
        r2 = r4.f31125S;
        r2.m28707c(r5);
        r4.f31122P = r1;
    L_0x0116:
        r1 = r4.f31124R;
        if (r1 == 0) goto L_0x0122;
    L_0x011a:
        if (r0 == 0) goto L_0x0122;
    L_0x011c:
        r0 = r4.f31125S;
        r1 = 5;
        r0.m28707c(r1);
    L_0x0122:
        r0 = r4.m28729e();
        if (r0 == 0) goto L_0x012b;
    L_0x0128:
        r4.m28727c();
    L_0x012b:
        r0 = r4.m28730f();
        r4.m28718a(r0);
        goto L_0x0011;
    L_0x0134:
        r0 = r4.f31138j;
        r0.removeMessages(r5);
        r0 = r4.f31136h;
        r0 = r0.m28744f();
        if (r0 == 0) goto L_0x0146;
    L_0x0141:
        r0 = r4.f31125S;
        r0.m28707c(r3);
    L_0x0146:
        r0 = r4.m28729e();
        if (r0 != 0) goto L_0x0146;
    L_0x014c:
        r0 = r11.obj;
        r0 = (java.lang.Runnable) r0;
        if (r0 == 0) goto L_0x0157;
    L_0x0152:
        r1 = r4.f31139k;
        r1.post(r0);
    L_0x0157:
        r0 = r4.m28730f();
        r4.m28718a(r0);
        goto L_0x0011;
    L_0x0160:
        r0 = r1;
        goto L_0x0109;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.i.dispatchMessage(android.os.Message):void");
    }
}
