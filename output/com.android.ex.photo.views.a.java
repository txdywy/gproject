package com.android.ex.photo.views;

import android.graphics.RectF;

public final class com.android.ex.photo.views.a implements Runnable
{

    public final PhotoView a;

    a(PhotoView p0) {
        this.a = p0;
    }

    public final void run() {
        v2 = this.a.b();
        if (v2 > this.a.D) {
            v7 = (float)this.a.getWidth() * 1065353216 / (1065353216 - this.a.D / v2) + this.a.K.right * (1065353216 - 1065353216 / (1065353216 - this.a.D / v2));
            v8 = 1065353216 / (1065353216 - this.a.D / v2) * (float)this.a.getHeight() + (1065353216 - 1065353216 / (1065353216 - this.a.D / v2)) * this.a.K.bottom;
            if (v7 > this.a.K.left * (1065353216 - 1065353216 / (1065353216 - this.a.D / v2)))
                v1 = (v7 + this.a.K.left * (1065353216 - 1065353216 / (1065353216 - this.a.D / v2))) / 1073741824;
            else
                v1 = Math.min(Math.max(v7, (float)(this.a.getWidth() / 2)), this.a.K.left * (1065353216 - 1065353216 / (1065353216 - this.a.D / v2)));
            if (v8 > this.a.K.top * (1065353216 - 1065353216 / (1065353216 - this.a.D / v2)))
                v0 = (v8 + this.a.K.top * (1065353216 - 1065353216 / (1065353216 - this.a.D / v2))) / 1073741824;
            else
                v0 = Math.min(Math.max(v8, (float)(this.a.getHeight() / 2)), this.a.K.top * (1065353216 - 1065353216 / (1065353216 - this.a.D / v2)));
            this.a.B.a(v2, this.a.D, v1, v0);
        }
    }

}
