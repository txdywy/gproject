package com.google.android.finsky.bm;

import android.text.TextUtils;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.youtube.player.e;
import com.google.wireless.android.a.a.a.a.at;
import com.google.wireless.android.a.a.a.a.bo;

public final class com.google.android.finsky.bm.d
{

    public com.google.android.finsky.bm.i a;
    public com.google.android.finsky.d.w b;

    d(com.google.android.finsky.bm.i p0, com.google.android.finsky.d.w p1) {
        this.a = p0;
        this.b = p1;
    }

    private final void a(int p0, int p1, int p2, int p3, int p4, long p5, String p7, byte[] p8) {
        v0 = new com.google.android.finsky.d.c(549);
        v1 = new com.google.wireless.android.a.a.a.a.at();
        v1.b = p0;
        v1.a = v1.a | 1;
        if (p1 > 0) {
            v1.c = p1;
            v1.a = v1.a | 2;
        }
        if (p2 > 0) {
            v1.d = p2;
            v1.a = v1.a | 4;
        }
        if (p3 >= 0) {
            v1.a = v1.a | 8;
            v1.e = p3;
        }
        if (p4 >= 0) {
            v1.a = v1.a | 16;
            v1.f = p4;
        }
        if (p5 > 0) {
            v1.a = v1.a | 32;
            v1.g = p5;
        }
        if (!TextUtils.isEmpty(p7)) {
            if (p7 == 0)
                throw new NullPointerException();
            v1.a = v1.a | 64;
            v1.h = p7;
        }
        v0.a.af = v1;
        v0.a(p8);
        this.b.a(v0);
    }

    public final void a(int p0, long p1, String p3, byte[] p4) {
        if (this.a.e == 0 || this.a.f == 0) {
            FinskyLog.d("Cannot determine video length with uninitialized fragment or YouTube player", new Object[0]);
            v4 = -1;
        }
        else
            v4 = this.a.f.d();
        this.a(2, 0, p0, v4, this.a.b(), p1, p3, p4);
    }

    public final void a(long p0, String p2, byte[] p3) {
        this.a(1, 1, 0, -1, this.a.b(), p0, p2, p3);
    }

}
