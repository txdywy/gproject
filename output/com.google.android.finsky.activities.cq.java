package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.actionbuttons.DetailsButtonLayout;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bd.a;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.o;
import com.google.android.finsky.detailscomponents.DetailsSummaryExtraLabelsSection;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;

protected final class com.google.android.finsky.activities.cq extends com.google.android.finsky.activities.cu
{

    public final boolean a;
    public com.google.android.finsky.by.o u;

    cq(DfeToc p0, Account p1) {
        com.google.android.finsky.activities.cu(p0, p1);
        this.u = com.google.android.finsky.m.a.Y();
        this.a = com.google.android.finsky.m.a.dj().a(12620773);
    }

    private final void e(int p0) {
        this.T.a(new com.google.android.finsky.d.o(p0, this.T));
    }

    protected final boolean a(PlayActionButtonV2 p0, PlayActionButtonV2 p1, PlayActionButtonV2 p2, PlayActionButtonV2 p3, PlayActionButtonV2 p4, PlayActionButtonV2 p5, WishlistPlayActionButton p6) {
        v5 = super.a(p0, p1, p2, p3, p4, p5, p6);
        v2 = com.google.android.finsky.m.a.dj();
        v8 = v2.a(12602761);
        if ((v2.a(87) || v8 != 0) && this.u.b(this.D)) {
            if (this.a == 0)
                p5 = p4;
            v9 = com.google.android.finsky.m.a.cY();
            if (p1.getVisibility() != 0)
                v4 = 1;
            else
                v4 = 0;
            v11 = this.B.getResources();
            v12 = LayoutInflater.from(this.B);
            if (this.a == 0) {
                v2 = (ViewGroup)this.c(2131755629);
                v3 = (ViewGroup)v2.findViewById(2131755630);
                v3.removeAllViews();
                v6 = v3;
                v7 = v2;
            }
            else {
                v6 = 0;
                v7 = 0;
            }
            v2 = 0;
            if (!this.u.a(com.google.android.finsky.m.a.ah().a(v9))) {
                p5.setVisibility(0);
                p5.setEnabled(1);
                if (this.a != 0) {
                    if (v8 != 0)
                        v2 = com.google.android.finsky.bd.a.z.intValue();
                    else
                        v2 = com.google.android.finsky.bd.a.y.intValue();
                    this.e(286);
                    v3 = v2;
                    v2 = 0;
                }
                else if (v8 != 0) {
                    v3 = 2131951685;
                    v2 = 2131951686;
                }
                else {
                    v3 = 2131951682;
                    v2 = 2131951688;
                }
                p5.a(this.D.a.f, v3, new com.google.android.finsky.activities.cr(this, v9));
                if (v2 > 0)
                    DetailsSummaryExtraLabelsSection.a(v12, v6, v11.getString(v2));
                if (this.a == 0)
                    v2 = 1;
                else
                    v2 = 0;
                v3 = 1;
            }
            else if (v4 == 0) {
                p5.setVisibility(0);
                p5.setEnabled(1);
                v3 = 1;
                p5.a(this.D.a.f, 2131952450, new com.google.android.finsky.activities.cs(this, v9));
                if (this.a != 0)
                    this.e(285);
                else
                    DetailsSummaryExtraLabelsSection.a(v12, v6, v11.getString(2131951687));
                if (this.a == 0)
                    v2 = 1;
                else
                    v2 = 0;
            }
            else
                v3 = v5;
            if (this.a == 0) {
                if (v2 != 0)
                    v2 = 0;
                else
                    v2 = 8;
                v7.setVisibility(v2);
            }
            v5 = v3;
        }
        return v5;
    }

    protected final void g() {
        if (this.I instanceof DetailsButtonLayout) {
            ((DetailsButtonLayout)this.I).setForceMultiLineLayout(this.a);
            ((DetailsButtonLayout)this.I).setForceWideLayout(com.google.android.finsky.m.a.av().k(this.B.getResources()));
        }
    }

}
