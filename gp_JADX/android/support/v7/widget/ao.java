package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.ai;
import android.support.v7.p040a.C0403j;
import android.support.v7.p041b.p042a.C0436b;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class ao {
    public final ImageView f3112a;
    public ha f3113b;
    public ha f3114c;
    public ha f3115d;

    public ao(ImageView imageView) {
        this.f3112a = imageView;
    }

    public final void m3195a(AttributeSet attributeSet, int i) {
        hc a = hc.m3769a(this.f3112a.getContext(), attributeSet, C0403j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f3112a.getDrawable();
            if (drawable == null) {
                int g = a.m3783g(C0403j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C0436b.m2650b(this.f3112a.getContext(), g);
                    if (drawable != null) {
                        this.f3112a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                cj.m3401b(drawable);
            }
            if (a.m3782f(C0403j.AppCompatImageView_tint)) {
                ai.f2074a.mo461a(this.f3112a, a.m3780e(C0403j.AppCompatImageView_tint));
            }
            if (a.m3782f(C0403j.AppCompatImageView_tintMode)) {
                ai.f2074a.mo462a(this.f3112a, cj.m3399a(a.m3770a(C0403j.AppCompatImageView_tintMode, -1), null));
            }
            a.f3558b.recycle();
        } catch (Throwable th) {
            a.f3558b.recycle();
        }
    }

    public final void m3192a(int i) {
        if (i != 0) {
            Drawable b = C0436b.m2650b(this.f3112a.getContext(), i);
            if (b != null) {
                cj.m3401b(b);
            }
            this.f3112a.setImageDrawable(b);
        } else {
            this.f3112a.setImageDrawable(null);
        }
        m3199d();
    }

    final boolean m3196a() {
        Drawable background = this.f3112a.getBackground();
        if (VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    final void m3193a(ColorStateList colorStateList) {
        if (this.f3114c == null) {
            this.f3114c = new ha();
        }
        this.f3114c.f3552a = colorStateList;
        this.f3114c.f3555d = true;
        m3199d();
    }

    final ColorStateList m3197b() {
        return this.f3114c != null ? this.f3114c.f3552a : null;
    }

    final void m3194a(Mode mode) {
        if (this.f3114c == null) {
            this.f3114c = new ha();
        }
        this.f3114c.f3553b = mode;
        this.f3114c.f3554c = true;
        m3199d();
    }

    final Mode m3198c() {
        return this.f3114c != null ? this.f3114c.f3553b : null;
    }

    final void m3199d() {
        boolean z = false;
        Drawable drawable = this.f3112a.getDrawable();
        if (drawable != null) {
            cj.m3401b(drawable);
        }
        if (drawable != null) {
            int i = VERSION.SDK_INT;
            boolean z2 = i > 21 ? this.f3113b != null : i == 21;
            if (z2) {
                if (this.f3115d == null) {
                    this.f3115d = new ha();
                }
                ha haVar = this.f3115d;
                haVar.m3766a();
                ColorStateList a = ai.f2074a.mo460a(this.f3112a);
                if (a != null) {
                    haVar.f3555d = true;
                    haVar.f3552a = a;
                }
                Mode b = ai.f2074a.mo463b(this.f3112a);
                if (b != null) {
                    haVar.f3554c = true;
                    haVar.f3553b = b;
                }
                if (haVar.f3555d || haVar.f3554c) {
                    ag.m3177a(drawable, haVar, this.f3112a.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            if (this.f3114c != null) {
                ag.m3177a(drawable, this.f3114c, this.f3112a.getDrawableState());
            } else if (this.f3113b != null) {
                ag.m3177a(drawable, this.f3113b, this.f3112a.getDrawableState());
            }
        }
    }
}
