package com.google.android.finsky.frameworkviews;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class C3149w extends Animation {
    public final View f16313a;
    public int f16314b;
    public int f16315c;

    public C3149w(View view) {
        this.f16313a = view;
    }

    public final void m16059a(int i, int i2) {
        this.f16314b = i;
        this.f16315c = i2 - i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f16313a.getLayoutParams().height = this.f16314b + ((int) (((float) this.f16315c) * f));
        this.f16313a.requestLayout();
    }
}
