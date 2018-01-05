package android.support.v4.view;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class C0350g {
    public C0351h f1895a;

    public abstract View mo651a();

    public View mo655a(MenuItem menuItem) {
        return mo651a();
    }

    public boolean mo657b() {
        return false;
    }

    public boolean mo658c() {
        return true;
    }

    public boolean mo653d() {
        return false;
    }

    public boolean mo654e() {
        return false;
    }

    public void mo652a(SubMenu subMenu) {
    }

    public void mo656a(C0351h c0351h) {
        if (this.f1895a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1895a = c0351h;
    }
}
