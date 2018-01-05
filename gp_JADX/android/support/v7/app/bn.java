package android.support.v7.app;

import android.support.v7.view.menu.C0408q;
import android.support.v7.view.menu.C0471p;
import android.view.MenuItem;

final class bn implements C0408q {
    public final /* synthetic */ bj f2376a;

    bn(bj bjVar) {
        this.f2376a = bjVar;
    }

    public final boolean mo529a(C0471p c0471p, MenuItem menuItem) {
        return false;
    }

    public final void mo524a(C0471p c0471p) {
        if (this.f2376a.f2366c == null) {
            return;
        }
        if (this.f2376a.f2364a.mo910i()) {
            this.f2376a.f2366c.onPanelClosed(108, c0471p);
        } else if (this.f2376a.f2366c.onPreparePanel(0, null, c0471p)) {
            this.f2376a.f2366c.onMenuOpened(108, c0471p);
        }
    }
}
