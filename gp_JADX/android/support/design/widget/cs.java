package android.support.design.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0117b;
import android.support.design.C0125g;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

final class cs {
    public static final int[] f963a = new int[]{16843848};

    static void m775a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void m777a(View view, AttributeSet attributeSet, int i) {
        Context context = view.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f963a, 0, i);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, obtainStyledAttributes.getResourceId(0, 0)));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    static void m776a(View view, float f) {
        int integer = view.getResources().getInteger(C0125g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842766, C0117b.state_collapsible, -C0117b.state_collapsed}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration((long) integer));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration((long) integer));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
