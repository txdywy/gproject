package com.google.android.finsky.bg;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public static class com.google.android.finsky.bg.v
{

    public static Animator a(View p0, float p1, long p2) {
        v1 = new float[2];
        v1[0] = p1;
        v1[1] = 1065353216;
        v0 = ObjectAnimator.ofFloat(p0, "alpha", v1);
        v0.setStartDelay(0);
        v0.setDuration(p2);
        v0.setInterpolator(new AccelerateDecelerateInterpolator());
        return v0;
    }

    public static Animation a(Context p0, long p1, Animation$AnimationListener p3) {
        v0 = AnimationUtils.loadAnimation(p0, 2131034135);
        v0.setStartOffset(0);
        v0.setDuration(p1);
        if (p3 != 0)
            v0.setAnimationListener(p3);
        return v0;
    }

    public static void a(Context p0, TextView p1) {
        v0 = ObjectAnimator.ofFloat(p1, "translationX", new float[2]{0, 1065353216});
        v0.setInterpolator(new com.google.android.finsky.bg.w(p0.getResources().getDimension(2131625396)));
        v0.start();
    }

    public static void a(View p0, com.google.android.finsky.bg.z p1) {
        new Handler(Looper.myLooper()).postDelayed(new com.google.android.finsky.bg.x(p0, p1), 2500);
    }

    public static Animation b(Context p0, long p1, Animation$AnimationListener p3) {
        v0 = AnimationUtils.loadAnimation(p0, 2131034127);
        v0.setStartOffset(0);
        v0.setDuration(p1);
        if (p3 != 0)
            v0.setAnimationListener(p3);
        return v0;
    }

}
