package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class C1029y extends C0996o implements OnClickListener {
    public final Document f6286f;
    public final C3748a f6287g;
    public final Account f6288h;
    public final C2127b f6289i;

    C1029y(Context context, int i, Document document, Account account, ad adVar, C3748a c3748a, C2495w c2495w, C2127b c2127b) {
        super(context, i, c2495w, adVar);
        this.f6286f = document;
        this.f6287g = c3748a;
        this.f6288h = account;
        this.f6289i = c2127b;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6286f.f14885a.f12099f, this.a.getResources().getString(C7582R.string.continue_text), (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        m5894c();
        this.f6287g.mo3633a(this.f6288h, this.f6286f, true);
        this.f6289i.mo2671b(this.f6286f.f14885a.f12096c, null);
    }

    public final int mo1200a() {
        return 219;
    }
}
