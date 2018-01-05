package com.google.android.finsky.billing.redeem.p165a;

import android.graphics.Bitmap;
import android.view.ViewGroup.LayoutParams;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;

final class C2082b implements be {
    public final /* synthetic */ C2081a f10633a;

    C2082b(C2081a c2081a) {
        this.f10633a = c2081a;
    }

    public final void m10912a(FifeImageView fifeImageView) {
    }

    public final void m10913a(FifeImageView fifeImageView, Bitmap bitmap) {
        if (bitmap != null) {
            LayoutParams layoutParams = fifeImageView.getLayoutParams();
            layoutParams.height = (int) (((float) layoutParams.width) / (((float) bitmap.getWidth()) / ((float) bitmap.getHeight())));
            this.f10633a.f10632c.requestLayout();
        }
    }
}
