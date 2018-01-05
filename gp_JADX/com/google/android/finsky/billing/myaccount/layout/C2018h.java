package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.ke;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C2018h implements OnClickListener {
    public final /* synthetic */ C2495w f10435a;
    public final /* synthetic */ Document f10436b;
    public final /* synthetic */ C2005p f10437c;
    public final /* synthetic */ ke f10438d;
    public final /* synthetic */ SubscriptionRowView f10439e;

    C2018h(SubscriptionRowView subscriptionRowView, C2495w c2495w, Document document, C2005p c2005p, ke keVar) {
        this.f10439e = subscriptionRowView;
        this.f10435a = c2495w;
        this.f10436b = document;
        this.f10437c = c2005p;
        this.f10438d = keVar;
    }

    public final void onClick(View view) {
        this.f10435a.m13379b(new C2475d(this.f10439e).m13256a(2643).m13258a(this.f10436b.f14885a.f12087D));
        this.f10437c.mo2581a(this.f10436b, this.f10438d.f12866f);
    }
}
