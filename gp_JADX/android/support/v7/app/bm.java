package android.support.v7.app;

import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.ag;

final class bm implements ag {
    public boolean f2374a;
    public final /* synthetic */ bj f2375b;

    bm(bj bjVar) {
        this.f2375b = bjVar;
    }

    public final boolean mo554a(C0471p c0471p) {
        if (this.f2375b.f2366c == null) {
            return false;
        }
        this.f2375b.f2366c.onMenuOpened(108, c0471p);
        return true;
    }

    public final void mo553a(C0471p c0471p, boolean z) {
        if (!this.f2374a) {
            this.f2374a = true;
            this.f2375b.f2364a.mo915n();
            if (this.f2375b.f2366c != null) {
                this.f2375b.f2366c.onPanelClosed(108, c0471p);
            }
            this.f2374a = false;
        }
    }
}
