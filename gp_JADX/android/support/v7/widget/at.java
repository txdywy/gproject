package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.bn;
import android.support.v7.p040a.C0394a;
import android.support.v7.p041b.p042a.C0436b;
import android.util.AttributeSet;
import android.widget.RadioButton;

public final class at extends RadioButton implements bn {
    public final af f3126a;
    public final bd f3127b;

    public at(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.radioButtonStyle);
    }

    private at(Context context, AttributeSet attributeSet, int i) {
        super(gz.m3765a(context), attributeSet, i);
        this.f3126a = new af(this);
        this.f3126a.m3171a(attributeSet, i);
        this.f3127b = new bd(this);
        this.f3127b.mo757a(attributeSet, i);
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f3126a != null) {
            this.f3126a.m3168a();
        }
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C0436b.m2650b(getContext(), i));
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f3126a != null ? this.f3126a.m3167a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public final void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f3126a != null) {
            this.f3126a.m3169a(colorStateList);
        }
    }

    public final ColorStateList getSupportButtonTintList() {
        if (this.f3126a != null) {
            return this.f3126a.f3089b;
        }
        return null;
    }

    public final void setSupportButtonTintMode(Mode mode) {
        if (this.f3126a != null) {
            this.f3126a.m3170a(mode);
        }
    }

    public final Mode getSupportButtonTintMode() {
        if (this.f3126a != null) {
            return this.f3126a.f3090c;
        }
        return null;
    }
}
