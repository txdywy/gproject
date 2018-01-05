package com.google.android.finsky.stream.controllers;

import android.content.res.Resources;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.squareup.leakcanary.C7582R;

final class aj implements C1164b {
    public Resources f21699a = this.f21702d.e.getResources();
    public final int f21700b = this.f21699a.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_content_height);
    public final int f21701c = this.f21699a.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_xpadding);
    public final /* synthetic */ ai f21702d;

    aj(ai aiVar) {
        this.f21702d = aiVar;
    }

    public final float mo1489a(C1158a c1158a) {
        return 0.5625f;
    }

    public final int mo1491a(int i, float f) {
        return ((int) (((float) (i - (this.f21701c * 2))) * f)) + this.f21700b;
    }

    public final float mo1487a() {
        return 1.0f;
    }

    public final float mo1493b() {
        return 2.0f;
    }

    public final float mo1488a(int i) {
        return 1.0f;
    }

    public final int mo1490a(float f, float f2, int i) {
        return (int) ((((float) (i - (this.f21701c * 2))) * f2) + ((float) this.f21700b));
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
