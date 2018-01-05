package android.support.design.widget.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0124f;
import android.support.design.p018a.C0095a;
import android.support.design.p018a.C0096b;
import android.support.design.p018a.C0097c;
import android.support.design.p018a.C0098d;
import android.support.design.p018a.C0099e;
import android.support.design.p018a.C0103i;
import android.support.design.p018a.C0104j;
import android.support.design.p019b.C0107e;
import android.support.design.p019b.C0109a;
import android.support.design.p019b.C0110b;
import android.support.design.p019b.C0112d;
import android.support.design.p019b.C0115h;
import android.support.design.p019b.C0116i;
import android.support.design.p021c.C0118a;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.aq;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.haha.perflib.HprofParser;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect f982c;
    public final RectF f983d;
    public final RectF f984e;
    public final int[] f985f;

    public FabTransformationBehavior() {
        this.f982c = new Rect();
        this.f983d = new RectF();
        this.f984e = new RectF();
        this.f985f = new int[2];
    }

    protected abstract C0169g mo195a(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f982c = new Rect();
        this.f983d = new RectF();
        this.f984e = new RectF();
        this.f985f = new int[2];
    }

    public final boolean mo92a(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public final void mo118a(aq aqVar) {
        if (aqVar.f801h == 0) {
            aqVar.f801h = 80;
        }
    }

    protected final AnimatorSet mo194b(View view, View view2, boolean z, boolean z2) {
        Animator ofFloat;
        C0103i a;
        C0103i c0103i;
        Animator ofFloat2;
        C0107e c0107e;
        int i;
        C0169g a2 = mo195a(view2.getContext(), z);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            float v = ai.f1848a.mo423v(view2) - ai.f1848a.mo423v(view);
            if (z) {
                if (!z2) {
                    view2.setTranslationZ(-v);
                }
                ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
            } else {
                ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-v});
            }
            a2.f1000a.m214a("elevation").m216a(ofFloat);
            arrayList.add(ofFloat);
        }
        RectF rectF = this.f983d;
        float a3 = m801a(view, view2, a2.f1001b);
        float b = m805b(view, view2, a2.f1001b);
        C0103i a4;
        if (a3 == 0.0f || b == 0.0f) {
            a4 = a2.f1000a.m214a("translationXLinear");
            a = a2.f1000a.m214a("translationYLinear");
            c0103i = a4;
        } else if ((!z || b >= 0.0f) && (z || b <= 0.0f)) {
            a4 = a2.f1000a.m214a("translationXCurveDownwards");
            a = a2.f1000a.m214a("translationYCurveDownwards");
            c0103i = a4;
        } else {
            a4 = a2.f1000a.m214a("translationXCurveUpwards");
            a = a2.f1000a.m214a("translationYCurveUpwards");
            c0103i = a4;
        }
        if (z) {
            if (!z2) {
                view2.setTranslationX(-a3);
                view2.setTranslationY(-b);
            }
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{0.0f});
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f});
            b = -b;
            a3 = m800a(a2, c0103i, -a3);
            b = m800a(a2, a, b);
            Rect rect = this.f982c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f983d;
            rectF2.set(rect);
            RectF rectF3 = this.f984e;
            m804a(view2, rectF3);
            rectF3.offset(a3, b);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{-a3});
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{-b});
        }
        c0103i.m216a(ofFloat2);
        a.m216a(ofFloat);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat);
        float width = rectF.width();
        float height = rectF.height();
        if ((view2 instanceof C0107e) && (view instanceof ImageView)) {
            c0107e = (C0107e) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(HprofParser.ROOT_UNKNOWN);
                    }
                    ofFloat2 = ObjectAnimator.ofInt(drawable, C0099e.f427a, new int[]{0});
                } else {
                    ofFloat2 = ObjectAnimator.ofInt(drawable, C0099e.f427a, new int[]{HprofParser.ROOT_UNKNOWN});
                }
                ofFloat2.addUpdateListener(new C0166d(view2));
                a2.f1000a.m214a("iconFade").m216a(ofFloat2);
                arrayList.add(ofFloat2);
                arrayList2.add(new C0167e(c0107e, drawable));
            }
        }
        if (view2 instanceof C0107e) {
            c0107e = (C0107e) view2;
            C0104j c0104j = a2.f1001b;
            RectF rectF4 = this.f983d;
            RectF rectF5 = this.f984e;
            m804a(view, rectF4);
            m804a(view2, rectF5);
            rectF5.offset(-m801a(view, view2, c0104j), 0.0f);
            float centerX = rectF4.centerX() - rectF5.left;
            c0104j = a2.f1001b;
            rectF4 = this.f983d;
            rectF5 = this.f984e;
            m804a(view, rectF4);
            m804a(view2, rectF5);
            rectF5.offset(0.0f, -m805b(view, view2, c0104j));
            float centerY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).m487a(this.f982c);
            float width2 = ((float) this.f982c.width()) / 2.0f;
            C0103i a5 = a2.f1000a.m214a("expansion");
            if (z) {
                if (!z2) {
                    c0107e.setRevealInfo(new C0116i(centerX, centerY, width2));
                }
                b = z2 ? c0107e.getRevealInfo().f455c : width2;
                float a6 = C0118a.m231a(centerX, centerY, 0.0f, 0.0f);
                float a7 = C0118a.m231a(centerX, centerY, width, 0.0f);
                width = C0118a.m231a(centerX, centerY, width, height);
                height = C0118a.m231a(centerX, centerY, 0.0f, height);
                if (a6 <= a7 || a6 <= width || a6 <= height) {
                    a6 = (a7 <= width || a7 <= height) ? width > height ? width : height : a7;
                }
                Animator a8 = C0109a.m221a(c0107e, centerX, centerY, a6);
                a8.addListener(new C0168f(c0107e));
                m803a(view2, a5.f434a, (int) centerX, (int) centerY, b, arrayList);
                ofFloat2 = a8;
            } else {
                b = c0107e.getRevealInfo().f455c;
                Animator a9 = C0109a.m221a(c0107e, centerX, centerY, width2);
                m803a(view2, a5.f434a, (int) centerX, (int) centerY, b, arrayList);
                long j = a5.f434a;
                long j2 = a5.f435b;
                long a10 = a2.f1000a.m213a();
                i = (int) centerX;
                int i2 = (int) centerY;
                if (VERSION.SDK_INT >= 21 && j + j2 < a10) {
                    ofFloat2 = ViewAnimationUtils.createCircularReveal(view2, i, i2, width2, width2);
                    ofFloat2.setStartDelay(j + j2);
                    ofFloat2.setDuration(a10 - (j + j2));
                    arrayList.add(ofFloat2);
                }
                ofFloat2 = a9;
            }
            a5.m216a(ofFloat2);
            arrayList.add(ofFloat2);
            arrayList2.add(new C0110b(c0107e));
        }
        if (view2 instanceof C0107e) {
            c0107e = (C0107e) view2;
            ColorStateList z3 = ai.f1848a.mo427z(view);
            if (z3 != null) {
                i = z3.getColorForState(view.getDrawableState(), z3.getDefaultColor());
            } else {
                i = 0;
            }
            int i3 = 16777215 & i;
            if (z) {
                if (!z2) {
                    c0107e.setCircularRevealScrimColor(i);
                }
                ofFloat = ObjectAnimator.ofInt(c0107e, C0115h.f452a, new int[]{i3});
            } else {
                ofFloat = ObjectAnimator.ofInt(c0107e, C0115h.f452a, new int[]{i});
            }
            ofFloat.setEvaluator(C0097c.f425a);
            a2.f1000a.m214a("color").m216a(ofFloat);
            arrayList.add(ofFloat);
        }
        if ((view2 instanceof ViewGroup) && !((view2 instanceof C0107e) && C0112d.f448a == 0)) {
            Object a11;
            View findViewById = view2.findViewById(C0124f.mtrl_child_content_container);
            if (findViewById != null) {
                a11 = m802a(findViewById);
            } else if ((view2 instanceof C0172j) || (view2 instanceof C0171i)) {
                a11 = m802a(((ViewGroup) view2).getChildAt(0));
            } else {
                a11 = m802a(view2);
            }
            if (a11 != null) {
                if (z) {
                    if (!z2) {
                        C0098d.f426a.set(a11, Float.valueOf(0.0f));
                    }
                    ofFloat = ObjectAnimator.ofFloat(a11, C0098d.f426a, new float[]{1.0f});
                } else {
                    ofFloat = ObjectAnimator.ofFloat(a11, C0098d.f426a, new float[]{0.0f});
                }
                a2.f1000a.m214a("contentFade").m216a(ofFloat);
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C0096b.m209a(animatorSet, arrayList);
        animatorSet.addListener(new C0165c(z, view2, view));
        int size = arrayList2.size();
        for (i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    private final float m801a(View view, View view2, C0104j c0104j) {
        RectF rectF = this.f983d;
        RectF rectF2 = this.f984e;
        m804a(view, rectF);
        m804a(view2, rectF2);
        float f = 0.0f;
        switch (c0104j.f439a & 7) {
            case 1:
                f = rectF2.centerX() - rectF.centerX();
                break;
            case 3:
                f = rectF2.left - rectF.left;
                break;
            case 5:
                f = rectF2.right - rectF.right;
                break;
        }
        return f + c0104j.f440b;
    }

    private final float m805b(View view, View view2, C0104j c0104j) {
        RectF rectF = this.f983d;
        RectF rectF2 = this.f984e;
        m804a(view, rectF);
        m804a(view2, rectF2);
        float f = 0.0f;
        switch (c0104j.f439a & 112) {
            case 16:
                f = rectF2.centerY() - rectF.centerY();
                break;
            case 48:
                f = rectF2.top - rectF.top;
                break;
            case 80:
                f = rectF2.bottom - rectF.bottom;
                break;
        }
        return f + c0104j.f441c;
    }

    private final void m804a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f985f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private static float m800a(C0169g c0169g, C0103i c0103i, float f) {
        long j = c0103i.f434a;
        long j2 = c0103i.f435b;
        C0103i a = c0169g.f1000a.m214a("expansion");
        return C0095a.m207a(f, c0103i.m215a().getInterpolation(((float) (((a.f435b + a.f434a) + 17) - j)) / ((float) j2)));
    }

    private static ViewGroup m802a(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private static void m803a(View view, long j, int i, int i2, float f, List list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }
}
