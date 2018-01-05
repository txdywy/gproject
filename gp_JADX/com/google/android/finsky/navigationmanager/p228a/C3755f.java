package com.google.android.finsky.navigationmanager.p228a;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class C3755f implements OnClickListener {
    public final /* synthetic */ C2495w f18952a;
    public final /* synthetic */ ad f18953b;
    public final /* synthetic */ Account f18954c;
    public final /* synthetic */ Document f18955d;
    public final /* synthetic */ C3749d f18956e;

    C3755f(C3749d c3749d, C2495w c2495w, ad adVar, Account account, Document document) {
        this.f18956e = c3749d;
        this.f18952a = c2495w;
        this.f18953b = adVar;
        this.f18954c = account;
        this.f18955d = document;
    }

    public final void onClick(View view) {
        this.f18952a.m13379b(new C2475d(this.f18953b).m13256a(218));
        this.f18956e.mo3633a(this.f18954c, this.f18955d, false);
    }
}
