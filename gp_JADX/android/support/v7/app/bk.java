package android.support.v7.app;

final class bk implements Runnable {
    public final /* synthetic */ bj f2372a;

    bk(bj bjVar) {
        this.f2372a = bjVar;
    }

    public final void run() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0032 in list [B:12:0x002f]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r5 = this;
        r0 = 0;
        r3 = r5.f2372a;
        r1 = r3.m2525o();
        r2 = r1 instanceof android.support.v7.view.menu.C0471p;
        if (r2 == 0) goto L_0x0033;
    L_0x000b:
        r0 = r1;
        r0 = (android.support.v7.view.menu.C0471p) r0;
        r2 = r0;
    L_0x000f:
        if (r2 == 0) goto L_0x0014;
    L_0x0011:
        r2.m2834d();
    L_0x0014:
        r1.clear();	 Catch:{ all -> 0x0035 }
        r0 = r3.f2366c;	 Catch:{ all -> 0x0035 }
        r4 = 0;	 Catch:{ all -> 0x0035 }
        r0 = r0.onCreatePanelMenu(r4, r1);	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x002a;	 Catch:{ all -> 0x0035 }
    L_0x0020:
        r0 = r3.f2366c;	 Catch:{ all -> 0x0035 }
        r3 = 0;	 Catch:{ all -> 0x0035 }
        r4 = 0;	 Catch:{ all -> 0x0035 }
        r0 = r0.onPreparePanel(r3, r4, r1);	 Catch:{ all -> 0x0035 }
        if (r0 != 0) goto L_0x002d;	 Catch:{ all -> 0x0035 }
    L_0x002a:
        r1.clear();	 Catch:{ all -> 0x0035 }
    L_0x002d:
        if (r2 == 0) goto L_0x0032;
    L_0x002f:
        r2.m2835e();
    L_0x0032:
        return;
    L_0x0033:
        r2 = r0;
        goto L_0x000f;
    L_0x0035:
        r0 = move-exception;
        if (r2 == 0) goto L_0x003b;
    L_0x0038:
        r2.m2835e();
    L_0x003b:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.bk.run():void");
    }
}
