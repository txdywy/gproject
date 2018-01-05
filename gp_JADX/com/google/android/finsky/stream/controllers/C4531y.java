package com.google.android.finsky.stream.controllers;

import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.utils.FinskyLog;

final class C4531y implements C1164b {
    public final /* synthetic */ C4500v f23199a;

    C4531y(C4500v c4500v) {
        this.f23199a = c4500v;
    }

    public final float mo1489a(C1158a c1158a) {
        return c1158a.mo1482b(0);
    }

    public final int mo1491a(int i, float f) {
        return mo1490a(Float.NaN, f, i);
    }

    public final float mo1487a() {
        return 1.0f;
    }

    public final float mo1493b() {
        return 3.0f;
    }

    public final float mo1488a(int i) {
        return 1.0f;
    }

    public final int mo1490a(float f, float f2, int i) {
        if (i <= 0) {
            FinskyLog.m21669e("Bad child width reported [%d]", Integer.valueOf(i));
        }
        return ((int) (((float) (i - (this.f23199a.f22862p * 2))) * f2)) + this.f23199a.f22861o;
    }

    public final int mo1495c() {
        return 0;
    }

    public final float mo1496d() {
        return 0.25f;
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
