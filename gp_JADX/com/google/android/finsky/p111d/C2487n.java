package com.google.android.finsky.p111d;

import android.content.Context;
import com.google.android.finsky.cg.C2278e;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.p179a.C2486w;
import com.google.android.play.p179a.C6216a;
import com.google.android.play.p179a.p352a.ar;

public final class C2487n implements C2486w {
    public Context f13406a;
    public C1463g f13407b;
    public C2482j f13408c = null;
    public C2472z f13409d;

    public C2487n() {
        ((C1372b) C3947d.m18649a(C1372b.class)).mo1794a(this);
    }

    public final void mo2918a(ar arVar) {
        int i = 1;
        if (this.f13409d == null || arVar.f30875b.l == null) {
            arVar.f30876c = C6216a.m28694a(C2278e.m11746a(this.f13406a));
            arVar.f30874a |= 1;
            C2482j dc = this.f13408c == null ? this.f13407b.dc() : this.f13408c;
            C2474c c2474c = new C2474c(9);
            c2474c.f13342a.f31688N = arVar;
            dc.m13320a(c2474c.f13342a, null, -1);
            return;
        }
        if (!arVar.f30875b.q.equals(ae.f13328a.toString())) {
            FinskyLog.m21669e("Unknown jank event name: %s", arVar.f30875b.q);
            i = 0;
        }
        this.f13409d.mo2912a(i, arVar.f30875b.l);
        this.f13409d = null;
    }
}
