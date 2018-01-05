package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.stream.controllers.view.FlatCardMerchClusterView;

final class ac implements OnClickListener {
    public final /* synthetic */ Document f21680a;
    public final /* synthetic */ FlatCardMerchClusterView f21681b;
    public final /* synthetic */ ab f21682c;

    ac(ab abVar, Document document, FlatCardMerchClusterView flatCardMerchClusterView) {
        this.f21682c = abVar;
        this.f21680a = document;
        this.f21681b = flatCardMerchClusterView;
    }

    public final void onClick(View view) {
        this.f21682c.f.mo3655a(this.f21680a, this.f21681b.getPlayStoreUiElementNode(), this.f21682c.i);
    }
}
