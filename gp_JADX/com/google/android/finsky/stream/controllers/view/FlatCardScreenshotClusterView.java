package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;

public class FlatCardScreenshotClusterView extends FlatCardClusterView {
    public FlatCardScreenshotClusterView(Context context) {
        this(context, null);
    }

    public FlatCardScreenshotClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected int getPlayStoreUiElementType() {
        return 466;
    }
}
