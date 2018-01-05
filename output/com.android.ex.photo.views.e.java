package com.android.ex.photo.views;

public final class com.android.ex.photo.views.e implements Runnable
{

    public final PhotoView a;
    public float b;
    public float c;
    public float d;
    public float e;
    public long f;
    public boolean g;
    public boolean h;

    e(PhotoView p0) {
        this.f = -1;
        this.a = p0;
    }

    public final void a() {
        this.g = 0;
        this.h = 1;
    }

    public final void run() {
  0:    v2 = 1184645120;
  9:    if (this.h != 0)
 11:        return;
 12:    v4 = System.currentTimeMillis();
 22:    if (this.f != -1)
 31:        v0 = (float)(v4 - this.f) / 1148846080;
        else
124:        v0 = 0;
 40:    v6 = this.a.a(this.b * v0, this.c * v0);
 44:    this.f = v4;
 61:    if (Math.abs(this.b) > Math.abs(this.d * v0))
 67:        this.b = this.b - this.d * v0;
        else
126:        this.b = 0;
 84:    if (Math.abs(this.c) > Math.abs(v0 * this.e))
 90:        this.c = this.c - v0 * this.e;
        else
129:        this.c = 0;
 96:    if (this.b != 0) goto 104;
102:    if (this.c == 0 || v6 == 0) {
106:        this.a();
111:        this.a.c();
        }
133:    else if (v6 == 1) {
139:        if (this.b > 0)
141:            v0 = 1184645120;
            else
149:            v0 = -962838528;
142:        this.d = v0;
144:        this.e = 0;
146:        this.c = 0;
        }
152:    else if (v6 == 2) {
154:        this.d = 0;
160:        if (this.c <= 0)
167:            v2 = -962838528;
162:        this.e = v2;
164:        this.b = 0;
        }
116:    if (this.h == 0)
120:        this.a.post(this);
    }

}
