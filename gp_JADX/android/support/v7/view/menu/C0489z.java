package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class C0489z extends C0467f implements OnMenuItemClickListener {
    public final /* synthetic */ C0469v f2855a;

    C0489z(C0469v c0469v, OnMenuItemClickListener onMenuItemClickListener) {
        this.f2855a = c0469v;
        super(onMenuItemClickListener);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((OnMenuItemClickListener) this.d).onMenuItemClick(this.f2855a.m2747a(menuItem));
    }
}
