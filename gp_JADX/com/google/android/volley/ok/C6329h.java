package com.google.android.volley.ok;

import android.content.Context;
import com.android.volley.aa;
import com.google.android.p102c.C0925g;
import com.google.android.volley.ok.a.a;
import com.squareup.okhttp.ad;
import com.squareup.okhttp.k;
import com.squareup.okhttp.o;
import com.squareup.okhttp.p;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import org.apache.http.ProtocolVersion;

public final class C6329h extends C6327c {
    public static final o f31633l = new p(o.b).a(new k[]{k.aK, k.aO, k.W, k.am, k.al, k.av, k.aw, k.aj, k.at, k.F, k.E, k.J, k.U, k.D, k.H, k.e}).b();
    public static final List f31634m = Arrays.asList(new o[]{f31633l, o.d});
    public static final ProtocolVersion f31635n = new ProtocolVersion("HTTP", 1, 0);
    public static final ProtocolVersion f31636o = new ProtocolVersion("HTTP", 1, 1);
    public static final ProtocolVersion f31637p = new ProtocolVersion("HTTP", 2, 0);
    public static final ProtocolVersion f31638q = new ProtocolVersion("SPD", 3, 1);
    public static final byte[] f31639r = new byte[0];
    public boolean f31640i;
    public l f31641j;
    public UrlRewriter f31642k;
    public i f31643s;

    public C6329h(Context context, ad adVar, UrlRewriter urlRewriter, boolean z) {
        this(adVar, urlRewriter, null, C0925g.m5657a(context.getContentResolver(), "http_stats", false), z);
    }

    private C6329h(ad adVar, UrlRewriter urlRewriter, l lVar, boolean z, boolean z2) {
        this.f31640i = z;
        this.f31642k = urlRewriter;
        if (this.f31640i) {
            lVar = new a();
        }
        this.f31641j = lVar;
        if (z2) {
            adVar.f31794j.add(new a(aa.f4123a));
        }
        adVar.m29019a(f31634m);
        this.f31643s = new i(adVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.apache.http.HttpResponse mo1053b(com.android.volley.C0656n r11, java.util.Map r12) {
        /*
        r10 = this;
        r4 = 0;
        r2 = 0;
        r0 = r10.f31643s;
        r1 = r11.m4382o();
        r5 = r0.a(r1);
        r6 = r11.mo1547h();
        r1 = r11.f4027b;
        r3 = r11.mo1061m();
        switch(r1) {
            case -1: goto L_0x0034;
            case 0: goto L_0x0082;
            case 1: goto L_0x0085;
            case 2: goto L_0x0088;
            case 3: goto L_0x0094;
            case 4: goto L_0x008e;
            case 5: goto L_0x0097;
            case 6: goto L_0x0091;
            case 7: goto L_0x008b;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = new java.lang.IllegalArgumentException;
        r2 = 38;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Unknown HTTP Method value: ";
        r2 = r3.append(r2);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0034:
        if (r3 != 0) goto L_0x007f;
    L_0x0036:
        r0 = "GET";
    L_0x0038:
        r7 = r11.mo1060l();
        switch(r1) {
            case -1: goto L_0x009a;
            case 0: goto L_0x003f;
            case 1: goto L_0x00a5;
            case 2: goto L_0x00a5;
            case 3: goto L_0x003f;
            case 4: goto L_0x003f;
            case 5: goto L_0x003f;
            case 6: goto L_0x003f;
            case 7: goto L_0x00a5;
            default: goto L_0x003f;
        };
    L_0x003f:
        r1 = r2;
    L_0x0040:
        r3 = r11.mo1545d();
        r7 = r10.f31642k;
        if (r7 == 0) goto L_0x004e;
    L_0x0048:
        r7 = r10.f31642k;
        r3 = r7.mo5391a(r3);
    L_0x004e:
        r7 = new com.squareup.okhttp.ah;
        r7.<init>();
        r3 = r7.a(r3);
        r3 = r3.a(r0, r1);
        r0 = r6.entrySet();
        r7 = r0.iterator();
    L_0x0063:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00b7;
    L_0x0069:
        r0 = r7.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r3.b(r1, r0);
        goto L_0x0063;
    L_0x007f:
        r0 = "POST";
        goto L_0x0038;
    L_0x0082:
        r0 = "GET";
        goto L_0x0038;
    L_0x0085:
        r0 = "POST";
        goto L_0x0038;
    L_0x0088:
        r0 = "PUT";
        goto L_0x0038;
    L_0x008b:
        r0 = "PATCH";
        goto L_0x0038;
    L_0x008e:
        r0 = "HEAD";
        goto L_0x0038;
    L_0x0091:
        r0 = "TRACE";
        goto L_0x0038;
    L_0x0094:
        r0 = "DELETE";
        goto L_0x0038;
    L_0x0097:
        r0 = "OPTIONS";
        goto L_0x0038;
    L_0x009a:
        if (r3 == 0) goto L_0x003f;
    L_0x009c:
        r1 = com.squareup.okhttp.ac.a(r7);
        r1 = com.squareup.okhttp.ai.a(r1, r3);
        goto L_0x0040;
    L_0x00a5:
        if (r3 != 0) goto L_0x00ae;
    L_0x00a7:
        r1 = f31639r;
        r1 = com.squareup.okhttp.ai.a(r2, r1);
        goto L_0x0040;
    L_0x00ae:
        r1 = com.squareup.okhttp.ac.a(r7);
        r1 = com.squareup.okhttp.ai.a(r1, r3);
        goto L_0x0040;
    L_0x00b7:
        if (r12 == 0) goto L_0x00e3;
    L_0x00b9:
        r0 = r12.isEmpty();
        if (r0 != 0) goto L_0x00e3;
    L_0x00bf:
        r0 = r12.entrySet();
        r7 = r0.iterator();
    L_0x00c7:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00e3;
    L_0x00cd:
        r0 = r7.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r3.b(r1, r0);
        goto L_0x00c7;
    L_0x00e3:
        r0 = r3.a();
        r1 = r5.m29020a(r0);
        r0 = r10.f31640i;
        if (r0 == 0) goto L_0x019a;
    L_0x00ef:
        r0 = r10.f31641j;
        r0 = r0.a();
        r3 = r0;
    L_0x00f6:
        r5 = r1.a();	 Catch:{ InterruptedIOException -> 0x0161 }
        r1 = new org.apache.http.entity.BasicHttpEntity;
        r1.<init>();
        r0 = new com.google.android.volley.ok.k;
        r7 = r5.g;
        r7 = r7.c();
        r0.<init>(r7);
        r1.setContent(r0);
        r0 = r5.g;
        r8 = r0.b();
        r1.setContentLength(r8);
        r0 = "Content-Encoding";
        r7 = r5.f;
        r0 = r7.a(r0);
        if (r0 == 0) goto L_0x0121;
    L_0x0120:
        r2 = r0;
    L_0x0121:
        r1.setContentEncoding(r2);
        r0 = r5.g;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0133;
    L_0x012c:
        r0 = r0.toString();
        r1.setContentType(r0);
    L_0x0133:
        r2 = r5.c;
        r0 = r10.f31640i;
        if (r0 == 0) goto L_0x0198;
    L_0x0139:
        r0 = "User-Agent";
        r0 = r6.get(r0);
        r0 = (java.lang.String) r0;
        r0 = r3.a(r0, r1);
    L_0x0145:
        r3 = new org.apache.http.message.BasicStatusLine;
        r1 = r5.b;
        r6 = r1.ordinal();
        switch(r6) {
            case 0: goto L_0x0167;
            case 1: goto L_0x018e;
            case 2: goto L_0x0194;
            case 3: goto L_0x0191;
            default: goto L_0x0150;
        };
    L_0x0150:
        r0 = new java.lang.IllegalArgumentException;
        r2 = "Unknown protocol: %s";
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r3[r4] = r1;
        r1 = java.lang.String.format(r2, r3);
        r0.<init>(r1);
        throw r0;
    L_0x0161:
        r0 = move-exception;
        r0 = com.google.android.volley.ok.C6329h.m28979b(r0);
        throw r0;
    L_0x0167:
        r1 = f31635n;
    L_0x0169:
        r6 = r5.d;
        r3.<init>(r1, r2, r6);
        r1 = new org.apache.http.message.BasicHttpResponse;
        r1.<init>(r3);
        r1.setEntity(r0);
        r2 = r5.f;
        r0 = r2.a;
        r0 = r0.length;
        r3 = r0 / 2;
        r0 = r4;
    L_0x017e:
        if (r0 >= r3) goto L_0x0197;
    L_0x0180:
        r4 = r2.a(r0);
        r5 = r2.b(r0);
        r1.addHeader(r4, r5);
        r0 = r0 + 1;
        goto L_0x017e;
    L_0x018e:
        r1 = f31636o;
        goto L_0x0169;
    L_0x0191:
        r1 = f31637p;
        goto L_0x0169;
    L_0x0194:
        r1 = f31638q;
        goto L_0x0169;
    L_0x0197:
        return r1;
    L_0x0198:
        r0 = r1;
        goto L_0x0145;
    L_0x019a:
        r3 = r2;
        goto L_0x00f6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.volley.ok.h.b(com.android.volley.n, java.util.Map):org.apache.http.HttpResponse");
    }

    static InterruptedIOException m28979b(InterruptedIOException interruptedIOException) {
        if ("timeout".equals(interruptedIOException.getMessage())) {
            return new SocketTimeoutException();
        }
        return interruptedIOException;
    }
}
