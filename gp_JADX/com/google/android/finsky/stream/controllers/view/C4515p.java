package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.v7.widget.dn;
import android.util.DisplayMetrics;
import android.view.View;

final class C4515p extends dn {
    public final /* synthetic */ JpkrHighlightsBannerClusterView f23119n;

    public C4515p(JpkrHighlightsBannerClusterView jpkrHighlightsBannerClusterView, Context context) {
        this.f23119n = jpkrHighlightsBannerClusterView;
        super(context);
    }

    protected final float mo3051a(DisplayMetrics displayMetrics) {
        return this.f23119n.f22939n / ((float) displayMetrics.densityDpi);
    }

    public final int mo4255b(View view, int i) {
        return super.mo4255b(view, -1);
    }
}
