package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.caverock.androidsvg.C0722q;

public final class PlayRatingStar extends ImageView {
    public int f16217a;
    public int f16218b;
    public int f16219c;
    public int f16220d;
    public int f16221e;
    public boolean f16222f;
    public boolean f16223g;
    public boolean f16224h;
    public int f16225i;
    public ad f16226j;

    public PlayRatingStar(Context context) {
        this(context, null);
    }

    public PlayRatingStar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int getIndex() {
        return this.f16225i;
    }

    public final void setOnPressStateChangeListener(ad adVar) {
        this.f16226j = adVar;
    }

    public final void setFocused(boolean z) {
        this.f16223g = z;
        m16032a();
    }

    public final void setFilled(boolean z) {
        this.f16222f = z;
        m16032a();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        boolean isPressed = isPressed();
        if (this.f16224h != isPressed) {
            if (this.f16226j != null) {
                this.f16226j.mo3330a(this, isPressed);
            }
            this.f16224h = isPressed;
        }
    }

    final void m16032a() {
        Drawable a;
        Resources resources = getResources();
        if (this.f16222f) {
            a = C0722q.m4781a(resources, this.f16218b, this.f16221e);
        } else {
            a = C0722q.m4781a(resources, this.f16217a, this.f16220d);
        }
        if (this.f16223g) {
            Drawable drawable = resources.getDrawable(this.f16219c);
            setImageDrawable(new LayerDrawable(new Drawable[]{a, drawable}));
            return;
        }
        setImageDrawable(a);
    }
}
