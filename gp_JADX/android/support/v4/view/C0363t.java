package android.support.v4.view;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class C0363t implements OnActionExpandListener {
    public final /* synthetic */ C0367x f1927a;

    C0363t(C0367x c0367x) {
        this.f1927a = c0367x;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f1927a.m2084a(menuItem);
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f1927a.m2083a();
    }
}
