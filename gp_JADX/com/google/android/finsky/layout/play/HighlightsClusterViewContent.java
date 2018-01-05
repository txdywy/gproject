package com.google.android.finsky.layout.play;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;
import com.google.android.play.animation.C6242e;
import com.google.android.play.animation.C6243f;
import com.squareup.leakcanary.C7582R;

public class HighlightsClusterViewContent extends PlayClusterViewContentV2 {
    public int aG;

    public HighlightsClusterViewContent(Context context) {
        this(context, null);
    }

    public HighlightsClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aG = Integer.MAX_VALUE;
        if (VERSION.SDK_INT >= 21) {
            Context applicationContext = context.getApplicationContext();
            if (C6242e.f31249b == null) {
                C6242e.f31249b = new C6243f(applicationContext);
                return;
            }
            return;
        }
        aj ajVar = new aj();
    }

    protected int getPreloadRadius() {
        return 2;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getClusterContentConfigurator() != null) {
            int size = MeasureSpec.getSize(i);
            setLeadingGapForSnapping((size - (getClusterContentConfigurator().mo1492a(size, MeasureSpec.getSize(i2)) + (getResources().getDimensionPixelSize(C7582R.dimen.highlight_banner_item_card_xmargin) * 2))) / 2);
        }
    }
}
