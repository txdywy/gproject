package android.support.p011c.p012a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class C0048e extends ConstantState {
    public final ConstantState f81a;

    public C0048e(ConstantState constantState) {
        this.f81a = constantState;
    }

    public final Drawable newDrawable() {
        Drawable c0045b = new C0045b();
        c0045b.e = this.f81a.newDrawable();
        c0045b.e.setCallback(c0045b.f74d);
        return c0045b;
    }

    public final Drawable newDrawable(Resources resources) {
        Drawable c0045b = new C0045b();
        c0045b.e = this.f81a.newDrawable(resources);
        c0045b.e.setCallback(c0045b.f74d);
        return c0045b;
    }

    public final Drawable newDrawable(Resources resources, Theme theme) {
        Drawable c0045b = new C0045b();
        c0045b.e = this.f81a.newDrawable(resources, theme);
        c0045b.e.setCallback(c0045b.f74d);
        return c0045b;
    }

    public final boolean canApplyTheme() {
        return this.f81a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f81a.getChangingConfigurations();
    }
}
