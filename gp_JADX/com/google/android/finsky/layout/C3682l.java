package com.google.android.finsky.layout;

import com.google.android.finsky.stream.base.playcluster.C1158a;

final class C3682l extends C3672e {
    public final /* synthetic */ int f18583a;
    public final /* synthetic */ C3676f f18584b;

    C3682l(C3676f c3676f, int i) {
        this.f18584b = c3676f;
        this.f18583a = i;
    }

    public final float mo1489a(C1158a c1158a) {
        return 0.5f;
    }

    public final int mo1491a(int i, float f) {
        return (((int) (((float) (i - (this.f18584b.f18570b * 2))) * f)) + (this.f18584b.f18570b * 2)) + this.f18583a;
    }

    public final float mo1487a() {
        return 2.0f;
    }

    public final int mo1490a(float f, float f2, int i) {
        return (int) (((((float) (i - (this.f18584b.f18570b * 2))) * f) + ((float) this.f18583a)) + ((float) (this.f18584b.f18570b * 2)));
    }
}
