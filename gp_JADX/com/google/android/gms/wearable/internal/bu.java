package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

final class bu implements Callable {
    public /* synthetic */ ParcelFileDescriptor f28603a;
    public /* synthetic */ byte[] f28604b;

    bu(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f28603a = parcelFileDescriptor;
        this.f28604b = bArr;
    }

    private final java.lang.Boolean m26774a() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0105 in list []
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
        r6 = this;
        r1 = 3;
        r0 = "WearableClient";
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0009:
        r0 = "WearableClient";
        r1 = r6.f28603a;
        r1 = java.lang.String.valueOf(r1);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 36;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "processAssets: writing data to FD : ";
        r2 = r3.append(r2);
        r1 = r2.append(r1);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0031:
        r1 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream;
        r0 = r6.f28603a;
        r1.<init>(r0);
        r0 = r6.f28604b;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r1.write(r0);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r1.flush();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = 3;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r0 = android.util.Log.isLoggable(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        if (r0 == 0) goto L_0x0071;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
    L_0x0049:
        r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = r6.f28603a;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = r3.length();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = r3 + 27;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r4.<init>(r3);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = "processAssets: wrote data: ";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = r4.append(r3);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        android.util.Log.d(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
    L_0x0071:
        r0 = 1;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = "WearableClient";	 Catch:{ IOException -> 0x0148 }
        r3 = 3;	 Catch:{ IOException -> 0x0148 }
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x0148 }
        if (r2 == 0) goto L_0x00a7;	 Catch:{ IOException -> 0x0148 }
    L_0x007f:
        r2 = "WearableClient";	 Catch:{ IOException -> 0x0148 }
        r3 = r6.f28603a;	 Catch:{ IOException -> 0x0148 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0148 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0148 }
        r4 = r4.length();	 Catch:{ IOException -> 0x0148 }
        r4 = r4 + 24;	 Catch:{ IOException -> 0x0148 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0148 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x0148 }
        r4 = "processAssets: closing: ";	 Catch:{ IOException -> 0x0148 }
        r4 = r5.append(r4);	 Catch:{ IOException -> 0x0148 }
        r3 = r4.append(r3);	 Catch:{ IOException -> 0x0148 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0148 }
        android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x0148 }
    L_0x00a7:
        r1.close();	 Catch:{ IOException -> 0x0148 }
    L_0x00aa:
        return r0;
    L_0x00ab:
        r0 = move-exception;
        r0 = "WearableClient";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = r6.f28603a;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = r3.length();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = r3 + 36;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r4.<init>(r3);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = "processAssets: writing data failed: ";	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r3 = r4.append(r3);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        android.util.Log.w(r0, r2);	 Catch:{ IOException -> 0x00ab, all -> 0x010e }
        r0 = "WearableClient";
        r2 = 3;
        r0 = android.util.Log.isLoggable(r0, r2);
        if (r0 == 0) goto L_0x0105;
    L_0x00dd:
        r0 = "WearableClient";
        r2 = r6.f28603a;
        r2 = java.lang.String.valueOf(r2);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 24;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "processAssets: closing: ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r2 = r2.toString();
        android.util.Log.d(r0, r2);
    L_0x0105:
        r1.close();
    L_0x0108:
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);
        goto L_0x00aa;
    L_0x010e:
        r0 = move-exception;
        r2 = "WearableClient";	 Catch:{ IOException -> 0x0144 }
        r3 = 3;	 Catch:{ IOException -> 0x0144 }
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x0144 }
        if (r2 == 0) goto L_0x0140;	 Catch:{ IOException -> 0x0144 }
    L_0x0118:
        r2 = "WearableClient";	 Catch:{ IOException -> 0x0144 }
        r3 = r6.f28603a;	 Catch:{ IOException -> 0x0144 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0144 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x0144 }
        r4 = r4.length();	 Catch:{ IOException -> 0x0144 }
        r4 = r4 + 24;	 Catch:{ IOException -> 0x0144 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0144 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x0144 }
        r4 = "processAssets: closing: ";	 Catch:{ IOException -> 0x0144 }
        r4 = r5.append(r4);	 Catch:{ IOException -> 0x0144 }
        r3 = r4.append(r3);	 Catch:{ IOException -> 0x0144 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0144 }
        android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x0144 }
    L_0x0140:
        r1.close();	 Catch:{ IOException -> 0x0144 }
    L_0x0143:
        throw r0;
    L_0x0144:
        r1 = move-exception;
        goto L_0x0143;
    L_0x0146:
        r0 = move-exception;
        goto L_0x0108;
    L_0x0148:
        r1 = move-exception;
        goto L_0x00aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.bu.a():java.lang.Boolean");
    }

    public final /* synthetic */ Object call() {
        return m26774a();
    }
}
