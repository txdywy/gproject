package com.google.android.finsky.api;

import com.android.volley.n;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.wireless.android.a.a.a.a.as;
import com.google.wireless.android.a.a.a.a.bo;

public final class com.google.android.finsky.api.a implements com.google.android.play.image.z
{

    public final com.google.android.finsky.d.g a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    a(com.google.android.finsky.d.g p0) {
        this.b = 100;
        this.a = p0;
    }

    private final void b() {
        if (this.c >= this.b || this.f + this.g >= this.b) {
            v0 = new com.google.android.finsky.d.c(554);
            v8 = new com.google.wireless.android.a.a.a.a.as();
            v8.a = this.c;
            v8.b = this.d;
            v8.c = this.e;
            v8.d = this.f;
            v8.e = this.g;
            v8.f = this.h;
            v8.g = this.i;
            v0.a.au = v8;
            this.a.dc().a(v0.a, 0);
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.c = 0;
        }
    }

    public final void a() {
        this.c = this.c + 1;
        this.d = this.d + 1;
        this.b();
    }

    public final void a(com.android.volley.n p0) {
        if (p0 instanceof com.google.android.finsky.api.b) {
            if (((com.google.android.finsky.api.b)p0).a() == 0) {
                this.f = this.f + 1;
                this.h = this.h + (int)((com.google.android.finsky.api.b)p0).b();
            }
            else {
                this.g = this.g + 1;
                this.i = this.i + (int)((com.google.android.finsky.api.b)p0).b();
            }
            this.b();
        }
    }

    public final void a(boolean p0) {
        this.c = this.c + 1;
        if (p0 != 0)
            this.e = this.e + 1;
        this.b();
    }

}
