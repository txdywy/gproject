package com.google.android.finsky.headerlistlayout;

import android.view.View;
import android.view.View.OnClickListener;

final class C3165h implements OnClickListener {
    public final /* synthetic */ OnClickListener f16382a;
    public final /* synthetic */ FinskyTabStrip f16383b;

    C3165h(FinskyTabStrip finskyTabStrip, OnClickListener onClickListener) {
        this.f16383b = finskyTabStrip;
        this.f16382a = onClickListener;
    }

    public final void onClick(View view) {
        this.f16383b.f16354h = true;
        this.f16382a.onClick(view);
    }
}
