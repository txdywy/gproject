package com.google.android.finsky.detailspage;

import android.support.v7.widget.LinearLayoutManager;

final class ey extends LinearLayoutManager {
    public final /* synthetic */ StructuredReviewModuleLayout f14558a;

    ey(StructuredReviewModuleLayout structuredReviewModuleLayout, boolean z) {
        this.f14558a = structuredReviewModuleLayout;
        super(0, z);
    }

    public final boolean mo745e() {
        return super.mo745e() && !this.f14558a.f14070g;
    }
}
