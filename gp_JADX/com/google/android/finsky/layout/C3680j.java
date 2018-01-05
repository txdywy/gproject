package com.google.android.finsky.layout;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.stream.base.playcluster.C1158a;

final class C3680j extends C3672e {
    public final /* synthetic */ int f18579a;
    public final /* synthetic */ int f18580b;
    public final /* synthetic */ C3676f f18581c;

    C3680j(C3676f c3676f, int i, int i2) {
        this.f18581c = c3676f;
        this.f18579a = i;
        this.f18580b = i2;
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
        int i2 = (((int) (((float) (i - (this.f18581c.f18570b * 2))) * f)) + (this.f18581c.f18570b * 2)) + this.f18579a;
        if (C1473m.f7980a.dj().mo2294a(12609522)) {
            return i2 - this.f18580b;
        }
        return i2;
    }

    public final int mo1490a(float f, float f2, int i) {
        float f3 = ((((float) (i - (this.f18581c.f18570b * 2))) * f) + ((float) this.f18579a)) + ((float) (this.f18581c.f18570b * 2));
        if (C1473m.f7980a.dj().mo2294a(12609522)) {
            f3 -= (float) this.f18580b;
        }
        return (int) f3;
    }

    public final int mo1494b(float f, float f2, int i) {
        if (f2 > f) {
            return (int) (((float) (i - (this.f18581c.f18570b * 2))) * (f2 - f));
        }
        return 0;
    }
}
