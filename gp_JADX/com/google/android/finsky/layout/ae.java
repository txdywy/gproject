package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class ae implements OnClickListener {
    public final /* synthetic */ C2495w f18478a;
    public final /* synthetic */ ad f18479b;
    public final /* synthetic */ C3748a f18480c;
    public final /* synthetic */ Account f18481d;
    public final /* synthetic */ Document f18482e;

    ae(C2495w c2495w, ad adVar, C3748a c3748a, Account account, Document document) {
        this.f18478a = c2495w;
        this.f18479b = adVar;
        this.f18480c = c3748a;
        this.f18481d = account;
        this.f18482e = document;
    }

    public final void onClick(View view) {
        this.f18478a.m13379b(new C2475d(this.f18479b).m13256a(218));
        this.f18480c.mo3633a(this.f18481d, this.f18482e, false);
    }
}
