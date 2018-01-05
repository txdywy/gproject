package com.google.android.play.image;

import android.graphics.Bitmap;

final class bc implements Runnable {
    public final /* synthetic */ Bitmap f32045a;
    public final /* synthetic */ boolean f32046b;
    public final /* synthetic */ FifeImageView f32047c;

    bc(FifeImageView fifeImageView, Bitmap bitmap, boolean z) {
        this.f32047c = fifeImageView;
        this.f32045a = bitmap;
        this.f32046b = z;
    }

    public final void run() {
        this.f32047c.m29186c(this.f32045a, this.f32046b);
    }
}
