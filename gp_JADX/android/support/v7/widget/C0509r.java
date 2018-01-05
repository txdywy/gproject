package android.support.v7.widget;

import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.ag;
import android.support.v7.view.menu.ap;

final class C0509r implements ag {
    public final /* synthetic */ C0502k f3651a;

    C0509r(C0502k c0502k) {
        this.f3651a = c0502k;
    }

    public final boolean mo554a(C0471p c0471p) {
        if (c0471p == null) {
            return false;
        }
        ((ap) c0471p).getItem().getItemId();
        ag agVar = this.f3651a.f2756e;
        return agVar != null ? agVar.mo554a(c0471p) : false;
    }

    public final void mo553a(C0471p c0471p, boolean z) {
        if (c0471p instanceof ap) {
            c0471p.mo686k().m2824a(false);
        }
        ag agVar = this.f3651a.f2756e;
        if (agVar != null) {
            agVar.mo553a(c0471p, z);
        }
    }
}
