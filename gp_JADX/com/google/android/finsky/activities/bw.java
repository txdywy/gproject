package com.google.android.finsky.activities;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.finsky.actionbuttons.ae;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

final class bw implements OnGlobalLayoutListener {
    public final /* synthetic */ PlayActionButtonV2 f6579a;
    public final /* synthetic */ String f6580b;
    public final /* synthetic */ bq f6581c;

    bw(bq bqVar, PlayActionButtonV2 playActionButtonV2, String str) {
        this.f6581c = bqVar;
        this.f6579a = playActionButtonV2;
        this.f6580b = str;
    }

    public final void onGlobalLayout() {
        this.f6579a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f6581c.f6563n = ae.m5901a(this.f6579a, this.f6580b);
        this.f6581c.f6563n.m16052a(new bx(this));
        this.f6581c.m6378a(this.f6579a);
    }
}
