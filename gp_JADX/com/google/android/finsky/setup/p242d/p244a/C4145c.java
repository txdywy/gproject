package com.google.android.finsky.setup.p242d.p244a;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bt.C2180a;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.setup.ah;
import com.google.android.finsky.utils.FinskyLog;

final class C4145c implements C0657w {
    public final /* synthetic */ String f20981a;
    public final /* synthetic */ String f20982b;
    public final /* synthetic */ C4143a f20983c;

    C4145c(C4143a c4143a, String str, String str2) {
        this.f20983c = c4143a;
        this.f20981a = str;
        this.f20982b = str2;
    }

    public final void mo1062a(VolleyError volleyError) {
        boolean z;
        C4143a c4143a = this.f20983c;
        String str = this.f20981a;
        String str2 = this.f20982b;
        c4143a.f20976h.mo3950a(str, c4143a.f20971c.m19188b(str), volleyError);
        FinskyLog.m21665c("Could not get applications to setup for account %s from server. Error: %s", FinskyLog.m21655a(str), volleyError);
        ah ahVar = (ah) c4143a.f20971c.f20763b.get(str);
        if (ahVar == null) {
            z = false;
        } else if (ahVar.f20767a >= ((Integer) C0955b.bj.m28964b()).intValue()) {
            FinskyLog.m21659a("Reached limit %d for account %s", Integer.valueOf(ahVar.f20767a), FinskyLog.m21655a(str));
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ahVar = (ah) c4143a.f20971c.f20763b.get(str);
            if (ahVar != null) {
                ahVar.f20769c = false;
            }
            c4143a.f20977i.mo3924a(c4143a.f20969a, str2, str, C2180a.m11451a(((Long) C0955b.bk.m28964b()).longValue(), 0.25f));
        } else {
            c4143a.m19417a(str, c4143a.f20971c.m19188b(str), C3322j.m16692a(volleyError), volleyError);
            c4143a.f20971c.m19187a(str);
        }
        c4143a.f20970b.mo3941a();
    }
}
