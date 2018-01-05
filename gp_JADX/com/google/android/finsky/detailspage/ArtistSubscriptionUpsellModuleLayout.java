package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;

public class ArtistSubscriptionUpsellModuleLayout extends FrameLayout implements ad, C2621k, C2622l {
    public PlayActionButtonV2 f13913a;
    public ce f13914b;
    public ad f13915c;

    public ArtistSubscriptionUpsellModuleLayout(Context context) {
        this(context, null);
    }

    public ArtistSubscriptionUpsellModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        this.f13913a = (PlayActionButtonV2) findViewById(C1592a.f8427B.intValue());
    }

    public ce getPlayStoreUiElement() {
        return this.f13914b;
    }

    public ad getParentNode() {
        return this.f13915c;
    }

    public final void mo1219a(ad adVar) {
        this.f13915c.mo1219a(adVar);
    }
}
