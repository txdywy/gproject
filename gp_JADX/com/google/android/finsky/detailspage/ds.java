package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;

final class ds implements OnClickListener {
    public final /* synthetic */ ReviewSnippetsModuleLayout f14432a;

    ds(ReviewSnippetsModuleLayout reviewSnippetsModuleLayout) {
        this.f14432a = reviewSnippetsModuleLayout;
    }

    public final void onClick(View view) {
        if (this.f14432a.f14042m != null) {
            this.f14432a.f14042m.onClick(view);
        }
    }
}
