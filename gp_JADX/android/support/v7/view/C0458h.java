package android.support.v7.view;

import android.content.Context;
import android.support.v4.p032d.p033a.C0283a;
import android.support.v4.p032d.p033a.C0284b;
import android.support.v4.p037h.C0304u;
import android.support.v7.view.menu.aj;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class C0458h implements C0409c {
    public final Callback f2567a;
    public final Context f2568b;
    public final ArrayList f2569c = new ArrayList();
    public final C0304u f2570d = new C0304u();

    public C0458h(Context context, Callback callback) {
        this.f2568b = context;
        this.f2567a = callback;
    }

    public final boolean mo556a(C0412b c0412b, Menu menu) {
        return this.f2567a.onCreateActionMode(m2708b(c0412b), m2704a(menu));
    }

    public final boolean mo558b(C0412b c0412b, Menu menu) {
        return this.f2567a.onPrepareActionMode(m2708b(c0412b), m2704a(menu));
    }

    public final boolean mo557a(C0412b c0412b, MenuItem menuItem) {
        return this.f2567a.onActionItemClicked(m2708b(c0412b), aj.m2795a(this.f2568b, (C0284b) menuItem));
    }

    public final void mo555a(C0412b c0412b) {
        this.f2567a.onDestroyActionMode(m2708b(c0412b));
    }

    private final Menu m2704a(Menu menu) {
        Menu menu2 = (Menu) this.f2570d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        menu2 = aj.m2794a(this.f2568b, (C0283a) menu);
        this.f2570d.put(menu, menu2);
        return menu2;
    }

    public final ActionMode m2708b(C0412b c0412b) {
        int size = this.f2569c.size();
        for (int i = 0; i < size; i++) {
            C0457g c0457g = (C0457g) this.f2569c.get(i);
            if (c0457g != null && c0457g.f2566b == c0412b) {
                return c0457g;
            }
        }
        ActionMode c0457g2 = new C0457g(this.f2568b, c0412b);
        this.f2569c.add(c0457g2);
        return c0457g2;
    }
}
