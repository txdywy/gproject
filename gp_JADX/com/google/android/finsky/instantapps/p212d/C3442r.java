package com.google.android.finsky.instantapps.p212d;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.instantapps.C5265d;

final /* synthetic */ class C3442r implements C1643x {
    public final C3438n f17609a;
    public final ah f17610b;
    public final boolean f17611c;

    C3442r(C3438n c3438n, ah ahVar, boolean z) {
        this.f17609a = c3438n;
        this.f17610b = ahVar;
        this.f17611c = z;
    }

    public final void mo2367a(C4980w c4980w) {
        C3438n c3438n = this.f17609a;
        ah ahVar = this.f17610b;
        boolean z = this.f17611c;
        C5265d c5265d = (C5265d) c4980w;
        c3438n.f17598l.mo5136a(628);
        if (!c5265d.mo4505b().m23271a() || c5265d.mo4691a() == null || TextUtils.isEmpty(c5265d.mo4691a().f26426b)) {
            FinskyLog.m21667d("Couldn't fetch account!", new Object[0]);
            c3438n.f17601o.set(false);
            C3438n.m16993a(ahVar);
            c3438n.m16997a(2504, false);
            return;
        }
        c3438n.m16999a(ahVar, z, c5265d.mo4691a().f26426b);
    }
}
