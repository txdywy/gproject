package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class C0417i implements C0406f {
    public final Activity f2439a;

    C0417i(Activity activity) {
        this.f2439a = activity;
    }

    public final Drawable mo509a() {
        TypedArray obtainStyledAttributes = mo512b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public final Context mo512b() {
        ActionBar actionBar = this.f2439a.getActionBar();
        if (actionBar != null) {
            return actionBar.getThemedContext();
        }
        return this.f2439a;
    }

    public final boolean mo513c() {
        ActionBar actionBar = this.f2439a.getActionBar();
        return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
    }

    public final void mo511a(Drawable drawable, int i) {
        ActionBar actionBar = this.f2439a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    public final void mo510a(int i) {
        ActionBar actionBar = this.f2439a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }
}
