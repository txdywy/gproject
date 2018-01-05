package com.google.android.finsky.stream.base.view;

import android.view.View;
import android.view.View.OnClickListener;

final /* synthetic */ class C4294b implements OnClickListener {
    public final FlatCardClusterViewHeader f21656a;

    C4294b(FlatCardClusterViewHeader flatCardClusterViewHeader) {
        this.f21656a = flatCardClusterViewHeader;
    }

    public final void onClick(View view) {
        FlatCardClusterViewHeader flatCardClusterViewHeader = this.f21656a;
        if (flatCardClusterViewHeader.f18686l != null) {
            flatCardClusterViewHeader.f18686l.mo3580c(view);
        }
    }
}
