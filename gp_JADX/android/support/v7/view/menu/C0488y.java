package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class C0488y extends C0467f implements OnActionExpandListener {
    public final /* synthetic */ C0469v f2854a;

    C0488y(C0469v c0469v, OnActionExpandListener onActionExpandListener) {
        this.f2854a = c0469v;
        super(onActionExpandListener);
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionExpand(this.f2854a.m2747a(menuItem));
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionCollapse(this.f2854a.m2747a(menuItem));
    }
}
