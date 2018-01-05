package com.google.android.finsky.api.a;

import a.a;
import android.accounts.Account;
import android.content.Context;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.a;
import com.android.volley.a.b;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ah.a;
import com.google.android.finsky.api.f;
import com.google.android.finsky.api.g;
import com.google.android.finsky.api.i;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.az.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.c.a;
import com.google.android.finsky.cg.c;
import com.google.android.finsky.cs.e;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.cv.a.lg;
import com.google.android.finsky.cv.a.lh;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.deviceconfig.e;
import com.google.android.finsky.deviceconfig.l;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.q.c;
import com.google.android.finsky.utils.be;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.k;
import com.google.android.volley.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.api.a.b
{

    public static String a;
    public com.google.android.finsky.cs.e b;
    public a.a c;
    public com.google.android.finsky.d.a d;
    public com.google.android.finsky.ct.a e;
    public final Context f;
    public final com.google.android.finsky.ba.e g;
    public final com.android.volley.a.b h;
    public final com.android.volley.a i;
    public final boolean j;
    public final String k;
    public final String l;
    public final Map m;
    public final com.google.android.finsky.d.j n;
    public final com.google.android.finsky.aq.a o;
    public final com.google.android.finsky.deviceconfig.e p;
    public final String q;
    public final com.google.android.finsky.ah.a r;
    public final com.google.android.finsky.d.w s;
    public String t;
    public com.google.android.finsky.c.a u;
    public com.google.android.finsky.cg.c v;
    public com.google.android.finsky.api.a.c w;
    public final com.google.android.finsky.az.a x;
    public final boolean y;

    b(Context p0, com.android.volley.a.b p1, com.android.volley.a p2, com.google.android.finsky.ba.e p3, boolean p4, Locale p5, String p6, String p7, String p8, String p9, String p10, com.google.android.finsky.c.a p11, com.google.android.finsky.d.j p12, String p13, String p14, com.google.android.finsky.aq.a p15, com.google.android.finsky.deviceconfig.e p16, String p17, com.google.android.finsky.ah.a p18, boolean p19, com.google.android.finsky.cg.c p20, com.google.android.finsky.az.a p21) {
        this.m = new HashMap();
        ((com.google.android.finsky.api.a.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.api.a.a)).a(this);
        this.f = p0;
        this.h = p1;
        this.i = p2;
        this.j = p4;
        this.k = p6;
        this.l = p7;
        this.g = p3;
        this.u = p11;
        this.q = p17;
        this.r = p18;
        this.y = p19;
        this.m.put("X-DFE-Device-Id", p13);
        v4 = p5.getLanguage();
        v5 = p5.getCountry();
        this.m.put("Accept-Language", (String.valueOf(v4).length() + 1 + String.valueOf(v5).length()) + v4 + "-" + v5);
        if (!TextUtils.isEmpty(this.k))
            this.m.put("X-DFE-MCCMNC", this.k);
        if (!TextUtils.isEmpty(p8))
            this.m.put("X-DFE-Client-Id", p8);
        if (!TextUtils.isEmpty(p9))
            this.m.put("X-DFE-Logging-Id", p9);
        this.m.put("User-Agent", p14);
        this.b(p10);
        this.n = p12;
        this.v = p20;
        if (((Boolean)com.google.android.finsky.aa.b.fj.b()).booleanValue() && (this.g == 0 || !this.g.a(12603109)))
            this.o = p15;
        else
            this.o = 0;
        this.p = p16;
        this.x = p21;
        v2 = com.google.android.finsky.api.g.a.toString();
        v3 = com.google.android.volley.l.a(this.f, v2);
        if (v3 == 0) {
            v2 = String.valueOf(v2);
            if (v2.length() != 0)
                v2 = "BASE_URI blocked by UrlRules: ".concat(v2);
            else
                v2 = new String("BASE_URI blocked by UrlRules: ");
            throw new RuntimeException(v2);
        }
        if (!com.google.android.finsky.utils.be.a(v3, com.google.android.play.utils.k.a())) {
            v2 = String.valueOf(v3);
            if (v2.length() != 0)
                v2 = "Insecure URL: ".concat(v2);
            else
                v2 = new String("Insecure URL: ");
            throw new RuntimeException(v2);
        }
        v2 = this.a();
        if (v2 != 0)
            v2 = this.d.a(v2);
        else
            v2 = this.d.a(0);
        this.s = v2;
    }

    public static void a(com.google.android.finsky.cv.a.lg p0, Map p1) {
        if (p0.a != 0) {
            v0 = 0;
            while (v0 < p0.a.length) {
                p1.put(p0.a[v0].c, p0.a[v0].d);
                v0 = v0 + 1;
            }
        }
    }

    public static synchronized void a(String p0) {
        enter com.google.android.finsky.api.a.b;
        try {
            com.google.android.finsky.api.a.b.a = p0;
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.api.a.b;
            throw ex;
        }
        exit com.google.android.finsky.api.a.b;
    }

    private static synchronized String i() {
        enter com.google.android.finsky.api.a.b;
        try {
            exit com.google.android.finsky.api.a.b;
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.api.a.b;
            throw ex;
        }
        return com.google.android.finsky.api.a.b.a;
    }

    public final Account a() {
        if (this.h == 0)
            v0 = 0;
        else
            v0 = this.h.b;
        return v0;
    }

    public final synchronized void a(String p0, String p1) {
        enter this;
        try {
            this.m.put(p0, p1);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void a(Map p0) {
        if (this.w != 0)
            this.w.a(this, p0);
        else {
            v0 = this.f();
            if (!TextUtils.isEmpty(v0))
                p0.put("X-DFE-Device-Checkin-Consistency-Token", v0);
        }
    }

    public final String b() {
        v0 = this.a();
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.name;
        return v0;
    }

    public final void b(String p0) {
        this.m.put("X-DFE-Content-Filters", p0);
        v0 = (String)com.google.android.finsky.aa.a.aP.a();
        if (!TextUtils.isEmpty(v0))
            this.m.put("X-DFE-Content-Filter-Consistency-Token", v0);
    }

    public final void b(Map p0) {
        if (this.p != 0) {
            v0 = this.p.e();
            if (!TextUtils.isEmpty(v0))
                p0.put("X-DFE-Data-Service-Subscriber", v0);
        }
    }

    public final synchronized String c(String p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return (String)this.m.get(p0);
    }

    public final void c() {
        if (this.t != 0) {
            if (this.h != 0)
                this.h.a(this.t);
            this.t = 0;
        }
    }

    public final com.google.android.finsky.api.i d() {
        if (this.j != 0)
            v0 = (com.google.android.finsky.api.i)this.c.a();
        else
            v0 = 0;
        return v0;
    }

    public final synchronized Map e() {
        enter this;
        try {
            v1 = new HashMap();
            v1.putAll(this.m);
            if (this.g != 0) {
                if (this.g.a(12610177))
                    v1.put("X-DFE-Encoded-Targets", this.g.h());
                else {
                    try {
                        if (this.g.d())
                            v1.put("X-DFE-Supported-Targets", this.g.f());
                        if (this.g.e())
                            v1.put("X-DFE-Other-Targets", this.g.g());
                    }
                    catch (Throwable ex) {
                        exit this;
                        throw ex;
                    }
                }
            }
            v0 = this.b.e(this.b());
            if (!TextUtils.isEmpty(v0))
                v1.put("X-DFE-Phenotype", v0);
            v2 = com.google.android.finsky.aa.a.aq.b(this.b());
            if (!TextUtils.isEmpty((CharSequence)v2.a()))
                v1.put("X-DFE-Debug-Overrides", (String)v2.a());
            v2 = com.google.android.finsky.aa.a.Z.b(this.b());
            if (!TextUtils.isEmpty((CharSequence)v2.a()))
                v1.put("X-DFE-Debug-Other-Overridden-Targets", (String)v2.a());
            v0 = (String)com.google.android.finsky.aa.a.an.b(this.b()).a();
            if (!TextUtils.isEmpty(v0))
                v1.put("X-DFE-Cookie", v0);
            if (this.h != 0) {
                this.t = this.h.a();
                com.google.android.finsky.q.c.a(v1, this.t, this.h.c);
            }
            v0 = com.google.android.finsky.api.a.b.i();
            if (v0 != 0) {
                if (this.y != 0)
                    v1.put("x-obscura-nonce", v0);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v1;
    }

    public final String f() {
        if (!((Boolean)com.google.android.finsky.api.f.M.b()).booleanValue())
            v0 = 0;
        else
            v0 = com.google.android.finsky.deviceconfig.l.a(this.f, this.s);
        return v0;
    }

    public final NetworkInfo g() {
        return this.v.a();
    }

    public final boolean h() {
        if (this.h == 0 && ((this.g.a(12634602)) || ((Boolean)com.google.android.finsky.aa.b.gS.b()).booleanValue()))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final String toString() {
        v2 = new StringBuilder();
        v2.append("[DfeApiContext headers={");
        v3 = this.m.keySet().iterator();
        v1 = 1;
        while (v3.hasNext()) {
            v0 = (String)v3.next();
            if (v1 != 0)
                v1 = 0;
            else
                v2.append(", ");
            v2.append(v0).append(": ").append((String)this.m.get(v0));
        }
        v2.append("}]");
        return v2.toString();
    }

}
