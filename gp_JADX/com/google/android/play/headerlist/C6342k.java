package com.google.android.play.headerlist;

import android.view.animation.Animation;
import android.view.animation.Transformation;

abstract class C6342k extends Animation {
    public final float f31897b;
    public final float f31898c;

    protected C6342k(float f, float f2) {
        this.f31897b = f;
        this.f31898c = f2;
    }

    protected abstract void mo5392a(float f);

    protected void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        mo5392a(((this.f31898c - this.f31897b) * f) + this.f31897b);
    }
}
