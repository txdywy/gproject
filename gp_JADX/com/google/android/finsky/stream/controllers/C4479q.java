package com.google.android.finsky.stream.controllers;

import android.content.res.Resources;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.squareup.leakcanary.C7582R;

final class C4479q implements C1164b {
    public Resources f22769a = this.f22772d.e.getResources();
    public final int f22770b = this.f22769a.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_content_height);
    public final int f22771c = this.f22769a.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_xpadding);
    public final /* synthetic */ C4471p f22772d;

    C4479q(C4471p c4471p) {
        this.f22772d = c4471p;
    }

    public final float mo1489a(C1158a c1158a) {
        return 0.5625f;
    }

    public final int mo1491a(int i, float f) {
        return ((int) (((float) (i - (this.f22771c * 2))) * f)) + this.f22770b;
    }

    public final float mo1487a() {
        return 1.0f;
    }

    public final float mo1493b() {
        if (this.f22772d.f22726t.dj().mo2294a(12634025)) {
            return 2.0f;
        }
        if (this.f22772d.f22726t.dj().mo2294a(12634204)) {
            return 2.5f;
        }
        return 3.0f;
    }

    public final float mo1488a(int i) {
        return 1.0f;
    }

    public final int mo1490a(float f, float f2, int i) {
        return (int) ((((float) (i - (this.f22771c * 2))) * f2) + ((float) this.f22770b));
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
