package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p040a.C0394a;
import android.support.v7.view.C0454d;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.C0485t;
import android.support.v7.view.menu.af;
import android.support.v7.view.menu.ag;
import android.support.v7.view.menu.ap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;

final class hg implements af {
    public C0471p f3563a;
    public C0485t f3564b;
    public final /* synthetic */ Toolbar f3565c;

    hg(Toolbar toolbar) {
        this.f3565c = toolbar;
    }

    public final void mo659a(Context context, C0471p c0471p) {
        if (!(this.f3563a == null || this.f3564b == null)) {
            this.f3563a.mo684b(this.f3564b);
        }
        this.f3563a = c0471p;
    }

    public final void mo668a(boolean z) {
        Object obj = null;
        if (this.f3564b != null) {
            if (this.f3563a != null) {
                int size = this.f3563a.size();
                for (int i = 0; i < size; i++) {
                    if (this.f3563a.getItem(i) == this.f3564b) {
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj == null) {
                mo661c(this.f3564b);
            }
        }
    }

    public final void mo663a(ag agVar) {
    }

    public final boolean mo670a(ap apVar) {
        return false;
    }

    public final void mo665a(C0471p c0471p, boolean z) {
    }

    public final boolean mo669a() {
        return false;
    }

    public final boolean mo660b(C0485t c0485t) {
        Toolbar toolbar = this.f3565c;
        if (toolbar.f3050h == null) {
            toolbar.f3050h = new an(toolbar.getContext(), null, C0394a.toolbarNavigationButtonStyle);
            toolbar.f3050h.setImageDrawable(toolbar.f3048f);
            toolbar.f3050h.setContentDescription(toolbar.f3049g);
            LayoutParams hhVar = new hh();
            hhVar.a = (toolbar.f3056n & 112) | 8388611;
            hhVar.f3566b = 2;
            toolbar.f3050h.setLayoutParams(hhVar);
            toolbar.f3050h.setOnClickListener(new hf(toolbar));
        }
        ViewParent parent = this.f3565c.f3050h.getParent();
        if (parent != this.f3565c) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3565c.f3050h);
            }
            this.f3565c.addView(this.f3565c.f3050h);
        }
        this.f3565c.f3051i = c0485t.getActionView();
        this.f3564b = c0485t;
        parent = this.f3565c.f3051i.getParent();
        if (parent != this.f3565c) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3565c.f3051i);
            }
            LayoutParams hhVar2 = new hh();
            hhVar2.a = (this.f3565c.f3056n & 112) | 8388611;
            hhVar2.f3566b = 2;
            this.f3565c.f3051i.setLayoutParams(hhVar2);
            this.f3565c.addView(this.f3565c.f3051i);
        }
        Toolbar toolbar2 = this.f3565c;
        for (int childCount = toolbar2.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar2.getChildAt(childCount);
            if (!(((hh) childAt.getLayoutParams()).f3566b == 2 || childAt == toolbar2.f3043a)) {
                toolbar2.removeViewAt(childCount);
                toolbar2.f3032E.add(childAt);
            }
        }
        this.f3565c.requestLayout();
        c0485t.m2920d(true);
        if (this.f3565c.f3051i instanceof C0454d) {
            ((C0454d) this.f3565c.f3051i).onActionViewExpanded();
        }
        return true;
    }

    public final boolean mo661c(C0485t c0485t) {
        if (this.f3565c.f3051i instanceof C0454d) {
            ((C0454d) this.f3565c.f3051i).onActionViewCollapsed();
        }
        this.f3565c.removeView(this.f3565c.f3051i);
        this.f3565c.removeView(this.f3565c.f3050h);
        this.f3565c.f3051i = null;
        Toolbar toolbar = this.f3565c;
        for (int size = toolbar.f3032E.size() - 1; size >= 0; size--) {
            toolbar.addView((View) toolbar.f3032E.get(size));
        }
        toolbar.f3032E.clear();
        this.f3564b = null;
        this.f3565c.requestLayout();
        c0485t.m2920d(false);
        return true;
    }
}
