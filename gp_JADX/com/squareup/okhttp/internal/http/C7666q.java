package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7599a;
import com.squareup.okhttp.C7607h;
import com.squareup.okhttp.C7680m;
import com.squareup.okhttp.C7689v;
import com.squareup.okhttp.C7690w;
import com.squareup.okhttp.C7691x;
import com.squareup.okhttp.ad;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ak;
import com.squareup.okhttp.al;
import com.squareup.okhttp.am;
import com.squareup.okhttp.internal.k;
import java.net.CookieHandler;
import java.util.Date;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p526e.C7631z;
import p526e.C7724h;
import p526e.C7731n;
import p526e.C7733p;
import p526e.aa;

public final class C7666q {
    public static final am f39676a = new C7667r();
    public final ad f39677b;
    public final ad f39678c;
    public final ak f39679d;
    public C7654v f39680e;
    public long f39681f = -1;
    public boolean f39682g;
    public final boolean f39683h;
    public final ag f39684i;
    public ag f39685j;
    public ak f39686k;
    public ak f39687l;
    public C7631z f39688m;
    public C7724h f39689n;
    public final boolean f39690o;
    public final boolean f39691p;
    public C7650b f39692q;
    public C7651c f39693r;

    public C7666q(ad adVar, ag agVar, boolean z, boolean z2, boolean z3, ad adVar2, aa aaVar, ak akVar) {
        this.f39677b = adVar;
        this.f39684i = agVar;
        this.f39683h = z;
        this.f39690o = z2;
        this.f39691p = z3;
        if (adVar2 == null) {
            C7680m c7680m = adVar.t;
            SSLSocketFactory sSLSocketFactory = null;
            HostnameVerifier hostnameVerifier = null;
            C7607h c7607h = null;
            if (agVar.m36635d()) {
                sSLSocketFactory = adVar.p;
                hostnameVerifier = adVar.q;
                c7607h = adVar.r;
            }
            ad adVar3 = new ad(c7680m, new C7599a(agVar.f39288a.f39799e, agVar.f39288a.f39800f, adVar.u, adVar.o, sSLSocketFactory, hostnameVerifier, c7607h, adVar.s, adVar.f, adVar.g, adVar.h, adVar.k));
        }
        this.f39678c = adVar2;
        this.f39688m = aaVar;
        this.f39679d = akVar;
    }

    public static ak m36961a(ak akVar) {
        if (akVar == null || akVar.f39310g == null) {
            return akVar;
        }
        al a = akVar.m36650a();
        a.f39321g = null;
        return a.m36655a();
    }

    public final void m36966a() {
        if (this.f39681f != -1) {
            throw new IllegalStateException();
        }
        this.f39681f = System.currentTimeMillis();
    }

    public static boolean m36963a(ag agVar) {
        return C7670u.m36980b(agVar.f39289b);
    }

    public final ad m36970b() {
        if (this.f39689n != null) {
            k.a(this.f39689n);
        } else if (this.f39688m != null) {
            k.a(this.f39688m);
        }
        if (this.f39687l != null) {
            k.a(this.f39687l.f39310g);
        } else {
            this.f39678c.m36917a(true, false, true);
        }
        return this.f39678c;
    }

    public final ak m36969b(ak akVar) {
        if (!this.f39682g || !"gzip".equalsIgnoreCase(this.f39687l.m36651a("Content-Encoding")) || akVar.f39310g == null) {
            return akVar;
        }
        aa c7731n = new C7731n(akVar.f39310g.mo6476d());
        C7689v a = akVar.f39309f.m37016b().m37022a("Content-Encoding").m37022a("Content-Length").m37021a();
        al a2 = akVar.m36650a().m36657a(a);
        a2.f39321g = new C7673y(a, C7733p.m37442a(c7731n));
        return a2.m36655a();
    }

    public static boolean m36965c(ak akVar) {
        if (akVar.f39304a.f39289b.equals("HEAD")) {
            return false;
        }
        int i = akVar.f39306c;
        if ((i < 100 || i >= 200) && i != 204 && i != 304) {
            return true;
        }
        if (C7671w.m36982a(akVar) != -1 || "chunked".equalsIgnoreCase(akVar.m36651a("Transfer-Encoding"))) {
            return true;
        }
        return false;
    }

    public final ak m36971c() {
        this.f39680e.mo6473b();
        al a = this.f39680e.mo6467a();
        a.f39315a = this.f39685j;
        a.f39319e = this.f39678c.m36912a().f39562d;
        ak a2 = a.m36658a(C7671w.f39704c, Long.toString(this.f39681f)).m36658a(C7671w.f39705d, Long.toString(System.currentTimeMillis())).m36655a();
        if (!this.f39691p) {
            al a3 = a2.m36650a();
            a3.f39321g = this.f39680e.mo6468a(a2);
            a2 = a3.m36655a();
        }
        if ("close".equalsIgnoreCase(a2.f39304a.m36630a("Connection")) || "close".equalsIgnoreCase(a2.m36651a("Connection"))) {
            this.f39678c.m36917a(true, false, false);
        }
        return a2;
    }

    public static boolean m36964a(ak akVar, ak akVar2) {
        if (akVar2.f39306c == 304) {
            return true;
        }
        Date b = akVar.f39309f.m37018b("Last-Modified");
        if (b != null) {
            Date b2 = akVar2.f39309f.m37018b("Last-Modified");
            if (b2 != null && b2.getTime() < b.getTime()) {
                return true;
            }
        }
        return false;
    }

    public static C7689v m36962a(C7689v c7689v, C7689v c7689v2) {
        int i;
        int i2 = 0;
        C7690w c7690w = new C7690w();
        int length = c7689v.f39793a.length / 2;
        for (i = 0; i < length; i++) {
            String a = c7689v.m37013a(i);
            String b = c7689v.m37017b(i);
            if (!("Warning".equalsIgnoreCase(a) && b.startsWith("1")) && (!C7671w.m36987a(a) || c7689v2.m37014a(a) == null)) {
                c7690w.m37023a(a, b);
            }
        }
        i = c7689v2.f39793a.length / 2;
        while (i2 < i) {
            String a2 = c7689v2.m37013a(i2);
            if (!"Content-Length".equalsIgnoreCase(a2) && C7671w.m36987a(a2)) {
                c7690w.m37023a(a2, c7689v2.m37017b(i2));
            }
            i2++;
        }
        return c7690w.m37021a();
    }

    public final void m36967a(C7689v c7689v) {
        CookieHandler cookieHandler = this.f39677b.l;
        if (cookieHandler != null) {
            cookieHandler.put(this.f39684i.m36631a(), C7671w.m36989b(c7689v));
        }
    }

    public final boolean m36968a(C7691x c7691x) {
        C7691x c7691x2 = this.f39684i.f39288a;
        return c7691x2.f39799e.equals(c7691x.f39799e) && c7691x2.f39800f == c7691x.f39800f && c7691x2.f39796b.equals(c7691x.f39796b);
    }
}
