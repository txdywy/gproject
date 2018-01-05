package com.google.android.finsky.installer.p207a;

import android.support.v4.p037h.C0308c;
import com.android.volley.C0660x;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.ae;
import com.google.wireless.android.finsky.dfe.nano.bs;

final class as implements C0660x {
    public final /* synthetic */ String f16946a;
    public final /* synthetic */ ah f16947b;

    as(ah ahVar, String str) {
        this.f16947b = ahVar;
        this.f16946a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        boolean z = true;
        bs bsVar = (bs) obj;
        int i = bsVar.b;
        if (i == 1) {
            this.f16947b.f16900h.mo2665a(this.f16946a, bsVar.c, System.currentTimeMillis());
            C2129c a = this.f16947b.f16900h.mo2657a(this.f16946a);
            this.f16947b.m16429a(a, true);
            ah ahVar = this.f16947b;
            a aVar = a.f10811e;
            C3654j a2 = new C3654j(ahVar.f16911s).m17261a(a).m17262a(ahVar.f16896d.m17243a(ahVar.f16878I).f18028c);
            if (ahVar.m16451k() && a2.m17268d()) {
                C0308c c0308c = new C0308c(a2.m17267c());
                for (ae aeVar : aVar.r) {
                    c0308c.remove(aeVar.c);
                }
                z = c0308c.isEmpty();
            }
            if (z) {
                this.f16947b.m16426a(a);
                this.f16947b.m16440b(a);
                return;
            }
            this.f16947b.m16435a(false);
            this.f16947b.f16874E.m11221a(this.f16946a, new C2474c(104).m13236a(this.f16946a).m13254g(1127).m13231a(this.f16947b.f16893X).f13342a);
            this.f16947b.m16423a(3, 999);
            return;
        }
        FinskyLog.m21659a("Received non-OK response %d", Integer.valueOf(i));
        this.f16947b.m16435a(false);
        Runnable atVar = new at(this, i);
        if (i == 5) {
            this.f16947b.f16913u.mo4382b(atVar, "delivery_doc_outdated");
        } else {
            atVar.run();
        }
    }
}
