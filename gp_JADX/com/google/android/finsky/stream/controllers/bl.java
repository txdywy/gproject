package com.google.android.finsky.stream.controllers;

import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;

final class bl implements C1164b {
    public int f21939a;
    public final /* synthetic */ bj f21940b;

    bl(bj bjVar, int i) {
        this.f21940b = bjVar;
        this.f21939a = i;
    }

    public final float mo1489a(C1158a c1158a) {
        return ((float) this.f21940b.f21930q) / ((float) this.f21940b.f21929p);
    }

    public final int mo1491a(int i, float f) {
        return (this.f21940b.f21930q * i) / this.f21940b.f21929p;
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
        return (int) (((float) i) * f2);
    }

    public final int mo1495c() {
        return 2;
    }

    public final float mo1496d() {
        if (this.f21939a > 1) {
            return this.f21940b.f21932s;
        }
        return 0.0f;
    }

    public final int mo1492a(int i, int i2) {
        if (this.f21939a == 0) {
            return 1;
        }
        if (this.f21939a <= this.f21940b.f21931r) {
            return (i - (this.f21940b.k * 2)) / this.f21939a;
        }
        return (int) (((float) (i - this.f21940b.k)) / (((float) this.f21940b.f21931r) + this.f21940b.f21932s));
    }

    public final int mo1494b(float f, float f2, int i) {
        return 0;
    }

    public final boolean mo1497e() {
        return true;
    }
}
