package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.adapters.C1181z;
import com.google.android.finsky.adapters.p121a.C1140e;

final class fa implements OnClickListener {
    public final /* synthetic */ StructuredReviewModuleLayout f14563a;

    fa(StructuredReviewModuleLayout structuredReviewModuleLayout) {
        this.f14563a = structuredReviewModuleLayout;
    }

    public final void onClick(View view) {
        C1181z c1181z = this.f14563a.f14065b;
        int i = this.f14563a.f14071h;
        if (c1181z.f7256f != null) {
            if ((i > 0 ? 1 : null) != null) {
                ((C1140e) c1181z.f7257g.get(i)).mo1463g();
                c1181z.f7256f.mo3013a(i - 1);
            }
        }
    }
}
