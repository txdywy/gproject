package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.ke;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C2019i implements OnClickListener {
    public final /* synthetic */ C2495w f10440a;
    public final /* synthetic */ Document f10441b;
    public final /* synthetic */ C2005p f10442c;
    public final /* synthetic */ ke f10443d;
    public final /* synthetic */ SubscriptionRowView f10444e;

    C2019i(SubscriptionRowView subscriptionRowView, C2495w c2495w, Document document, C2005p c2005p, ke keVar) {
        this.f10444e = subscriptionRowView;
        this.f10440a = c2495w;
        this.f10441b = document;
        this.f10442c = c2005p;
        this.f10443d = keVar;
    }

    public final void onClick(View view) {
        this.f10440a.m13379b(new C2475d(this.f10444e).m13256a(2647).m13258a(this.f10441b.f14885a.f12087D));
        this.f10442c.mo2583a(this.f10441b, this.f10443d.f12867g);
    }
}
