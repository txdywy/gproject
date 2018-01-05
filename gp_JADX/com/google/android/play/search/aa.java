package com.google.android.play.search;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class aa extends Animation {
    public final /* synthetic */ int f32331a;
    public final /* synthetic */ int f32332b;
    public final /* synthetic */ PlaySearchSuggestionsList f32333c;

    aa(PlaySearchSuggestionsList playSearchSuggestionsList, int i, int i2) {
        this.f32333c = playSearchSuggestionsList;
        this.f32331a = i;
        this.f32332b = i2;
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        this.f32333c.f32320d.getLayoutParams().height = this.f32331a + ((int) (((float) this.f32332b) * f));
        this.f32333c.f32320d.requestLayout();
    }

    public final boolean willChangeBounds() {
        return true;
    }
}
