package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1608h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

@TargetApi(21)
public final class C2877h extends Fade {
    public final int f15368a;
    public final int[] f15369b = new int[2];
    public final Rect f15370c = new Rect();

    public C2877h(int i) {
        this.f15368a = i;
        setDuration(400);
    }

    private final void m15118a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getId() == C7582R.id.controls_container) {
            transitionValues.values.put("pageFade:translationZ", Integer.valueOf(10));
            int id;
            do {
                view = (View) view.getParent();
                if (view != null) {
                    id = view.getId();
                    if (id == C7582R.id.drawer_layout) {
                        return;
                    }
                } else {
                    return;
                }
            } while (id != C7582R.id.content_frame);
            view.getLocationInWindow(this.f15369b);
            transitionValues.values.put("pageFade:topInset", Integer.valueOf(this.f15369b[1]));
        }
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getGlobalVisibleRect(this.f15370c)) {
            super.captureStartValues(transitionValues);
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                m15118a(transitionValues);
            }
        }
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            m15118a(transitionValues);
        }
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        int i = (transitionValues != null && transitionValues.values.containsKey("pageFade:translationZ") && transitionValues.values.containsKey("pageFade:topInset")) ? 1 : 0;
        if (i == 0) {
            return onDisappear;
        }
        viewGroup.getLocationInWindow(this.f15369b);
        if (this.f15369b[1] > 0) {
            onDisappear.addListener(new C2878i(view, transitionValues));
            return onDisappear;
        }
        int width = view.getWidth();
        i = ((Integer) transitionValues.values.get("pageFade:topInset")).intValue() - 1;
        Drawable colorDrawable = new ColorDrawable(C1608h.m9263g(view.getContext(), this.f15368a));
        View c2880k = new C2880k(viewGroup.getContext());
        c2880k.setBackground(colorDrawable);
        c2880k.measure(MeasureSpec.makeMeasureSpec(width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i, MemoryMappedFileBuffer.DEFAULT_SIZE));
        c2880k.layout(0, 0, width, i);
        viewGroup.getOverlay().add(c2880k);
        c2880k.setTranslationZ(20.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c2880k, View.ALPHA, new float[]{1.0f, 0.0f});
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, onDisappear});
        animatorSet.addListener(new C2879j(view, transitionValues, viewGroup, c2880k));
        return animatorSet;
    }
}
