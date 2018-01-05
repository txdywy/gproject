package com.google.android.finsky.detailspage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;

final class ez extends fe {
    public final /* synthetic */ StructuredReviewModuleLayout f14559a;

    ez(StructuredReviewModuleLayout structuredReviewModuleLayout) {
        this.f14559a = structuredReviewModuleLayout;
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
        super.mo791a(recyclerView, i, i2);
        int scrolledToItemPosition = this.f14559a.f14064a.getScrolledToItemPosition();
        if (scrolledToItemPosition != this.f14559a.f14071h) {
            StructuredReviewModuleLayout structuredReviewModuleLayout = this.f14559a;
            structuredReviewModuleLayout.f14065b.m7130e(structuredReviewModuleLayout.f14071h).mo1455a(null);
            structuredReviewModuleLayout.f14071h = scrolledToItemPosition;
            structuredReviewModuleLayout.f14067d.setSelectedPage(scrolledToItemPosition);
            if (scrolledToItemPosition >= 0) {
                structuredReviewModuleLayout.f14065b.m7130e(scrolledToItemPosition).mo1458b();
            }
            if (structuredReviewModuleLayout.f14074k != null) {
                structuredReviewModuleLayout.f14074k.mo3087d(scrolledToItemPosition);
            }
            structuredReviewModuleLayout.m13791b(scrolledToItemPosition);
        }
    }
}
