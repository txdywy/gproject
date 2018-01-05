package com.google.android.finsky.api.a;

import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.support.v4.h.a;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.a;
import com.android.volley.a.n;
import com.android.volley.b;
import com.android.volley.f;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import com.android.volley.z;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ah.a;
import com.google.android.finsky.api.DfeServerError;
import com.google.android.finsky.api.f;
import com.google.android.finsky.api.g;
import com.google.android.finsky.api.i;
import com.google.android.finsky.api.j;
import com.google.android.finsky.api.l;
import com.google.android.finsky.api.p;
import com.google.android.finsky.api.v;
import com.google.android.finsky.api.w;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.az.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.c.a;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.cv.a.dk;
import com.google.android.finsky.cv.a.hc;
import com.google.android.finsky.cv.a.jq;
import com.google.android.finsky.cv.a.jr;
import com.google.android.finsky.cv.a.lg;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.deviceconfig.e;
import com.google.android.finsky.do.a;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.i;
import com.google.android.finsky.utils.t;
import com.google.android.finsky.utils.x;
import com.google.android.finsky.volley.c;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.android.play.dfe.api.DfeResponseVerifier$DfeResponseVerifierException;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.f;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.j;
import com.google.wireless.android.a.a.a.a.bo;
import com.google.wireless.android.finsky.b.ab;
import com.google.wireless.android.finsky.dfe.nano.fl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class com.google.android.finsky.api.a.cp extends com.google.android.finsky.api.j
{

    public static final boolean r;
    public StringBuilder A;
    public com.google.android.finsky.cv.a.lg B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public DfeResponseVerifier G;
    public long H;
    public NetworkInfo I;
    public int J;
    public boolean K;
    public boolean L;
    public com.google.android.finsky.api.w M;
    public boolean N;
    public String O;
    public com.google.android.finsky.api.v P;
    public com.google.android.finsky.dx.a Q;
    public com.google.android.finsky.d.g R;
    public com.google.android.finsky.api.p S;
    public com.google.android.finsky.api.l T;
    public boolean U;
    public long V;
    public long W;
    public int X;
    public boolean k;
    public com.android.volley.x s;
    public final com.google.android.finsky.api.a.cz t;
    public final com.google.android.finsky.api.a.b u;
    public boolean v;
    public long w;
    public int x;
    public String y;
    public Map z;

    static {
        com.google.android.finsky.api.a.cp.r = Log.isLoggable("DfeProto", 2);
    }

    cp(int p0, Uri p1, String p2, com.google.android.finsky.api.a.b p3, com.google.android.finsky.api.a.cz p4, com.android.volley.x p5, com.android.volley.w p6, com.google.android.finsky.api.w p7, com.google.android.finsky.do.a p8, com.google.android.finsky.dx.a p9, com.google.android.finsky.api.p p10, com.google.android.finsky.d.g p11, com.google.android.finsky.api.l p12) {
        com.google.android.finsky.api.j(p0, Uri.withAppendedPath(p1, p2).toString(), p6);
        this.v = 0;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.F = 0;
        this.U = 0;
        this.V = -1;
        this.W = -1;
        this.X = 0;
        if (TextUtils.isEmpty(p2))
            FinskyLog.e("Empty DFE URL", new Object[0]);
        if (!((Boolean)com.google.android.finsky.api.f.H.b()).booleanValue())
            v2 = 1;
        else
            v2 = 0;
        this.i = v2;
        this.m = new com.google.android.finsky.api.a.cx(p8.a(), p3);
        this.u = p3;
        this.s = p5;
        this.t = p4;
        this.I = this.u.g();
        this.M = p7;
        this.Q = p9;
        this.S = p10;
        this.R = p11;
        this.T = p12;
        if (p3.g != 0 && p3.g.a(12629642))
            this.K = ((Boolean)com.google.android.finsky.aa.b.iy.b()).booleanValue();
    }

    cp(int p0, String p1, com.google.android.finsky.api.a.b p2, com.google.android.finsky.api.a.cz p3, com.android.volley.x p4, com.android.volley.w p5, com.google.android.finsky.do.a p6, com.google.android.finsky.dx.a p7, com.google.android.finsky.api.p p8, com.google.android.finsky.d.g p9, com.google.android.finsky.api.l p10) {
        com.google.android.finsky.api.a.cp(p0, p10.b, p1, p2, p3, p4, p5, 0, p6, p7, p8, p9, p10);
    }

    cp(String p0, com.google.android.finsky.api.a.b p1, com.google.android.finsky.api.a.cz p2, com.android.volley.x p3, com.android.volley.w p4, com.google.android.finsky.do.a p5, com.google.android.finsky.dx.a p6, com.google.android.finsky.api.p p7, com.google.android.finsky.d.g p8, com.google.android.finsky.api.l p9) {
        com.google.android.finsky.api.a.cp(0, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    private final long a(boolean p0) {
  4:    if (this.X != 3) {
 37:        if (this.X != 0)
 39:            v0 = this.H;
 44:        else if (this.U == 1) {
 47:            this.X = 4;
 49:            v0 = this.H;
            }
 52:        else if (p0 != 0) {
 54:            this.X = 1;
 56:            v0 = this.H;
            }
            else {
 61:            if (this.n == 0)
 64:                this.X = 6;
                else
 70:                this.X = 5;
 66:            v0 = this.H;
            }
 41:        return v0;
        }
 18:    v0 = Long.parseLong((String)this.n.g.get("X-DFE-Firm-Rpc-Timeout"));
 22:    return v0;
 29:    FinskyLog.e("Cache hit type is firm TTL timeout, but can't read timeout.", new Object[0]);
 32:    v0 = this.H;
 34:    return v0;
 74:    goto 24;
 75:    try
            run 6...21
        catch (NumberFormatException ex) {
  6:        goto 73;
        }
        catch (NullPointerException ex) {
  6:        goto 23;
        }
    }

    private final com.android.volley.v a(com.google.wireless.android.finsky.dfe.nano.fl p0) {
        v0 = 0;
        if (p0.c != 0) {
            if (p0.c.bA_()) {
                v3 = new Object[1];
                v3[0] = p0.c.d;
                FinskyLog.a("%s", v3);
            }
            if (p0.c.b != 0)
                this.u.i.b();
            if (p0.c.e.length > 0)
                new Handler(Looper.getMainLooper()).post(new com.google.android.finsky.api.a.cq(this, p0.c));
            if (p0.c.bz_())
                v0 = com.android.volley.v.a(new DfeServerError(p0.c.c));
        }
        return v0;
    }

    private final com.google.wireless.android.finsky.dfe.nano.fl a(com.android.volley.m p0, boolean p1) {
 10:    v0 = (String)p0.c.get("X-DFE-Signature-Response");
 12:    if (p1 == 0) {
 66:        if (this.G != 0) {
 72:            this.G.a(p0.b, v0);
 77:            this.a("signature-verification-succeeded");
            }
 80:        v0 = com.google.wireless.android.finsky.dfe.nano.fl.a(p0.b);
 81:        return v0;
        }
 23:    v3 = new GZIPInputStream(new ByteArrayInputStream(p0.b));
 26:    try {
 26:        v4 = com.google.android.finsky.utils.x.a(v3);
 36:        if (this.G != 0)
 40:            this.G.a(v4, v0);
        }
        catch (Throwable ex) {
 49:        v3.close();
 52:        throw ex;
        }
 43:    v3.close();
 46:    v0 = com.google.wireless.android.finsky.dfe.nano.fl.a(v4);
 47:    return v0;
 54:    if (p1 != 0) {
 86:        FinskyLog.c("Cannot parse response as ResponseWrapper proto.", new Object[0]);
 89:        v0 = 0;
 90:        return v0;
        }
 56:    p1 = 1;
 57:    goto 2;
 86:    FinskyLog.c("Cannot parse response as ResponseWrapper proto.", new Object[0]);
 89:    v0 = 0;
 90:    return v0;
 96:    FinskyLog.c("IOException while manually unzipping request.", new Object[0]);
 99:    goto 89;
103:    this.a("signature-verification-failed");
109:    v3 = new Object[2];
111:    v3[0] = this;
113:    v3[1] = ex;
115:    FinskyLog.d("Could not verify request: %s, exception %s", v3);
118:    goto 89;
119:    try
            run 43...80
        catch (InvalidProtocolBufferNanoException ex) {
 43:        goto 53;
        }
        catch (IOException ex) {
 43:        goto 91;
        }
        catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
 43:        goto 100;
        }
121:    try
            run 2...26
        catch (InvalidProtocolBufferNanoException ex) {
  2:        goto 53;
        }
        catch (IOException ex) {
  2:        goto 91;
        }
        catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
  2:        goto 100;
        }
    }

    private static void a(com.android.volley.b p0, long p1, long p3) {
        if (p1 != 0 && p3 != 0) {
            v0 = System.currentTimeMillis() + p1;
            if (v0 < p0.f || v0 > p0.e) {
                v5 = new Object[3];
                v5[0] = Long.valueOf(p0.f);
                v5[1] = Long.valueOf(v0);
                v5[2] = Long.valueOf(p0.e);
                FinskyLog.e("TTLs don't line up: soft = %d, firm = %d, hard = %d", v5);
                v0 = 0;
                p3 = 0;
                p1 = 0;
            }
            if (p0.g == 0 || p0.g.isEmpty())
                v2 = new android.support.v4.h.a(3);
            else
                v2 = p0.g;
            v2.put("X-DFE-Firm-TTL", Long.toString(p1));
            v2.put("X-DFE-Firm-Rpc-Timeout", Long.toString(p3));
            v2.put("Cache-Firm-TTL", Long.toString(v0));
            p0.g = v2;
        }
    }

    private final void a(com.google.wireless.android.finsky.dfe.nano.fl p0, com.android.volley.b p1, Map p2) {
        if (p0.d.length == 0)
            return;
        if (p1 != 0)
            v8 = p1.c;
        else {
            v2 = (String)p2.get("Date");
            if (v2 != 0)
                v8 = com.android.volley.a.n.a(v2);
            else
                v8 = 0;
        }
        v12 = System.currentTimeMillis();
        v10 = 0;
        while (v10 < p0.d.length) {
            v17 = new com.android.volley.b();
            v17.a = p0.d[v10].d;
            v17.b = p0.d[v10].e;
            v17.c = v8;
            v17.e = p0.d[v10].f + v12;
            v17.f = p0.d[v10].g + v12;
            if (this.T.a())
                com.google.android.finsky.api.a.cp.a(v17, p0.d[v10].h, p0.d[v10].i);
            if (this.d().contains("/bulkDataFetch")) {
                if (v17.g == 0 || v17.g.isEmpty())
                    v2 = new android.support.v4.h.a(1);
                else
                    v2 = v17.g;
                v2.put("X-DFE-Synced-Content", "1");
                v17.g = v2;
            }
            this.u.i.a(this.T.a(Uri.withAppendedPath(com.google.android.finsky.api.g.a, p0.d[v10].c).toString(), this.u.b(), this.u.k, this.u.l, this.A), v17);
            v10 = v10 + 1;
        }
        if (this.P != 0)
            this.P.a(p0.d);
    }

    private final void a(boolean p0, VolleyError p1) {
        if (this.u.n != 0) {
            v20 = 0;
            if (p0 != 0 && this.H <= 0)
                v20 = 1;
            if (this.u.n.a(v20, 0)) {
                v4 = this.H;
                if (p0 != 0 && this.T.a())
                    v4 = this.a(v20);
                v8 = -1;
                if (this.V > 0)
                    v8 = com.google.android.finsky.utils.i.b() - this.V;
                if (this.m instanceof com.google.android.finsky.api.a.cx)
                    v14 = ((com.google.android.finsky.api.a.cx)this.m).d;
                else
                    v14 = 0;
                v22 = 0;
                if (p1 instanceof NoConnectionError)
                    v22 = Boolean.valueOf(com.google.android.play.utils.f.b(this.u.f));
                this.u.n.a(this.d(), v4, this.b(), v8, this.W, this.m.b() + 1, this.m.a(), v14, p0, p1, this.I, this.u.g(), this.J, v20, this.X, v22, this.x, this.y);
            }
        }
    }

    private final com.android.volley.b b(com.android.volley.m p0) {
  2:    v6 = com.android.volley.a.n.a(p0);
  6:    if (v6 == 0) {
  8:        v0 = 0;
  9:        return v0;
        }
 10:    v2 = System.currentTimeMillis();
 22:    v0 = (String)p0.c.get("X-DFE-Soft-TTL");
 24:    if (v0 != 0)
 31:        v6.f = Long.parseLong(v0) + v2;
 41:    v0 = (String)p0.c.get("X-DFE-Hard-TTL");
 43:    if (v0 != 0)
 50:        v6.e = Long.parseLong(v0) + v2;
 58:    if (!this.T.a()) goto 153;
 64:    v0 = p0.c.get("X-DFE-Firm-TTL");
 70:    if ((String)v0 != 0)
 72:        v2 = Long.parseLong((String)v0);
        else
151:        v2 = 0;
 84:    v0 = (String)p0.c.get("X-DFE-Firm-Rpc-Timeout");
 86:    if (v0 != 0) {
 92:        v12 = v2;
 93:        v2 = Long.parseLong(v0);
 94:        v0 = v12;
        }
        else {
148:        v0 = v2;
149:        v2 = 0;
        }
103:    v6.e = Math.max(v6.e, v6.f);
111:    if (this.T.a() && p0.f > 0)
119:        com.google.android.finsky.api.a.cp.a(v6, v0, v2);
122:    v0 = v6;
123:    return v0;
125:    v0 = 0;
129:    v3 = new Object[1];
134:    v3[0] = p0.c;
136:    FinskyLog.c("Invalid TTL: %s", v3);
139:    v6.f = 0;
141:    v6.e = 0;
143:    v2 = 0;
144:    goto 95;
146:    v0 = v2;
147:    goto 126;
153:    v0 = 0;
154:    v2 = 0;
155:    goto 95;
156:    try
            run 76...91
        catch (NumberFormatException ex) {
 76:        goto 145;
        }
157:    try
            run 14...75
        catch (NumberFormatException ex) {
 14:        goto 124;
        }
    }

    private final void b(com.google.wireless.android.finsky.dfe.nano.fl p0) {
        if (p0.e.length != 0 && this.u.d() != 0) {
            v0 = 0;
            while (v0 < p0.e.length) {
                this.u.d().a(p0.e[v0]);
                v0 = v0 + 1;
            }
        }
    }

    public final com.android.volley.n a(com.android.volley.r p0) {
        this.V = com.google.android.finsky.utils.i.b();
        return super.a(p0);
    }

    public final com.android.volley.v a(com.android.volley.m p0) {
  6:    if (p0.c != 0 && p0.c.containsKey("X-DFE-Content-Length"))
 32:        this.J = Integer.parseInt((String)p0.c.get("X-DFE-Content-Length"));
 36:    this.H = p0.f;
 49:    if (this.u.g.a(12627544) && this.H > 0) {
 63:        v1 = com.google.android.finsky.api.l.c(this.e());
 71:        if (v1 != 0 && this.u.i instanceof com.google.android.finsky.volley.c) {
 81:            if (((com.google.android.finsky.volley.c)this.u.i).g == 0)
 83:                v0 = 0;
                else {
161:                v1 = ((com.google.android.finsky.volley.c)this.u.i).b.get(com.google.android.finsky.utils.t.a(v1.getBytes()));
167:                if ((String)v1 == 0)
169:                    v0 = 0;
                    else
171:                    v0 = ((com.google.android.finsky.volley.c)this.u.i).d((String)v1);
                }
 84:            this.y = v0;
            }
        }
 86:    v0 = 0;
 89:    if (p0.c != 0 && p0.c.containsKey("X-DFE-Content-Length"))
115:        v0 = Integer.parseInt((String)p0.c.get("X-DFE-Content-Length")) / 1024;
118:    v1 = new Object[2];
125:    v1[0] = this.d();
132:    v1[1] = Integer.valueOf(v0);
135:    v4 = this.a(p0, 0);
139:    if (v4 == 0) {
146:        v0 = com.android.volley.v.a(new ParseError(p0));
150:        return v0;
        }
178:    if (com.google.android.finsky.api.a.cp.r == 0) {
284:        v0 = this.a(v4);
288:        if (v0 == 0) {
292:            if (v4.f != 0) {
300:                if (v4.f.a & 1)
302:                    v0 = 1;
                    else
571:                    v0 = 0;
303:                if (v0 != 0)
307:                    this.w = v4.f.b;
                }
315:            if (this.H == 0 && p0.c != 0 && "1".equals(p0.c.get("X-DFE-Synced-Content")))
338:                this.x = 2;
340:            this.b(v4);
345:            if (v4.g != 0 && this.u.g != 0)
580:                this.u.g.a(v4.g);
357:            if (v4.a & 1)
359:                v0 = 1;
                else
585:                v0 = 0;
360:            if (v0 != 0)
381:                com.google.android.finsky.aa.a.f.b(this.u.b()).a(Base64.encodeToString(v4.i, 0));
390:            if (this.u.b() != 0 && this.S != 0)
404:                this.S.a(this.u.b(), v4);
409:            if (this.G != 0)
411:                v0 = 0;
                else
588:                v0 = this.b(p0);
412:            if (v0 != 0 || this.u.g.a(12620843))
429:                this.a(v4, v0, p0.c);
432:            if (v0 != 0 && (v4.d.length > 0 || v4.c != 0 || v4.e.length > 0 || v4.h.length > 0)) {
457:                v4.d = com.google.android.finsky.cv.a.hc.bh_();
460:                v4.c = 0;
466:                v4.e = com.google.wireless.android.finsky.b.ab.d();
469:                v4.g = 0;
475:                v4.h = com.google.android.finsky.cv.a.dk.aT_();
481:                v0.a = com.google.protobuf.nano.i.a(v4);
                }
483:            v0 = com.android.volley.v.a(v4, v0);
490:            v4 = new Object[1];
497:            v4[0] = this.d();
499:            FinskyLog.f("DFE response %s", v4);
508:            this.W = com.google.android.finsky.utils.i.b() - com.google.android.finsky.utils.i.b();
            }
510:        return v0;
        }
186:    v0 = (String)com.google.android.finsky.api.f.b.b();
196:    if (!this.d().matches(v0)) goto 512;
200:    enter com.google.protobuf.nano.j;
209:    v0 = String.valueOf(this.d());
217:    if (v0.length() != 0)
219:        v0 = "Response for ".concat(v0);
        else
270:        v0 = new String("Response for ");
223:    Log.v("DfeProto", v0);
232:    v6 = com.google.protobuf.nano.j.a(v4).split("\n");
238:    v1 = 0;
239:    if (v1 >= v6.length) {
283:        exit com.google.protobuf.nano.j;
284:        v0 = this.a(v4);
288:        if (v0 == 0) {
292:            if (v4.f != 0) {
300:                if (v4.f.a & 1)
302:                    v0 = 1;
                    else
571:                    v0 = 0;
303:                if (v0 != 0)
307:                    this.w = v4.f.b;
                }
315:            if (this.H == 0 && p0.c != 0 && "1".equals(p0.c.get("X-DFE-Synced-Content")))
338:                this.x = 2;
340:            this.b(v4);
345:            if (v4.g != 0 && this.u.g != 0)
580:                this.u.g.a(v4.g);
357:            if (v4.a & 1)
359:                v0 = 1;
                else
585:                v0 = 0;
360:            if (v0 != 0)
381:                com.google.android.finsky.aa.a.f.b(this.u.b()).a(Base64.encodeToString(v4.i, 0));
390:            if (this.u.b() != 0 && this.S != 0)
404:                this.S.a(this.u.b(), v4);
409:            if (this.G != 0)
411:                v0 = 0;
                else
588:                v0 = this.b(p0);
412:            if (v0 != 0 || this.u.g.a(12620843))
429:                this.a(v4, v0, p0.c);
432:            if (v0 != 0 && (v4.d.length > 0 || v4.c != 0 || v4.e.length > 0 || v4.h.length > 0)) {
457:                v4.d = com.google.android.finsky.cv.a.hc.bh_();
460:                v4.c = 0;
466:                v4.e = com.google.wireless.android.finsky.b.ab.d();
469:                v4.g = 0;
475:                v4.h = com.google.android.finsky.cv.a.dk.aT_();
481:                v0.a = com.google.protobuf.nano.i.a(v4);
                }
483:            v0 = com.android.volley.v.a(v4, v0);
490:            v4 = new Object[1];
497:            v4[0] = this.d();
499:            FinskyLog.f("DFE response %s", v4);
508:            this.W = com.google.android.finsky.utils.i.b() - com.google.android.finsky.utils.i.b();
            }
510:        return v0;
        }
247:    v0 = String.valueOf(v6[v1]);
255:    if (v0.length() == 0) goto 277;
257:    v0 = "| ".concat(v0);
261:    Log.v("DfeProto", v0);
266:    v1 = v1 + 1;
267:    goto 239;
275:    exit com.google.protobuf.nano.j;
276:    throw ex;
279:    v0 = new String("| ");
282:    goto 261;
283:    exit com.google.protobuf.nano.j;
284:    v0 = this.a(v4);
288:    if (v0 == 0) {
292:        if (v4.f != 0) {
300:            if (v4.f.a & 1)
302:                v0 = 1;
                else
571:                v0 = 0;
303:            if (v0 != 0)
307:                this.w = v4.f.b;
            }
315:        if (this.H == 0 && p0.c != 0 && "1".equals(p0.c.get("X-DFE-Synced-Content")))
338:            this.x = 2;
340:        this.b(v4);
345:        if (v4.g != 0 && this.u.g != 0)
580:            this.u.g.a(v4.g);
357:        if (v4.a & 1)
359:            v0 = 1;
            else
585:            v0 = 0;
360:        if (v0 != 0)
381:            com.google.android.finsky.aa.a.f.b(this.u.b()).a(Base64.encodeToString(v4.i, 0));
390:        if (this.u.b() != 0 && this.S != 0)
404:            this.S.a(this.u.b(), v4);
409:        if (this.G != 0)
411:            v0 = 0;
            else
588:            v0 = this.b(p0);
412:        if (v0 != 0 || this.u.g.a(12620843))
429:            this.a(v4, v0, p0.c);
432:        if (v0 != 0 && (v4.d.length > 0 || v4.c != 0 || v4.e.length > 0 || v4.h.length > 0)) {
457:            v4.d = com.google.android.finsky.cv.a.hc.bh_();
460:            v4.c = 0;
466:            v4.e = com.google.wireless.android.finsky.b.ab.d();
469:            v4.g = 0;
475:            v4.h = com.google.android.finsky.cv.a.dk.aT_();
481:            v0.a = com.google.protobuf.nano.i.a(v4);
            }
483:        v0 = com.android.volley.v.a(v4, v0);
490:        v4 = new Object[1];
497:        v4[0] = this.d();
499:        FinskyLog.f("DFE response %s", v4);
508:        this.W = com.google.android.finsky.utils.i.b() - com.google.android.finsky.utils.i.b();
        }
510:    return v0;
514:    v5 = this.d();
566:    Log.v("DfeProto", (String.valueOf(v5).length() + 41 + String.valueOf(v0).length()) + "Url does not match regexp: url=" + v5 + " / regexp=" + v0);
569:    goto 284;
593:    try
            run 277...284
        catch (Throwable ex) {
277:        goto 274;
        }
594:    try
            run 201...276
        catch (Throwable ex) {
201:        goto 274;
        }
    }

    final void a(int p0) {
        if (this.X != 0)
            FinskyLog.e("Attempting to change cache hit type after already setting it.", new Object[0]);
        else
            this.X = p0;
    }

    public final void a(Object p0) {
        try {
            v0 = this.t.a(((com.google.wireless.android.finsky.dfe.nano.fl)p0).b);
        }
        catch (Exception ex) {
            v2 = new Object[1];
            v2[0] = this;
            FinskyLog.d("Null wrapper parsed for request=[%s]", v2);
            this.c(new ParseError(ex));
            return;
        }
        if (v0 != 0) {
            if (this.v != 0 || this.k == 0) {
                if (this.s != 0)
                    this.s.b_(v0);
                this.k = 1;
                this.a(1, 0);
            }
            else {
                v1 = new Object[1];
                v1[0] = this;
                FinskyLog.a("Not delivering second response for request=[%s]", v1);
            }
        }
        else {
            v1 = new Object[1];
            v1[0] = this;
            FinskyLog.d("Null parsed response for request=[%s]", v1);
            this.c(new VolleyError());
        }
    }

    public final boolean a() {
        return this.F;
    }

    public final long b() {
        return this.w;
    }

    protected final VolleyError b(VolleyError p0) {
        if (p0 instanceof ServerError && p0.b != 0) {
            if (p0.b.a == 502 && this.u.y != 0) {
                v0 = (String)p0.b.c.get("x-obscura-nonce");
                if (v0 != 0)
                    com.google.android.finsky.api.a.b.a(v0);
            }
            v0 = this.a(p0.b, 0);
            if (v0 != 0) {
                v0 = this.a(v0);
                if (v0 != 0)
                    p0 = v0.c;
                else {
                    v2 = new Object[1];
                    v2[0] = Integer.valueOf(p0.b.a);
                    FinskyLog.d("Received a null response in ResponseWrapper, error %d", v2);
                }
            }
        }
        return p0;
    }

    public final void c(VolleyError p0) {
        this.H = p0.c;
        if (p0 instanceof AuthFailureError)
            this.u.c();
        if (this.k == 0) {
            this.a(0, p0);
            super.c(p0);
        }
        else {
            v1 = new Object[2];
            v1[0] = this;
            v1[1] = p0;
            FinskyLog.a("Not delivering error response for request=[%s], error=[%s] because response already delivered.", v1);
        }
    }

    public final void c(String p0) {
        this.N = 1;
        this.O = p0;
    }

    public final String d() {
        v5 = 38;
        v2 = 1;
        v7 = super.d();
        if (!TextUtils.isEmpty((CharSequence)com.google.android.finsky.api.f.g.b()))
            v1 = 1;
        else
            v1 = 0;
        if (!TextUtils.isEmpty((CharSequence)com.google.android.finsky.api.f.a.b()))
            v4 = 1;
        else
            v4 = 0;
        v8 = ((Boolean)com.google.android.finsky.api.f.H.b()).booleanValue();
        v9 = ((Boolean)com.google.android.finsky.api.f.I.b()).booleanValue();
        v10 = ((Boolean)com.google.android.finsky.api.f.J.b()).booleanValue();
        if (v1 == 0 && v4 == 0 && v8 == 0 && v9 == 0 && v10 == 0)
            v0 = v7;
        else {
            v11 = new StringBuilder(v7);
            if (v7.indexOf(63) != -1)
                v0 = 1;
            else
                v0 = 0;
            if (v1 != 0) {
                if (v0 != 0)
                    v0 = 38;
                else
                    v0 = 63;
                v11.append(v0);
                v11.append("ipCountryOverride=");
                v11.append((String)com.google.android.finsky.api.f.g.b());
                v0 = 1;
            }
            if (v4 != 0) {
                if (v0 != 0)
                    v0 = 38;
                else
                    v0 = 63;
                v11.append(v0);
                v11.append("mccmncOverride=");
                v11.append((String)com.google.android.finsky.api.f.a.b());
                v0 = 1;
            }
            if (v8 != 0) {
                if (v0 != 0)
                    v0 = 38;
                else
                    v0 = 63;
                v11.append(v0);
                v11.append("skipCache=true");
                v0 = 1;
            }
            if (v9 != 0) {
                if (v0 != 0)
                    v0 = 38;
                else
                    v0 = 63;
                v11.append(v0);
                v11.append("showStagingData=true");
            }
            else
                v2 = v0;
            if (v10 != 0) {
                if (v2 == 0)
                    v5 = 63;
                v11.append(v5);
                v11.append("p13n=false");
            }
            v0 = v11.toString();
        }
        return v0;
    }

    public String e() {
        return this.T.a(super.d(), this.u.b(), this.u.k, this.u.l, this.A);
    }

    public final synchronized void f() {
        enter this;
        try {
            if (this.g()) {
            }
            else {
                try {
                    super.f();
                    if (this.M != 0) {
                        this.M.ah_();
                        this.M = 0;
                    }
                    this.s = 0;
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized boolean g() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return super.g();
    }

    public final Map h() {
        v1 = 0;
        v4 = this.u.e();
        if (this.z != 0)
            v4.putAll(this.z);
        if (this.G != 0) {
            try {
                v4.put("X-DFE-Signature-Request", this.G.a());
            }
            catch (DfeResponseVerifier$DfeResponseVerifierException ex) {
                v6 = new Object[1];
                v6[0] = ex;
                FinskyLog.c("Couldn't create signature request: %s", v6);
                this.f();
            }
        }
        v0 = 21 + "timeoutMs=" + this.m.a();
        v5 = this.m.b();
        if (v5 > 0) {
            v0 = String.valueOf(v0);
            v0 = (String.valueOf(v0).length() + 26) + v0 + "; retryAttempt=" + v5;
        }
        v4.put("X-DFE-Request-Params", v0);
        v4.put("X-DFE-Network-Type", Integer.toString(com.google.android.play.utils.f.a(this.u.f)));
        if (this.C != 0)
            this.u.a(v4);
        if (this.B != 0)
            com.google.android.finsky.api.a.b.a(this.B, v4);
        if (this.D != 0 && this.u.o != 0 && this.u.o.a())
            v4.put("X-DFE-Managed-Context", "true");
        if (this.E != 0)
            this.u.b(v4);
        if (this.K != 0) {
            StrictMode.noteSlowCall("DfeApiContext.getAdIdBlocking");
            if (this.u.u == 0)
                v0 = 0;
            else
                v0 = this.u.u.a();
            if (!TextUtils.isEmpty(v0)) {
                v4.put("X-Ad-Id", v0);
                v2 = new com.google.android.finsky.d.c(1113);
                v3 = this.d();
                if (!TextUtils.isEmpty(v3)) {
                    if (v3 == 0)
                        throw new NullPointerException();
                    v2.a.a = v2.a.a | 67108864;
                    v2.a.av = v3;
                }
                this.R.dc().a(v2.a, 0);
            }
            else {
                if (this.u.u != 0)
                    v0 = 1;
                else
                    v0 = 0;
                if (v0 == 0)
                    v0 = "no_ad_id_provider";
                else
                    v0 = "ad_id_fetch_done_no_id_set";
                this.R.dc().a(new com.google.android.finsky.d.c(1101).b(v0).a, 0);
            }
            if (this.u.u != 0)
                v1 = this.u.u.b();
            if (v1 != 0)
                v4.put("X-Limit-Ad-Tracking-Enabled", v1.toString());
        }
        if (this.L != 0) {
            v0 = this.u.e.a(this.u.f);
            if (!TextUtils.isEmpty(v0))
                v4.put("X-DFE-ms", v0);
        }
        if (this.N != 0) {
            if (this.O != 0)
                v0 = this.O;
            else
                v0 = "";
            v0 = this.u.e.a(this.u.f, v0);
            if (!TextUtils.isEmpty(v0))
                v4.put("X-DFE-ms", v0);
        }
        if (this.u.r.a())
            v4.put("X-DFE-Data-Saver", "1");
        if (this.u.p != 0) {
            if (this.u.h == 0) {
                v0 = this.u.p.d();
                if (!TextUtils.isEmpty(v0))
                    v4.put("X-DFE-Device-Config", v0);
            }
            else {
                v0 = this.u.p.a(this.u.b());
                if (!TextUtils.isEmpty(v0))
                    v4.put("X-DFE-Device-Config-Token", v0);
            }
        }
        if (this.u.h()) {
            this.u.a(v4);
            this.u.b(v4);
            v4.put("X-DFE-Build-Fingerprint", Build.FINGERPRINT);
        }
        if (this.u.x != 0) {
            v0 = this.u.x.a(this.u.b());
            if (v0 != 0)
                v4.put("X-DFE-Enterprise-AclConsistencyToken", v0);
        }
        return v4;
    }

    public final void s() {
        if (((Boolean)com.google.android.finsky.aa.b.iy.b()).booleanValue())
            this.K = 1;
    }

}
