package com.google.android.finsky.playcard;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class bb implements OnClickListener {
    public final /* synthetic */ FlatCardViewReEngagement f19630a;
    public final /* synthetic */ Document f19631b;
    public final /* synthetic */ ad f19632c;
    public final /* synthetic */ C2495w f19633d;
    public final /* synthetic */ C3748a f19634e;
    public final /* synthetic */ Account f19635f;
    public final /* synthetic */ az f19636g;

    bb(az azVar, FlatCardViewReEngagement flatCardViewReEngagement, Document document, ad adVar, C2495w c2495w, C3748a c3748a, Account account) {
        this.f19636g = azVar;
        this.f19630a = flatCardViewReEngagement;
        this.f19631b = document;
        this.f19632c = adVar;
        this.f19633d = c2495w;
        this.f19634e = c3748a;
        this.f19635f = account;
    }

    public final void onClick(View view) {
        this.f19636g.m18529a(this.f19630a, this.f19631b, view, this.f19632c, this.f19633d, this.f19634e);
        this.f19634e.mo3633a(this.f19635f, this.f19631b, false);
    }
}
