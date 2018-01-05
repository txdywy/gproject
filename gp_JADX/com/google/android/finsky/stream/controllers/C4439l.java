package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;

final class C4439l implements OnClickListener {
    public final /* synthetic */ Document f22545a;
    public final /* synthetic */ FlatCardClusterView f22546b;
    public final /* synthetic */ C4302k f22547c;

    C4439l(C4302k c4302k, Document document, FlatCardClusterView flatCardClusterView) {
        this.f22547c = c4302k;
        this.f22545a = document;
        this.f22546b = flatCardClusterView;
    }

    public final void onClick(View view) {
        this.f22547c.f.mo3655a(this.f22545a, this.f22546b.getPlayStoreUiElementNode(), this.f22547c.i);
    }
}
