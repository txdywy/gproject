package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.app.C0434z;
import android.support.v7.p040a.C0400g;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public final class C0481m implements af, OnItemClickListener {
    public Context f2796a;
    public LayoutInflater f2797b;
    public C0471p f2798c;
    public ExpandedMenuView f2799d;
    public int f2800e;
    public int f2801f;
    public int f2802g;
    public ag f2803h;
    public C0482n f2804i;

    public C0481m(Context context, int i) {
        this(i);
        this.f2796a = context;
        this.f2797b = LayoutInflater.from(this.f2796a);
    }

    private C0481m(int i) {
        this.f2802g = i;
        this.f2801f = 0;
    }

    public final void mo659a(Context context, C0471p c0471p) {
        if (this.f2801f != 0) {
            this.f2796a = new ContextThemeWrapper(context, this.f2801f);
            this.f2797b = LayoutInflater.from(this.f2796a);
        } else if (this.f2796a != null) {
            this.f2796a = context;
            if (this.f2797b == null) {
                this.f2797b = LayoutInflater.from(this.f2796a);
            }
        }
        this.f2798c = c0471p;
        if (this.f2804i != null) {
            this.f2804i.notifyDataSetChanged();
        }
    }

    public final ListAdapter m2900b() {
        if (this.f2804i == null) {
            this.f2804i = new C0482n(this);
        }
        return this.f2804i;
    }

    public final void mo668a(boolean z) {
        if (this.f2804i != null) {
            this.f2804i.notifyDataSetChanged();
        }
    }

    public final void mo663a(ag agVar) {
        this.f2803h = agVar;
    }

    public final boolean mo670a(ap apVar) {
        if (!apVar.hasVisibleItems()) {
            return false;
        }
        C0484s c0484s = new C0484s(apVar);
        C0471p c0471p = c0484s.f2813a;
        C0434z c0434z = new C0434z(c0471p.f2715b);
        c0484s.f2815c = new C0481m(c0434z.f2507a.f2467a, C0400g.abc_list_menu_item_layout);
        c0484s.f2815c.f2803h = c0484s;
        c0484s.f2813a.m2821a(c0484s.f2815c);
        c0434z.f2507a.f2486t = c0484s.f2815c.m2900b();
        c0434z.f2507a.f2487u = c0484s;
        View view = c0471p.f2730q;
        if (view != null) {
            c0434z.f2507a.f2473g = view;
        } else {
            c0434z.f2507a.f2470d = c0471p.f2729p;
            c0434z.m2640a(c0471p.f2728o);
        }
        c0434z.f2507a.f2484r = c0484s;
        c0484s.f2814b = c0434z.m2637a();
        c0484s.f2814b.setOnDismissListener(c0484s);
        LayoutParams attributes = c0484s.f2814b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        c0484s.f2814b.show();
        if (this.f2803h != null) {
            this.f2803h.mo554a(apVar);
        }
        return true;
    }

    public final void mo665a(C0471p c0471p, boolean z) {
        if (this.f2803h != null) {
            this.f2803h.mo553a(c0471p, z);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f2798c.m2827a((C0485t) this.f2804i.getItem(i), (af) this, 0);
    }

    public final boolean mo669a() {
        return false;
    }

    public final boolean mo660b(C0485t c0485t) {
        return false;
    }

    public final boolean mo661c(C0485t c0485t) {
        return false;
    }
}
