package com.google.android.finsky.layout;

import com.google.android.finsky.stream.base.playcluster.C1158a;

final class C3681k extends C3672e {
    public final /* synthetic */ C3676f f18582a;

    C3681k(C3676f c3676f) {
        this.f18582a = c3676f;
    }

    public final float mo1489a(C1158a c1158a) {
        int c = c1158a.mo1486c();
        for (int i = 0; i < c; i++) {
            if (c1158a.mo1482b(i) == 1.0f) {
                return 1.0f;
            }
        }
        return 1.441f;
    }

    public final int mo1491a(int i, float f) {
        return ((int) ((((float) (i - (this.f18582a.f18570b * 2))) * f) / 2.0f)) + (this.f18582a.f18570b * 2);
    }

    public final float mo1487a() {
        return 2.0f;
    }

    public final int mo1490a(float f, float f2, int i) {
        return (int) ((((((float) i) * f2) / 2.0f) - ((float) (this.f18582a.f18570b * 2))) + ((float) (this.f18582a.f18570b * 2)));
    }
}
