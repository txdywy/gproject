package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;

final class gk implements OnClickListener {
    public final /* synthetic */ TextModuleLayout f14631a;

    gk(TextModuleLayout textModuleLayout) {
        this.f14631a = textModuleLayout;
    }

    public final void onClick(View view) {
        TextModuleLayout textModuleLayout = this.f14631a;
        if (textModuleLayout.f14169n) {
            textModuleLayout.f14169n = false;
        } else if (textModuleLayout.f14167l != null) {
            textModuleLayout.f14167l.onClick(view);
        }
    }
}
