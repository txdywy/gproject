package com.google.android.play.image;

import android.graphics.Bitmap;

final /* synthetic */ class C6380t implements Runnable {
    public final C6378r f32129a;
    public final Bitmap f32130b;

    C6380t(C6378r c6378r, Bitmap bitmap) {
        this.f32129a = c6378r;
        this.f32130b = bitmap;
    }

    public final void run() {
        C6378r c6378r = this.f32129a;
        c6378r.f32124c.a(this.f32130b, c6378r.f32123b);
    }
}
