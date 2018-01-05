package android.support.v7.widget;

import android.support.v7.view.menu.C0408q;
import android.support.v7.view.menu.C0471p;
import android.view.MenuItem;

final class C0512v implements C0408q {
    public final /* synthetic */ ActionMenuView f3658a;

    C0512v(ActionMenuView actionMenuView) {
        this.f3658a = actionMenuView;
    }

    public final boolean mo529a(C0471p c0471p, MenuItem menuItem) {
        return this.f3658a.f2924l != null && this.f3658a.f2924l.mo882a(menuItem);
    }

    public final void mo524a(C0471p c0471p) {
        if (this.f3658a.f2919g != null) {
            this.f3658a.f2919g.mo524a(c0471p);
        }
    }
}
