package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.widget.C0380k;
import android.support.v7.p040a.C0403j;
import android.support.v7.p041b.p042a.C0436b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class af {
    public final CompoundButton f3088a;
    public ColorStateList f3089b = null;
    public Mode f3090c = null;
    public boolean f3091d = false;
    public boolean f3092e = false;
    public boolean f3093f;

    af(CompoundButton compoundButton) {
        this.f3088a = compoundButton;
    }

    final void m3171a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3088a.getContext().obtainStyledAttributes(attributeSet, C0403j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0403j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C0403j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.f3088a.setButtonDrawable(C0436b.m2650b(this.f3088a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C0403j.CompoundButton_buttonTint)) {
                C0380k.m2283a(this.f3088a, obtainStyledAttributes.getColorStateList(C0403j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0403j.CompoundButton_buttonTintMode)) {
                C0380k.f2182a.mo483a(this.f3088a, cj.m3399a(obtainStyledAttributes.getInt(C0403j.CompoundButton_buttonTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    final void m3169a(ColorStateList colorStateList) {
        this.f3089b = colorStateList;
        this.f3091d = true;
        m3166b();
    }

    final void m3170a(Mode mode) {
        this.f3090c = mode;
        this.f3092e = true;
        m3166b();
    }

    final void m3168a() {
        if (this.f3093f) {
            this.f3093f = false;
            return;
        }
        this.f3093f = true;
        m3166b();
    }

    private final void m3166b() {
        Drawable a = C0380k.f2182a.mo484a(this.f3088a);
        if (a == null) {
            return;
        }
        if (this.f3091d || this.f3092e) {
            a = C0259a.m1526e(a).mutate();
            if (this.f3091d) {
                C0259a.m1516a(a, this.f3089b);
            }
            if (this.f3092e) {
                C0259a.m1519a(a, this.f3090c);
            }
            if (a.isStateful()) {
                a.setState(this.f3088a.getDrawableState());
            }
            this.f3088a.setButtonDrawable(a);
        }
    }

    final int m3167a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0380k.f2182a.mo484a(this.f3088a);
        if (a != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }
}
