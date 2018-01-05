package com.google.android.libraries.bind.card;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.dn;
import android.support.v7.widget.ew;
import android.support.v7.widget.fm;
import android.support.v7.widget.fn;
import android.support.v7.widget.fo;
import android.util.DisplayMetrics;
import android.view.View;

final class C5886c extends dn {
    public boolean f29402n;
    public final /* synthetic */ ew f29403o;
    public final /* synthetic */ int f29404p = -1;
    public final /* synthetic */ int f29405q = 0;
    public final /* synthetic */ float f29406r = 25.0f;
    public final /* synthetic */ boolean f29407s = true;
    public final /* synthetic */ BindRecyclerView f29408t;

    C5886c(BindRecyclerView bindRecyclerView, Context context, ew ewVar) {
        this.f29408t = bindRecyclerView;
        this.f29403o = ewVar;
        super(context);
    }

    public final PointF mo5194a(int i) {
        if (this.f29403o instanceof fn) {
            return ((fn) this.f29403o).mo738c(i);
        }
        if (this.f29403o.m3060p() == 0) {
            return null;
        }
        return new PointF(0.0f, (float) (i < ew.m2979a(this.f29403o.m3051f(0)) ? -1 : 1));
    }

    public final int mo5193a(int i, int i2, int i3, int i4, int i5) {
        if (this.f29404p == 10) {
            return (((i4 - i3) / 2) + i3) - (((i2 - i) / 2) + i);
        }
        return super.mo5193a(i, i2, i3, i4, i5);
    }

    protected final void mo817a(View view, fo foVar, fm fmVar) {
        fm fmVar2 = new fm();
        fmVar2.m3703a(fmVar.f3457a, fmVar.f3458b, fmVar.f3459c, fmVar.f3461e);
        super.mo817a(view, foVar, fmVar2);
        if (fmVar2.f3459c > 0) {
            fmVar2.m3702a(fmVar2.f3458b - this.f29405q);
            if (fmVar2.f3458b != 0 || fmVar2.f3457a != 0 || fmVar2.f3461e != fmVar.f3461e) {
                fmVar.m3703a(fmVar2.f3457a, fmVar2.f3458b, fmVar2.f3459c, fmVar2.f3461e);
            }
        }
    }

    protected final int mo5195c() {
        return -1;
    }

    protected final float mo3051a(DisplayMetrics displayMetrics) {
        return this.f29406r / ((float) displayMetrics.densityDpi);
    }

    protected final void mo815a() {
        if (!this.f29407s) {
            this.f29402n = this.f29408t.aL;
            this.f29408t.setUserInteractionEnabled(false);
        }
        super.mo815a();
    }

    protected final void mo818b() {
        if (!this.f29407s) {
            this.f29408t.setUserInteractionEnabled(this.f29402n);
        }
        super.mo818b();
    }
}
