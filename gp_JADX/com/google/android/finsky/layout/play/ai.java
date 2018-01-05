package com.google.android.finsky.layout.play;

import android.content.res.Resources;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.squareup.leakcanary.C7582R;

public final class ai implements C1164b {
    public final float mo1489a(C1158a c1158a) {
        return 1.0f;
    }

    public final int mo1491a(int i, float f) {
        return 0;
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
        return (i * 9) / 16;
    }

    public final int mo1495c() {
        return 1;
    }

    public final float mo1496d() {
        return 0.0f;
    }

    public final int mo1492a(int i, int i2) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources = C1473m.f7980a.f7981b.getResources();
        if (C1473m.f7980a.bT().m11025d()) {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.ia2_stream_highlight_banner_item_card_top_margin);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.highlight_banner_item_card_top_margin);
        }
        if (C1473m.f7980a.bT().m11025d()) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.ia2_stream_highlight_banner_item_card_bottom_margin);
        } else {
            dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.flat_highlight_banner_item_card_bottom_margin);
        }
        return (((((i2 - dimensionPixelSize) - dimensionPixelSize2) * 16) + 9) - 1) / 9;
    }

    public final int mo1494b(float f, float f2, int i) {
        return 0;
    }

    public final boolean mo1497e() {
        return true;
    }
}
