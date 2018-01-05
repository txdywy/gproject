package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;

final class ae implements OnClickListener {
    public final /* synthetic */ Document f21690a;
    public final /* synthetic */ FlatCardClusterView f21691b;
    public final /* synthetic */ ad f21692c;

    ae(ad adVar, Document document, FlatCardClusterView flatCardClusterView) {
        this.f21692c = adVar;
        this.f21690a = document;
        this.f21691b = flatCardClusterView;
    }

    public final void onClick(View view) {
        this.f21692c.f.mo3655a(this.f21690a, this.f21691b.getPlayStoreUiElementNode(), this.f21692c.i);
    }
}
