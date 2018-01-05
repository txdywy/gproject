package com.google.android.finsky.recyclerview;

import android.support.v7.widget.fl;
import android.support.v7.widget.fm;
import android.support.v7.widget.fo;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

final class C3986d extends fl {
    public boolean f20078a;
    public final /* synthetic */ int f20079b;
    public final /* synthetic */ C2575b f20080c;

    C3986d(C2575b c2575b, int i) {
        this.f20080c = c2575b;
        this.f20079b = i;
    }

    protected final void mo815a() {
    }

    protected final void mo818b() {
    }

    protected final void mo817a(View view, fo foVar, fm fmVar) {
    }

    protected final void mo816a(int i, int i2, fm fmVar) {
        if (!this.f20078a) {
            this.f20078a = true;
            int i3 = this.f20079b;
            fmVar.f3462f = true;
            fmVar.f3457a = i3;
            i3 = ((int) (275.0d * Math.sqrt(((double) Math.abs(this.f20079b)) / ((double) this.f20080c.getWidth())))) + 125;
            fmVar.f3462f = true;
            fmVar.f3459c = i3;
            Interpolator decelerateInterpolator = new DecelerateInterpolator(2.0f);
            fmVar.f3462f = true;
            fmVar.f3461e = decelerateInterpolator;
        }
    }
}
