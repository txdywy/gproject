package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.stream.controllers.view.JpkrFlatRecommendedCategoriesClusterView;

final class bg implements OnClickListener {
    public final /* synthetic */ Document f21922a;
    public final /* synthetic */ JpkrFlatRecommendedCategoriesClusterView f21923b;
    public final /* synthetic */ bf f21924c;

    bg(bf bfVar, Document document, JpkrFlatRecommendedCategoriesClusterView jpkrFlatRecommendedCategoriesClusterView) {
        this.f21924c = bfVar;
        this.f21922a = document;
        this.f21923b = jpkrFlatRecommendedCategoriesClusterView;
    }

    public final void onClick(View view) {
        this.f21924c.f.mo3655a(this.f21922a, this.f21923b.getPlayStoreUiElementNode(), this.f21924c.i);
    }
}
