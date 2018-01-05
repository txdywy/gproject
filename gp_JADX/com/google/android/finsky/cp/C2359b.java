package com.google.android.finsky.cp;

public final /* synthetic */ class C2359b implements Runnable {
    public final C2358a f11568a;
    public final String f11569b;
    public final int f11570c;
    public final String f11571d;

    public C2359b(C2358a c2358a, String str, int i, String str2) {
        this.f11568a = c2358a;
        this.f11569b = str;
        this.f11570c = i;
        this.f11571d = str2;
    }

    public final void run() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0039 in list [B:47:0x010e]
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
        r13 = this;
        r3 = r13.f11568a;
        r4 = r13.f11569b;
        r5 = r13.f11570c;
        r6 = r13.f11571d;
        r2 = 0;
        r1 = 0;
        r0 = com.google.android.finsky.aa.C0955b.gl;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = r0.m28964b();	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = (java.lang.String) r0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r7 = android.net.Uri.parse(r0);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = r3.f11565a;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = r0.getPackageManager();	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8 = r7.getAuthority();	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r9 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8 = r0.resolveContentProvider(r8, r9);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r8 != 0) goto L_0x003a;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0027:
        r0 = "GooglePartnerSetup app not found";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8 = new java.lang.Object[r8];	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        com.google.android.finsky.utils.FinskyLog.m21665c(r0, r8);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = -6001; // 0xffffffffffffe88f float:NaN double:NaN;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r9 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r3.m11982a(r0, r4, r8, r9);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r1 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0037:
        if (r1 != 0) goto L_0x0067;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0039:
        return;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x003a:
        r9 = r8.packageName;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r10 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = r0.getPackageInfo(r9, r10);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r9 = r0.applicationInfo;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r9 = r9.flags;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r10 = r9 & 1;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r10 != 0) goto L_0x0065;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0049:
        r10 = "GooglePartnerSetup app (%s) isn't system, flags = %d";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r11 = 2;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r11 = new java.lang.Object[r11];	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r12 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8 = r8.packageName;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r11[r12] = r8;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8 = 1;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r11[r8] = r9;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        com.google.android.finsky.utils.FinskyLog.m21665c(r10, r11);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8 = -6002; // 0xffffffffffffe88e float:NaN double:NaN;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r9 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r3.m11982a(r8, r4, r9, r0);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r1 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0037;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0065:
        r1 = r0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0037;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0067:
        r8 = new android.content.ContentValues;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8.<init>();	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = "package";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8.put(r0, r4);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = "version_code";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r8.put(r0, r5);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r5 = "source";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = -1;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r9 = r6.hashCode();	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        switch(r9) {
            case 123399022: goto L_0x00c8;
            case 267487396: goto L_0x00be;
            case 330290102: goto L_0x00b4;
            case 1097519758: goto L_0x00aa;
            default: goto L_0x0084;
        };	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0084:
        switch(r0) {
            case 0: goto L_0x00d2;
            case 1: goto L_0x00d5;
            case 2: goto L_0x00d8;
            case 3: goto L_0x00d8;
            default: goto L_0x0087;
        };	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0087:
        r0 = "other";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0089:
        r8.put(r5, r0);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r5 = 16;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r0 < r5) goto L_0x00db;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x0092:
        r0 = r3.f11565a;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = r0.getContentResolver();	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r2 = r0.acquireUnstableContentProviderClient(r7);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x009c:
        r2.insert(r7, r8);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r5 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r3.m11982a(r0, r4, r5, r1);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r2 == 0) goto L_0x0039;
    L_0x00a6:
        r2.release();
        goto L_0x0039;
    L_0x00aa:
        r9 = "restore";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6 = r6.equals(r9);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r6 == 0) goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00b2:
        r0 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00b4:
        r9 = "restore_vpa";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6 = r6.equals(r9);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r6 == 0) goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00bc:
        r0 = 1;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00be:
        r9 = "single_install";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6 = r6.equals(r9);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r6 == 0) goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00c6:
        r0 = 2;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00c8:
        r9 = "bulk_install";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6 = r6.equals(r9);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r6 == 0) goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00d0:
        r0 = 3;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00d2:
        r0 = "restore";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0089;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00d5:
        r0 = "pai";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0089;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00d8:
        r0 = "manual";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x0089;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
    L_0x00db:
        r0 = r3.f11565a;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r0 = r0.getContentResolver();	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r2 = r0.acquireContentProviderClient(r7);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        goto L_0x009c;
    L_0x00e6:
        r0 = move-exception;
    L_0x00e7:
        r5 = "Old version of GooglePartnerSetup app: %s";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6 = 1;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6 = new java.lang.Object[r6];	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r7 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6[r7] = r0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        com.google.android.finsky.utils.FinskyLog.m21665c(r5, r6);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r5 = -6003; // 0xffffffffffffe88d float:NaN double:NaN;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r3.m11982a(r5, r4, r0, r1);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r2 == 0) goto L_0x0039;
    L_0x00f9:
        r2.release();
        goto L_0x0039;
    L_0x00fe:
        r0 = move-exception;
        r5 = "Unexpected error when reporting app install source";	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6 = 0;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r6 = new java.lang.Object[r6];	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        com.google.android.finsky.utils.FinskyLog.m21660a(r0, r5, r6);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r5 = -6004; // 0xffffffffffffe88c float:NaN double:NaN;	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        r3.m11982a(r5, r4, r0, r1);	 Catch:{ IllegalArgumentException -> 0x011a, UnsupportedOperationException -> 0x00e6, Exception -> 0x00fe, all -> 0x0113 }
        if (r2 == 0) goto L_0x0039;
    L_0x010e:
        r2.release();
        goto L_0x0039;
    L_0x0113:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0119;
    L_0x0116:
        r2.release();
    L_0x0119:
        throw r0;
    L_0x011a:
        r0 = move-exception;
        goto L_0x00e7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cp.b.run():void");
    }
}
