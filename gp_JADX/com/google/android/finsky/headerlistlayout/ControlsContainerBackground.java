package com.google.android.finsky.headerlistlayout;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.p039b.C0344b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.play.animation.C6242e;
import com.squareup.leakcanary.C7582R;

public class ControlsContainerBackground extends FrameLayout {
    public static final boolean f16323a = (VERSION.SDK_INT >= 21);
    public C3159a f16324b;
    public View f16325c;
    public int f16326d;
    public int f16327e;
    public boolean f16328f;

    public ControlsContainerBackground(Context context) {
        super(context);
    }

    public ControlsContainerBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ControlsContainerBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ControlsContainerBackground(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @TargetApi(21)
    public final void m16065a(Drawable drawable, int i, boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(C7582R.layout.controls_container_background_drawable_container, this, false);
        addView(inflate);
        LayoutParams layoutParams = (LayoutParams) inflate.getLayoutParams();
        layoutParams.height = this.f16327e;
        inflate.setLayoutParams(layoutParams);
        inflate.setBackgroundDrawable(drawable);
        View view = this.f16325c;
        this.f16325c = inflate;
        if (z && f16323a && view != null) {
            TimeInterpolator a;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int height = ((iArr[1] < 0 ? iArr[1] : 0) + getHeight()) - (this.f16326d / 2);
            int max = Math.max(i, getWidth() - i);
            Animator duration = ViewAnimationUtils.createCircularReveal(inflate, i, this.f16327e - (this.f16326d / 2), 0.0f, (float) Math.sqrt((((double) height) * ((double) height)) + (((double) max) * ((double) max)))).setDuration(400);
            duration.addListener(new C3160b(this, view));
            if (VERSION.SDK_INT >= 21) {
                a = C6242e.m28755a(getContext());
            } else {
                a = new C0344b();
            }
            duration.setInterpolator(a);
            duration.start();
            return;
        }
        removeView(view);
    }
}
