package com.google.android.finsky.dp;

import android.text.TextUtils;
import com.android.volley.C0660x;
import com.android.volley.ServerError;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gp;

final /* synthetic */ class C2867d implements C0660x {
    public final C2866c f15333a;
    public final C1254c f15334b;
    public final boolean f15335c;
    public final C1096g f15336d;
    public final boolean f15337e;
    public final boolean f15338f;

    C2867d(C2866c c2866c, C1254c c1254c, boolean z, C1096g c1096g, boolean z2, boolean z3) {
        this.f15333a = c2866c;
        this.f15334b = c1254c;
        this.f15335c = z;
        this.f15336d = c1096g;
        this.f15337e = z2;
        this.f15338f = z3;
    }

    public final void b_(Object obj) {
        C2866c c2866c = this.f15333a;
        C1254c c1254c = this.f15334b;
        boolean z = this.f15335c;
        C1096g c1096g = this.f15336d;
        boolean z2 = this.f15337e;
        boolean z3 = this.f15338f;
        gp gpVar = (gp) obj;
        Object obj2 = gpVar.f31779v;
        String c = c1254c.mo1636c();
        C0957n b = C0954a.an.m5777b(c);
        if (TextUtils.isEmpty(obj2)) {
            b.m5765c();
        } else {
            b.m5763a(obj2);
        }
        C0957n b2 = C0954a.aR.m5777b(c);
        if (!c2866c.f15330b.dj().mo2294a(12633657) || c2866c.f15332d.m9026e()) {
            b2.m5763a(gpVar.f31765h);
        } else {
            b2.m5765c();
        }
        b = C0954a.by.m5777b(c);
        if (!((Boolean) b.m5760a()).booleanValue()) {
            b.m5763a(Boolean.valueOf(gpVar.f31782y));
        }
        b2 = C0954a.bA.m5777b(c);
        Object obj3 = gpVar.f31753A;
        if (TextUtils.isEmpty(obj3)) {
            b2.m5765c();
        } else {
            b2.m5763a(obj3);
        }
        if (gpVar.f31771n) {
            FinskyLog.m21659a("Server requests device config token", new Object[0]);
            c2866c.f15329a.mo3112a(c1254c);
            if (z) {
                c2866c.m15109a(c1254c, false, z2, z3, c1096g, true);
                return;
            }
            FinskyLog.m21665c("Failed to converge on device config for TOC", new Object[0]);
            c1096g.mo1426a(new ServerError());
            return;
        }
        c1096g.mo1427a(gpVar);
    }
}
