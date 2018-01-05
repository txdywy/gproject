package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v7.widget.ff;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class bi extends bj {
    public bi(Context context, C3748a c3748a, ff ffVar, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar) {
        super(context, c3748a, ffVar, adVar, c1611k, c1556d, c2495w);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.k -= this.e.getResources().getDimensionPixelSize(C7582R.dimen.jpkr_uniform_banner_inset);
        Context context = this.e;
        float l = ((float) (C1611k.m9270l(context.getResources()) - this.k)) / (((float) mo4148b()) + mo4149c());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7582R.dimen.play_card_default_inset);
        dimensionPixelSize = (int) (((float) (dimensionPixelSize * 2)) + (((l - ((float) (dimensionPixelSize * 2))) * 9.0f) / 16.0f));
        this.f21929p = (int) l;
        this.f21930q = dimensionPixelSize;
    }

    protected final int mo4148b() {
        return this.e.getResources().getInteger(C7582R.integer.jpkr_highlights_banner_per_row);
    }

    protected final float mo4149c() {
        return ((float) this.e.getResources().getInteger(C7582R.integer.jpkr_highlights_banner_peek_percent)) / 100.0f;
    }
}
