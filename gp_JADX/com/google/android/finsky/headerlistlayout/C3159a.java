package com.google.android.finsky.headerlistlayout;

import android.view.View;
import android.view.animation.Transformation;
import com.google.android.finsky.frameworkviews.C3149w;

final class C3159a extends C3149w {
    public boolean f16361d;

    C3159a(View view) {
        super(view);
    }

    public final void cancel() {
        super.cancel();
        this.f16361d = true;
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        if (!this.f16361d) {
            super.applyTransformation(f, transformation);
        }
    }
}
