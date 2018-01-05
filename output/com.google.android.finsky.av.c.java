package com.google.android.finsky.av;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.utils.i;

public final class com.google.android.finsky.av.c implements ValueAnimator$AnimatorUpdateListener
{

    public final com.google.android.finsky.av.d a;
    public final ProgressBar b;
    public final CharSequence c;
    public final TextView d;
    public final CharSequence e;
    public final Context f;
    public final long g;
    public final TextView h;

    c(com.google.android.finsky.av.d p0, ProgressBar p1, CharSequence p2, TextView p3, CharSequence p4, Context p5, long p6, TextView p8) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
        this.h = p8;
    }

    public final void onAnimationUpdate(ValueAnimator p0) {
        v0 = ((Float)p0.getAnimatedValue()).floatValue();
        if (this.a.d != 0)
            this.b.setProgress(this.a.j - (int)((float)(this.a.j - this.a.i) * v0));
        v2 = com.google.android.finsky.utils.i.a();
        if (this.a.e != 0 && (this.a.p == 0 || v0 <= 0 || v2 - this.a.o >= 100)) {
            this.a.p = 1;
            this.a.o = v2;
            com.google.android.finsky.av.a.a(this.c, this.a.l - (int)((float)(this.a.l - this.a.k) * v0), this.d);
            this.a.f = this.a.l - (int)((float)(this.a.l - this.a.k) * v0);
            this.a.g = this.a.n - (long)(v0 * (float)(this.a.n - this.a.m));
            com.google.android.finsky.av.a.a(this.e, this.f, this.a.n - (long)(v0 * (float)(this.a.n - this.a.m)), this.g, this.h);
        }
    }

}
