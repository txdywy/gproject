package com.google.android.finsky.layout;

import com.google.android.finsky.stream.base.playcluster.C1158a;

final class C3683m extends C3672e {
    public final /* synthetic */ int f18585a;
    public final /* synthetic */ int f18586b;

    C3683m(int i, int i2) {
        this.f18585a = i;
        this.f18586b = i2;
    }

    public final float mo1489a(C1158a c1158a) {
        return 1.0f;
    }

    public final int mo1491a(int i, float f) {
        return ((int) (((float) (i - (this.f18585a * 2))) * f)) + this.f18586b;
    }

    public final int mo1490a(float f, float f2, int i) {
        return (int) ((((float) (i - (this.f18585a * 2))) * f) + ((float) this.f18586b));
    }
}
