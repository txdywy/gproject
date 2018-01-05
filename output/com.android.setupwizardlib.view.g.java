package com.android.setupwizardlib.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

public final class com.android.setupwizardlib.view.g extends LayerDrawable
{

    public ColorStateList a;

    g(Drawable p0) {
        v0 = new Drawable[1];
        v0[0] = p0;
        LayerDrawable(v0);
        this.a = 0;
    }

    public static com.android.setupwizardlib.view.g a(Drawable p0) {
        if (p0 instanceof com.android.setupwizardlib.view.g)
            p0 = (com.android.setupwizardlib.view.g)p0;
        else
            p0 = new com.android.setupwizardlib.view.g(p0.mutate());
        return p0;
    }

    final boolean a() {
        v0 = 0;
        if (this.a != 0) {
            this.setColorFilter(this.a.getColorForState(this.getState(), 0), PorterDuff$Mode.SRC_IN);
            v0 = 1;
        }
        return v0;
    }

    public final boolean isStateful() {
        return 1;
    }

    public final boolean setState(int[] p0) {
        if ((super.setState(p0)) || this.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
