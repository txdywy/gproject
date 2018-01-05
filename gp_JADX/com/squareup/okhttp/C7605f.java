package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.C7649a;
import com.squareup.okhttp.internal.http.C7666q;
import com.squareup.okhttp.internal.p528c.C7643b;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.ProxySelector;
import javax.net.SocketFactory;

public final class C7605f {
    public final ad f39354a;
    public boolean f39355b;
    public volatile boolean f39356c;
    public ag f39357d;
    public C7666q f39358e;

    protected C7605f(ad adVar, ag agVar) {
        ad adVar2 = new ad(adVar);
        if (adVar2.k == null) {
            adVar2.k = ProxySelector.getDefault();
        }
        if (adVar2.l == null) {
            adVar2.l = CookieHandler.getDefault();
        }
        if (adVar2.o == null) {
            adVar2.o = SocketFactory.getDefault();
        }
        if (adVar2.p == null) {
            adVar2.p = adVar.a();
        }
        if (adVar2.q == null) {
            adVar2.q = C7643b.f39578a;
        }
        if (adVar2.r == null) {
            adVar2.r = C7607h.f39363a;
        }
        if (adVar2.s == null) {
            adVar2.s = C7649a.f39595a;
        }
        if (adVar2.t == null) {
            adVar2.t = C7680m.f39768a;
        }
        if (adVar2.g == null) {
            adVar2.g = ad.a;
        }
        if (adVar2.h == null) {
            adVar2.h = ad.b;
        }
        if (adVar2.u == null) {
            adVar2.u = C7686s.f39789a;
        }
        this.f39354a = adVar2;
        this.f39357d = agVar;
    }

    public final ak m36672a() {
        synchronized (this) {
            if (this.f39355b) {
                throw new IllegalStateException("Already Executed");
            }
            this.f39355b = true;
        }
        try {
            this.f39354a.e.m37008a(this);
            ak a = new C7606g(this, 0, this.f39357d, false).mo6420a(this.f39357d);
            if (a != null) {
                return a;
            }
            throw new IOException("Canceled");
        } finally {
            this.f39354a.e.m37009b(this);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final com.squareup.okhttp.ak m36673a(com.squareup.okhttp.ag r23, boolean r24) {
        /*
        r22 = this;
        r0 = r23;
        r2 = r0.f39291d;
        if (r2 == 0) goto L_0x0867;
    L_0x0006:
        r3 = r23.m36632b();
        r4 = r2.mo6416a();
        if (r4 == 0) goto L_0x0019;
    L_0x0010:
        r5 = "Content-Type";
        r4 = r4.toString();
        r3.m36640a(r5, r4);
    L_0x0019:
        r4 = r2.mo6418b();
        r6 = -1;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 == 0) goto L_0x0065;
    L_0x0023:
        r2 = "Content-Length";
        r4 = java.lang.Long.toString(r4);
        r3.m36640a(r2, r4);
        r2 = "Transfer-Encoding";
        r3.m36641b(r2);
    L_0x0031:
        r4 = r3.m36636a();
    L_0x0035:
        r2 = new com.squareup.okhttp.internal.http.q;
        r0 = r22;
        r3 = r0.f39354a;
        r5 = 0;
        r6 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r7 = r24;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);
        r0 = r22;
        r0.f39358e = r2;
        r2 = 0;
        r11 = r2;
    L_0x004b:
        r0 = r22;
        r2 = r0.f39356c;
        if (r2 == 0) goto L_0x0072;
    L_0x0051:
        r0 = r22;
        r2 = r0.f39358e;
        r2 = r2.f39678c;
        r3 = 0;
        r4 = 1;
        r5 = 0;
        r2.m36917a(r3, r4, r5);
        r2 = new java.io.IOException;
        r3 = "Canceled";
        r2.<init>(r3);
        throw r2;
    L_0x0065:
        r2 = "Transfer-Encoding";
        r4 = "chunked";
        r3.m36640a(r2, r4);
        r2 = "Content-Length";
        r3.m36641b(r2);
        goto L_0x0031;
    L_0x0072:
        r13 = 1;
        r0 = r22;
        r9 = r0.f39358e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r9.f39693r;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x040f;
    L_0x007b:
        r2 = r9.f39680e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x009f;
    L_0x007f:
        r2 = new java.lang.IllegalStateException;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.<init>();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        throw r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0085:
        r2 = move-exception;
        r2 = new java.lang.NoSuchMethodError;	 Catch:{ all -> 0x008c }
        r2.<init>();	 Catch:{ all -> 0x008c }
        throw r2;	 Catch:{ all -> 0x008c }
    L_0x008c:
        r2 = move-exception;
        r3 = r13;
    L_0x008e:
        if (r3 == 0) goto L_0x009e;
    L_0x0090:
        r0 = r22;
        r3 = r0.f39358e;
        r3 = r3.m36970b();
        r4 = 0;
        r5 = 1;
        r6 = 0;
        r3.m36917a(r4, r5, r6);
    L_0x009e:
        throw r2;
    L_0x009f:
        r2 = r9.f39684i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r2.m36632b();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = "Host";
        r4 = r2.m36630a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 != 0) goto L_0x00b8;
    L_0x00ad:
        r4 = "Host";
        r5 = r2.f39288a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = com.squareup.okhttp.internal.k.a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.m36640a(r4, r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x00b8:
        r4 = "Connection";
        r4 = r2.m36630a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 != 0) goto L_0x00c7;
    L_0x00c0:
        r4 = "Connection";
        r5 = "Keep-Alive";
        r3.m36640a(r4, r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x00c7:
        r4 = "Accept-Encoding";
        r4 = r2.m36630a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 != 0) goto L_0x00d9;
    L_0x00cf:
        r4 = 1;
        r9.f39682g = r4;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = "Accept-Encoding";
        r5 = "gzip";
        r3.m36640a(r4, r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x00d9:
        r4 = r9.f39677b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 == 0) goto L_0x00f4;
    L_0x00df:
        r5 = r3.m36636a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r5.f39290c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = com.squareup.okhttp.internal.http.C7671w.m36989b(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r2.m36631a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.get(r6, r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        com.squareup.okhttp.internal.http.C7671w.m36986a(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x00f4:
        r4 = "User-Agent";
        r2 = r2.m36630a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x0103;
    L_0x00fc:
        r2 = "User-Agent";
        r4 = "okhttp/2.7.2";
        r3.m36640a(r2, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0103:
        r10 = r3.m36636a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.C7600b.f39287b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r9.f39677b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r12 = r2.mo6410a(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r12 == 0) goto L_0x01e9;
    L_0x0111:
        r2 = r12.m36872a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r8 = r2;
    L_0x0116:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r14 = new com.squareup.okhttp.internal.http.d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r14.<init>(r2, r10, r8);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x01ed;
    L_0x0123:
        r2 = new com.squareup.okhttp.internal.http.c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = 0;
        r2.<init>(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x012b:
        r3 = r2.f39618a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r3 == 0) goto L_0x0140;
    L_0x012f:
        r3 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r3.m36634c();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r3.f39344j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r3 == 0) goto L_0x0140;
    L_0x0139:
        r2 = new com.squareup.okhttp.internal.http.c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = 0;
        r4 = 0;
        r2.<init>(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0140:
        r9.f39693r = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r9.f39693r;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39618a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39685j = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r9.f39693r;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39619b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39686k = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r12 == 0) goto L_0x0153;
    L_0x0150:
        r12.m36877f();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0153:
        if (r8 == 0) goto L_0x015e;
    L_0x0155:
        r2 = r9.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x015e;
    L_0x0159:
        r2 = r8.f39310g;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        com.squareup.okhttp.internal.k.a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x015e:
        r2 = r9.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0441;
    L_0x0162:
        r2 = r9.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39289b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = "GET";
        r2 = r2.equals(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x03f7;
    L_0x016e:
        r7 = 1;
    L_0x016f:
        r2 = r9.f39678c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r9.f39677b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r3.y;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r9.f39677b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.z;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r9.f39677b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r5.A;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r9.f39677b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r6.x;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36913a(r3, r4, r5, r6, r7);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39680e = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r9.f39680e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.mo6472a(r9);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r9.f39690o;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x040f;
    L_0x0190:
        r2 = r9.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.http.C7666q.m36963a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x040f;
    L_0x0198:
        r2 = r9.f39688m;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x040f;
    L_0x019c:
        r2 = com.squareup.okhttp.internal.http.C7671w.m36981a(r10);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r9.f39683h;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 == 0) goto L_0x042f;
    L_0x01a4:
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x03fa;
    L_0x01ab:
        r2 = new java.lang.IllegalStateException;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = "Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.";
        r2.<init>(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        throw r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x01b3:
        r2 = move-exception;
        r12 = r2;
        r0 = r22;
        r10 = r0.f39358e;	 Catch:{ all -> 0x008c }
        r2 = r10.f39678c;	 Catch:{ all -> 0x008c }
        r3 = r2.f39614d;	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x01c4;
    L_0x01bf:
        r3 = r12.f39594b;	 Catch:{ all -> 0x008c }
        r2.m36916a(r3);	 Catch:{ all -> 0x008c }
    L_0x01c4:
        r3 = r2.f39613c;	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x01d0;
    L_0x01c8:
        r2 = r2.f39613c;	 Catch:{ all -> 0x008c }
        r2 = r2.m36906a();	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x01d9;
    L_0x01d0:
        r2 = r12.f39594b;	 Catch:{ all -> 0x008c }
        r3 = r2 instanceof java.net.ProtocolException;	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x0684;
    L_0x01d6:
        r2 = 0;
    L_0x01d7:
        if (r2 != 0) goto L_0x06a5;
    L_0x01d9:
        r2 = 0;
    L_0x01da:
        if (r2 != 0) goto L_0x06a8;
    L_0x01dc:
        r2 = 0;
    L_0x01dd:
        if (r2 == 0) goto L_0x06cc;
    L_0x01df:
        r3 = 0;
        r0 = r22;
        r0.f39358e = r2;	 Catch:{ all -> 0x01e6 }
        goto L_0x004b;
    L_0x01e6:
        r2 = move-exception;
        goto L_0x008e;
    L_0x01e9:
        r2 = 0;
        r8 = r2;
        goto L_0x0116;
    L_0x01ed:
        r2 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39288a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39796b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = "https";
        r2 = r2.equals(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x022e;
    L_0x01fb:
        r2 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39308e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x022e;
    L_0x0201:
        r2 = new com.squareup.okhttp.internal.http.c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = 0;
        r2.<init>(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x012b;
    L_0x020b:
        r2 = move-exception;
        r12 = r2;
        r0 = r22;
        r10 = r0.f39358e;	 Catch:{ all -> 0x008c }
        r2 = r10.f39678c;	 Catch:{ all -> 0x008c }
        r3 = r2.f39614d;	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x06cf;
    L_0x0217:
        r3 = r2.f39614d;	 Catch:{ all -> 0x008c }
        r3 = r3.f39565g;	 Catch:{ all -> 0x008c }
        r2.m36916a(r12);	 Catch:{ all -> 0x008c }
        r4 = 1;
        if (r3 != r4) goto L_0x06cf;
    L_0x0221:
        r2 = 0;
    L_0x0222:
        if (r2 != 0) goto L_0x06f0;
    L_0x0224:
        r2 = 0;
    L_0x0225:
        if (r2 == 0) goto L_0x0711;
    L_0x0227:
        r3 = 0;
        r0 = r22;
        r0.f39358e = r2;	 Catch:{ all -> 0x01e6 }
        goto L_0x004b;
    L_0x022e:
        r2 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.http.C7651c.m36920a(r2, r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x0242;
    L_0x0238:
        r2 = new com.squareup.okhttp.internal.http.c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = 0;
        r2.<init>(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x012b;
    L_0x0242:
        r2 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r15 = r2.m36634c();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r15.f39335a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x0254;
    L_0x024c:
        r2 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.http.C7652d.m36921a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x025e;
    L_0x0254:
        r2 = new com.squareup.okhttp.internal.http.c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = 0;
        r2.<init>(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x012b;
    L_0x025e:
        r2 = r14.f39623d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0342;
    L_0x0262:
        r2 = 0;
        r4 = r14.f39629j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r14.f39623d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r6.getTime();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4 - r6;
        r2 = java.lang.Math.max(r2, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0271:
        r4 = r14.f39631l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = -1;
        if (r4 == r5) goto L_0x0283;
    L_0x0276:
        r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r14.f39631l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = (long) r5;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.toMillis(r6);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = java.lang.Math.max(r2, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0283:
        r4 = r14.f39629j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r14.f39628i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4 - r6;
        r6 = r14.f39620a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r0 = r14.f39629j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r16 = r0;
        r6 = r6 - r16;
        r2 = r2 + r4;
        r16 = r2 + r6;
        r2 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36653c();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r2.f39337c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = -1;
        if (r3 == r4) goto L_0x0346;
    L_0x029e:
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39337c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = (long) r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.toMillis(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x02a7:
        r4 = r15.f39337c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = -1;
        if (r4 == r5) goto L_0x0864;
    L_0x02ac:
        r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r15.f39337c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = (long) r5;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.toMillis(r6);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r2;
    L_0x02ba:
        r2 = 0;
        r4 = r15.f39343i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = -1;
        if (r4 == r5) goto L_0x0861;
    L_0x02c1:
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r15.f39343i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = (long) r3;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.toMillis(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r2;
    L_0x02cb:
        r2 = 0;
        r0 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r18 = r0;
        r18 = r18.m36653c();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r0 = r18;
        r0 = r0.f39341g;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r19 = r0;
        if (r19 != 0) goto L_0x02f6;
    L_0x02dd:
        r0 = r15.f39342h;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r19 = r0;
        r20 = -1;
        r0 = r19;
        r1 = r20;
        if (r0 == r1) goto L_0x02f6;
    L_0x02e9:
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r15.f39342h;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r0 = (long) r3;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r20 = r0;
        r0 = r20;
        r2 = r2.toMillis(r0);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x02f6:
        r0 = r18;
        r15 = r0.f39335a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r15 != 0) goto L_0x03b3;
    L_0x02fc:
        r18 = r16 + r4;
        r2 = r2 + r6;
        r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x03b3;
    L_0x0303:
        r2 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r2.m36650a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4 + r16;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x0316;
    L_0x030f:
        r2 = "Warning";
        r4 = "110 HttpURLConnection \"Response is stale\"";
        r3.m36660b(r2, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0316:
        r4 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r2 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0336;
    L_0x031d:
        r2 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36653c();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39337c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = -1;
        if (r2 != r4) goto L_0x03b0;
    L_0x0328:
        r2 = r14.f39627h;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x03b0;
    L_0x032c:
        r2 = 1;
    L_0x032d:
        if (r2 == 0) goto L_0x0336;
    L_0x032f:
        r2 = "Warning";
        r4 = "113 HttpURLConnection \"Heuristic expiration\"";
        r3.m36660b(r2, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0336:
        r2 = new com.squareup.okhttp.internal.http.c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r3.m36655a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = 0;
        r2.<init>(r4, r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x012b;
    L_0x0342:
        r2 = 0;
        goto L_0x0271;
    L_0x0346:
        r2 = r14.f39627h;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0369;
    L_0x034a:
        r2 = r14.f39623d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0366;
    L_0x034e:
        r2 = r14.f39623d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.getTime();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0354:
        r4 = r14.f39627h;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.getTime();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r4 - r2;
        r4 = 0;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 > 0) goto L_0x02a7;
    L_0x0362:
        r2 = 0;
        goto L_0x02a7;
    L_0x0366:
        r2 = r14.f39629j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x0354;
    L_0x0369:
        r2 = r14.f39625f;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x03ac;
    L_0x036d:
        r2 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39304a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39288a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r2.f39801g;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r3 != 0) goto L_0x0396;
    L_0x0377:
        r2 = 0;
    L_0x0378:
        if (r2 != 0) goto L_0x03ac;
    L_0x037a:
        r2 = r14.f39623d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x03a5;
    L_0x037e:
        r2 = r14.f39623d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.getTime();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0384:
        r4 = r14.f39625f;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.getTime();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2 - r4;
        r4 = 0;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x03a8;
    L_0x0391:
        r4 = 10;
        r2 = r2 / r4;
        goto L_0x02a7;
    L_0x0396:
        r3 = new java.lang.StringBuilder;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.<init>();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39801g;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        com.squareup.okhttp.C7691x.m37036b(r3, r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.toString();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x0378;
    L_0x03a5:
        r2 = r14.f39628i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x0384;
    L_0x03a8:
        r2 = 0;
        goto L_0x02a7;
    L_0x03ac:
        r2 = 0;
        goto L_0x02a7;
    L_0x03b0:
        r2 = 0;
        goto L_0x032d;
    L_0x03b3:
        r2 = r14.f39621b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36632b();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r14.f39630k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r3 == 0) goto L_0x03d7;
    L_0x03bd:
        r3 = "If-None-Match";
        r4 = r14.f39630k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.m36640a(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x03c4:
        r3 = r2.m36636a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.http.C7652d.m36921a(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x03ef;
    L_0x03ce:
        r2 = new com.squareup.okhttp.internal.http.c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r14.f39622c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.<init>(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x012b;
    L_0x03d7:
        r3 = r14.f39625f;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r3 == 0) goto L_0x03e3;
    L_0x03db:
        r3 = "If-Modified-Since";
        r4 = r14.f39626g;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.m36640a(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x03c4;
    L_0x03e3:
        r3 = r14.f39623d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r3 == 0) goto L_0x03c4;
    L_0x03e7:
        r3 = "If-Modified-Since";
        r4 = r14.f39624e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.m36640a(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x03c4;
    L_0x03ef:
        r2 = new com.squareup.okhttp.internal.http.c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = 0;
        r2.<init>(r3, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x012b;
    L_0x03f7:
        r7 = 0;
        goto L_0x016f;
    L_0x03fa:
        r4 = -1;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0427;
    L_0x0400:
        r4 = r9.f39680e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r9.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4.mo6470a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = new com.squareup.okhttp.internal.http.aa;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = (int) r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4.<init>(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39688m = r4;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x040f:
        r0 = r22;
        r3 = r0.f39358e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.f39687l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x0522;
    L_0x0417:
        r2 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x049c;
    L_0x041b:
        r2 = r3.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x049c;
    L_0x041f:
        r2 = new java.lang.IllegalStateException;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = "call sendRequest() first!";
        r2.<init>(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        throw r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0427:
        r2 = new com.squareup.okhttp.internal.http.aa;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.<init>();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39688m = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x040f;
    L_0x042f:
        r4 = r9.f39680e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r9.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4.mo6470a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r9.f39680e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r9.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r4.mo6469a(r5, r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39688m = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x040f;
    L_0x0441:
        r2 = r9.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0472;
    L_0x0445:
        r2 = r9.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36650a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r9.f39684i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.f39315a = r3;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r9.f39679d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = com.squareup.okhttp.internal.http.C7666q.m36961a(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36661c(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r9.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = com.squareup.okhttp.internal.http.C7666q.m36961a(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36659b(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36655a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39687l = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0469:
        r2 = r9.f39687l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r9.m36969b(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39687l = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x040f;
    L_0x0472:
        r2 = new com.squareup.okhttp.al;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.<init>();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r9.f39684i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.f39315a = r3;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = r9.f39679d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = com.squareup.okhttp.internal.http.C7666q.m36961a(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36661c(r3);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = com.squareup.okhttp.af.b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.f39316b = r3;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r2.f39317c = r3;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = "Unsatisfiable Request (only-if-cached)";
        r2.f39318d = r3;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3 = com.squareup.okhttp.internal.http.C7666q.f39676a;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.f39321g = r3;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36655a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r9.f39687l = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x0469;
    L_0x049c:
        r2 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0522;
    L_0x04a0:
        r2 = r3.f39691p;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0530;
    L_0x04a4:
        r2 = r3.f39680e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.mo6470a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x04ab:
        r2 = r3.m36971c();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x04af:
        r4 = r2.f39309f;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.m36967a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r3.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 == 0) goto L_0x05c5;
    L_0x04b8:
        r4 = r3.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = com.squareup.okhttp.internal.http.C7666q.m36964a(r4, r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 == 0) goto L_0x05be;
    L_0x04c0:
        r4 = r3.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.m36650a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r3.f39684i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4.f39315a = r5;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r3.f39679d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = com.squareup.okhttp.internal.http.C7666q.m36961a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.m36661c(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r3.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r5.f39309f;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r2.f39309f;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = com.squareup.okhttp.internal.http.C7666q.m36962a(r5, r6);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.m36657a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r3.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = com.squareup.okhttp.internal.http.C7666q.m36961a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.m36659b(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = com.squareup.okhttp.internal.http.C7666q.m36961a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.m36656a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.m36655a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.f39687l = r4;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39310g;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.close();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.f39678c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = 0;
        r5 = 1;
        r6 = 0;
        r2.m36917a(r4, r5, r6);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.C7600b.f39287b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r3.f39677b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.mo6410a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.m36876e();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r3.f39687l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        com.squareup.okhttp.internal.http.C7666q.m36961a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.m36875d();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.f39687l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.m36969b(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.f39687l = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0522:
        r0 = r22;
        r2 = r0.f39358e;
        r3 = r2.f39687l;
        if (r3 != 0) goto L_0x0712;
    L_0x052a:
        r2 = new java.lang.IllegalStateException;
        r2.<init>();
        throw r2;
    L_0x0530:
        r2 = r3.f39690o;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x0544;
    L_0x0534:
        r2 = new com.squareup.okhttp.internal.http.t;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = 0;
        r5 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.<init>(r3, r4, r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.mo6420a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x04af;
    L_0x0544:
        r2 = r3.f39689n;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x055b;
    L_0x0548:
        r2 = r3.f39689n;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.mo6486b();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r2.f40188c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x055b;
    L_0x0556:
        r2 = r3.f39689n;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.mo6488c();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x055b:
        r4 = r3.f39681f;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = -1;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x059a;
    L_0x0563:
        r2 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = com.squareup.okhttp.internal.http.C7671w.m36981a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = -1;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x0593;
    L_0x056f:
        r2 = r3.f39688m;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2 instanceof com.squareup.okhttp.internal.http.aa;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0593;
    L_0x0575:
        r2 = r3.f39688m;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = (com.squareup.okhttp.internal.http.aa) r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39598c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r2.f40188c;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36632b();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = "Content-Length";
        r4 = java.lang.Long.toString(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36640a(r6, r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36636a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.f39685j = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x0593:
        r2 = r3.f39680e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.mo6470a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x059a:
        r2 = r3.f39688m;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x04ab;
    L_0x059e:
        r2 = r3.f39689n;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x05b8;
    L_0x05a2:
        r2 = r3.f39689n;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.close();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x05a7:
        r2 = r3.f39688m;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2 instanceof com.squareup.okhttp.internal.http.aa;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x04ab;
    L_0x05ad:
        r4 = r3.f39680e;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.f39688m;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = (com.squareup.okhttp.internal.http.aa) r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4.mo6471a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x04ab;
    L_0x05b8:
        r2 = r3.f39688m;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2.close();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x05a7;
    L_0x05be:
        r4 = r3.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.f39310g;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        com.squareup.okhttp.internal.k.a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
    L_0x05c5:
        r4 = r2.m36650a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r3.f39684i;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4.f39315a = r5;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r3.f39679d;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = com.squareup.okhttp.internal.http.C7666q.m36961a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.m36661c(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r3.f39686k;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = com.squareup.okhttp.internal.http.C7666q.m36961a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r4.m36659b(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.http.C7666q.m36961a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r4.m36656a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.m36655a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.f39687l = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.f39687l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.http.C7666q.m36965c(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x0522;
    L_0x05f7:
        r2 = com.squareup.okhttp.internal.C7600b.f39287b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r3.f39677b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r2.mo6410a(r4);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 == 0) goto L_0x063d;
    L_0x0601:
        r2 = r3.f39687l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = com.squareup.okhttp.internal.http.C7651c.m36920a(r2, r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 != 0) goto L_0x064d;
    L_0x060b:
        r2 = r3.f39685j;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39289b;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = "POST";
        r5 = r2.equals(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r5 != 0) goto L_0x0637;
    L_0x0617:
        r5 = "PATCH";
        r5 = r2.equals(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r5 != 0) goto L_0x0637;
    L_0x061f:
        r5 = "PUT";
        r5 = r2.equals(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r5 != 0) goto L_0x0637;
    L_0x0627:
        r5 = "DELETE";
        r5 = r2.equals(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r5 != 0) goto L_0x0637;
    L_0x062f:
        r5 = "MOVE";
        r2 = r2.equals(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r2 == 0) goto L_0x064b;
    L_0x0637:
        r2 = 1;
    L_0x0638:
        if (r2 == 0) goto L_0x063d;
    L_0x063a:
        r4.m36874c();	 Catch:{ IOException -> 0x085e, RequestException -> 0x0085, RouteException -> 0x01b3 }
    L_0x063d:
        r4 = r3.f39692q;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r3.f39687l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r4 != 0) goto L_0x0659;
    L_0x0643:
        r2 = r3.m36969b(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.f39687l = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x0522;
    L_0x064b:
        r2 = 0;
        goto L_0x0638;
    L_0x064d:
        r2 = r3.f39687l;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        com.squareup.okhttp.internal.http.C7666q.m36961a(r2);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r4.m36873b();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r3.f39692q = r2;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x063d;
    L_0x0659:
        r5 = r4.m36918a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        if (r5 == 0) goto L_0x0643;
    L_0x065f:
        r6 = r2.f39310g;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = r6.mo6476d();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = p526e.C7733p.m37441a(r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r7 = new com.squareup.okhttp.internal.http.s;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r7.<init>(r6, r4, r5);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4 = r2.m36650a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5 = new com.squareup.okhttp.internal.http.y;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r2.f39309f;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r6 = p526e.C7733p.m37442a(r7);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r5.<init>(r2, r6);	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r4.f39321g = r5;	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        r2 = r4.m36655a();	 Catch:{ RequestException -> 0x0085, RouteException -> 0x01b3, IOException -> 0x020b }
        goto L_0x0643;
    L_0x0684:
        r3 = r2 instanceof java.io.InterruptedIOException;	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x068c;
    L_0x0688:
        r2 = r2 instanceof java.net.SocketTimeoutException;	 Catch:{ all -> 0x008c }
        goto L_0x01d7;
    L_0x068c:
        r3 = r2 instanceof javax.net.ssl.SSLHandshakeException;	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x069b;
    L_0x0690:
        r3 = r2.getCause();	 Catch:{ all -> 0x008c }
        r3 = r3 instanceof java.security.cert.CertificateException;	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x069b;
    L_0x0698:
        r2 = 0;
        goto L_0x01d7;
    L_0x069b:
        r2 = r2 instanceof javax.net.ssl.SSLPeerUnverifiedException;	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x06a2;
    L_0x069f:
        r2 = 0;
        goto L_0x01d7;
    L_0x06a2:
        r2 = 1;
        goto L_0x01d7;
    L_0x06a5:
        r2 = 1;
        goto L_0x01da;
    L_0x06a8:
        r2 = r10.f39677b;	 Catch:{ all -> 0x008c }
        r2 = r2.x;	 Catch:{ all -> 0x008c }
        if (r2 != 0) goto L_0x06b1;
    L_0x06ae:
        r2 = 0;
        goto L_0x01dd;
    L_0x06b1:
        r8 = r10.m36970b();	 Catch:{ all -> 0x008c }
        r2 = new com.squareup.okhttp.internal.http.q;	 Catch:{ all -> 0x008c }
        r3 = r10.f39677b;	 Catch:{ all -> 0x008c }
        r4 = r10.f39684i;	 Catch:{ all -> 0x008c }
        r5 = r10.f39683h;	 Catch:{ all -> 0x008c }
        r6 = r10.f39690o;	 Catch:{ all -> 0x008c }
        r7 = r10.f39691p;	 Catch:{ all -> 0x008c }
        r9 = r10.f39688m;	 Catch:{ all -> 0x008c }
        r9 = (com.squareup.okhttp.internal.http.aa) r9;	 Catch:{ all -> 0x008c }
        r10 = r10.f39679d;	 Catch:{ all -> 0x008c }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x008c }
        goto L_0x01dd;
    L_0x06cc:
        r2 = r12.f39594b;	 Catch:{ all -> 0x008c }
        throw r2;	 Catch:{ all -> 0x008c }
    L_0x06cf:
        r3 = r2.f39613c;	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x06db;
    L_0x06d3:
        r2 = r2.f39613c;	 Catch:{ all -> 0x008c }
        r2 = r2.m36906a();	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x06e2;
    L_0x06db:
        r2 = r12 instanceof java.net.ProtocolException;	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x06e5;
    L_0x06df:
        r2 = 0;
    L_0x06e0:
        if (r2 != 0) goto L_0x06ed;
    L_0x06e2:
        r2 = 0;
        goto L_0x0222;
    L_0x06e5:
        r2 = r12 instanceof java.io.InterruptedIOException;	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x06eb;
    L_0x06e9:
        r2 = 0;
        goto L_0x06e0;
    L_0x06eb:
        r2 = 1;
        goto L_0x06e0;
    L_0x06ed:
        r2 = 1;
        goto L_0x0222;
    L_0x06f0:
        r2 = r10.f39677b;	 Catch:{ all -> 0x008c }
        r2 = r2.x;	 Catch:{ all -> 0x008c }
        if (r2 != 0) goto L_0x06f9;
    L_0x06f6:
        r2 = 0;
        goto L_0x0225;
    L_0x06f9:
        r8 = r10.m36970b();	 Catch:{ all -> 0x008c }
        r2 = new com.squareup.okhttp.internal.http.q;	 Catch:{ all -> 0x008c }
        r3 = r10.f39677b;	 Catch:{ all -> 0x008c }
        r4 = r10.f39684i;	 Catch:{ all -> 0x008c }
        r5 = r10.f39683h;	 Catch:{ all -> 0x008c }
        r6 = r10.f39690o;	 Catch:{ all -> 0x008c }
        r7 = r10.f39691p;	 Catch:{ all -> 0x008c }
        r9 = 0;
        r10 = r10.f39679d;	 Catch:{ all -> 0x008c }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ all -> 0x008c }
        goto L_0x0225;
    L_0x0711:
        throw r12;	 Catch:{ all -> 0x008c }
    L_0x0712:
        r10 = r2.f39687l;
        r0 = r22;
        r4 = r0.f39358e;
        r2 = r4.f39687l;
        if (r2 != 0) goto L_0x0722;
    L_0x071c:
        r2 = new java.lang.IllegalStateException;
        r2.<init>();
        throw r2;
    L_0x0722:
        r2 = r4.f39678c;
        r2 = r2.m36912a();
        if (r2 == 0) goto L_0x074f;
    L_0x072a:
        r2 = r2.mo6460a();
    L_0x072e:
        if (r2 == 0) goto L_0x0751;
    L_0x0730:
        r2 = r2.f39326b;
    L_0x0732:
        r3 = r4.f39687l;
        r3 = r3.f39306c;
        r5 = r4.f39684i;
        r5 = r5.f39289b;
        switch(r3) {
            case 300: goto L_0x0781;
            case 301: goto L_0x0781;
            case 302: goto L_0x0781;
            case 303: goto L_0x0781;
            case 307: goto L_0x0771;
            case 308: goto L_0x0771;
            case 401: goto L_0x0766;
            case 407: goto L_0x0756;
            default: goto L_0x073d;
        };
    L_0x073d:
        r4 = 0;
    L_0x073e:
        if (r4 != 0) goto L_0x080e;
    L_0x0740:
        if (r24 != 0) goto L_0x074e;
    L_0x0742:
        r0 = r22;
        r2 = r0.f39358e;
        r2 = r2.f39678c;
        r3 = 0;
        r4 = 1;
        r5 = 0;
        r2.m36917a(r3, r4, r5);
    L_0x074e:
        return r10;
    L_0x074f:
        r2 = 0;
        goto L_0x072e;
    L_0x0751:
        r2 = r4.f39677b;
        r2 = r2.f;
        goto L_0x0732;
    L_0x0756:
        r3 = r2.type();
        r5 = java.net.Proxy.Type.HTTP;
        if (r3 == r5) goto L_0x0766;
    L_0x075e:
        r2 = new java.net.ProtocolException;
        r3 = "Received HTTP_PROXY_AUTH (407) code while not using proxy";
        r2.<init>(r3);
        throw r2;
    L_0x0766:
        r3 = r4.f39677b;
        r3 = r3.s;
        r4 = r4.f39687l;
        r4 = com.squareup.okhttp.internal.http.C7671w.m36984a(r3, r4, r2);
        goto L_0x073e;
    L_0x0771:
        r2 = "GET";
        r2 = r5.equals(r2);
        if (r2 != 0) goto L_0x0781;
    L_0x0779:
        r2 = "HEAD";
        r2 = r5.equals(r2);
        if (r2 == 0) goto L_0x073d;
    L_0x0781:
        r2 = r4.f39677b;
        r2 = r2.w;
        if (r2 == 0) goto L_0x073d;
    L_0x0787:
        r2 = r4.f39687l;
        r3 = "Location";
        r2 = r2.f39309f;
        r2 = r2.m37014a(r3);
        if (r2 == 0) goto L_0x0802;
    L_0x0793:
        if (r2 == 0) goto L_0x073d;
    L_0x0795:
        r3 = r4.f39684i;
        r3 = r3.f39288a;
        r6 = new com.squareup.okhttp.y;
        r6.<init>();
        r2 = r6.m37052a(r3, r2);
        r3 = com.squareup.okhttp.C7693z.SUCCESS;
        if (r2 != r3) goto L_0x0804;
    L_0x07a6:
        r2 = r6.m37053b();
        r3 = r2;
    L_0x07ab:
        if (r3 == 0) goto L_0x073d;
    L_0x07ad:
        r2 = r3.f39796b;
        r6 = r4.f39684i;
        r6 = r6.f39288a;
        r6 = r6.f39796b;
        r2 = r2.equals(r6);
        if (r2 != 0) goto L_0x07c1;
    L_0x07bb:
        r2 = r4.f39677b;
        r2 = r2.v;
        if (r2 == 0) goto L_0x073d;
    L_0x07c1:
        r2 = r4.f39684i;
        r6 = r2.m36632b();
        r2 = com.squareup.okhttp.internal.http.C7670u.m36980b(r5);
        if (r2 == 0) goto L_0x07ed;
    L_0x07cd:
        r2 = "PROPFIND";
        r2 = r5.equals(r2);
        if (r2 != 0) goto L_0x0807;
    L_0x07d5:
        r2 = 1;
    L_0x07d6:
        if (r2 == 0) goto L_0x0809;
    L_0x07d8:
        r2 = "GET";
        r5 = 0;
        r6.m36639a(r2, r5);
    L_0x07de:
        r2 = "Transfer-Encoding";
        r6.m36641b(r2);
        r2 = "Content-Length";
        r6.m36641b(r2);
        r2 = "Content-Type";
        r6.m36641b(r2);
    L_0x07ed:
        r2 = r4.m36968a(r3);
        if (r2 != 0) goto L_0x07f8;
    L_0x07f3:
        r2 = "Authorization";
        r6.m36641b(r2);
    L_0x07f8:
        r2 = r6.m36637a(r3);
        r4 = r2.m36636a();
        goto L_0x073e;
    L_0x0802:
        r2 = 0;
        goto L_0x0793;
    L_0x0804:
        r2 = 0;
        r3 = r2;
        goto L_0x07ab;
    L_0x0807:
        r2 = 0;
        goto L_0x07d6;
    L_0x0809:
        r2 = 0;
        r6.m36639a(r5, r2);
        goto L_0x07de;
    L_0x080e:
        r0 = r22;
        r2 = r0.f39358e;
        r8 = r2.m36970b();
        r11 = r11 + 1;
        r2 = 20;
        if (r11 <= r2) goto L_0x0837;
    L_0x081c:
        r2 = 0;
        r3 = 1;
        r4 = 0;
        r8.m36917a(r2, r3, r4);
        r2 = new java.net.ProtocolException;
        r3 = new java.lang.StringBuilder;
        r4 = "Too many follow-up requests: ";
        r3.<init>(r4);
        r3 = r3.append(r11);
        r3 = r3.toString();
        r2.<init>(r3);
        throw r2;
    L_0x0837:
        r0 = r22;
        r2 = r0.f39358e;
        r3 = r4.f39288a;
        r2 = r2.m36968a(r3);
        if (r2 != 0) goto L_0x084a;
    L_0x0843:
        r2 = 0;
        r3 = 1;
        r5 = 0;
        r8.m36917a(r2, r3, r5);
        r8 = 0;
    L_0x084a:
        r2 = new com.squareup.okhttp.internal.http.q;
        r0 = r22;
        r3 = r0.f39354a;
        r5 = 0;
        r6 = 0;
        r9 = 0;
        r7 = r24;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);
        r0 = r22;
        r0.f39358e = r2;
        goto L_0x004b;
    L_0x085e:
        r2 = move-exception;
        goto L_0x063d;
    L_0x0861:
        r4 = r2;
        goto L_0x02cb;
    L_0x0864:
        r6 = r2;
        goto L_0x02ba;
    L_0x0867:
        r4 = r23;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.f.a(com.squareup.okhttp.ag, boolean):com.squareup.okhttp.ak");
    }
}
