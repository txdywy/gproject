package com.google.android.play.image;

import android.graphics.Bitmap;

final class av implements Runnable {
    public final /* synthetic */ aw f32029a;
    public final /* synthetic */ Bitmap f32030b;

    av(aw awVar, Bitmap bitmap) {
        this.f32029a = awVar;
        this.f32030b = bitmap;
    }

    public final void run() {
        this.f32029a.f32035e.b_(this.f32030b);
    }
}
