package com.google.android.finsky.stream.controllers.paddedcollection.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.view.C4298h;
import com.squareup.leakcanary.C7582R;

public class PaddedCollectionRowLayout extends C4298h {
    public C1611k f22729i;

    public PaddedCollectionRowLayout(Context context) {
        this(context, null);
    }

    public PaddedCollectionRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((C1440a) C3947d.m18649a(C1440a.class)).mo1944a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_card_to_card_vpadding);
        setContentHorizontalPadding(this.f22729i.m9278c(resources));
        m19906a(dimensionPixelSize, true);
        m19906a(0, false);
        setBottomPadding(dimensionPixelSize);
        setDividerSize(0);
    }
}
