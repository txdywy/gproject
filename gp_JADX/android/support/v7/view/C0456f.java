package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.C0408q;
import android.support.v7.view.menu.C0471p;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class C0456f extends C0412b implements C0408q {
    public Context f2559a;
    public ActionBarContextView f2560b;
    public C0409c f2561c;
    public WeakReference f2562d;
    public boolean f2563e;
    public C0471p f2564h;

    public C0456f(Context context, ActionBarContextView actionBarContextView, C0409c c0409c) {
        this.f2559a = context;
        this.f2560b = actionBarContextView;
        this.f2561c = c0409c;
        C0471p c0471p = new C0471p(actionBarContextView.getContext());
        this.f2564h = c0471p;
        this.f2564h.mo680a((C0408q) this);
    }

    public final void mo607b(CharSequence charSequence) {
        this.f2560b.setTitle(charSequence);
    }

    public final void mo603a(CharSequence charSequence) {
        this.f2560b.setSubtitle(charSequence);
    }

    public final void mo601a(int i) {
        mo607b(this.f2559a.getString(i));
    }

    public final void mo606b(int i) {
        mo603a(this.f2559a.getString(i));
    }

    public final void mo604a(boolean z) {
        super.mo604a(z);
        this.f2560b.setTitleOptional(z);
    }

    public final boolean mo612h() {
        return this.f2560b.f2883r;
    }

    public final void mo602a(View view) {
        this.f2560b.setCustomView(view);
        this.f2562d = view != null ? new WeakReference(view) : null;
    }

    public final void mo609d() {
        this.f2561c.mo558b(this, this.f2564h);
    }

    public final void mo608c() {
        if (!this.f2563e) {
            this.f2563e = true;
            this.f2560b.sendAccessibilityEvent(32);
            this.f2561c.mo555a(this);
        }
    }

    public final Menu mo605b() {
        return this.f2564h;
    }

    public final CharSequence mo610f() {
        return this.f2560b.getTitle();
    }

    public final CharSequence mo611g() {
        return this.f2560b.getSubtitle();
    }

    public final View mo613i() {
        return this.f2562d != null ? (View) this.f2562d.get() : null;
    }

    public final MenuInflater mo600a() {
        return new C0459i(this.f2560b.getContext());
    }

    public final boolean mo529a(C0471p c0471p, MenuItem menuItem) {
        return this.f2561c.mo557a((C0412b) this, menuItem);
    }

    public final void mo524a(C0471p c0471p) {
        mo609d();
        this.f2560b.mo697a();
    }
}
