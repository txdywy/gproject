package com.google.android.finsky.billing.lightpurchase.p160e;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class C1936l implements OnClickListener {
    public final /* synthetic */ C1935k f9899a;

    C1936l(C1935k c1935k) {
        this.f9899a = c1935k;
    }

    public final void onClick(View view) {
        this.f9899a.m10341Y().m13379b(new C2475d(this.f9899a).m13256a(719));
        C1601a.m9199a(view.getContext(), this.f9899a.m592c((int) C7582R.string.content_description_unselected_voucher_entry), view, false);
        ((aq) this.f9899a.aa()).mo2519a(null);
    }
}
