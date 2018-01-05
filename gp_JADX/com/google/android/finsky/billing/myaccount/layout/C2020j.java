package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C2020j implements OnClickListener {
    public final /* synthetic */ C2495w f10445a;
    public final /* synthetic */ Document f10446b;
    public final /* synthetic */ C2006q f10447c;
    public final /* synthetic */ SubscriptionRowView f10448d;

    C2020j(SubscriptionRowView subscriptionRowView, C2495w c2495w, Document document, C2006q c2006q) {
        this.f10448d = subscriptionRowView;
        this.f10445a = c2495w;
        this.f10446b = document;
        this.f10447c = c2006q;
    }

    public final void onClick(View view) {
        this.f10445a.m13379b(new C2475d(this.f10448d).m13256a(2646).m13258a(this.f10446b.f14885a.f12087D));
        this.f10447c.mo2585a(this.f10448d.f10395q.cZ(), this.f10446b.m14646d());
    }
}
