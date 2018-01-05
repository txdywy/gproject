package com.google.android.finsky.dp;

import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C1050j;
import com.google.android.finsky.utils.FinskyLog;

final class C2869f implements C1050j {
    public final /* synthetic */ C1254c f15340a;
    public final /* synthetic */ boolean f15341b;
    public final /* synthetic */ boolean f15342c;
    public final /* synthetic */ boolean f15343d;
    public final /* synthetic */ C1096g f15344e;
    public final /* synthetic */ C2866c f15345f;

    C2869f(C2866c c2866c, C1254c c1254c, boolean z, boolean z2, boolean z3, C1096g c1096g) {
        this.f15345f = c2866c;
        this.f15340a = c1254c;
        this.f15341b = z;
        this.f15342c = z2;
        this.f15343d = z3;
        this.f15344e = c1096g;
    }

    public final void mo1306a() {
        this.f15345f.f15331c.m14579a(this.f15340a);
        C2866c c2866c = this.f15345f;
        C1254c c1254c = this.f15340a;
        boolean z = this.f15341b;
        boolean z2 = this.f15342c;
        boolean z3 = this.f15343d;
        C1096g c1096g = this.f15344e;
        c1254c.mo1607a(z2, false, z3, (C0660x) new C2867d(c2866c, c1254c, z, c1096g, z2, z3), new C2868e(c1096g));
    }

    public final void mo1307a(VolleyError volleyError) {
        FinskyLog.m21665c("Upload device configuration failed", new Object[0]);
        this.f15344e.mo1426a(volleyError);
    }
}
