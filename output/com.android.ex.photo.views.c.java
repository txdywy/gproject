package com.android.ex.photo.views;

public final class com.android.ex.photo.views.c implements Runnable
{

    public final PhotoView a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public long h;
    public boolean i;
    public boolean j;

    c(PhotoView p0) {
        this.a = p0;
    }

    public final void a() {
        this.i = 0;
        this.j = 1;
    }

    public final boolean a(float p0, float p1, float p2, float p3) {
        v2 = 0;
        if (this.i == 0) {
            this.b = p2;
            this.c = p3;
            this.e = p1;
            this.h = System.currentTimeMillis();
            this.f = p0;
            if (this.e > this.f)
                v0 = 1;
            else
                v0 = 0;
            this.d = v0;
            this.g = (this.e - this.f) / 1128792064;
            this.i = 1;
            this.j = 0;
            this.a.post(this);
            v2 = 1;
        }
        return v2;
    }

    public final void run() {
        if (this.j != 0)
            return;
        v0 = (float)(System.currentTimeMillis() - this.h) * this.g + this.f;
        this.a.a(v0, this.b, this.c);
        if (v0 == this.e) {
            this.a.a(this.e, this.b, this.c);
            this.a();
            if (this.j == 0)
                this.a.post(this);
            return;
        }
        if (v0 > this.e)
            v0 = 1;
        else
            v0 = 0;
        if (this.d == v0) {
            this.a.a(this.e, this.b, this.c);
            this.a();
        }
        if (this.j == 0)
            this.a.post(this);
    }

}
