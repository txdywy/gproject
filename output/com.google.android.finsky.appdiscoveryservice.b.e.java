package com.google.android.finsky.appdiscoveryservice.b;

import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.wireless.android.a.a.a.a.ax;
import com.google.wireless.android.a.a.a.a.bo;
import com.google.wireless.android.a.a.a.a.cn;

public final class com.google.android.finsky.appdiscoveryservice.b.e
{

    public com.google.android.finsky.d.w a;

    e(com.google.android.finsky.d.w p0) {
        this.a = p0;
    }

    public final void a(int p0, int p1, String p2, int p3, String p4, boolean p5, int p6, boolean p7) {
        v0 = new com.google.wireless.android.a.a.a.a.ax();
        v0.a = v0.a | 1;
        v0.b = p0;
        v0.a = v0.a | 2;
        v0.c = p1;
        if (p2 == 0)
            throw new NullPointerException();
        v0.a = v0.a | 4;
        v0.d = p2;
        v0.a = v0.a | 8;
        v0.e = p3;
        if (p4 == 0)
            throw new NullPointerException();
        v0.a = v0.a | 16;
        v0.f = p4;
        v0.a = v0.a | 32;
        v0.g = p5;
        v0.a = v0.a | 64;
        v0.h = p6;
        v0.a = v0.a | 128;
        v0.i = p7;
        v1 = new com.google.android.finsky.d.c(2300).a;
        v1.ah = v0;
        this.a.a(v1, 0);
    }

    public final void a(String p0, long p1, int p3) {
        this.a.a(new com.google.android.finsky.d.c(2301).a(new com.google.wireless.android.a.a.a.a.cn().a(5).a(p0).a(p1).b(p3)).a, 0);
    }

}
