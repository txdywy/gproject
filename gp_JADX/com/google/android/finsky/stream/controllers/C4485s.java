package com.google.android.finsky.stream.controllers;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.stream.controllers.view.FlatCardCreatorAvatarClusterView;

final class C4485s implements OnClickListener {
    public final /* synthetic */ FlatCardCreatorAvatarClusterView f22789a;
    public final /* synthetic */ C4484r f22790b;

    C4485s(C4484r c4484r, FlatCardCreatorAvatarClusterView flatCardCreatorAvatarClusterView) {
        this.f22790b = c4484r;
        this.f22789a = flatCardCreatorAvatarClusterView;
    }

    public final void onClick(View view) {
        this.f22790b.f.mo3655a(this.f22790b.mo4229k(), this.f22789a.getPlayStoreUiElementNode(), this.f22790b.i);
    }
}
