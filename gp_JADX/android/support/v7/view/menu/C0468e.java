package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p032d.p033a.C0284b;
import android.support.v4.p032d.p033a.C0285c;
import android.support.v4.p037h.C0305a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

class C0468e extends C0467f {
    public final Context f2671a;
    public Map f2672b;
    public Map f2673c;

    C0468e(Context context, Object obj) {
        super(obj);
        this.f2671a = context;
    }

    final MenuItem m2747a(MenuItem menuItem) {
        if (!(menuItem instanceof C0284b)) {
            return menuItem;
        }
        C0284b c0284b = (C0284b) menuItem;
        if (this.f2672b == null) {
            this.f2672b = new C0305a();
        }
        MenuItem menuItem2 = (MenuItem) this.f2672b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = aj.m2795a(this.f2671a, c0284b);
        this.f2672b.put(c0284b, menuItem2);
        return menuItem2;
    }

    final SubMenu m2748a(SubMenu subMenu) {
        if (!(subMenu instanceof C0285c)) {
            return subMenu;
        }
        C0285c c0285c = (C0285c) subMenu;
        if (this.f2673c == null) {
            this.f2673c = new C0305a();
        }
        SubMenu subMenu2 = (SubMenu) this.f2673c.get(c0285c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = new aq(this.f2671a, c0285c);
        this.f2673c.put(c0285c, subMenu2);
        return subMenu2;
    }
}
