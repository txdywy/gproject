package android.support.v7.view.menu;

import android.view.MenuItem;

final class C0479k implements Runnable {
    public final /* synthetic */ C0480l f2789a;
    public final /* synthetic */ MenuItem f2790b;
    public final /* synthetic */ C0471p f2791c;
    public final /* synthetic */ C0478j f2792d;

    C0479k(C0478j c0478j, C0480l c0480l, MenuItem menuItem, C0471p c0471p) {
        this.f2792d = c0478j;
        this.f2789a = c0480l;
        this.f2790b = menuItem;
        this.f2791c = c0471p;
    }

    public final void run() {
        if (this.f2789a != null) {
            this.f2792d.f2788a.f2785z = true;
            this.f2789a.f2794b.m2824a(false);
            this.f2792d.f2788a.f2785z = false;
        }
        if (this.f2790b.isEnabled() && this.f2790b.hasSubMenu()) {
            this.f2791c.m2827a(this.f2790b, null, 4);
        }
    }
}
