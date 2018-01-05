package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.View;

final class ac {
    public final View f3078a;
    public final ag f3079b;
    public int f3080c = -1;
    public ha f3081d;
    public ha f3082e;
    public ha f3083f;

    ac(View view) {
        this.f3078a = view;
        this.f3079b = ag.m3175a();
    }

    final void m3162a(AttributeSet attributeSet, int i) {
        hc a = hc.m3769a(this.f3078a.getContext(), attributeSet, C0403j.ViewBackgroundHelper, i, 0);
        try {
            if (a.m3782f(C0403j.ViewBackgroundHelper_android_background)) {
                this.f3080c = a.m3783g(C0403j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f3079b.m3186b(this.f3078a.getContext(), this.f3080c);
                if (b != null) {
                    m3157b(b);
                }
            }
            if (a.m3782f(C0403j.ViewBackgroundHelper_backgroundTint)) {
                ai.m1824a(this.f3078a, a.m3780e(C0403j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.m3782f(C0403j.ViewBackgroundHelper_backgroundTintMode)) {
                ai.f1848a.mo416a(this.f3078a, cj.m3399a(a.m3770a(C0403j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            a.f3558b.recycle();
        } catch (Throwable th) {
            a.f3558b.recycle();
        }
    }

    final void m3159a(int i) {
        this.f3080c = i;
        m3157b(this.f3079b != null ? this.f3079b.m3186b(this.f3078a.getContext(), i) : null);
        m3165d();
    }

    final void m3158a() {
        this.f3080c = -1;
        m3157b(null);
        m3165d();
    }

    final void m3160a(ColorStateList colorStateList) {
        if (this.f3082e == null) {
            this.f3082e = new ha();
        }
        this.f3082e.f3552a = colorStateList;
        this.f3082e.f3555d = true;
        m3165d();
    }

    final ColorStateList m3163b() {
        return this.f3082e != null ? this.f3082e.f3552a : null;
    }

    final void m3161a(Mode mode) {
        if (this.f3082e == null) {
            this.f3082e = new ha();
        }
        this.f3082e.f3553b = mode;
        this.f3082e.f3554c = true;
        m3165d();
    }

    final Mode m3164c() {
        return this.f3082e != null ? this.f3082e.f3553b : null;
    }

    final void m3165d() {
        boolean z = false;
        Drawable background = this.f3078a.getBackground();
        if (background != null) {
            int i = VERSION.SDK_INT;
            boolean z2 = i > 21 ? this.f3081d != null : i == 21;
            if (z2) {
                if (this.f3083f == null) {
                    this.f3083f = new ha();
                }
                ha haVar = this.f3083f;
                haVar.m3766a();
                ColorStateList z3 = ai.f1848a.mo427z(this.f3078a);
                if (z3 != null) {
                    haVar.f3555d = true;
                    haVar.f3552a = z3;
                }
                Mode A = ai.f1848a.mo411A(this.f3078a);
                if (A != null) {
                    haVar.f3554c = true;
                    haVar.f3553b = A;
                }
                if (haVar.f3555d || haVar.f3554c) {
                    ag.m3177a(background, haVar, this.f3078a.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            if (this.f3082e != null) {
                ag.m3177a(background, this.f3082e, this.f3078a.getDrawableState());
            } else if (this.f3081d != null) {
                ag.m3177a(background, this.f3081d, this.f3078a.getDrawableState());
            }
        }
    }

    private final void m3157b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3081d == null) {
                this.f3081d = new ha();
            }
            this.f3081d.f3552a = colorStateList;
            this.f3081d.f3555d = true;
        } else {
            this.f3081d = null;
        }
        m3165d();
    }
}
