package com.google.android.finsky.instantapps.p212d;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.instantapps.C5264c;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;

final /* synthetic */ class C3439o implements C1643x {
    public final C3438n f17603a;
    public final ah f17604b;
    public final boolean f17605c;

    C3439o(C3438n c3438n, ah ahVar, boolean z) {
        this.f17603a = c3438n;
        this.f17604b = ahVar;
        this.f17605c = z;
    }

    public final void mo2367a(C4980w c4980w) {
        C3438n c3438n = this.f17603a;
        ah ahVar = this.f17604b;
        boolean z = this.f17605c;
        C5264c c5264c = (C5264c) c4980w;
        if (c5264c.mo4505b().m23271a()) {
            c3438n.f17598l.mo5136a(605);
            InstantAppPreLaunchInfo a = c5264c.mo4690a();
            Object obj = a.f26417b;
            if (TextUtils.isEmpty(obj)) {
                obj = c3438n.f17587a.m17005a();
            } else {
                c3438n.f17587a.m17006a(obj);
            }
            if (c3438n.f17599m) {
                FinskyLog.m21662b("Intersplit launch; ignoring gcore destination.", new Object[0]);
            } else {
                int i = a.f26416a;
                FinskyLog.m21662b("Destination was " + i, new Object[0]);
                if (i == 1) {
                    c3438n.f17598l.mo5136a(608);
                    c3438n.f17601o.set(false);
                    c3438n.f17590d.post(new C3440p(c3438n, a));
                    FinskyLog.m21662b("Destination was OPT IN", new Object[0]);
                    C3438n.m16993a(ahVar);
                    return;
                } else if (i == 0) {
                    c3438n.f17598l.mo5136a(609);
                    FinskyLog.m21662b("No Instant App available after all", new Object[0]);
                    C3438n.m16993a(ahVar);
                    c3438n.m16997a(2507, false);
                    return;
                } else if (a.f26423h) {
                    FinskyLog.m21662b("User preferred browser", new Object[0]);
                    C3438n.m16993a(ahVar);
                    c3438n.m16997a(2507, false);
                    return;
                } else if (i == 5) {
                    c3438n.f17590d.post(new C3441q(c3438n.f17593g));
                }
            }
            if (TextUtils.isEmpty(obj)) {
                c3438n.f17598l.mo5136a(627);
                c3438n.f17588b.m27186a(new C3442r(c3438n, ahVar, z));
                return;
            }
            c3438n.m16999a(ahVar, z, obj);
            return;
        }
        FinskyLog.m21667d("Couldn't connect to GMSCore", new Object[0]);
        C3438n.m16993a(ahVar);
        c3438n.m16997a(2504, false);
    }
}
