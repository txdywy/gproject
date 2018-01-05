package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.ke;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C2022l implements OnClickListener {
    public final /* synthetic */ C2495w f10454a;
    public final /* synthetic */ Document f10455b;
    public final /* synthetic */ C3748a f10456c;
    public final /* synthetic */ ke f10457d;
    public final /* synthetic */ DfeToc f10458e;
    public final /* synthetic */ SubscriptionRowView f10459f;

    C2022l(SubscriptionRowView subscriptionRowView, C2495w c2495w, Document document, C3748a c3748a, ke keVar, DfeToc dfeToc) {
        this.f10459f = subscriptionRowView;
        this.f10454a = c2495w;
        this.f10455b = document;
        this.f10456c = c3748a;
        this.f10457d = keVar;
        this.f10458e = dfeToc;
    }

    public final void onClick(View view) {
        this.f10454a.m13379b(new C2475d(this.f10459f).m13256a(2645).m13258a(this.f10455b.f14885a.f12087D));
        this.f10456c.mo3639a(this.f10457d.f12865e, this.f10458e, view.getContext().getPackageManager(), this.f10454a);
    }
}
