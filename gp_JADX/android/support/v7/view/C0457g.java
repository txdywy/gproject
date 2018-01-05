package android.support.v7.view;

import android.content.Context;
import android.support.v4.p032d.p033a.C0283a;
import android.support.v7.view.menu.aj;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class C0457g extends ActionMode {
    public final Context f2565a;
    public final C0412b f2566b;

    public C0457g(Context context, C0412b c0412b) {
        this.f2565a = context;
        this.f2566b = c0412b;
    }

    public final Object getTag() {
        return this.f2566b.f2420f;
    }

    public final void setTag(Object obj) {
        this.f2566b.f2420f = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f2566b.mo607b(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f2566b.mo603a(charSequence);
    }

    public final void invalidate() {
        this.f2566b.mo609d();
    }

    public final void finish() {
        this.f2566b.mo608c();
    }

    public final Menu getMenu() {
        return aj.m2794a(this.f2565a, (C0283a) this.f2566b.mo605b());
    }

    public final CharSequence getTitle() {
        return this.f2566b.mo610f();
    }

    public final void setTitle(int i) {
        this.f2566b.mo601a(i);
    }

    public final CharSequence getSubtitle() {
        return this.f2566b.mo611g();
    }

    public final void setSubtitle(int i) {
        this.f2566b.mo606b(i);
    }

    public final View getCustomView() {
        return this.f2566b.mo613i();
    }

    public final void setCustomView(View view) {
        this.f2566b.mo602a(view);
    }

    public final MenuInflater getMenuInflater() {
        return this.f2566b.mo600a();
    }

    public final boolean getTitleOptionalHint() {
        return this.f2566b.f2421g;
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f2566b.mo604a(z);
    }

    public final boolean isTitleOptional() {
        return this.f2566b.mo612h();
    }
}
