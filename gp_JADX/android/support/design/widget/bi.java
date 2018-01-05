package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.p023e.C0122a;
import android.support.v4.p013b.p014a.C0259a;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class bi extends ay {
    public InsetDrawable f868G;

    bi(ct ctVar, bp bpVar) {
        super(ctVar, bpVar);
    }

    final void mo156a(ColorStateList colorStateList, Mode mode, int i, ColorStateList colorStateList2, int i2) {
        Drawable layerDrawable;
        this.k = C0259a.m1526e(m681h());
        C0259a.m1516a(this.k, colorStateList);
        if (mode != null) {
            C0259a.m1519a(this.k, mode);
        }
        if (i2 > 0) {
            this.m = m670b(i2, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{this.m, this.k});
        } else {
            this.m = null;
            layerDrawable = this.k;
        }
        this.l = new RippleDrawable(C0122a.m235a(ColorStateList.valueOf(i), colorStateList2), layerDrawable, null);
        this.n = this.l;
        this.A.mo150a(this.l);
    }

    final void mo155a(int i, ColorStateList colorStateList) {
        if (this.l instanceof RippleDrawable) {
            ((RippleDrawable) this.l).setColor(C0122a.m235a(ColorStateList.valueOf(i), colorStateList));
        } else {
            super.mo155a(i, colorStateList);
        }
    }

    final void mo154a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.z.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(t, m689a(f, f3));
            stateListAnimator.addState(u, m689a(f, f2));
            stateListAnimator.addState(v, m689a(f, f2));
            stateListAnimator.addState(w, m689a(f, f2));
            Animator animatorSet = new AnimatorSet();
            List arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.z, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Z, new float[]{this.z.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(x, animatorSet);
            stateListAnimator.addState(y, m689a(0.0f, 0.0f));
            this.z.setStateListAnimator(stateListAnimator);
        }
        if (this.A.mo151b()) {
            m678e();
        }
    }

    private final Animator m689a(float f, float f2) {
        Animator animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.z, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    public final float mo153a() {
        return this.z.getElevation();
    }

    final void mo161d() {
        m678e();
    }

    final void mo159b(Rect rect) {
        if (this.A.mo151b()) {
            this.f868G = new InsetDrawable(this.l, rect.left, rect.top, rect.right, rect.bottom);
            this.A.mo150a(this.f868G);
            return;
        }
        this.A.mo150a(this.l);
    }

    final void mo158a(int[] iArr) {
        if (VERSION.SDK_INT != 21) {
            return;
        }
        if (this.z.isEnabled()) {
            this.z.setElevation(this.o);
            if (this.z.isPressed()) {
                this.z.setTranslationZ(this.q);
                return;
            } else if (this.z.isFocused() || this.z.isHovered()) {
                this.z.setTranslationZ(this.p);
                return;
            } else {
                this.z.setTranslationZ(0.0f);
                return;
            }
        }
        this.z.setElevation(0.0f);
        this.z.setTranslationZ(0.0f);
    }

    final void mo160c() {
    }

    final boolean mo162f() {
        return false;
    }

    final ak mo163g() {
        return new al();
    }

    final GradientDrawable mo164i() {
        return new bj();
    }

    final void mo157a(Rect rect) {
        if (this.A.mo151b()) {
            float a = this.A.mo148a();
            float a2 = mo153a() + this.q;
            int ceil = (int) Math.ceil((double) bo.m704b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) bo.m703a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
