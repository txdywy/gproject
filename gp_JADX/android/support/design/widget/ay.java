package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.design.C0119c;
import android.support.design.p018a.C0095a;
import android.support.design.p018a.C0096b;
import android.support.design.p018a.C0100f;
import android.support.design.p018a.C0101g;
import android.support.design.p018a.C0102h;
import android.support.design.p023e.C0122a;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.List;

class ay {
    public static final TimeInterpolator f818a = C0095a.f422b;
    public static final int[] f819t = new int[]{16842919, 16842910};
    public static final int[] f820u = new int[]{16843623, 16842908, 16842910};
    public static final int[] f821v = new int[]{16842908, 16842910};
    public static final int[] f822w = new int[]{16843623, 16842910};
    public static final int[] f823x = new int[]{16842910};
    public static final int[] f824y = new int[0];
    public final bp f825A;
    public final Rect f826B = new Rect();
    public final RectF f827C = new RectF();
    public final RectF f828D = new RectF();
    public final Matrix f829E = new Matrix();
    public OnPreDrawListener f830F;
    public int f831b = 0;
    public Animator f832c;
    public C0102h f833d;
    public C0102h f834e;
    public C0102h f835f;
    public C0102h f836g;
    public final bv f837h;
    public bo f838i;
    public float f839j;
    public Drawable f840k;
    public Drawable f841l;
    public ak f842m;
    public Drawable f843n;
    public float f844o;
    public float f845p;
    public float f846q;
    public int f847r;
    public float f848s = 1.0f;
    public final ct f849z;

    ay(ct ctVar, bp bpVar) {
        this.f849z = ctVar;
        this.f825A = bpVar;
        this.f837h = new bv();
        this.f837h.m721a(f819t, m660a(new be(this)));
        this.f837h.m721a(f820u, m660a(new bd(this)));
        this.f837h.m721a(f821v, m660a(new bd(this)));
        this.f837h.m721a(f822w, m660a(new bd(this)));
        this.f837h.m721a(f823x, m660a(new bg(this)));
        this.f837h.m721a(f824y, m660a(new bc(this)));
        this.f839j = this.f849z.getRotation();
    }

    void mo156a(ColorStateList colorStateList, Mode mode, int i, ColorStateList colorStateList2, int i2) {
        Drawable[] drawableArr;
        this.f840k = C0259a.m1526e(m681h());
        C0259a.m1516a(this.f840k, colorStateList);
        if (mode != null) {
            C0259a.m1519a(this.f840k, mode);
        }
        this.f841l = C0259a.m1526e(m681h());
        C0259a.m1516a(this.f841l, C0122a.m235a(ColorStateList.valueOf(i), colorStateList2));
        if (i2 > 0) {
            this.f842m = m670b(i2, colorStateList);
            drawableArr = new Drawable[]{this.f842m, this.f840k, this.f841l};
        } else {
            this.f842m = null;
            drawableArr = new Drawable[]{this.f840k, this.f841l};
        }
        this.f843n = new LayerDrawable(drawableArr);
        this.f838i = new bo(this.f849z.getContext(), this.f843n, this.f825A.mo148a(), this.f844o, this.f844o + this.f846q);
        bo boVar = this.f838i;
        boVar.f886n = false;
        boVar.invalidateSelf();
        this.f825A.mo150a(this.f838i);
    }

    void mo155a(int i, ColorStateList colorStateList) {
        if (this.f841l != null) {
            C0259a.m1516a(this.f841l, C0122a.m235a(ColorStateList.valueOf(i), colorStateList));
        }
    }

    final void m664a(float f) {
        if (this.f844o != f) {
            this.f844o = f;
            mo154a(this.f844o, this.f845p, this.f846q);
        }
    }

    float mo153a() {
        return this.f844o;
    }

    final void m672b(float f) {
        if (this.f845p != f) {
            this.f845p = f;
            mo154a(this.f844o, this.f845p, this.f846q);
        }
    }

    final void m675c(float f) {
        if (this.f846q != f) {
            this.f846q = f;
            mo154a(this.f844o, this.f845p, this.f846q);
        }
    }

    final void m671b() {
        m677d(this.f848s);
    }

    final void m677d(float f) {
        this.f848s = f;
        Matrix matrix = this.f829E;
        m661a(f, matrix);
        this.f849z.setImageMatrix(matrix);
    }

    private final void m661a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f849z.getDrawable();
        if (drawable != null && this.f847r != 0) {
            RectF rectF = this.f827C;
            RectF rectF2 = this.f828D;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            rectF2.set(0.0f, 0.0f, (float) this.f847r, (float) this.f847r);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            matrix.postScale(f, f, ((float) this.f847r) / 2.0f, ((float) this.f847r) / 2.0f);
        }
    }

    void mo154a(float f, float f2, float f3) {
        if (this.f838i != null) {
            this.f838i.m707a(f, this.f846q + f);
            m678e();
        }
    }

    void mo158a(int[] iArr) {
        bx bxVar;
        bv bvVar = this.f837h;
        int size = bvVar.f900a.size();
        for (int i = 0; i < size; i++) {
            bxVar = (bx) bvVar.f900a.get(i);
            if (StateSet.stateSetMatches(bxVar.f905a, iArr)) {
                break;
            }
        }
        bxVar = null;
        if (bxVar != bvVar.f901b) {
            if (!(bvVar.f901b == null || bvVar.f902c == null)) {
                bvVar.f902c.cancel();
                bvVar.f902c = null;
            }
            bvVar.f901b = bxVar;
            if (bxVar != null) {
                bvVar.f902c = bxVar.f906b;
                bvVar.f902c.start();
            }
        }
    }

    void mo160c() {
        bv bvVar = this.f837h;
        if (bvVar.f902c != null) {
            bvVar.f902c.end();
            bvVar.f902c = null;
        }
    }

    final AnimatorSet m663a(C0102h c0102h, float f, float f2, float f3) {
        List arrayList = new ArrayList();
        Animator ofFloat = ObjectAnimator.ofFloat(this.f849z, View.ALPHA, new float[]{f});
        c0102h.m214a("opacity").m216a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.f849z, View.SCALE_X, new float[]{f2});
        c0102h.m214a("scale").m216a(ofFloat);
        arrayList.add(ofFloat);
        ofFloat = ObjectAnimator.ofFloat(this.f849z, View.SCALE_Y, new float[]{f2});
        c0102h.m214a("scale").m216a(ofFloat);
        arrayList.add(ofFloat);
        m661a(f3, this.f829E);
        ofFloat = ObjectAnimator.ofObject(this.f849z, new C0100f(), new C0101g(), new Matrix[]{new Matrix(this.f829E)});
        c0102h.m214a("iconScale").m216a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C0096b.m209a(animatorSet, arrayList);
        return animatorSet;
    }

    void mo161d() {
    }

    final void m678e() {
        Rect rect = this.f826B;
        mo157a(rect);
        mo159b(rect);
        this.f825A.mo149a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void mo157a(Rect rect) {
        this.f838i.getPadding(rect);
    }

    void mo159b(Rect rect) {
    }

    boolean mo162f() {
        return true;
    }

    final ak m670b(int i, ColorStateList colorStateList) {
        Context context = this.f849z.getContext();
        ak g = mo163g();
        int c = C0216d.m1116c(context, C0119c.design_fab_stroke_top_outer_color);
        int c2 = C0216d.m1116c(context, C0119c.design_fab_stroke_top_inner_color);
        int c3 = C0216d.m1116c(context, C0119c.design_fab_stroke_end_inner_color);
        int c4 = C0216d.m1116c(context, C0119c.design_fab_stroke_end_outer_color);
        g.f784e = c;
        g.f785f = c2;
        g.f786g = c3;
        g.f787h = c4;
        float f = (float) i;
        if (g.f783d != f) {
            g.f783d = f;
            g.f780a.setStrokeWidth(f * 1.3333f);
            g.f790k = true;
            g.invalidateSelf();
        }
        g.m638a(colorStateList);
        return g;
    }

    ak mo163g() {
        return new ak();
    }

    final GradientDrawable m681h() {
        GradientDrawable i = mo164i();
        i.setShape(1);
        i.setColor(-1);
        return i;
    }

    GradientDrawable mo164i() {
        return new GradientDrawable();
    }

    private static ValueAnimator m660a(bh bhVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f818a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(bhVar);
        valueAnimator.addUpdateListener(bhVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    final boolean m683j() {
        return ai.f1848a.mo409s(this.f849z) && !this.f849z.isInEditMode();
    }
}
