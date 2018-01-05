package com.google.android.finsky.stream.controllers.taglinks.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.ab;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.p143a.p144a.C4248d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class TagLinksBannerRecyclerView extends C4248d implements ad {
    public C1461c aN;
    public C4498c aO;

    public TagLinksBannerRecyclerView(Context context) {
        this(context, null);
    }

    public TagLinksBannerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((C1443d) C3947d.m18649a(C1443d.class)).mo1947a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.aM = 0;
        this.aM -= getResources().getDimensionPixelSize(C7582R.dimen.quicklinks_pill_padding);
        setPadding(this.aM, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    protected final void mo2964u() {
        if (!this.aN.dj().mo2294a(12638742) || !getResources().getBoolean(C7582R.bool.use_fixed_width_pages)) {
            super.mo2964u();
        } else if (this.aL == null) {
            Resources resources = getResources();
            this.aL = new ab(true, resources.getDimensionPixelSize(C7582R.dimen.quicklink_minwidth_single), resources.getDimensionPixelSize(C7582R.dimen.quicklink_minwidth_double), resources.getDimensionPixelSize(C7582R.dimen.quicklink_fillwidth_threshold));
        }
    }

    protected int getPlayStoreUiElementType() {
        return 447;
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

    public final void Z_() {
        super.Z_();
        if (this.aO != null) {
            C4498c c4498c = this.aO;
            c4498c.f22852e = 0;
            c4498c.f22851d = null;
            c4498c.f22853f = null;
            c4498c.f22854g = null;
        }
    }
}
