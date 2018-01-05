package com.google.android.finsky.appdiscoveryservice.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.android.vending.a.a;
import com.android.volley.VolleyError;
import com.android.volley.n;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.appdiscoveryservice.a.a;
import com.google.android.finsky.appdiscoveryservice.i;
import com.google.android.finsky.appdiscoveryservice.q;
import com.google.android.finsky.appdiscoveryservice.s;
import com.google.android.finsky.appdiscoveryservice.t;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.instantappscompatibility.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.i;
import com.google.android.play.image.u;
import com.google.android.play.image.w;
import com.google.android.play.image.x;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.cn;
import com.google.wireless.android.finsky.dfe.a.a.b;
import com.google.wireless.android.finsky.dfe.a.a.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class com.google.android.finsky.appdiscoveryservice.b.a extends com.google.android.finsky.appdiscoveryservice.b.k implements com.android.volley.w, com.android.volley.x, com.google.android.finsky.api.w
{

    public static final com.google.android.play.utils.b.a a;
    public final com.google.android.finsky.api.h b;
    public final com.google.android.play.image.w c;
    public final com.google.android.finsky.appdiscoveryservice.b.e d;
    public final com.google.android.finsky.appdiscoveryservice.i e;
    public final ConditionVariable f;
    public com.android.volley.n g;
    public final com.google.android.finsky.instantappscompatibility.b h;
    public ConditionVariable i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public int n;
    public byte[] o;
    public boolean p;
    public Set q;

    static {
        com.google.android.finsky.appdiscoveryservice.b.a.a = com.google.android.play.utils.b.a.a("finsky.launcher_search_suggest_timeout_ms", Long.valueOf(5000));
    }

    a(Context p0, com.google.android.finsky.appdiscoveryservice.b.h p1, int p2, int p3, int p4, String p5, String p6, int p7, com.android.vending.a.a p8, com.google.android.finsky.instantappscompatibility.b p9, com.google.android.finsky.appdiscoveryservice.s p10, com.google.android.finsky.appdiscoveryservice.q p11, com.google.android.finsky.appdiscoveryservice.t p12, com.google.android.finsky.api.h p13, com.google.android.play.image.w p14, com.google.android.finsky.appdiscoveryservice.b.e p15, com.google.android.finsky.appdiscoveryservice.a.a p16, boolean p17, ConditionVariable p18) {
        com.google.android.finsky.appdiscoveryservice.b.k(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p15, p16);
        this.b = p13;
        this.c = p14;
        this.d = p15;
        this.e = p12;
        this.p = this.g();
        this.j = p17;
        this.f = p18;
        this.h = p9;
    }

    private final void a(Context p0, String p1, int p2) {
        v2 = com.google.android.finsky.utils.i.b();
        FinskyLog.b(40 + "Profile logging ms: " + (v2 - this.k), new Object[0]);
        this.q = new HashSet();
        v1 = this.b(p0, p1);
        v4 = v1.iterator();
        while (true) {
            if (!v4.hasNext()) {
                FinskyLog.b(48 + "No. of on-device instant apps found: " + v1.size(), new Object[0]);
                this.d.a(p1, com.google.android.finsky.utils.i.b() - this.k, this.n);
                FinskyLog.b(48 + "Profile on-device fetch ms: " + (com.google.android.finsky.utils.i.b() - v2), new Object[0]);
                return;
            }
            v0 = (Bundle)v4.next();
            v5 = v0.getString("AppDiscoveryService.packageName");
            if (v5 != 0)
                this.q.add(v5);
            this.a(v0);
            this.n = this.n + 1;
            if (this.n == p2) {
                FinskyLog.b(48 + "No. of on-device instant apps found: " + v1.size(), new Object[0]);
                this.d.a(p1, com.google.android.finsky.utils.i.b() - this.k, this.n);
                FinskyLog.b(48 + "Profile on-device fetch ms: " + (com.google.android.finsky.utils.i.b() - v2), new Object[0]);
                return;
            }
        }
    }

    private static boolean a(com.google.wireless.android.finsky.dfe.a.a.c p0) {
        if (p0 != 0 && p0.e != 0 && p0.e.f != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final boolean a(String p0) {
        v0 = 0;
        if (!TextUtils.isEmpty(p0)) {
            if (this.h.e.getPackageUid(p0, 0) != -1)
                v0 = 1;
            return v0;
        }
        return v0;
        try {
        }
        catch (PackageManager$NameNotFoundException ex) {
            return v0;
        }
        if (this.h.e.getPackageUid(p0, 0) != -1)
            v0 = 1;
        return v0;
    }

    private final void h() {
        this.g = 0;
        if (this.i != 0)
            this.i.open();
    }

    protected final void a(Context p0, String p1) {
        this.k = com.google.android.finsky.utils.i.b();
        this.n = 0;
        if ((TextUtils.isEmpty(p1)) || this.x == 0) {
            if (this.j != 0)
                super.a(p0, p1);
            else
                this.f();
        }
        else {
            this.d.a(this.v, this.w, this.E, this.F, p1, 0, this.x, this.p);
            v0 = String.valueOf(p1);
            if (v0.length() != 0)
                v0 = "findApps: ".concat(v0);
            else
                v0 = new String("findApps: ");
            FinskyLog.b(v0, new Object[0]);
            if (this.j != 0)
                this.a(p0, p1, this.x);
            if (this.n == this.x)
                this.f();
            else {
                this.l = com.google.android.finsky.utils.i.b();
                FinskyLog.b("Issuing search suggestions request.", new Object[0]);
                this.o = 0;
                this.f.block(((Long)com.google.android.finsky.aa.b.iG.b()).longValue());
                if (this.d())
                    FinskyLog.b("Not performing server request - task was cancelled during wait period.", new Object[0]);
                else {
                    this.i = new ConditionVariable();
                    this.g = this.b.a().a(p1, this.x, this.E, this.F, this, this, this);
                    FinskyLog.b("Search suggestions request issued.", new Object[0]);
                    if (!this.i.block(((Long)com.google.android.finsky.appdiscoveryservice.b.a.a.b()).longValue())) {
                        FinskyLog.c("Server app discovery request timed-out.", new Object[0]);
                        this.e();
                    }
                    FinskyLog.b("Search suggestions request complete.", new Object[0]);
                }
            }
        }
    }

    public final void a(VolleyError p0) {
        FinskyLog.b("onErrorResponse", new Object[0]);
        this.e();
        this.h();
    }

    final void a(List p0, x[] p1) {
        if (this.B == 0) {
            v12 = p0.iterator();
            v10 = 0;
            while (v12.hasNext()) {
                v3 = (com.google.wireless.android.finsky.dfe.a.a.c)v12.next();
                if (this.p == 0)
                    v3.g = 0;
                v0 = this.e.a(this.r, 0, v3, this.E, this.F, this.v, this.w, v3.j, this.d.a);
                if (this.a(v0.getString("AppDiscoveryService.packageName", 0)))
                    v10 = v10 + 1;
                else {
                    if (com.google.android.finsky.appdiscoveryservice.b.a.a(v3))
                        v0.putParcelable("AppDiscoveryService.launcherIcon", p1[v10].b());
                    this.a(v0);
                    v10 = v10 + 1;
                }
            }
            v0 = com.google.android.finsky.utils.i.b();
            FinskyLog.b(44 + "Profile image fetch ms: " + (v0 - this.m), new Object[0]);
            FinskyLog.b(38 + "Profile total ms: " + (v0 - this.k), new Object[0]);
            this.d.a.a(new com.google.android.finsky.d.c(2302).a(new com.google.wireless.android.a.a.a.a.cn().a(2).a(this.u).a(v0 - this.k).b(p0.size()).a(this.o)).a, 0);
            this.f();
            this.h();
        }
    }

    public final void ah_() {
        FinskyLog.b("onRequestCanceled", new Object[0]);
        this.h();
    }

    protected final void b() {
        if (this.g != 0) {
            this.g.f();
            this.g = 0;
        }
    }

    public final void b_(Object p0) {
        v0 = String.valueOf((com.google.wireless.android.finsky.dfe.a.a.b)p0);
        FinskyLog.b((String.valueOf(v0).length() + 12) + "onResponse: " + v0, new Object[0]);
        v4 = com.google.android.finsky.utils.i.b();
        FinskyLog.b(45 + "Profile server fetch ms: " + (v4 - this.l), new Object[0]);
        if (((com.google.wireless.android.finsky.dfe.a.a.b)p0).b == 0) {
            FinskyLog.d("Response object unexpectedly null.", new Object[0]);
            this.e();
            this.h();
        }
        this.o = ((com.google.wireless.android.finsky.dfe.a.a.b)p0).c;
        if (((com.google.wireless.android.finsky.dfe.a.a.b)p0).b.length == 0) {
            this.f();
            this.h();
        }
        v1 = new ArrayList();
        v0 = 0;
        while (true) {
            if (v0 >= ((com.google.wireless.android.finsky.dfe.a.a.b)p0).b.length) {
                if (v1.size() == 0) {
                    this.f();
                    this.h();
                }
                this.m = v4;
                v8 = this.r.getResources().getDimensionPixelSize(2131625255);
                v5 = 0;
                v4 = 0;
                while (v5 < ((ArrayList)v1).size()) {
                    v2 = ((ArrayList)v1).get(v5);
                    v5 = v5 + 1;
                    if (com.google.android.finsky.appdiscoveryservice.b.a.a((com.google.wireless.android.finsky.dfe.a.a.c)v2) && this.c.a().a(((com.google.wireless.android.finsky.dfe.a.a.c)v2).e.f, v8, v8) == 0)
                        v2 = v4 + 1;
                    else
                        v2 = v4;
                    v4 = v2;
                }
                v9 = new x[v1.size()];
                v5 = 0;
                v7 = 0;
                while (v5 < ((ArrayList)v1).size()) {
                    v6 = v5 + 1;
                    v2 = (com.google.wireless.android.finsky.dfe.a.a.c)((ArrayList)v1).get(v5);
                    if (com.google.android.finsky.appdiscoveryservice.b.a.a(v2)) {
                        v5 = String.valueOf(v2.e.f);
                        if (v5.length() != 0)
                            v5 = "Loading image: ".concat(v5);
                        else
                            v5 = new String("Loading image: ");
                        FinskyLog.b(v5, new Object[0]);
                        v9[v7] = this.c.a(v2.e.f, v8, v8, new com.google.android.finsky.appdiscoveryservice.b.c(v4, new com.google.android.finsky.appdiscoveryservice.b.b(this, v1, v9)));
                    }
                    v5 = v6;
                    v7 = v7 + 1;
                }
                if (v4 == 0)
                    this.a(v1, v9);
                return;
            }
            if (((com.google.wireless.android.finsky.dfe.a.a.b)p0).b[v0] != 0) {
                if (((com.google.wireless.android.finsky.dfe.a.a.b)p0).b[v0].b & 1)
                    v2 = 1;
                else
                    v2 = 0;
                if (v2 != 0) {
                    if (this.q == 0 || !this.q.contains(((com.google.wireless.android.finsky.dfe.a.a.b)p0).b[v0].c)) {
                        v1.add(((com.google.wireless.android.finsky.dfe.a.a.b)p0).b[v0]);
                        this.n = this.n + 1;
                        if (this.n == this.x) {
                            if (v1.size() == 0) {
                                this.f();
                                this.h();
                            }
                            this.m = v4;
                            v8 = this.r.getResources().getDimensionPixelSize(2131625255);
                            v5 = 0;
                            v4 = 0;
                            while (v5 < ((ArrayList)v1).size()) {
                                v2 = ((ArrayList)v1).get(v5);
                                v5 = v5 + 1;
                                if (com.google.android.finsky.appdiscoveryservice.b.a.a((com.google.wireless.android.finsky.dfe.a.a.c)v2) && this.c.a().a(((com.google.wireless.android.finsky.dfe.a.a.c)v2).e.f, v8, v8) == 0)
                                    v2 = v4 + 1;
                                else
                                    v2 = v4;
                                v4 = v2;
                            }
                            v9 = new x[v1.size()];
                            v5 = 0;
                            v7 = 0;
                            while (v5 < ((ArrayList)v1).size()) {
                                v6 = v5 + 1;
                                v2 = (com.google.wireless.android.finsky.dfe.a.a.c)((ArrayList)v1).get(v5);
                                if (com.google.android.finsky.appdiscoveryservice.b.a.a(v2)) {
                                    v5 = String.valueOf(v2.e.f);
                                    if (v5.length() != 0)
                                        v5 = "Loading image: ".concat(v5);
                                    else
                                        v5 = new String("Loading image: ");
                                    FinskyLog.b(v5, new Object[0]);
                                    v9[v7] = this.c.a(v2.e.f, v8, v8, new com.google.android.finsky.appdiscoveryservice.b.c(v4, new com.google.android.finsky.appdiscoveryservice.b.b(this, v1, v9)));
                                }
                                v5 = v6;
                                v7 = v7 + 1;
                            }
                            if (v4 == 0)
                                this.a(v1, v9);
                            return;
                        }
                    }
                }
            }
            v0 = v0 + 1;
        }
    }

}
