package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;

public class JpkrFlatDealsAndPromosClusterView extends FlatCardClusterView {
    public JpkrFlatDealsAndPromosClusterView(Context context) {
        super(context);
    }

    public JpkrFlatDealsAndPromosClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected int getPlayStoreUiElementType() {
        return 450;
    }
}
