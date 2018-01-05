package android.support.p011c.p012a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

final class C0061s extends ConstantState {
    public final ConstantState f152a;

    public C0061s(ConstantState constantState) {
        this.f152a = constantState;
    }

    public final Drawable newDrawable() {
        Drawable c0054l = new C0054l();
        c0054l.e = (VectorDrawable) this.f152a.newDrawable();
        return c0054l;
    }

    public final Drawable newDrawable(Resources resources) {
        Drawable c0054l = new C0054l();
        c0054l.e = (VectorDrawable) this.f152a.newDrawable(resources);
        return c0054l;
    }

    public final Drawable newDrawable(Resources resources, Theme theme) {
        Drawable c0054l = new C0054l();
        c0054l.e = (VectorDrawable) this.f152a.newDrawable(resources, theme);
        return c0054l;
    }

    public final boolean canApplyTheme() {
        return this.f152a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f152a.getChangingConfigurations();
    }
}
