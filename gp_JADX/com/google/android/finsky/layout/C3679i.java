package com.google.android.finsky.layout;

import com.google.android.finsky.stream.base.playcluster.C1158a;

final class C3679i extends C3672e {
    public final /* synthetic */ int f18577a;
    public final /* synthetic */ int f18578b;

    C3679i(int i, int i2) {
        this.f18577a = i;
        this.f18578b = i2;
    }

    public final int mo1495c() {
        return 3;
    }

    public final float mo1496d() {
        return 0.0f;
    }

    public final float mo1489a(C1158a c1158a) {
        int c = c1158a.mo1486c();
        for (int i = 0; i < c; i++) {
            if (c1158a.mo1482b(i) != 1.441f) {
                return 1.0f;
            }
        }
        return 1.441f;
    }

    public final int mo1491a(int i, float f) {
        if (f == 1.0f) {
            return this.f18577a;
        }
        return this.f18578b;
    }

    public final int mo1490a(float f, float f2, int i) {
        if (f2 == 1.0f) {
            return this.f18577a;
        }
        return this.f18578b;
    }

    public final boolean mo1497e() {
        return false;
    }
}
