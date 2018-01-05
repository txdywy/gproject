package com.google.android.volley.ok;

import android.content.Context;
import android.util.Pair;
import com.android.volley.aa;
import com.android.volley.p060a.C0653p;
import com.google.android.p102c.C0925g;
import com.google.android.volley.ok.a.a;
import com.squareup.okhttp.ac;
import com.squareup.okhttp.ad;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ah;
import com.squareup.okhttp.ai;
import com.squareup.okhttp.ak;
import com.squareup.okhttp.f;
import com.squareup.okhttp.k;
import com.squareup.okhttp.o;
import com.squareup.okhttp.p;
import com.squareup.okhttp.v;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class C6327c implements C0653p {
    public static final o f31621a = new p(o.b).a(new k[]{k.aK, k.aO, k.W, k.am, k.al, k.av, k.aw, k.aj, k.at, k.F, k.E, k.J, k.U, k.D, k.H, k.e}).b();
    public static final List f31622b = Arrays.asList(new o[]{f31621a, o.d});
    public static final ProtocolVersion f31623c = new ProtocolVersion("HTTP", 1, 0);
    public static final ProtocolVersion f31624d = new ProtocolVersion("HTTP", 1, 1);
    public static final ProtocolVersion f31625e = new ProtocolVersion("HTTP", 2, 0);
    public static final ProtocolVersion f31626f = new ProtocolVersion("SPD", 3, 1);
    public static final byte[] f31627g = new byte[0];
    public d f31628h;
    public boolean f31629i;
    public l f31630j;
    public UrlRewriter f31631k;

    protected C6327c() {
    }

    public C6327c(Context context, ad adVar, UrlRewriter urlRewriter, boolean z) {
        this(context, adVar, urlRewriter, z, aa.f4123a);
    }

    private C6327c(Context context, ad adVar, UrlRewriter urlRewriter, boolean z, String str) {
        this(adVar, urlRewriter, null, C0925g.m5657a(context.getContentResolver(), "http_stats", false), z, str);
    }

    private C6327c(ad adVar, UrlRewriter urlRewriter, l lVar, boolean z, boolean z2, String str) {
        this.f31629i = z;
        this.f31631k = urlRewriter;
        if (this.f31629i) {
            lVar = new a();
        }
        this.f31630j = lVar;
        if (z2) {
            adVar.f31794j.add(new a(str));
        }
        adVar.m29019a(f31622b);
        this.f31628h = new d(adVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpResponse mo1053b(com.android.volley.C0656n r10, java.util.Map r11) {
        /*
        r9 = this;
        r1 = 0;
        r0 = r9.f31628h;
        r2 = r10.m4382o();
        r4 = r0.a(r2);
        r5 = r10.mo1547h();
        r6 = new java.util.ArrayList;
        r6.<init>();
        r3 = r10.f4027b;
        r7 = r10.mo1061m();
        switch(r3) {
            case -1: goto L_0x0038;
            case 0: goto L_0x0072;
            case 1: goto L_0x0076;
            case 2: goto L_0x007a;
            case 3: goto L_0x008a;
            case 4: goto L_0x0082;
            case 5: goto L_0x008e;
            case 6: goto L_0x0086;
            case 7: goto L_0x007e;
            default: goto L_0x001d;
        };
    L_0x001d:
        r0 = new java.lang.IllegalArgumentException;
        r1 = 38;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Unknown HTTP Method value: ";
        r1 = r2.append(r1);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0038:
        if (r7 != 0) goto L_0x006e;
    L_0x003a:
        r0 = "GET";
        r2 = r0;
    L_0x003d:
        r0 = r10.mo1060l();
        switch(r3) {
            case -1: goto L_0x0092;
            case 0: goto L_0x0044;
            case 1: goto L_0x009e;
            case 2: goto L_0x009e;
            case 3: goto L_0x0044;
            case 4: goto L_0x0044;
            case 5: goto L_0x0044;
            case 6: goto L_0x0044;
            case 7: goto L_0x009e;
            default: goto L_0x0044;
        };
    L_0x0044:
        r3 = r1;
    L_0x0045:
        r0 = r5.entrySet();
        r7 = r0.iterator();
    L_0x004d:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00b2;
    L_0x0053:
        r0 = r7.next();
        r0 = (java.util.Map.Entry) r0;
        r8 = new android.util.Pair;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r8.<init>(r1, r0);
        r6.add(r8);
        goto L_0x004d;
    L_0x006e:
        r0 = "POST";
        r2 = r0;
        goto L_0x003d;
    L_0x0072:
        r0 = "GET";
        r2 = r0;
        goto L_0x003d;
    L_0x0076:
        r0 = "POST";
        r2 = r0;
        goto L_0x003d;
    L_0x007a:
        r0 = "PUT";
        r2 = r0;
        goto L_0x003d;
    L_0x007e:
        r0 = "PATCH";
        r2 = r0;
        goto L_0x003d;
    L_0x0082:
        r0 = "HEAD";
        r2 = r0;
        goto L_0x003d;
    L_0x0086:
        r0 = "TRACE";
        r2 = r0;
        goto L_0x003d;
    L_0x008a:
        r0 = "DELETE";
        r2 = r0;
        goto L_0x003d;
    L_0x008e:
        r0 = "OPTIONS";
        r2 = r0;
        goto L_0x003d;
    L_0x0092:
        if (r7 == 0) goto L_0x0044;
    L_0x0094:
        r0 = com.squareup.okhttp.ac.a(r0);
        r0 = com.squareup.okhttp.ai.a(r0, r7);
        r3 = r0;
        goto L_0x0045;
    L_0x009e:
        if (r7 != 0) goto L_0x00a8;
    L_0x00a0:
        r0 = f31627g;
        r0 = com.squareup.okhttp.ai.a(r1, r0);
        r3 = r0;
        goto L_0x0045;
    L_0x00a8:
        r0 = com.squareup.okhttp.ac.a(r0);
        r0 = com.squareup.okhttp.ai.a(r0, r7);
        r3 = r0;
        goto L_0x0045;
    L_0x00b2:
        if (r11 == 0) goto L_0x00dd;
    L_0x00b4:
        r0 = r11.entrySet();
        r7 = r0.iterator();
    L_0x00bc:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00dd;
    L_0x00c2:
        r0 = r7.next();
        r0 = (java.util.Map.Entry) r0;
        r8 = new android.util.Pair;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r8.<init>(r1, r0);
        r6.add(r8);
        goto L_0x00bc;
    L_0x00dd:
        r0 = r10.mo1545d();
        r0 = r9.m28974a(r0, r2, r3, r6);
        r1 = r4.m29020a(r0);
        r0 = "User-Agent";
        r0 = r5.get(r0);
        r0 = (java.lang.String) r0;
        r0 = r9.m28976a(r1, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.volley.ok.c.b(com.android.volley.n, java.util.Map):org.apache.http.HttpResponse");
    }

    private final HttpResponse m28976a(f fVar, String str) {
        m a;
        if (this.f31629i) {
            a = this.f31630j.a();
        } else {
            a = null;
        }
        try {
            HttpEntity a2;
            ProtocolVersion protocolVersion;
            ak a3 = fVar.a();
            HttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(new f(a3.g.c()));
            basicHttpEntity.setContentLength(a3.g.b());
            String a4 = a3.f.a("Content-Encoding");
            if (a4 == null) {
                a4 = null;
            }
            basicHttpEntity.setContentEncoding(a4);
            ac a5 = a3.g.a();
            if (a5 != null) {
                basicHttpEntity.setContentType(a5.toString());
            }
            int i = a3.c;
            if (this.f31629i) {
                a2 = a.a(str, basicHttpEntity);
            } else {
                a2 = basicHttpEntity;
            }
            switch (a3.b.ordinal()) {
                case 0:
                    protocolVersion = f31623c;
                    break;
                case 1:
                    protocolVersion = f31624d;
                    break;
                case 2:
                    protocolVersion = f31626f;
                    break;
                case 3:
                    protocolVersion = f31625e;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unknown protocol: %s", new Object[]{a3.b}));
            }
            HttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, i, a3.d));
            basicHttpResponse.setEntity(a2);
            v vVar = a3.f;
            int length = vVar.a.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                basicHttpResponse.addHeader(vVar.a(i2), vVar.b(i2));
            }
            return basicHttpResponse;
        } catch (InterruptedIOException e) {
            throw C6327c.m28975a(e);
        }
    }

    static InterruptedIOException m28975a(InterruptedIOException interruptedIOException) {
        if ("timeout".equals(interruptedIOException.getMessage())) {
            return new SocketTimeoutException();
        }
        return interruptedIOException;
    }

    private final ag m28974a(String str, String str2, ai aiVar, List list) {
        if (this.f31631k != null) {
            str = this.f31631k.mo5391a(str);
        }
        ah a = new ah().a(str).a(str2, aiVar);
        for (Pair pair : list) {
            a.b((String) pair.first, (String) pair.second);
        }
        return a.a();
    }
}
