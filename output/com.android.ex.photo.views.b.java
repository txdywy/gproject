package com.android.ex.photo.views;

import android.graphics.Matrix;

public final class com.android.ex.photo.views.b implements Runnable
{

    public final PhotoView a;
    public float b;
    public float c;
    public float d;
    public long e;
    public boolean f;

    b(PhotoView p0) {
        this.a = p0;
    }

    public final void run() {
        if (this.f == 0) {
            if (this.c != this.b) {
                v2 = System.currentTimeMillis();
                if (this.e != -1)
                    v0 = v2 - this.e;
                else
                    v0 = 0;
                v0 = (float)v0 * this.d;
                if (this.c < this.b && (this.c + v0 > this.b || this.c > this.b && this.c + v0 < this.b))
                    v0 = this.b - this.c;
                this.a.H = this.a.H + v0;
                this.a.j.postRotate(v0, (float)(this.a.getWidth() / 2), (float)(this.a.getHeight() / 2));
                this.a.invalidate();
                this.c = v0 + this.c;
                if (this.c == this.b)
                    this.f = 1;
                this.e = v2;
            }
            if (this.f == 0)
                this.a.post(this);
        }
    }

}
