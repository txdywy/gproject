package com.google.android.finsky.layout;

import com.google.android.finsky.stream.base.playcluster.C1158a;

final class C3678h extends C3672e {
    public final /* synthetic */ int f18575a;
    public final /* synthetic */ int f18576b;

    C3678h(int i, int i2) {
        this.f18575a = i;
        this.f18576b = i2;
    }

    public final float mo1489a(C1158a c1158a) {
        int c = c1158a.mo1486c();
        for (int i = 0; i < c; i++) {
            if (c1158a.mo1482b(i) == 1.441f) {
                return 1.441f;
            }
        }
        return 1.0f;
    }

    public final int mo1491a(int i, float f) {
        return ((int) (((float) (i - (this.f18575a * 2))) * f)) + this.f18576b;
    }

    public final int mo1490a(float f, float f2, int i) {
        return (int) ((((float) (i - (this.f18575a * 2))) * f) + ((float) this.f18576b));
    }

    public final int mo1494b(float f, float f2, int i) {
        if (f2 > f) {
            return (int) (((float) (i - (this.f18575a * 2))) * (f2 - f));
        }
        return 0;
    }
}
