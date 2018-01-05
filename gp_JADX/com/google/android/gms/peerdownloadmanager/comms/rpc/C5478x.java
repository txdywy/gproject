package com.google.android.gms.peerdownloadmanager.comms.rpc;

final class C5478x {
    C5478x() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.peerdownloadmanager.comms.rpc.ab m26354a(com.google.android.gms.peerdownloadmanager.common.C5371a r9, com.google.android.gms.peerdownloadmanager.common.C5373c r10, java.io.InputStream r11, java.io.OutputStream r12, int r13) {
        /*
        r0 = new com.google.common.f.a.bf;
        r0.<init>();
        r2 = new com.google.common.f.a.bf;
        r2.<init>();
        r3 = new java.util.concurrent.atomic.AtomicBoolean;
        r1 = 0;
        r3.<init>(r1);
        r1 = new com.google.android.gms.peerdownloadmanager.comms.rpc.y;
        r1.<init>(r0, r10, r3);
        r4 = com.google.common.f.a.ba.a;
        r2.a(r1, r4);
        r1 = 2;
        r1 = new com.google.common.f.a.au[r1];
        r4 = 0;
        r1[r4] = r0;
        r4 = 1;
        r1[r4] = r2;
        r4 = com.google.common.f.a.ak.a(r1);
        r1 = 0;
        r5 = new com.google.android.gms.peerdownloadmanager.comms.rpc.a.d;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r6 = r10.f27939a;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r7 = new com.google.android.gms.peerdownloadmanager.comms.rpc.z;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r7.<init>(r0);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r5.<init>(r6, r12, r7);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r0 = new com.google.android.gms.peerdownloadmanager.comms.rpc.a.e;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r6 = r10.f27940b;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r7 = new com.google.android.gms.peerdownloadmanager.comms.rpc.aa;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r7.<init>(r2);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r0.<init>(r11, r6, r7);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2 = new com.google.android.gms.common.b.a;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2.<init>(r5);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2.start();	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2 = new com.google.android.gms.common.b.a;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2.<init>(r0);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2.start();	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r0 = "StreamManager";
        r2 = java.lang.String.valueOf(r9);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r5 = r5.length();	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r5 = r5 + 21;
        r6 = new java.lang.StringBuilder;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r6.<init>(r5);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r5 = "transfer running for ";
        r5 = r6.append(r5);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2 = r5.append(r2);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2 = r2.toString();	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        android.util.Log.d(r0, r2);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r6 = (long) r13;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r4.get(r6, r0);	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r0 = r3.get();	 Catch:{ TimeoutException -> 0x0107, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        if (r0 != 0) goto L_0x0104;
    L_0x0082:
        r0 = 1;
    L_0x0083:
        r1 = "StreamManager";
        r2 = java.lang.String.valueOf(r9);	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r3 = r3.length();	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r3 = r3 + 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r5.<init>(r3);	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r3 = "transfer was voluntarily stopped by ";
        r3 = r5.append(r3);	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2 = r3.append(r2);	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2 = r2.toString();	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        android.util.Log.d(r1, r2);	 Catch:{ TimeoutException -> 0x01e9, ExecutionException -> 0x0134, InterruptedException -> 0x015d }
        r2 = r0;
    L_0x00aa:
        com.google.android.gms.peerdownloadmanager.common.aa.m26135a(r10);
        r0 = 5;
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r0 = r4.get(r0, r3);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r0 = (java.util.List) r0;	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r1 = 0;
        r1 = r0.get(r1);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r1 = (com.google.android.gms.peerdownloadmanager.comms.rpc.p299a.C5439c) r1;	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r3 = 1;
        r0 = r0.get(r3);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r0 = (com.google.android.gms.peerdownloadmanager.comms.rpc.p299a.C5439c) r0;	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r4 = r1.f28137b;	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x01ec;
    L_0x00cd:
        r4 = r0.f28138c;	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x01ec;
    L_0x00d5:
        r2 = "StreamManager";
        r3 = java.lang.String.valueOf(r9);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r4 = r4.length();	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r4 = r4 + 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r5.<init>(r4);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r4 = "no data was transferred, marking app finished ";
        r4 = r5.append(r4);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r3 = r4.append(r3);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r3 = r3.toString();	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        android.util.Log.d(r2, r3);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r2 = 1;
        r3 = r2;
    L_0x00fd:
        r2 = new com.google.android.gms.peerdownloadmanager.comms.rpc.a;	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r2.<init>(r1, r0, r3);	 Catch:{ InterruptedException -> 0x018e, ExecutionException -> 0x01bf, TimeoutException -> 0x01e7 }
        r0 = r2;
    L_0x0103:
        return r0;
    L_0x0104:
        r0 = 0;
        goto L_0x0083;
    L_0x0107:
        r0 = move-exception;
        r8 = r0;
        r0 = r1;
        r1 = r8;
    L_0x010b:
        r2 = "StreamManager";
        r3 = java.lang.String.valueOf(r9);
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r5 = r5 + 34;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "transfer was forcibly stopped for ";
        r5 = r6.append(r5);
        r3 = r5.append(r3);
        r3 = r3.toString();
        android.util.Log.e(r2, r3, r1);
        r2 = r0;
        goto L_0x00aa;
    L_0x0134:
        r0 = move-exception;
        r1 = "StreamManager";
        r2 = java.lang.String.valueOf(r9);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 31;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "transfer failed unexpected for ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r2 = r2.toString();
        android.util.Log.e(r1, r2, r0);
        r0 = 0;
        goto L_0x0103;
    L_0x015d:
        r0 = move-exception;
        r1 = "StreamManager";
        r2 = java.lang.String.valueOf(r9);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 29;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "transfer was interrupted for ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r2 = r2.toString();
        android.util.Log.e(r1, r2, r0);
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        r0 = 0;
        goto L_0x0103;
    L_0x018e:
        r0 = move-exception;
        r1 = java.lang.Thread.currentThread();
        r1.interrupt();
        r1 = "StreamManager";
        r2 = java.lang.String.valueOf(r9);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 46;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "interrupted while draining the socket for app ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r2 = r2.toString();
        android.util.Log.e(r1, r2, r0);
    L_0x01bc:
        r0 = 0;
        goto L_0x0103;
    L_0x01bf:
        r0 = move-exception;
    L_0x01c0:
        r1 = "StreamManager";
        r2 = java.lang.String.valueOf(r9);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 39;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "failed to timely shutdown transfer for ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r2 = r2.toString();
        android.util.Log.e(r1, r2, r0);
        goto L_0x01bc;
    L_0x01e7:
        r0 = move-exception;
        goto L_0x01c0;
    L_0x01e9:
        r1 = move-exception;
        goto L_0x010b;
    L_0x01ec:
        r3 = r2;
        goto L_0x00fd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.peerdownloadmanager.comms.rpc.x.a(com.google.android.gms.peerdownloadmanager.common.a, com.google.android.gms.peerdownloadmanager.common.c, java.io.InputStream, java.io.OutputStream, int):com.google.android.gms.peerdownloadmanager.comms.rpc.ab");
    }
}
