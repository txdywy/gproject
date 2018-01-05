package com.google.android.finsky.stream.controllers.view;

import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;

public final class C4503a implements C1164b {
    public final int f23070a;
    public final int f23071b;
    public final float f23072c;

    public C4503a(float f, int i, int i2, float f2, float f3, int i3, int i4) {
        this.f23070a = i;
        this.f23071b = i2;
        float f4 = f / ((float) i3);
        int i5 = (int) f4;
        f4 -= (float) i5;
        if (f4 < f2) {
            this.f23072c = f2;
        } else if (f4 <= f3) {
            this.f23072c = f4;
        } else if ((f / (((float) i5) + f3)) - ((float) i3) > ((float) i4)) {
            this.f23072c = f2;
        } else {
            this.f23072c = f3;
        }
    }

    public C4503a(int i, int i2) {
        this.f23070a = i;
        this.f23071b = i2;
        this.f23072c = 0.0f;
    }

    public final float mo1489a(C1158a c1158a) {
        return c1158a.mo1482b(0);
    }

    public final int mo1491a(int i, float f) {
        return (((int) (((float) (i - (this.f23070a * 2))) * f)) + (this.f23070a * 2)) + this.f23071b;
    }

    public final float mo1487a() {
        return 1.0f;
    }

    public final float mo1493b() {
        return 1.0f;
    }

    public final float mo1488a(int i) {
        return 1.0f;
    }

    public final int mo1490a(float f, float f2, int i) {
        return ((int) (((((float) i) * f2) - ((float) (this.f23070a * 2))) + ((float) (this.f23070a * 2)))) + this.f23071b;
    }

    public final int mo1495c() {
        return 0;
    }

    public final float mo1496d() {
        return this.f23072c;
    }

    public final int mo1492a(int i, int i2) {
        throw new IllegalStateException("Not implemented");
    }

    public final int mo1494b(float f, float f2, int i) {
        return 0;
    }

    public final boolean mo1497e() {
        return true;
    }
}
