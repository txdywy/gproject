package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;
import com.squareup.leakcanary.C7582R;

public class FlatCardLeadingGapClusterViewContent extends PlayClusterViewContentV2 {
    public int aG;

    public FlatCardLeadingGapClusterViewContent(Context context) {
        this(context, null);
    }

    public FlatCardLeadingGapClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.aG = getResources().getInteger(C7582R.integer.flat_leading_gap_cluster_leading_item_gap);
    }

    protected int getLeadingItemGap() {
        return this.aG;
    }

    protected final boolean mo3609h(int i) {
        boolean z;
        int leadingSpacerCount = getLeadingSpacerCount();
        if (i == (this.bd.mo1486c() + leadingSpacerCount) - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z || i <= leadingSpacerCount || i >= getLeadingItemGap() + leadingSpacerCount) {
            return true;
        }
        return false;
    }
}
