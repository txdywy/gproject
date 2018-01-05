package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.actionbuttons.DetailsButtonLayout;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.detailscomponents.DetailsSummaryExtraLabelsSection;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2473o;
import com.squareup.leakcanary.C7582R;

public final class cq extends cu {
    public final boolean f6637a = C1473m.f7980a.dj().mo2294a(12620773);
    public C2233o f6638u = C1473m.f7980a.mo2045Y();

    public cq(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    protected final void mo1335g() {
        if (this.I instanceof DetailsButtonLayout) {
            DetailsButtonLayout detailsButtonLayout = (DetailsButtonLayout) this.I;
            detailsButtonLayout.setForceMultiLineLayout(this.f6637a);
            detailsButtonLayout.setForceWideLayout(C1473m.f7980a.av().m9286k(this.B.getResources()));
        }
    }

    protected final boolean mo1332a(PlayActionButtonV2 playActionButtonV2, PlayActionButtonV2 playActionButtonV22, PlayActionButtonV2 playActionButtonV23, PlayActionButtonV2 playActionButtonV24, PlayActionButtonV2 playActionButtonV25, PlayActionButtonV2 playActionButtonV26, WishlistPlayActionButton wishlistPlayActionButton) {
        boolean a = super.mo1332a(playActionButtonV2, playActionButtonV22, playActionButtonV23, playActionButtonV24, playActionButtonV25, playActionButtonV26, wishlistPlayActionButton);
        C1552e dj = C1473m.f7980a.dj();
        boolean a2 = dj.mo2294a(87);
        boolean a3 = dj.mo2294a(12602761);
        if ((!a2 && !a3) || !this.f6638u.m11654b(this.D)) {
            return a;
        }
        Object obj;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.f6637a) {
            playActionButtonV26 = playActionButtonV25;
        }
        C2206c ah = C1473m.f7980a.ah();
        Account cY = C1473m.f7980a.cY();
        boolean a4 = this.f6638u.m11644a(ah.mo2811a(cY));
        if (playActionButtonV22.getVisibility() != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        Resources resources = this.B.getResources();
        LayoutInflater from = LayoutInflater.from(this.B);
        if (this.f6637a) {
            viewGroup = null;
            viewGroup2 = null;
        } else {
            ViewGroup viewGroup3 = (ViewGroup) mo1323c((int) C7582R.id.title_extra_labels_bottom);
            ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(C7582R.id.extra_labels_bottom_leading);
            viewGroup4.removeAllViews();
            viewGroup = viewGroup4;
            viewGroup2 = viewGroup3;
        }
        Object obj2 = null;
        if (!a4) {
            int intValue;
            int i;
            playActionButtonV26.setVisibility(0);
            playActionButtonV26.setEnabled(true);
            OnClickListener crVar = new cr(this, cY);
            if (this.f6637a) {
                if (a3) {
                    intValue = C1592a.f8477z.intValue();
                } else {
                    intValue = C1592a.f8476y.intValue();
                }
                m6448e(286);
                i = intValue;
                intValue = 0;
            } else if (a3) {
                i = C7582R.string.all_access_button_subscribe;
                intValue = C7582R.string.all_access_label_bottom_alternate_try_all_access;
            } else {
                i = C7582R.string.all_access_button_free_trial;
                intValue = C7582R.string.all_access_label_bottom_try_all_access;
            }
            playActionButtonV26.m6000a(this.D.f14885a.f12099f, i, crVar);
            if (intValue > 0) {
                DetailsSummaryExtraLabelsSection.m13577a(from, viewGroup, resources.getString(intValue));
            }
            if (this.f6637a) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            a2 = true;
        } else if (obj == null) {
            playActionButtonV26.setVisibility(0);
            playActionButtonV26.setEnabled(true);
            a2 = true;
            playActionButtonV26.m6000a(this.D.f14885a.f12099f, (int) C7582R.string.listen, new cs(this, cY));
            if (this.f6637a) {
                m6448e(285);
            } else {
                DetailsSummaryExtraLabelsSection.m13577a(from, viewGroup, resources.getString(C7582R.string.all_access_label_bottom_available_in_all_access));
            }
            obj2 = !this.f6637a ? 1 : null;
        } else {
            a2 = a;
        }
        if (!this.f6637a) {
            viewGroup2.setVisibility(obj2 != null ? 0 : 8);
        }
        return a2;
    }

    private final void m6448e(int i) {
        this.T.mo1219a(new C2473o(i, this.T));
    }
}
