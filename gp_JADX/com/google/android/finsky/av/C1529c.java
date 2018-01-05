package com.google.android.finsky.av;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.utils.C4678i;

final class C1529c implements AnimatorUpdateListener {
    public final /* synthetic */ C1530d f8239a;
    public final /* synthetic */ ProgressBar f8240b;
    public final /* synthetic */ CharSequence f8241c;
    public final /* synthetic */ TextView f8242d;
    public final /* synthetic */ CharSequence f8243e;
    public final /* synthetic */ Context f8244f;
    public final /* synthetic */ long f8245g;
    public final /* synthetic */ TextView f8246h;

    C1529c(C1530d c1530d, ProgressBar progressBar, CharSequence charSequence, TextView textView, CharSequence charSequence2, Context context, long j, TextView textView2) {
        this.f8239a = c1530d;
        this.f8240b = progressBar;
        this.f8241c = charSequence;
        this.f8242d = textView;
        this.f8243e = charSequence2;
        this.f8244f = context;
        this.f8245g = j;
        this.f8246h = textView2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f8239a.f8250d) {
            this.f8240b.setProgress(this.f8239a.f8256j - ((int) (((float) (this.f8239a.f8256j - this.f8239a.f8255i)) * floatValue)));
        }
        long a = C4678i.m21812a();
        if (!this.f8239a.f8251e) {
            return;
        }
        if (!this.f8239a.f8262p || floatValue <= 0.0f || a - this.f8239a.f8261o >= 100) {
            this.f8239a.f8262p = true;
            this.f8239a.f8261o = a;
            int i = this.f8239a.f8258l - ((int) (((float) (this.f8239a.f8258l - this.f8239a.f8257k)) * floatValue));
            C1527a.m8950a(this.f8241c, i, this.f8242d);
            this.f8239a.f8252f = i;
            a = this.f8239a.f8260n - ((long) (floatValue * ((float) (this.f8239a.f8260n - this.f8239a.f8259m))));
            this.f8239a.f8253g = a;
            C1527a.m8951a(this.f8243e, this.f8244f, a, this.f8245g, this.f8246h);
        }
    }
}
