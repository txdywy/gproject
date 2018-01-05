package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;

public class PlayCardMerchClusterViewContentV2 extends PlayClusterViewContentV2 {
    public PlayCardMerchClusterViewContentV2(Context context) {
        this(context, null);
    }

    public PlayCardMerchClusterViewContentV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected int getLeadingItemGap() {
        return this.bf <= 3 ? 1 : 2;
    }
}
