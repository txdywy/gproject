package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayHighlightsBannerView extends PlayCardClusterViewV2 {
    public TypedValue f18733a;

    public PlayHighlightsBannerView(Context context) {
        this(context, null);
    }

    public PlayHighlightsBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18733a = new TypedValue();
    }

    public int[] getImageTypePreference() {
        return PlayHighlightsBannerItemView.f18714a;
    }

    protected int getPlayStoreUiElementType() {
        return 428;
    }

    protected void onMeasure(int i, int i2) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        C1552e dj = C1473m.f7980a.dj();
        Resources resources = C1473m.f7980a.f7981b.getResources();
        Resources resources2 = getContext().getResources();
        C1473m.f7980a.av();
        int min = Math.min(C1611k.m9271m(resources2), C1611k.m9270l(resources2));
        if (dj.mo2294a(12631697)) {
            resources2.getValue(C7582R.dimen.highlight_banner_card_width_ratio_v2, this.f18733a, true);
        } else {
            resources2.getValue(C7582R.dimen.highlight_banner_card_width_ratio, this.f18733a, true);
        }
        min = (int) (this.f18733a.getFloat() * ((float) min));
        if (C1473m.f7980a.bT().m11025d()) {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.ia2_stream_highlight_banner_item_card_bottom_margin);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_highlight_banner_item_card_bottom_margin);
        }
        if (C1473m.f7980a.bT().m11025d()) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.ia2_stream_highlight_banner_item_card_top_margin);
        } else {
            dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.highlight_banner_item_card_top_margin);
        }
        dimensionPixelSize += dimensionPixelSize2 + ((min * 9) / 16);
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(dimensionPixelSize, MemoryMappedFileBuffer.DEFAULT_SIZE));
        if (this.c.getClusterContentConfigurator() != null && m13759a(C1473m.f7980a.av().m9275a(getResources()) - resources.getDimensionPixelSize(C7582R.dimen.flat_highlight_banner_item_card_xmargin))) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(dimensionPixelSize, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }
}
