package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C2013b implements OnClickListener {
    public final /* synthetic */ C2495w f10405a;
    public final /* synthetic */ C2014c f10406b;
    public final /* synthetic */ AccountSimpleRowView f10407c;

    C2013b(AccountSimpleRowView accountSimpleRowView, C2495w c2495w, C2014c c2014c) {
        this.f10407c = accountSimpleRowView;
        this.f10405a = c2495w;
        this.f10406b = c2014c;
    }

    public final void onClick(View view) {
        this.f10405a.m13379b(new C2475d(this.f10407c));
        this.f10406b.f10416i.onClick(view);
    }
}
