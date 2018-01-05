package android.support.v7.app;

import android.content.Context;
import android.support.v7.view.C0409c;
import android.support.v7.view.C0412b;
import android.support.v7.view.C0459i;
import android.support.v7.view.menu.C0408q;
import android.support.v7.view.menu.C0471p;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class bw extends C0412b implements C0408q {
    public final Context f2422a;
    public final C0471p f2423b;
    public C0409c f2424c;
    public WeakReference f2425d;
    public final /* synthetic */ bs f2426e;

    public bw(bs bsVar, Context context, C0409c c0409c) {
        this.f2426e = bsVar;
        this.f2422a = context;
        this.f2424c = c0409c;
        C0471p c0471p = new C0471p(context);
        this.f2423b = c0471p;
        this.f2423b.mo680a((C0408q) this);
    }

    public final MenuInflater mo600a() {
        return new C0459i(this.f2422a);
    }

    public final Menu mo605b() {
        return this.f2423b;
    }

    public final void mo608c() {
        if (this.f2426e.f2402l == this) {
            if (bs.m2542a(this.f2426e.f2410t, this.f2426e.f2411u, false)) {
                this.f2424c.mo555a(this);
            } else {
                this.f2426e.f2403m = this;
                this.f2426e.f2404n = this.f2424c;
            }
            this.f2424c = null;
            this.f2426e.m2570f(false);
            ActionBarContextView actionBarContextView = this.f2426e.f2398h;
            if (actionBarContextView.f2876k == null) {
                actionBarContextView.m2941b();
            }
            this.f2426e.f2397g.mo884a().sendAccessibilityEvent(32);
            this.f2426e.f2395e.setHideOnContentScrollEnabled(this.f2426e.f2416z);
            this.f2426e.f2402l = null;
        }
    }

    public final void mo609d() {
        if (this.f2426e.f2402l == this) {
            this.f2423b.m2834d();
            try {
                this.f2424c.mo558b(this, this.f2423b);
            } finally {
                this.f2423b.m2835e();
            }
        }
    }

    public final boolean m2608e() {
        this.f2423b.m2834d();
        try {
            boolean a = this.f2424c.mo556a((C0412b) this, this.f2423b);
            return a;
        } finally {
            this.f2423b.m2835e();
        }
    }

    public final void mo602a(View view) {
        this.f2426e.f2398h.setCustomView(view);
        this.f2425d = new WeakReference(view);
    }

    public final void mo603a(CharSequence charSequence) {
        this.f2426e.f2398h.setSubtitle(charSequence);
    }

    public final void mo607b(CharSequence charSequence) {
        this.f2426e.f2398h.setTitle(charSequence);
    }

    public final void mo601a(int i) {
        mo607b(this.f2426e.f2393c.getResources().getString(i));
    }

    public final void mo606b(int i) {
        mo603a(this.f2426e.f2393c.getResources().getString(i));
    }

    public final CharSequence mo610f() {
        return this.f2426e.f2398h.getTitle();
    }

    public final CharSequence mo611g() {
        return this.f2426e.f2398h.getSubtitle();
    }

    public final void mo604a(boolean z) {
        super.mo604a(z);
        this.f2426e.f2398h.setTitleOptional(z);
    }

    public final boolean mo612h() {
        return this.f2426e.f2398h.f2883r;
    }

    public final View mo613i() {
        return this.f2425d != null ? (View) this.f2425d.get() : null;
    }

    public final boolean mo529a(C0471p c0471p, MenuItem menuItem) {
        if (this.f2424c != null) {
            return this.f2424c.mo557a((C0412b) this, menuItem);
        }
        return false;
    }

    public final void mo524a(C0471p c0471p) {
        if (this.f2424c != null) {
            mo609d();
            this.f2426e.f2398h.mo697a();
        }
    }
}
