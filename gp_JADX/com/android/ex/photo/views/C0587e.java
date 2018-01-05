package com.android.ex.photo.views;

public final class C0587e implements Runnable {
    public final PhotoView f3915a;
    public float f3916b;
    public float f3917c;
    public float f3918d;
    public float f3919e;
    public long f3920f = -1;
    public boolean f3921g;
    public boolean f3922h;

    public C0587e(PhotoView photoView) {
        this.f3915a = photoView;
    }

    public final void m4184a() {
        this.f3921g = false;
        this.f3922h = true;
    }

    public final void run() {
        float f = 20000.0f;
        if (!this.f3922h) {
            long currentTimeMillis = System.currentTimeMillis();
            float f2 = this.f3920f != -1 ? ((float) (currentTimeMillis - this.f3920f)) / 1000.0f : 0.0f;
            int a = this.f3915a.m4173a(this.f3916b * f2, this.f3917c * f2);
            this.f3920f = currentTimeMillis;
            float f3 = this.f3918d * f2;
            if (Math.abs(this.f3916b) > Math.abs(f3)) {
                this.f3916b -= f3;
            } else {
                this.f3916b = 0.0f;
            }
            f2 *= this.f3919e;
            if (Math.abs(this.f3917c) > Math.abs(f2)) {
                this.f3917c -= f2;
            } else {
                this.f3917c = 0.0f;
            }
            if ((this.f3916b == 0.0f && this.f3917c == 0.0f) || a == 0) {
                m4184a();
                this.f3915a.m4179c();
            } else if (a == 1) {
                if (this.f3916b > 0.0f) {
                    f2 = 20000.0f;
                } else {
                    f2 = -20000.0f;
                }
                this.f3918d = f2;
                this.f3919e = 0.0f;
                this.f3917c = 0.0f;
            } else if (a == 2) {
                this.f3918d = 0.0f;
                if (this.f3917c <= 0.0f) {
                    f = -20000.0f;
                }
                this.f3919e = f;
                this.f3916b = 0.0f;
            }
            if (!this.f3922h) {
                this.f3915a.post(this);
            }
        }
    }
}
