package com.google.android.finsky.billing.lightpurchase.p160e;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class C1937m implements OnClickListener {
    public final /* synthetic */ String f9900a;
    public final /* synthetic */ C1935k f9901b;

    C1937m(C1935k c1935k, String str) {
        this.f9901b = c1935k;
        this.f9900a = str;
    }

    public final void onClick(View view) {
        this.f9901b.m10341Y().m13379b(new C2475d(this.f9901b).m13256a(718));
        C1601a.m9199a(view.getContext(), this.f9901b.m592c((int) C7582R.string.content_description_selected_voucher_entry), view, false);
        ((aq) this.f9901b.aa()).mo2519a(this.f9900a);
    }
}
