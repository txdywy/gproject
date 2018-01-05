package com.android.ex.photo.views;

final class C0583a implements Runnable {
    public final /* synthetic */ PhotoView f3892a;

    C0583a(PhotoView photoView) {
        this.f3892a = photoView;
    }

    public final void run() {
        float b = this.f3892a.m4177b();
        if (b > this.f3892a.f3860D) {
            float f = 1.0f / (1.0f - (this.f3892a.f3860D / b));
            float f2 = 1.0f - f;
            float width = (float) (this.f3892a.getWidth() / 2);
            float height = (float) (this.f3892a.getHeight() / 2);
            float f3 = this.f3892a.f3867K.left * f2;
            float f4 = this.f3892a.f3867K.top * f2;
            float width2 = (((float) this.f3892a.getWidth()) * f) + (this.f3892a.f3867K.right * f2);
            float height2 = (f * ((float) this.f3892a.getHeight())) + (f2 * this.f3892a.f3867K.bottom);
            if (width2 > f3) {
                f2 = (width2 + f3) / 2.0f;
            } else {
                f2 = Math.min(Math.max(width2, width), f3);
            }
            if (height2 > f4) {
                f = (height2 + f4) / 2.0f;
            } else {
                f = Math.min(Math.max(height2, height), f4);
            }
            this.f3892a.f3858B.m4182a(b, this.f3892a.f3860D, f2, f);
        }
    }
}
