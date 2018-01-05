package android.support.v7.view.menu;

import android.support.v4.view.C0350g;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class C0470w extends C0350g {
    public final ActionProvider f2675b;
    public final /* synthetic */ C0469v f2676c;

    public C0470w(C0469v c0469v, ActionProvider actionProvider) {
        this.f2676c = c0469v;
        this.f2675b = actionProvider;
    }

    public final View mo651a() {
        return this.f2675b.onCreateActionView();
    }

    public final boolean mo653d() {
        return this.f2675b.onPerformDefaultAction();
    }

    public final boolean mo654e() {
        return this.f2675b.hasSubMenu();
    }

    public final void mo652a(SubMenu subMenu) {
        this.f2675b.onPrepareSubMenu(this.f2676c.m2748a(subMenu));
    }
}
