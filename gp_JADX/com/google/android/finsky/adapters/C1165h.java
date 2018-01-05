package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.squareup.leakcanary.C7582R;

final class C1165h implements C1164b {
    public final int f7196a;
    public final int f7197b;
    public final int f7198c;
    public final int f7199d;
    public final int f7200e;

    public C1165h(Context context) {
        Resources resources = context.getResources();
        this.f7197b = resources.getDimensionPixelSize(C7582R.dimen.large_quicklinks_image_size);
        this.f7198c = resources.getDimensionPixelSize(C7582R.dimen.large_quicklinks_circle_content_min_height);
        this.f7199d = resources.getDimensionPixelSize(C7582R.dimen.quicklinks_image_vmargin);
        this.f7200e = resources.getDimensionPixelSize(C7582R.dimen.quicklinks_banner_vpadding);
        this.f7196a = resources.getDimensionPixelSize(C7582R.dimen.large_quicklinks_banner_item_min_width);
    }

    public final float mo1489a(C1158a c1158a) {
        return 1.0f;
    }

    public final int mo1491a(int i, float f) {
        return ((this.f7197b + this.f7198c) + (this.f7199d * 2)) + this.f7200e;
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
        return (this.f7197b + this.f7198c) + (this.f7199d * 2);
    }

    public final int mo1495c() {
        return 2;
    }

    public final float mo1496d() {
        return 0.25f;
    }

    public final int mo1492a(int i, int i2) {
        return this.f7196a;
    }

    public final int mo1494b(float f, float f2, int i) {
        return 0;
    }

    public final boolean mo1497e() {
        return true;
    }
}
