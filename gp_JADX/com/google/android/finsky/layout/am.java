package com.google.android.finsky.layout;

import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.squareup.leakcanary.C7582R;

public final class am extends C3672e {
    public final int f18488a;
    public final int f18489b;

    public am(int i, int i2) {
        this.f18488a = i;
        this.f18489b = i2;
    }

    public final float mo1489a(C1158a c1158a) {
        return 1.0f;
    }

    public final int mo1490a(float f, float f2, int i) {
        return (int) ((((float) (i - (this.f18489b * 2))) * f) + ((float) this.f18488a));
    }

    public final int mo1491a(int i, float f) {
        return mo1490a(f, f, i);
    }

    public final float mo1488a(int i) {
        if (i == C7582R.layout.flat_re_engagement_card) {
            return 2.0f;
        }
        return 1.0f;
    }

    public final int mo1495c() {
        return 0;
    }

    public final int mo1494b(float f, float f2, int i) {
        return 0;
    }

    public final boolean mo1497e() {
        return false;
    }
}
