package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class ap extends C0471p implements SubMenu {
    public C0471p f2740A;
    public C0485t f2741B;

    public ap(Context context, C0471p c0471p, C0485t c0485t) {
        super(context);
        this.f2740A = c0471p;
        this.f2741B = c0485t;
    }

    public final void setQwertyMode(boolean z) {
        this.f2740A.setQwertyMode(z);
    }

    public final boolean mo683b() {
        return this.f2740A.mo683b();
    }

    public final boolean mo685c() {
        return this.f2740A.mo685c();
    }

    public final MenuItem getItem() {
        return this.f2741B;
    }

    public final void mo680a(C0408q c0408q) {
        this.f2740A.mo680a(c0408q);
    }

    public final C0471p mo686k() {
        return this.f2740A.mo686k();
    }

    final boolean mo681a(C0471p c0471p, MenuItem menuItem) {
        return super.mo681a(c0471p, menuItem) || this.f2740A.mo681a(c0471p, menuItem);
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f2741B.setIcon(drawable);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f2741B.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.m2819a(0, null, 0, drawable, null);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        super.m2819a(0, null, i, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m2819a(0, charSequence, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        super.m2819a(i, null, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.m2819a(0, null, 0, null, view);
        return this;
    }

    public final boolean mo682a(C0485t c0485t) {
        return this.f2740A.mo682a(c0485t);
    }

    public final boolean mo684b(C0485t c0485t) {
        return this.f2740A.mo684b(c0485t);
    }

    public final String mo679a() {
        int itemId = this.f2741B != null ? this.f2741B.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo679a() + ":" + itemId;
    }
}
