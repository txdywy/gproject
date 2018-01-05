package com.google.android.finsky.dq;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
public final class C2881l extends Visibility {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void captureStartValues(android.transition.TransitionValues r9) {
        /*
        r8 = this;
        super.captureStartValues(r9);
        r1 = r9.view;
        r2 = 0;
        r0 = r1;
    L_0x0007:
        r0 = r0.getParent();
        r3 = r0 instanceof android.support.v7.widget.RecyclerView;
        if (r3 == 0) goto L_0x0044;
    L_0x000f:
        r0 = (android.support.v7.widget.RecyclerView) r0;
        r3 = r0;
    L_0x0012:
        if (r3 == 0) goto L_0x0057;
    L_0x0014:
        r2 = r1.getTop();
        r1 = r1.getBottom();
        r4 = r3.getChildCount();
        r0 = 0;
        r7 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r7;
    L_0x0025:
        if (r2 >= r4) goto L_0x004b;
    L_0x0027:
        r5 = r3.getChildAt(r2);
        r6 = r5.getVisibility();
        if (r6 != 0) goto L_0x0041;
    L_0x0031:
        r6 = r5.getTop();
        r1 = java.lang.Math.min(r1, r6);
        r5 = r5.getBottom();
        r0 = java.lang.Math.max(r0, r5);
    L_0x0041:
        r2 = r2 + 1;
        goto L_0x0025;
    L_0x0044:
        r3 = r0 instanceof android.view.View;
        if (r3 == 0) goto L_0x0058;
    L_0x0048:
        r0 = (android.view.View) r0;
        goto L_0x0007;
    L_0x004b:
        r2 = r9.values;
        r3 = "translate:y";
        r0 = r0 - r1;
        r0 = java.lang.Integer.valueOf(r0);
        r2.put(r3, r0);
    L_0x0057:
        return;
    L_0x0058:
        r3 = r2;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.dq.l.captureStartValues(android.transition.TransitionValues):void");
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || !transitionValues.values.containsKey("translate:y")) {
            return null;
        }
        int intValue = ((Integer) transitionValues.values.get("translate:y")).intValue();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) intValue});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.6f});
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        return new C2875f(animatorSet);
    }
}
