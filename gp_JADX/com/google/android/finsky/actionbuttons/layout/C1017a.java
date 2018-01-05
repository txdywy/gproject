package com.google.android.finsky.actionbuttons.layout;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.ad;

final class C1017a implements OnClickListener {
    public final /* synthetic */ Document f6244a;
    public final /* synthetic */ Account f6245b;
    public final /* synthetic */ ad f6246c;
    public final /* synthetic */ C3748a f6247d;
    public final /* synthetic */ C1254c f6248e;
    public final /* synthetic */ WishlistPlayActionButton f6249f;

    C1017a(WishlistPlayActionButton wishlistPlayActionButton, Document document, Account account, ad adVar, C3748a c3748a, C1254c c1254c) {
        this.f6249f = wishlistPlayActionButton;
        this.f6244a = document;
        this.f6245b = account;
        this.f6246c = adVar;
        this.f6247d = c3748a;
        this.f6248e = c1254c;
    }

    public final void onClick(View view) {
        int i;
        if (this.f6249f.f6240d.m15402a(this.f6244a, this.f6245b)) {
            i = 205;
        } else {
            i = 204;
        }
        ad adVar = this.f6246c;
        if (adVar == null) {
            adVar = this.f6247d.mo3712n();
        }
        this.f6249f.f6238b.dc().m13325a(i, null, adVar);
        this.f6249f.f6240d.m15398a(this.f6249f, this.f6244a, this.f6248e);
    }
}
