package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.Button;

public class NavigationBarButton extends Button {
    public NavigationBarButton(Context context) {
        super(context);
        m4262a();
    }

    public NavigationBarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4262a();
    }

    private final void m4262a() {
        if (VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            for (int i = 0; i < compoundDrawablesRelative.length; i++) {
                if (compoundDrawablesRelative[i] != null) {
                    compoundDrawablesRelative[i] = C0623g.m4283a(compoundDrawablesRelative[i]);
                }
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = C0623g.m4283a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = C0623g.m4283a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = C0623g.m4283a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = C0623g.m4283a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m4263b();
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = C0623g.m4283a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = C0623g.m4283a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = C0623g.m4283a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = C0623g.m4283a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m4263b();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m4263b();
    }

    private final void m4263b() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            Drawable[] drawableArr = new Drawable[6];
            Drawable[] compoundDrawables = getCompoundDrawables();
            drawableArr[0] = compoundDrawables[0];
            drawableArr[1] = compoundDrawables[1];
            drawableArr[2] = compoundDrawables[2];
            drawableArr[3] = compoundDrawables[3];
            if (VERSION.SDK_INT >= 17) {
                compoundDrawables = getCompoundDrawablesRelative();
                drawableArr[4] = compoundDrawables[0];
                drawableArr[5] = compoundDrawables[2];
            }
            for (int i = 0; i < 6; i++) {
                Drawable drawable = drawableArr[i];
                if (drawable instanceof C0623g) {
                    C0623g c0623g = (C0623g) drawable;
                    c0623g.f3999a = textColors;
                    if (c0623g.m4284a()) {
                        c0623g.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }
}
