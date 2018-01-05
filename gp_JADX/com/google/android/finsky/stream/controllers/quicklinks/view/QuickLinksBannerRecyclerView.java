package com.google.android.finsky.stream.controllers.quicklinks.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.bg.ab;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.p143a.p144a.C4248d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class QuickLinksBannerRecyclerView extends C4248d implements ad {
    public C4483c aP;

    public QuickLinksBannerRecyclerView(Context context) {
        this(context, null);
    }

    public QuickLinksBannerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final void mo2964u() {
        if (this.aL == null) {
            Resources resources = getResources();
            this.aL = new ab(true, resources.getDimensionPixelSize(C7582R.dimen.quicklink_minwidth_single), resources.getDimensionPixelSize(C7582R.dimen.quicklink_minwidth_double), resources.getDimensionPixelSize(C7582R.dimen.quicklink_fillwidth_threshold));
        }
    }

    protected int getPlayStoreUiElementType() {
        return 429;
    }

    public ce getPlayStoreUiElement() {
        return this.aH;
    }

    public ad getParentNode() {
        return this.aI;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public void Z_() {
        super.Z_();
        if (this.aP != null) {
            C4483c c4483c = this.aP;
            c4483c.f22784e = 0;
            c4483c.f22783d = null;
            c4483c.f22785f = null;
            c4483c.f22786g = null;
        }
    }
}
