package com.google.android.finsky.setup;

import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.ee;
import java.util.ArrayList;
import java.util.List;

public final class C4174g {
    public final List f21089a = new ArrayList();
    public final List f21090b = new ArrayList();
    public final List f21091c = new ArrayList();

    public C4174g(C1461c c1461c, ee[] eeVarArr, C3646a c3646a) {
        if (eeVarArr != null && eeVarArr.length != 0) {
            for (ee eeVar : eeVarArr) {
                C3647b a = c3646a.m17243a(eeVar.c.f11833b);
                if (eeVar.h) {
                    this.f21090b.add(eeVar);
                    this.f21091c.add(eeVar);
                    if (a == null || a.f18028c == null) {
                        FinskyLog.m21659a("Required preload %s is not already installed.", r6);
                        this.f21089a.add(eeVar);
                    }
                } else if (a == null || (a.f18028c == null && a.f18029d == null)) {
                    FinskyLog.m21659a("Optional preload %s is not already installed or installing.", r6);
                    this.f21089a.add(eeVar);
                    if (eeVar.i) {
                        this.f21091c.add(eeVar);
                    }
                } else {
                    C3654j c3654j = new C3654j(c1461c);
                    if (eeVar != null) {
                        c3654j.m17260a(eeVar.d, eeVar.k, null);
                    }
                    boolean e = c3654j.m17262a(a.f18028c).m17269e();
                    int i;
                    if (a.f18029d == null || a.f18029d.f10809c < eeVar.d) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    if (e || r0 != 0) {
                        FinskyLog.m21665c("Skip optional preload %s because a sufficient version is already installed or installing.", r6);
                    } else {
                        FinskyLog.m21659a("Preload %s needs updating; the installed or installing version is too old.", r6);
                        this.f21090b.add(eeVar);
                        this.f21091c.add(eeVar);
                    }
                }
            }
        }
    }
}
