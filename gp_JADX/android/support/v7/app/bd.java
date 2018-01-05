package android.support.v7.app;

import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.ag;
import android.view.Menu;
import android.view.Window.Callback;

final class bd implements ag {
    public final /* synthetic */ aq f2346a;

    bd(aq aqVar) {
        this.f2346a = aqVar;
    }

    public final void mo553a(C0471p c0471p, boolean z) {
        Menu menu;
        Menu k = c0471p.mo686k();
        boolean z2 = k != c0471p;
        aq aqVar = this.f2346a;
        if (z2) {
            menu = k;
        }
        bc a = aqVar.m2409a(menu);
        if (a == null) {
            return;
        }
        if (z2) {
            this.f2346a.m2413a(a.f2327a, a, k);
            this.f2346a.m2415a(a, true);
            return;
        }
        this.f2346a.m2415a(a, z);
    }

    public final boolean mo554a(C0471p c0471p) {
        if (c0471p == null && this.f2346a.l) {
            Callback callback = this.f2346a.f2249f.getCallback();
            if (!(callback == null || this.f2346a.f2261r)) {
                callback.onMenuOpened(108, c0471p);
            }
        }
        return true;
    }
}
