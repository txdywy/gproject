package com.google.android.finsky.billing.myaccount;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.wireless.android.finsky.dfe.nano.cl;

final class bg implements OnClickListener {
    public final /* synthetic */ cl f10248a;
    public final /* synthetic */ bf f10249b;

    bg(bf bfVar, cl clVar) {
        this.f10249b = bfVar;
        this.f10248a = clVar;
    }

    public final void onClick(View view) {
        this.f10249b.f10247a.bw.m13379b(new C2475d(this.f10249b.f10247a).m13256a(2695));
        this.f10249b.f10247a.ag.m10608a(this.f10248a, new bh(this), null);
    }
}
