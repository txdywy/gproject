package com.google.android.finsky.bg;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public final class C1621v {
    public static void m9305a(Context context, TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationX", new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new C1622w(context.getResources().getDimension(C7582R.dimen.shake_animation_delta)));
        ofFloat.start();
    }

    public static void m9306a(View view, C1625z c1625z) {
        new Handler(Looper.myLooper()).postDelayed(new C1623x(view, c1625z), 2500);
    }

    public static Animation m9304a(Context context, long j, AnimationListener animationListener) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C7582R.anim.play_fade_in);
        loadAnimation.setStartOffset(0);
        loadAnimation.setDuration(j);
        if (animationListener != null) {
            loadAnimation.setAnimationListener(animationListener);
        }
        return loadAnimation;
    }

    public static Animation m9307b(Context context, long j, AnimationListener animationListener) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C7582R.anim.fade_out);
        loadAnimation.setStartOffset(0);
        loadAnimation.setDuration(j);
        if (animationListener != null) {
            loadAnimation.setAnimationListener(animationListener);
        }
        return loadAnimation;
    }

    public static Animator m9303a(View view, float f, long j) {
        Animator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{f, 1.0f});
        ofFloat.setStartDelay(0);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofFloat;
    }
}
