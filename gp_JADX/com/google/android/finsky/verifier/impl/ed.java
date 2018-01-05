package com.google.android.finsky.verifier.impl;

import java.util.Collections;
import java.util.List;

public final class ed {
    public static final String[] f24674a = new String[]{"classes.dex", "AndroidManifest.xml", "resources.arsc", "META-INF/MANIFEST.MF"};

    static com.google.android.finsky.verifier.p259a.p260a.C4705i[] m22361a(java.io.File r10) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x0043 in {8, 13, 15, 18, 27, 30, 34, 36, 38, 39, 40, 41, 43, 44, 47, 48, 49, 50} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.rerun(BlockProcessor.java:44)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:57)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = 0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = new com.google.android.d.d;
        r6.<init>(r10);
        r0 = r6.f5744c;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r7 = java.util.Collections.unmodifiableList(r0);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r2 = r1;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x001c:
        r0 = r7.size();	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        if (r2 >= r0) goto L_0x004c;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x0022:
        r0 = r7.get(r2);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r0 = (com.google.android.p103d.C0938c) r0;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8 = 1;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r6.m5681a(r0, r8);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8 = r0.f5735a;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8 = m22360a(r8);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        if (r8 == 0) goto L_0x003b;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x0034:
        r3.add(r0);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x0037:
        r0 = r2 + 1;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r2 = r0;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        goto L_0x001c;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x003b:
        r8 = r0.f5741g;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        if (r8 == 0) goto L_0x0048;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x003f:
        r4.add(r0);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        goto L_0x0037;
    L_0x0043:
        r0 = move-exception;
        com.google.android.finsky.utils.C4679j.m21814a(r6);
        throw r0;
    L_0x0048:
        r5.add(r0);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        goto L_0x0037;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x004c:
        r0 = 20;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r0 = m22359a(r3, r0);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r2 = 10;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r2 = m22359a(r4, r2);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r3 = 10;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r3 = m22359a(r5, r3);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = r0.size();	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r7 = r2.size();	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = r5 + r7;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r7 = r3.size();	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = r5 + r7;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r4.<init>(r5);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r4.addAll(r0);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r4.addAll(r2);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r4.addAll(r3);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r0 = r4.size();	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r3 = new com.google.android.finsky.verifier.p259a.p260a.C4705i[r0];	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r2 = r1;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x0081:
        r0 = r4.size();	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        if (r2 >= r0) goto L_0x00d0;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x0087:
        r0 = r4.get(r2);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r0 = (com.google.android.p103d.C0938c) r0;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r1 = 0;
        r5 = 0;
        r1 = r6.m5681a(r0, r5);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = "SHA-256";	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = com.google.android.finsky.utils.C4688t.m21837a(r1, r5);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = r5.f24072b;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r7 = r0.f5735a;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r0 = r0.f5741g;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8 = new com.google.android.finsky.verifier.a.a.i;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8.<init>();	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        if (r7 != 0) goto L_0x00b1;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x00a6:
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r0.<init>();	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        throw r0;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x00ac:
        r0 = move-exception;
        com.google.android.finsky.utils.C4679j.m21814a(r1);
        throw r0;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
    L_0x00b1:
        r9 = r8.f24203b;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r9 = r9 | 1;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8.f24203b = r9;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8.f24204c = r7;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = com.google.android.finsky.verifier.impl.am.m22057a(r5);	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8.f24205d = r5;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = r8.f24203b;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r5 = r5 | 2;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8.f24203b = r5;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r8.f24206e = r0;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        r3[r2] = r8;	 Catch:{ all -> 0x00ac, all -> 0x0043 }
        com.google.android.finsky.utils.C4679j.m21814a(r1);
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0081;
    L_0x00d0:
        com.google.android.finsky.utils.C4679j.m21814a(r6);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.impl.ed.a(java.io.File):com.google.android.finsky.verifier.a.a.i[]");
    }

    private static boolean m22360a(String str) {
        String[] strArr = f24674a;
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static final List m22359a(List list, int i) {
        if (list.size() <= i) {
            return list;
        }
        Collections.shuffle(list);
        return list.subList(0, i);
    }
}
