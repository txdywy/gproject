package android.support.v7.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.v4.p032d.p033a.C0284b;
import android.support.v4.view.C0350g;
import android.support.v4.view.C0362s;
import android.support.v7.view.menu.C0469v;
import android.support.v7.view.menu.C0485t;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

final class C0461k {
    public C0350g f2580A;
    public CharSequence f2581B;
    public CharSequence f2582C;
    public ColorStateList f2583D = null;
    public Mode f2584E = null;
    public final /* synthetic */ C0459i f2585F;
    public Menu f2586a;
    public int f2587b;
    public int f2588c;
    public int f2589d;
    public int f2590e;
    public boolean f2591f;
    public boolean f2592g;
    public boolean f2593h;
    public int f2594i;
    public int f2595j;
    public CharSequence f2596k;
    public CharSequence f2597l;
    public int f2598m;
    public char f2599n;
    public int f2600o;
    public char f2601p;
    public int f2602q;
    public int f2603r;
    public boolean f2604s;
    public boolean f2605t;
    public boolean f2606u;
    public int f2607v;
    public int f2608w;
    public String f2609x;
    public String f2610y;
    public String f2611z;

    public C0461k(C0459i c0459i, Menu menu) {
        this.f2585F = c0459i;
        this.f2586a = menu;
        m2714a();
    }

    public final void m2714a() {
        this.f2587b = 0;
        this.f2588c = 0;
        this.f2589d = 0;
        this.f2590e = 0;
        this.f2591f = true;
        this.f2592g = true;
    }

    static char m2712a(String str) {
        if (str == null) {
            return '\u0000';
        }
        return str.charAt(0);
    }

    final void m2715a(MenuItem menuItem) {
        boolean z = true;
        menuItem.setChecked(this.f2604s).setVisible(this.f2605t).setEnabled(this.f2606u).setCheckable(this.f2603r > 0).setTitleCondensed(this.f2597l).setIcon(this.f2598m);
        if (this.f2607v >= 0) {
            menuItem.setShowAsAction(this.f2607v);
        }
        if (this.f2611z != null) {
            if (this.f2585F.f2575e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            C0459i c0459i = this.f2585F;
            if (c0459i.f2576f == null) {
                c0459i.f2576f = C0459i.m2710a(c0459i.f2575e);
            }
            menuItem.setOnMenuItemClickListener(new C0460j(c0459i.f2576f, this.f2611z));
        }
        if (this.f2603r >= 2) {
            if (menuItem instanceof C0485t) {
                ((C0485t) menuItem).m2914a(true);
            } else if (menuItem instanceof C0469v) {
                C0469v c0469v = (C0469v) menuItem;
                try {
                    if (c0469v.f2674e == null) {
                        c0469v.f2674e = ((C0284b) c0469v.d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    c0469v.f2674e.invoke(c0469v.d, new Object[]{Boolean.valueOf(true)});
                } catch (Throwable e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        if (this.f2609x != null) {
            menuItem.setActionView((View) m2713a(this.f2609x, C0459i.f2571a, this.f2585F.f2573c));
        } else {
            z = false;
        }
        if (this.f2608w > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(this.f2608w);
            }
        }
        if (this.f2580A != null) {
            C0362s.m2053a(menuItem, this.f2580A);
        }
        C0362s.m2059a(menuItem, this.f2581B);
        C0362s.m2061b(menuItem, this.f2582C);
        C0362s.m2060b(menuItem, this.f2599n, this.f2600o);
        C0362s.m2056a(menuItem, this.f2601p, this.f2602q);
        if (this.f2584E != null) {
            C0362s.m2058a(menuItem, this.f2584E);
        }
        if (this.f2583D != null) {
            C0362s.m2057a(menuItem, this.f2583D);
        }
    }

    public final SubMenu m2716b() {
        this.f2593h = true;
        SubMenu addSubMenu = this.f2586a.addSubMenu(this.f2587b, this.f2594i, this.f2595j, this.f2596k);
        m2715a(addSubMenu.getItem());
        return addSubMenu;
    }

    final Object m2713a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor constructor = this.f2585F.f2575e.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Throwable e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
