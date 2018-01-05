package com.google.android.finsky.stream.controllers.prereggames.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.view.C4298h;
import com.squareup.leakcanary.C7582R;

public class PreregistrationGameRowLayout extends C4298h {
    public PreregistrationGameRowLayout(Context context) {
        this(context, null);
    }

    public PreregistrationGameRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
        setContentHorizontalPadding(0);
        m19906a(dimensionPixelSize, true);
        m19906a(0, false);
        setBottomPadding(0);
        setDividerSize(resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding));
    }
}
