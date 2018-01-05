package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.ke;
import com.google.android.finsky.dfemodel.Document;

final class C2023m implements OnClickListener {
    public final /* synthetic */ C2003n f10460a;
    public final /* synthetic */ Document f10461b;
    public final /* synthetic */ ke f10462c;
    public final /* synthetic */ SubscriptionRowView f10463d;

    C2023m(SubscriptionRowView subscriptionRowView, C2003n c2003n, Document document, ke keVar) {
        this.f10463d = subscriptionRowView;
        this.f10460a = c2003n;
        this.f10461b = document;
        this.f10462c = keVar;
    }

    public final void onClick(View view) {
        this.f10460a.mo2584a(this.f10461b, this.f10463d.f10395q.cZ(), this.f10462c.f12869i);
    }
}
