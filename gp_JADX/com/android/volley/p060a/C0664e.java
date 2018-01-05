package com.android.volley.p060a;

import android.support.v7.widget.eq;
import com.android.volley.C0656n;
import com.android.volley.C0663k;
import com.android.volley.C0684b;
import com.android.volley.C0689z;
import com.android.volley.C0695j;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.aa;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public final class C0664e implements C0663k {
    public static final boolean f4066a = aa.f4124b;
    public final C0654d f4067b;
    public final C0665f f4068c;

    @Deprecated
    public C0664e(C0653p c0653p) {
        this(c0653p, new C0665f(eq.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    @Deprecated
    public C0664e(C0653p c0653p, C0665f c0665f) {
        this.f4067b = new C0655a(c0653p);
        this.f4068c = c0665f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.volley.C0697m mo1072a(com.android.volley.C0656n r21) {
        /*
        r20 = this;
        r18 = android.os.SystemClock.elapsedRealtime();
    L_0x0004:
        r3 = 0;
        r9 = 0;
        r8 = java.util.Collections.emptyList();
        r0 = r21;
        r4 = r0.f4039n;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        if (r4 != 0) goto L_0x0044;
    L_0x0010:
        r2 = java.util.Collections.emptyMap();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
    L_0x0014:
        r0 = r20;
        r4 = r0.f4067b;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r0 = r21;
        r17 = r4.mo1054a(r0, r2);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r0 = r17;
        r3 = r0.f4091a;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r0 = r17;
        r2 = r0.f4092b;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r8 = java.util.Collections.unmodifiableList(r2);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r3 != r2) goto L_0x0095;
    L_0x002e:
        r0 = r21;
        r2 = r0.f4039n;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        if (r2 != 0) goto L_0x007f;
    L_0x0034:
        r2 = new com.android.volley.m;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r3 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r4 = 0;
        r5 = 1;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r6 = r6 - r18;
        r2.<init>(r3, r4, r5, r6, r8);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
    L_0x0043:
        return r2;
    L_0x0044:
        r2 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r5 = r4.f4132b;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        if (r5 == 0) goto L_0x0054;
    L_0x004d:
        r5 = "If-None-Match";
        r6 = r4.f4132b;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r2.put(r5, r6);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
    L_0x0054:
        r6 = r4.f4134d;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r10 = 0;
        r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r5 <= 0) goto L_0x0014;
    L_0x005c:
        r5 = "If-Modified-Since";
        r6 = r4.f4134d;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r4 = com.android.volley.p060a.C0673n.m4463a();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r10 = new java.util.Date;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r10.<init>(r6);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r4 = r4.format(r10);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        r2.put(r5, r4);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01b7 }
        goto L_0x0014;
    L_0x0071:
        r2 = move-exception;
        r2 = "socket";
        r3 = new com.android.volley.TimeoutError;
        r3.<init>();
        r0 = r21;
        com.android.volley.p060a.C0664e.m4423a(r2, r0, r3);
        goto L_0x0004;
    L_0x007f:
        r16 = com.android.volley.p060a.C0664e.m4422a(r8, r2);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r10 = new com.android.volley.m;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r11 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r12 = r2.f4131a;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r13 = 1;
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r14 = r2 - r18;
        r10.<init>(r11, r12, r13, r14, r16);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r2 = r10;
        goto L_0x0043;
    L_0x0095:
        r0 = r17;
        r2 = r0.f4094d;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        if (r2 == 0) goto L_0x0111;
    L_0x009b:
        r0 = r17;
        r4 = r0.f4093c;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        r0 = r20;
        r4 = r0.m4424a(r2, r4);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
    L_0x00a5:
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r6 = r6 - r18;
        r2 = f4066a;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        if (r2 != 0) goto L_0x00b5;
    L_0x00af:
        r10 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x00e7;
    L_0x00b5:
        r5 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
        r2 = 5;
        r9 = new java.lang.Object[r2];	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r2 = 0;
        r9[r2] = r21;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r2 = 1;
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r9[r2] = r6;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r6 = 2;
        if (r4 == 0) goto L_0x0115;
    L_0x00c7:
        r2 = r4.length;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
    L_0x00cc:
        r9[r6] = r2;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r2 = 3;
        r6 = java.lang.Integer.valueOf(r3);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r9[r2] = r6;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r2 = 4;
        r0 = r21;
        r6 = r0.f4038m;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r6 = r6.mo1079b();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r9[r2] = r6;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        com.android.volley.aa.m4482b(r5, r9);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
    L_0x00e7:
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 < r2) goto L_0x00ef;
    L_0x00eb:
        r2 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r3 <= r2) goto L_0x0118;
    L_0x00ef:
        r2 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        throw r2;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
    L_0x00f5:
        r2 = move-exception;
        r3 = r2;
        r4 = new java.lang.RuntimeException;
        r5 = "Bad URL ";
        r2 = r21.mo1545d();
        r2 = java.lang.String.valueOf(r2);
        r6 = r2.length();
        if (r6 == 0) goto L_0x0167;
    L_0x0109:
        r2 = r5.concat(r2);
    L_0x010d:
        r4.<init>(r2, r3);
        throw r4;
    L_0x0111:
        r2 = 0;
        r4 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x01bb }
        goto L_0x00a5;
    L_0x0115:
        r2 = "null";
        goto L_0x00cc;
    L_0x0118:
        r2 = new com.android.volley.m;	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r5 = 0;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        r6 = r6 - r18;
        r2.<init>(r3, r4, r5, r6, r8);	 Catch:{ SocketTimeoutException -> 0x0071, MalformedURLException -> 0x00f5, IOException -> 0x0126 }
        goto L_0x0043;
    L_0x0126:
        r2 = move-exception;
        r3 = r17;
    L_0x0129:
        if (r3 == 0) goto L_0x016d;
    L_0x012b:
        r3 = r3.f4091a;
        r2 = "Unexpected response code %d for %s";
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = java.lang.Integer.valueOf(r3);
        r5[r6] = r7;
        r6 = 1;
        r7 = r21.mo1545d();
        r5[r6] = r7;
        com.android.volley.aa.m4483c(r2, r5);
        if (r4 == 0) goto L_0x01a9;
    L_0x0145:
        r2 = new com.android.volley.m;
        r5 = 0;
        r6 = android.os.SystemClock.elapsedRealtime();
        r6 = r6 - r18;
        r2.<init>(r3, r4, r5, r6, r8);
        r4 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r3 == r4) goto L_0x0159;
    L_0x0155:
        r4 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r3 != r4) goto L_0x0173;
    L_0x0159:
        r3 = "auth";
        r4 = new com.android.volley.AuthFailureError;
        r4.<init>(r2);
        r0 = r21;
        com.android.volley.p060a.C0664e.m4423a(r3, r0, r4);
        goto L_0x0004;
    L_0x0167:
        r2 = new java.lang.String;
        r2.<init>(r5);
        goto L_0x010d;
    L_0x016d:
        r3 = new com.android.volley.NoConnectionError;
        r3.<init>(r2);
        throw r3;
    L_0x0173:
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r3 < r4) goto L_0x0181;
    L_0x0177:
        r4 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        if (r3 > r4) goto L_0x0181;
    L_0x017b:
        r3 = new com.android.volley.ClientError;
        r3.<init>(r2);
        throw r3;
    L_0x0181:
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r3 < r4) goto L_0x01a3;
    L_0x0185:
        r4 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        if (r3 > r4) goto L_0x01a3;
    L_0x0189:
        r0 = r21;
        r3 = r0.f4037l;
        if (r3 == 0) goto L_0x019d;
    L_0x018f:
        r3 = "server";
        r4 = new com.android.volley.ServerError;
        r4.<init>(r2);
        r0 = r21;
        com.android.volley.p060a.C0664e.m4423a(r3, r0, r4);
        goto L_0x0004;
    L_0x019d:
        r3 = new com.android.volley.ServerError;
        r3.<init>(r2);
        throw r3;
    L_0x01a3:
        r3 = new com.android.volley.ServerError;
        r3.<init>(r2);
        throw r3;
    L_0x01a9:
        r2 = "network";
        r3 = new com.android.volley.NetworkError;
        r3.<init>();
        r0 = r21;
        com.android.volley.p060a.C0664e.m4423a(r2, r0, r3);
        goto L_0x0004;
    L_0x01b7:
        r2 = move-exception;
        r4 = r9;
        goto L_0x0129;
    L_0x01bb:
        r2 = move-exception;
        r4 = r9;
        r3 = r17;
        goto L_0x0129;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.a.e.a(com.android.volley.n):com.android.volley.m");
    }

    private static void m4423a(String str, C0656n c0656n, VolleyError volleyError) {
        C0689z c0689z = c0656n.f4038m;
        int o = c0656n.m4382o();
        try {
            c0689z.mo1078a(volleyError);
            c0656n.m4366a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(o)}));
        } catch (VolleyError e) {
            c0656n.m4366a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(o)}));
            throw e;
        }
    }

    private final byte[] m4424a(InputStream inputStream, int i) {
        af afVar = new af(this.f4068c, i);
        if (inputStream == null) {
            try {
                throw new ServerError();
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        aa.m4480a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f4068c.m4427a(null);
                afVar.close();
            }
        } else {
            byte[] a = this.f4068c.m4428a((int) MemoryMappedFileBuffer.DEFAULT_PADDING);
            while (true) {
                int read = inputStream.read(a);
                if (read == -1) {
                    break;
                }
                afVar.write(a, 0, read);
            }
            byte[] toByteArray = afVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    aa.m4480a("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f4068c.m4427a(a);
            afVar.close();
            return toByteArray;
        }
    }

    private static List m4422a(List list, C0684b c0684b) {
        Set treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C0695j c0695j : list) {
                treeSet.add(c0695j.f4159a);
            }
        }
        List arrayList = new ArrayList(list);
        if (c0684b.f4138h != null) {
            if (!c0684b.f4138h.isEmpty()) {
                for (C0695j c0695j2 : c0684b.f4138h) {
                    if (!treeSet.contains(c0695j2.f4159a)) {
                        arrayList.add(c0695j2);
                    }
                }
            }
        } else if (!c0684b.f4137g.isEmpty()) {
            for (Entry entry : c0684b.f4137g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C0695j((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return arrayList;
    }
}
