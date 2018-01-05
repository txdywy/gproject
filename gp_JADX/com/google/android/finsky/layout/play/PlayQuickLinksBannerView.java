package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;
import com.google.wireless.android.a.a.a.a.ce;

public class PlayQuickLinksBannerView extends PlayClusterViewContentV2 implements ad {
    public ce aG;
    public ad aH;

    public PlayQuickLinksBannerView(Context context) {
        this(context, null);
    }

    public PlayQuickLinksBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ce getPlayStoreUiElement() {
        return this.aG;
    }

    public ad getParentNode() {
        return this.aH;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
