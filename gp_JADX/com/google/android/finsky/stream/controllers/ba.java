package com.google.android.finsky.stream.controllers;

import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;

final class ba implements C1164b {
    public int f21900a;
    public final /* synthetic */ ay f21901b;

    ba(ay ayVar, int i) {
        this.f21901b = ayVar;
        this.f21900a = i;
    }

    public final float mo1489a(C1158a c1158a) {
        return c1158a.mo1482b(0);
    }

    public final int mo1491a(int i, float f) {
        return ((int) (((float) i) * f)) + this.f21901b.f21883q;
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
        return ((int) (((float) i) * f2)) + this.f21901b.f21883q;
    }

    public final int mo1495c() {
        return 2;
    }

    public final float mo1496d() {
        if (this.f21900a > this.f21901b.f21882p) {
            return this.f21901b.f21884r;
        }
        return 0.0f;
    }

    public final int mo1492a(int i, int i2) {
        if (this.f21900a == 0) {
            return 1;
        }
        if (this.f21900a <= this.f21901b.f21882p) {
            return (i - (this.f21901b.k * 2)) / this.f21901b.f21882p;
        }
        return (int) (((float) (i - this.f21901b.k)) / (((float) this.f21901b.f21882p) + this.f21901b.f21884r));
    }

    public final int mo1494b(float f, float f2, int i) {
        return 0;
    }

    public final boolean mo1497e() {
        return true;
    }
}
