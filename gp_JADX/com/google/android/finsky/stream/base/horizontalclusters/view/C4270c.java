package com.google.android.finsky.stream.base.horizontalclusters.view;

import android.content.res.Resources;
import com.google.android.finsky.bg.C1611k;
import com.squareup.leakcanary.C7582R;

public final class C4270c implements C4269h {
    public Resources f21552a;
    public int f21553b;
    public float f21554c;
    public C1611k f21555d;

    public C4270c(Resources resources, C1611k c1611k, int i, float f) {
        this.f21552a = resources;
        this.f21555d = c1611k;
        this.f21553b = i;
        this.f21554c = f;
    }

    public final int mo4085a(int i) {
        if (this.f21553b == C7582R.layout.flat_card_mini_multi_aspect_ratio_lite || this.f21553b == C7582R.layout.flat_card_mini_multi_aspect_ratio) {
            int e = this.f21555d.m9280e(this.f21552a);
            int dimensionPixelSize = this.f21552a.getDimensionPixelSize(C7582R.dimen.flat_cluster_mixed_content_thumbnail_height) + e;
            e += this.f21552a.getDimensionPixelSize(C7582R.dimen.flat_cluster_mixed_content_thumbnail_height_tall);
            if (this.f21554c == 1.0f) {
                return dimensionPixelSize;
            }
            return e;
        } else if (this.f21553b == C7582R.layout.flat_card_mini_lite || this.f21553b == C7582R.layout.flat_card_mini) {
            return this.f21555d.m9280e(this.f21552a) + ((int) (((float) (i - (this.f21555d.m9279d(this.f21552a) * 2))) * this.f21554c));
        } else {
            throw new IllegalStateException("Card layout not supported");
        }
    }

    public final int mo4084a() {
        throw new IllegalStateException("Not supported with this cluster");
    }
}
