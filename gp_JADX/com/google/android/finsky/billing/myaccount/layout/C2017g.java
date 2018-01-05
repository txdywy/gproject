package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class C2017g implements OnClickListener {
    public final /* synthetic */ C3748a f10430a;
    public final /* synthetic */ Document f10431b;
    public final /* synthetic */ ad f10432c;
    public final /* synthetic */ C2495w f10433d;
    public final /* synthetic */ SubscriptionRowView f10434e;

    C2017g(SubscriptionRowView subscriptionRowView, C3748a c3748a, Document document, ad adVar, C2495w c2495w) {
        this.f10434e = subscriptionRowView;
        this.f10430a = c3748a;
        this.f10431b = document;
        this.f10432c = adVar;
        this.f10433d = c2495w;
    }

    public final void onClick(View view) {
        this.f10430a.mo3654a(this.f10431b, this.f10432c, this.f10434e.getThumbnailCover(), this.f10433d);
    }
}
