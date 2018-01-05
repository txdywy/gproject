package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.android.finsky.layout.play.C3689a;
import com.google.android.finsky.layout.play.DiscoveryBadgeGeneric;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public class DiscoveryBar extends C3656x {
    public HorizontalScrollView f18148a;
    public boolean f18149b;
    public int f18150c;

    public DiscoveryBar(Context context) {
        this(context, null);
    }

    public DiscoveryBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18148a = (HorizontalScrollView) findViewById(C7582R.id.content_scroller);
    }

    protected final void mo3557a() {
        LayoutInflater from = LayoutInflater.from(getContext());
        this.j.removeAllViews();
        this.j.setDividerDrawable(null);
        for (cc ccVar : this.e) {
            View view;
            if ((ccVar.b & 32) != 0) {
                view = (C3689a) from.inflate(C7582R.layout.discovery_badge_rating, this.j, false);
            } else if (ccVar.i) {
                r0 = (C3689a) from.inflate(C7582R.layout.discovery_badge_social_plus_one, this.j, false);
            } else {
                boolean z;
                if ((ccVar.b & 64) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    r0 = (C3689a) from.inflate(C7582R.layout.discovery_badge_social_rating, this.j, false);
                } else {
                    if ((ccVar.b & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        r0 = (C3689a) from.inflate(C7582R.layout.discovery_badge_download_count, this.j, false);
                    } else if (ccVar.n != null) {
                        r0 = (C3689a) from.inflate(C7582R.layout.discovery_badge_social_player, this.j, false);
                    } else if (ccVar.o != null) {
                        r0 = (C3689a) from.inflate(C7582R.layout.discovery_badge_family_age_range, this.j, false);
                    } else if (ccVar.p != null) {
                        r0 = (C3689a) from.inflate(C7582R.layout.discovery_badge_family_category, this.j, false);
                    } else {
                        r0 = (C3689a) from.inflate(C7582R.layout.discovery_badge_generic, this.j, false);
                    }
                }
            }
            view.mo3583a(ccVar, this.f, this.g, this.d, this.h, this.i, this, this.l);
            this.j.addView(view);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f18149b) {
            this.f18149b = false;
            this.f18148a.scrollTo(this.f18150c, 0);
        }
    }

    public int getScrollPosition() {
        return this.f18148a.getScrollX();
    }

    protected final void mo3558a(boolean z, int i) {
        this.f18149b = z;
        this.f18150c = i;
    }

    protected void setupBadgePlaceholder(LayoutInflater layoutInflater) {
        for (int i = 0; i < 4; i++) {
            this.j.addView(layoutInflater.inflate(C7582R.layout.discovery_badge_placeholder, this.j, false));
        }
    }

    protected void setupEmptyPlaceholder(LayoutInflater layoutInflater) {
        DiscoveryBadgeGeneric discoveryBadgeGeneric = (DiscoveryBadgeGeneric) layoutInflater.inflate(C7582R.layout.discovery_badge_generic, this.j, false);
        discoveryBadgeGeneric.setVisibility(4);
        this.j.addView(discoveryBadgeGeneric);
    }
}
