package com.android.ex.photo.views;

public final class com.android.ex.photo.views.d implements Runnable
{

    public final PhotoView a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;

    d(PhotoView p0) {
        this.d = -1;
        this.a = p0;
    }

    public final void a() {
        this.e = 0;
        this.f = 1;
    }

    public final void run() {
        if (this.f != 0)
            return;
        v2 = System.currentTimeMillis();
        if (this.d != -1)
            v0 = (float)(v2 - this.d);
        else
            v0 = 0;
        if (this.d == -1)
            this.d = v2;
        if (v0 >= 1120403456) {
            v0 = this.b;
            v2 = v0;
            v0 = this.c;
        }
        else {
            v3 = this.c / (1120403456 - v0) * 1092616192;
            if (Math.abs(this.b / (1120403456 - v0) * 1092616192) > Math.abs(this.b) || Float.isNaN(this.b / (1120403456 - v0) * 1092616192))
                v0 = this.b;
            else
                v0 = this.b / (1120403456 - v0) * 1092616192;
            if (Math.abs(v3) > Math.abs(this.c)) {
                v2 = v0;
                v0 = this.c;
                this.a.a(v2, v0);
                this.b = this.b - v2;
                this.c = this.c - v0;
                if (this.b == 0 && this.c == 0)
                    this.a();
                if (this.f == 0)
                    this.a.post(this);
                return;
            }
            if (Float.isNaN(v3)) {
                v2 = v0;
                v0 = this.c;
                this.a.a(v2, v0);
                this.b = this.b - v2;
                this.c = this.c - v0;
                if (this.b == 0 && this.c == 0)
                    this.a();
                if (this.f == 0)
                    this.a.post(this);
                return;
            }
            v2 = v0;
            v0 = v3;
        }
        this.a.a(v2, v0);
        this.b = this.b - v2;
        this.c = this.c - v0;
        if (this.b == 0 && this.c == 0)
            this.a();
        if (this.f == 0)
            this.a.post(this);
    }

}
