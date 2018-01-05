package android.support.v7.view.menu;

import android.support.v7.widget.cs;

final class C0472b extends cs {
    public final /* synthetic */ ActionMenuItemView f2751a;

    public C0472b(ActionMenuItemView actionMenuItemView) {
        this.f2751a = actionMenuItemView;
        super(actionMenuItemView);
    }

    public final al mo688a() {
        if (this.f2751a.f2628g != null) {
            return this.f2751a.f2628g.mo928a();
        }
        return null;
    }

    protected final boolean mo689b() {
        if (this.f2751a.f2626e == null || !this.f2751a.f2626e.mo626a(this.f2751a.f2623b)) {
            return false;
        }
        al a = mo688a();
        if (a == null || !a.mo677d()) {
            return false;
        }
        return true;
    }
}
