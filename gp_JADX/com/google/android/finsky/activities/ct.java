package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.detailscomponents.DetailsSummaryExtraLabelsSection;
import com.google.android.finsky.dfemodel.DfeToc;
import com.squareup.leakcanary.C7582R;

public final class ct extends dc {
    public final boolean f6643b = C1473m.f7980a.dj().mo2294a(12620773);
    public C2233o f6644u = C1473m.f7980a.mo2045Y();

    public ct(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    protected final void mo1336h() {
        if (!this.f6643b) {
            C1552e dj = C1473m.f7980a.dj();
            boolean a = dj.mo2294a(87);
            boolean a2 = dj.mo2294a(12602761);
            if ((a || a2) && this.f6644u.m11654b(this.D)) {
                Object obj;
                int i;
                C2196e a3 = C1473m.f7980a.ah().mo2811a(C1473m.f7980a.cY());
                boolean a4 = this.f6644u.m11644a(a3);
                boolean a5 = this.f6644u.m11649a(this.D, this.M, a3);
                boolean a6 = C1473m.f7980a.ce().m5996a(this.D, this.M, null, this.C, this.f6644u.m11642a(this.D, this.C), a5);
                Resources resources = this.B.getResources();
                LayoutInflater from = LayoutInflater.from(this.B);
                ViewGroup viewGroup = (ViewGroup) mo1323c((int) C7582R.id.title_extra_labels_bottom);
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C7582R.id.extra_labels_bottom_leading);
                viewGroup2.removeAllViews();
                if (!a4) {
                    if (a2) {
                        DetailsSummaryExtraLabelsSection.m13577a(from, viewGroup2, resources.getString(C7582R.string.all_access_label_bottom_alternate_try_all_access));
                    } else {
                        DetailsSummaryExtraLabelsSection.m13577a(from, viewGroup2, resources.getString(C7582R.string.all_access_label_bottom_try_all_access));
                    }
                    obj = 1;
                } else if (a6) {
                    obj = null;
                } else {
                    DetailsSummaryExtraLabelsSection.m13577a(from, viewGroup2, resources.getString(C7582R.string.all_access_label_bottom_available_in_all_access));
                    i = 1;
                }
                if (obj != null) {
                    i = 0;
                } else {
                    i = 8;
                }
                viewGroup.setVisibility(i);
            }
        }
    }
}
