package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.stream.controllers.view.PlayCardMerchClusterViewV2;

final class bq implements OnClickListener {
    public final /* synthetic */ Document f21949a;
    public final /* synthetic */ PlayCardMerchClusterViewV2 f21950b;
    public final /* synthetic */ bp f21951c;

    bq(bp bpVar, Document document, PlayCardMerchClusterViewV2 playCardMerchClusterViewV2) {
        this.f21951c = bpVar;
        this.f21949a = document;
        this.f21950b = playCardMerchClusterViewV2;
    }

    public final void onClick(View view) {
        this.f21951c.f.mo3655a(this.f21949a, this.f21950b.getPlayStoreUiElementNode(), this.f21951c.i);
    }
}
