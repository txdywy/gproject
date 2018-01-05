package android.support.v7.view.menu;

import android.support.v4.view.C0351h;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class ab extends C0470w implements VisibilityListener {
    public C0351h f2677d;

    public ab(aa aaVar, ActionProvider actionProvider) {
        super(aaVar, actionProvider);
    }

    public final View mo655a(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    public final boolean mo657b() {
        return this.b.overridesItemVisibility();
    }

    public final boolean mo658c() {
        return this.b.isVisible();
    }

    public final void mo656a(C0351h c0351h) {
        this.f2677d = c0351h;
        this.b.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        if (this.f2677d != null) {
            this.f2677d.mo693a();
        }
    }
}
