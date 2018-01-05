package com.google.android.finsky.di;

final class C2756l {
    static boolean m14812a(java.io.InputStream r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 1;
        r1 = 0;
        r5 = new java.util.zip.ZipInputStream;
        r5.<init>(r8);
        r2 = r1;
        r3 = r1;
        r4 = r1;
    L_0x000a:
        r6 = r5.getNextEntry();	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        if (r6 == 0) goto L_0x003e;	 Catch:{ IOException -> 0x0038, all -> 0x004a }
    L_0x0010:
        if (r6 == 0) goto L_0x0034;	 Catch:{ IOException -> 0x0038, all -> 0x004a }
    L_0x0012:
        r6 = r6.getName();	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        r7 = "AndroidManifest.xml";	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        r7 = android.text.TextUtils.equals(r7, r6);	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        if (r7 == 0) goto L_0x0020;	 Catch:{ IOException -> 0x0038, all -> 0x004a }
    L_0x001e:
        r4 = r4 + 1;	 Catch:{ IOException -> 0x0038, all -> 0x004a }
    L_0x0020:
        r7 = "resources.arsc";	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        r7 = android.text.TextUtils.equals(r7, r6);	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        if (r7 == 0) goto L_0x002a;	 Catch:{ IOException -> 0x0038, all -> 0x004a }
    L_0x0028:
        r3 = r3 + 1;	 Catch:{ IOException -> 0x0038, all -> 0x004a }
    L_0x002a:
        r7 = "classes.dex";	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        r6 = android.text.TextUtils.equals(r6, r7);	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        if (r6 == 0) goto L_0x0034;	 Catch:{ IOException -> 0x0038, all -> 0x004a }
    L_0x0032:
        r2 = r2 + 1;	 Catch:{ IOException -> 0x0038, all -> 0x004a }
    L_0x0034:
        r5.closeEntry();	 Catch:{ IOException -> 0x0038, all -> 0x004a }
        goto L_0x000a;
    L_0x0038:
        r0 = move-exception;
        com.google.android.finsky.utils.C4679j.m21814a(r5);
        r0 = r1;
    L_0x003d:
        return r0;
    L_0x003e:
        if (r4 != r0) goto L_0x0048;
    L_0x0040:
        if (r3 != r0) goto L_0x0048;
    L_0x0042:
        if (r2 != 0) goto L_0x0048;
    L_0x0044:
        com.google.android.finsky.utils.C4679j.m21814a(r5);
        goto L_0x003d;
    L_0x0048:
        r0 = r1;
        goto L_0x0044;
    L_0x004a:
        r0 = move-exception;
        com.google.android.finsky.utils.C4679j.m21814a(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.di.l.a(java.io.InputStream):boolean");
    }
}
