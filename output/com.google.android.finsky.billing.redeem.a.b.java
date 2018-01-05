package com.google.android.finsky.billing.redeem.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.google.android.play.image.FifeImageView;

public final class com.google.android.finsky.billing.redeem.a.b implements com.google.android.play.image.be
{

    public final com.google.android.finsky.billing.redeem.a.a a;

    b(com.google.android.finsky.billing.redeem.a.a p0) {
        this.a = p0;
    }

    public final void a(FifeImageView p0) {
    }

    public final void a(FifeImageView p0, Bitmap p1) {
        if (p1 != 0) {
            v0 = p0.getLayoutParams();
            v0.height = (int)((float)v0.width / ((float)p1.getWidth() / (float)p1.getHeight()));
            this.a.c.requestLayout();
        }
    }

}
