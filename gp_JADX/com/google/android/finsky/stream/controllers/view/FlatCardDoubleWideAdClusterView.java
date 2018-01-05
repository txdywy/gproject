package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;

public class FlatCardDoubleWideAdClusterView extends FlatCardClusterView {
    public FlatCardDoubleWideAdClusterView(Context context) {
        this(context, null);
    }

    public FlatCardDoubleWideAdClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected int getPlayStoreUiElementType() {
        return 467;
    }
}
