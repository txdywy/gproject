package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.actionbuttons.j;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.detailscomponents.DetailsSummaryExtraLabelsSection;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.m;

protected final class com.google.android.finsky.activities.ct extends com.google.android.finsky.activities.dc
{

    public final boolean b;
    public com.google.android.finsky.by.o u;

    ct(DfeToc p0, Account p1) {
        com.google.android.finsky.activities.dc(p0, p1);
        this.u = com.google.android.finsky.m.a.Y();
        this.b = com.google.android.finsky.m.a.dj().a(12620773);
    }

    protected final void h() {
        if (this.b == 0) {
            v0 = com.google.android.finsky.m.a.dj();
            v9 = v0.a(12602761);
            if (((v0.a(87)) || v9 != 0) && this.u.b(this.D)) {
                v0 = com.google.android.finsky.m.a.ah().a(com.google.android.finsky.m.a.cY());
                v10 = this.u.a(v0);
                v2 = com.google.android.finsky.m.a.ce().a(this.D, this.M, 0, this.C, this.u.a(this.D, this.C), this.u.a(this.D, this.M, v0));
                v3 = this.B.getResources();
                v4 = LayoutInflater.from(this.B);
                v0 = (ViewGroup)this.c(2131755629);
                v1 = (ViewGroup)v0.findViewById(2131755630);
                v1.removeAllViews();
                if (v10 == 0) {
                    if (v9 != 0)
                        DetailsSummaryExtraLabelsSection.a(v4, v1, v3.getString(2131951686));
                    else
                        DetailsSummaryExtraLabelsSection.a(v4, v1, v3.getString(2131951688));
                    v1 = 1;
                }
                else if (v2 == 0) {
                    DetailsSummaryExtraLabelsSection.a(v4, v1, v3.getString(2131951687));
                    v1 = 1;
                }
                else
                    v1 = 0;
                if (v1 != 0)
                    v1 = 0;
                else
                    v1 = 8;
                v0.setVisibility(v1);
            }
        }
    }

}
