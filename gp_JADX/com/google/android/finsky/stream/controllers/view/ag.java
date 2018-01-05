package com.google.android.finsky.stream.controllers.view;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import com.google.android.play.layout.d;

final class ag extends TranslateAnimation {
    public final /* synthetic */ int f23084a;
    public final /* synthetic */ int f23085b;
    public final /* synthetic */ int f23086c;
    public final /* synthetic */ int[] f23087d;
    public final /* synthetic */ PlayCardRateClusterView f23088e;

    ag(PlayCardRateClusterView playCardRateClusterView, float f, int i, int i2, int i3, int[] iArr) {
        this.f23088e = playCardRateClusterView;
        this.f23084a = i;
        this.f23085b = i2;
        this.f23086c = i3;
        this.f23087d = iArr;
        super(0.0f, 0.0f, f, 0.0f);
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.f23084a) * f);
        for (int i2 = this.f23085b + 1; i2 < this.f23086c; i2++) {
            d a = this.f23088e.m19866a(i2);
            a.offsetLeftAndRight((this.f23087d[i2] - i) - a.getLeft());
        }
    }
}
