package com.google.android.finsky.setup.p242d;

import android.content.Context;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.billing.p120d.C1805b;
import com.google.android.finsky.bt.C2180a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p257t.C4562a;
import com.google.android.finsky.setup.af;
import com.google.android.finsky.setup.al;
import com.google.android.finsky.setup.ao;
import com.google.android.finsky.setup.bs;
import com.google.android.finsky.setup.bw;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.setup.p242d.p244a.C4143a;
import com.google.android.finsky.setup.p242d.p244a.C4156l;
import com.google.android.finsky.setup.p242d.p244a.C4160o;

public final class C4169i implements C4168h {
    public final Context f21042a;
    public final bs f21043b;
    public final C1287h f21044c;
    public final C1463g f21045d;
    public final C0986a f21046e;
    public final C4562a f21047f;
    public final C4126m f21048g;
    public final C2320a f21049h;
    public final ao f21050i;
    public final af f21051j;
    public final al f21052k;
    public final bw f21053l;
    public final C1805b f21054m;

    public C4169i(Context context, bs bsVar, C1287h c1287h, C1463g c1463g, C0986a c0986a, C4562a c4562a, C4126m c4126m, C2320a c2320a, ao aoVar, af afVar, al alVar, C2180a c2180a, bw bwVar, C1805b c1805b) {
        this.f21042a = context;
        this.f21043b = bsVar;
        this.f21044c = c1287h;
        this.f21045d = c1463g;
        this.f21046e = c0986a;
        this.f21047f = c4562a;
        this.f21048g = c4126m;
        this.f21049h = c2320a;
        this.f21050i = aoVar;
        this.f21051j = afVar;
        this.f21052k = alVar;
        this.f21053l = bwVar;
        this.f21054m = c1805b;
    }

    public final C4142a mo3989a(C4138b c4138b) {
        return new C4143a(this.f21042a, c4138b, this.f21051j, this.f21044c, this.f21045d, this.f21046e, this.f21047f, this.f21043b, this.f21052k, this.f21048g);
    }

    public final C4159f mo3991a() {
        return new C4160o(this.f21042a, this.f21050i);
    }

    public final C4155d mo3990a(C4161e c4161e) {
        return new C4156l(this.f21042a, c4161e, this.f21050i, this.f21049h, this.f21044c, this.f21046e, this.f21052k, this.f21053l, this.f21054m);
    }
}
