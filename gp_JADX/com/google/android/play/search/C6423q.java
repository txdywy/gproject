package com.google.android.play.search;

import android.graphics.Bitmap;
import android.widget.ImageView.ScaleType;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;

final class C6423q implements be {
    public final /* synthetic */ FifeImageView f32367a;
    public final /* synthetic */ C6429w f32368b;

    C6423q(FifeImageView fifeImageView, C6429w c6429w) {
        this.f32367a = fifeImageView;
        this.f32368b = c6429w;
    }

    public final void mo5432a(FifeImageView fifeImageView, Bitmap bitmap) {
        this.f32367a.setScaleType(ScaleType.FIT_CENTER);
        this.f32367a.setBackgroundDrawable(this.f32368b.f32384l);
    }

    public final void mo5431a(FifeImageView fifeImageView) {
    }
}
