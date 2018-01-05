package com.google.android.finsky.stream.controllers;

import android.content.res.Resources;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.squareup.leakcanary.C7582R;

final class C4499u implements C1164b {
    public Resources f22855a = this.f22858d.e.getResources();
    public final int f22856b = this.f22855a.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_content_height);
    public final int f22857c = this.f22855a.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_xpadding);
    public final /* synthetic */ C4493t f22858d;

    C4499u(C4493t c4493t) {
        this.f22858d = c4493t;
    }

    public final float mo1489a(C1158a c1158a) {
        return 0.5f;
    }

    public final int mo1491a(int i, float f) {
        return ((int) (((float) (i - (this.f22857c * 2))) * f)) + this.f22856b;
    }

    public final float mo1487a() {
        return 1.0f;
    }

    public final float mo1493b() {
        if (this.f22858d.f22836t.dj().mo2294a(12631594) && this.f22855a.getBoolean(C7582R.bool.use_1_5x_card_width_for_double_wide_ad_card)) {
            return 1.5f;
        }
        return 2.0f;
    }

    public final float mo1488a(int i) {
        return 1.0f;
    }

    public final int mo1490a(float f, float f2, int i) {
        return (int) ((((float) (i - (this.f22857c * 2))) * f2) + ((float) this.f22856b));
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
