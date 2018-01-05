package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.stream.controllers.view.FlatCardCreatorAvatarClusterView;

final class bo implements OnClickListener {
    public final /* synthetic */ FlatCardCreatorAvatarClusterView f14312a;
    public final /* synthetic */ bn f14313b;

    bo(bn bnVar, FlatCardCreatorAvatarClusterView flatCardCreatorAvatarClusterView) {
        this.f14313b = bnVar;
        this.f14312a = flatCardCreatorAvatarClusterView;
    }

    public final void onClick(View view) {
        this.f14313b.z.mo3655a(this.f14313b.m13976d(), this.f14312a.getPlayStoreUiElementNode(), this.f14313b.J);
    }
}
