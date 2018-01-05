package com.google.android.finsky.layout;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.stream.base.playcluster.C1158a;

final class C3677g extends C3672e {
    public final /* synthetic */ int f18571a;
    public final /* synthetic */ int f18572b;
    public final /* synthetic */ int f18573c;
    public final /* synthetic */ C3676f f18574d;

    C3677g(C3676f c3676f, int i, int i2, int i3) {
        this.f18574d = c3676f;
        this.f18571a = i;
        this.f18572b = i2;
        this.f18573c = i3;
    }

    public final float mo1487a() {
        return ((float) this.f18571a) / ((float) (this.f18571a + 1));
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
        int i2 = (((int) (((float) (i - (this.f18574d.f18570b * 2))) * f)) + (this.f18574d.f18570b * 2)) + this.f18572b;
        if (C1473m.f7980a.dj().mo2294a(12609522)) {
            return i2 - this.f18573c;
        }
        return i2;
    }

    public final int mo1490a(float f, float f2, int i) {
        float f3 = ((((float) (i - (this.f18574d.f18570b * 2))) * f) + ((float) this.f18572b)) + ((float) (this.f18574d.f18570b * 2));
        if (C1473m.f7980a.dj().mo2294a(12609522)) {
            f3 -= (float) this.f18573c;
        }
        return (int) f3;
    }

    public final int mo1494b(float f, float f2, int i) {
        if (f2 > f) {
            return (int) (((float) (i - (this.f18574d.f18570b * 2))) * (f2 - f));
        }
        return 0;
    }
}
