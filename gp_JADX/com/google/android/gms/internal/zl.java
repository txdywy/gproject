package com.google.android.gms.internal;

import java.lang.Thread.UncaughtExceptionHandler;

final class zl implements UncaughtExceptionHandler {
    public /* synthetic */ UncaughtExceptionHandler f27778a;
    public /* synthetic */ zk f27779b;

    zl(zk zkVar, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f27779b = zkVar;
        this.f27778a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
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
        r2 = this;
        r0 = r2.f27779b;	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
        r0.m26049a(r4);	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
        r0 = r2.f27778a;
        if (r0 == 0) goto L_0x000e;
    L_0x0009:
        r0 = r2.f27778a;
        r0.uncaughtException(r3, r4);
    L_0x000e:
        return;
    L_0x000f:
        r0 = move-exception;
        r0 = "AdMob exception reporter failed reporting the exception.";	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
        com.google.android.gms.internal.ap.m24191b(r0);	 Catch:{ Throwable -> 0x000f, all -> 0x001f }
        r0 = r2.f27778a;
        if (r0 == 0) goto L_0x000e;
    L_0x0019:
        r0 = r2.f27778a;
        r0.uncaughtException(r3, r4);
        goto L_0x000e;
    L_0x001f:
        r0 = move-exception;
        r1 = r2.f27778a;
        if (r1 == 0) goto L_0x0029;
    L_0x0024:
        r1 = r2.f27778a;
        r1.uncaughtException(r3, r4);
    L_0x0029:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zl.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
