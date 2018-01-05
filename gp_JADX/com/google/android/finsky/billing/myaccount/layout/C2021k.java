package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.ke;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C2021k implements OnClickListener {
    public final /* synthetic */ C2495w f10449a;
    public final /* synthetic */ Document f10450b;
    public final /* synthetic */ C2004o f10451c;
    public final /* synthetic */ ke f10452d;
    public final /* synthetic */ SubscriptionRowView f10453e;

    C2021k(SubscriptionRowView subscriptionRowView, C2495w c2495w, Document document, C2004o c2004o, ke keVar) {
        this.f10453e = subscriptionRowView;
        this.f10449a = c2495w;
        this.f10450b = document;
        this.f10451c = c2004o;
        this.f10452d = keVar;
    }

    public final void onClick(View view) {
        this.f10449a.m13379b(new C2475d(this.f10453e).m13256a(2648).m13258a(this.f10450b.f14885a.f12087D));
        this.f10451c.mo2582a(this.f10450b, this.f10452d.f12868h);
    }
}
