package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.widget.Button;

public class NavigationBarButton extends Button
{

    NavigationBarButton(Context p0) {
        Button(p0);
        this.a();
    }

    NavigationBarButton(Context p0, AttributeSet p1) {
        Button(p0, p1);
        this.a();
    }

    private final void a() {
        if (Build$VERSION.SDK_INT >= 17) {
            v2 = this.getCompoundDrawablesRelative();
            v0 = 0;
            while (v0 < v2.length) {
                if (v2[v0] != 0)
                    v2[v0] = com.android.setupwizardlib.view.g.a(v2[v0]);
                v0 = v0 + 1;
            }
            this.setCompoundDrawablesRelativeWithIntrinsicBounds(v2[0], v2[1], v2[2], v2[3]);
        }
    }

    private final void b() {
        v2 = this.getTextColors();
        if (v2 != 0) {
            v3 = new Drawable[6];
            v1 = this.getCompoundDrawables();
            v3[0] = v1[0];
            v3[1] = v1[1];
            v3[2] = v1[2];
            v3[3] = v1[3];
            if (Build$VERSION.SDK_INT >= 17) {
                v1 = this.getCompoundDrawablesRelative();
                v3[4] = v1[0];
                v3[5] = v1[2];
            }
            v1 = 0;
            while (v1 < 6) {
                if (v3[v1] instanceof com.android.setupwizardlib.view.g) {
                    ((com.android.setupwizardlib.view.g)v3[v1]).a = v2;
                    if (((com.android.setupwizardlib.view.g)v3[v1]).a())
                        ((com.android.setupwizardlib.view.g)v3[v1]).invalidateSelf();
                }
                v1 = v1 + 1;
            }
            this.invalidate();
        }
    }

    public void setCompoundDrawables(Drawable p0, Drawable p1, Drawable p2, Drawable p3) {
        if (p0 != 0)
            p0 = com.android.setupwizardlib.view.g.a(p0);
        if (p1 != 0)
            p1 = com.android.setupwizardlib.view.g.a(p1);
        if (p2 != 0)
            p2 = com.android.setupwizardlib.view.g.a(p2);
        if (p3 != 0)
            p3 = com.android.setupwizardlib.view.g.a(p3);
        super.setCompoundDrawables(p0, p1, p2, p3);
        this.b();
    }

    public void setCompoundDrawablesRelative(Drawable p0, Drawable p1, Drawable p2, Drawable p3) {
        if (p0 != 0)
            p0 = com.android.setupwizardlib.view.g.a(p0);
        if (p1 != 0)
            p1 = com.android.setupwizardlib.view.g.a(p1);
        if (p2 != 0)
            p2 = com.android.setupwizardlib.view.g.a(p2);
        if (p3 != 0)
            p3 = com.android.setupwizardlib.view.g.a(p3);
        super.setCompoundDrawablesRelative(p0, p1, p2, p3);
        this.b();
    }

    public void setTextColor(ColorStateList p0) {
        super.setTextColor(p0);
        this.b();
    }

}
