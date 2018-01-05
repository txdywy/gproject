package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.bn;
import android.support.v7.p040a.C0394a;
import android.support.v7.p041b.p042a.C0436b;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox implements bn {
    public final af f2927a;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        this.f2927a = new af(this);
        this.f2927a.m3171a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f2927a != null) {
            this.f2927a.m3168a();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0436b.m2650b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f2927a != null ? this.f2927a.m3167a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f2927a != null) {
            this.f2927a.m3169a(colorStateList);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f2927a != null) {
            return this.f2927a.f3089b;
        }
        return null;
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f2927a != null) {
            this.f2927a.m3170a(mode);
        }
    }

    public Mode getSupportButtonTintMode() {
        if (this.f2927a != null) {
            return this.f2927a.f3090c;
        }
        return null;
    }
}
