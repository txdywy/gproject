package com.android.setupwizardlib.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

final class C0623g extends LayerDrawable {
    public ColorStateList f3999a = null;

    public static C0623g m4283a(Drawable drawable) {
        if (drawable instanceof C0623g) {
            return (C0623g) drawable;
        }
        return new C0623g(drawable.mutate());
    }

    private C0623g(Drawable drawable) {
        super(new Drawable[]{drawable});
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || m4284a();
    }

    final boolean m4284a() {
        if (this.f3999a == null) {
            return false;
        }
        setColorFilter(this.f3999a.getColorForState(getState(), 0), Mode.SRC_IN);
        return true;
    }
}
