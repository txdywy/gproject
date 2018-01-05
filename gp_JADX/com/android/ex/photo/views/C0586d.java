package com.android.ex.photo.views;

public final class C0586d implements Runnable {
    public final PhotoView f3909a;
    public float f3910b;
    public float f3911c;
    public long f3912d = -1;
    public boolean f3913e;
    public boolean f3914f;

    public C0586d(PhotoView photoView) {
        this.f3909a = photoView;
    }

    public final void m4183a() {
        this.f3913e = false;
        this.f3914f = true;
    }

    public final void run() {
        if (!this.f3914f) {
            float f;
            long currentTimeMillis = System.currentTimeMillis();
            float f2 = this.f3912d != -1 ? (float) (currentTimeMillis - this.f3912d) : 0.0f;
            if (this.f3912d == -1) {
                this.f3912d = currentTimeMillis;
            }
            if (f2 >= 100.0f) {
                f2 = this.f3910b;
            } else {
                f = (this.f3910b / (100.0f - f2)) * 10.0f;
                float f3 = (this.f3911c / (100.0f - f2)) * 10.0f;
                if (Math.abs(f) > Math.abs(this.f3910b) || Float.isNaN(f)) {
                    f2 = this.f3910b;
                } else {
                    f2 = f;
                }
                if (Math.abs(f3) <= Math.abs(this.f3911c) && !Float.isNaN(f3)) {
                    f = f2;
                    f2 = f3;
                    this.f3909a.m4173a(f, f2);
                    this.f3910b -= f;
                    this.f3911c -= f2;
                    if (this.f3910b == 0.0f && this.f3911c == 0.0f) {
                        m4183a();
                    }
                    if (!this.f3914f) {
                        this.f3909a.post(this);
                    }
                }
            }
            f = f2;
            f2 = this.f3911c;
            this.f3909a.m4173a(f, f2);
            this.f3910b -= f;
            this.f3911c -= f2;
            m4183a();
            if (!this.f3914f) {
                this.f3909a.post(this);
            }
        }
    }
}
