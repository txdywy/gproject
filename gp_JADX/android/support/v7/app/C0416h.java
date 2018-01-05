package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class C0416h implements C0406f {
    public final Activity f2437a;
    public C0419k f2438b;

    C0416h(Activity activity) {
        this.f2437a = activity;
    }

    public final Drawable mo509a() {
        return C0418j.m2630a(this.f2437a);
    }

    public final Context mo512b() {
        ActionBar actionBar = this.f2437a.getActionBar();
        if (actionBar != null) {
            return actionBar.getThemedContext();
        }
        return this.f2437a;
    }

    public final boolean mo513c() {
        ActionBar actionBar = this.f2437a.getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    public final void mo511a(Drawable drawable, int i) {
        ActionBar actionBar = this.f2437a.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            this.f2438b = C0418j.m2631a(this.f2437a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }
    }

    public final void mo510a(int i) {
        this.f2438b = C0418j.m2632a(this.f2438b, this.f2437a, i);
    }
}
