package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.preregistration.C3934g;
import com.squareup.leakcanary.C7582R;

public final class al extends C0996o implements OnClickListener {
    public final Document f6059f;
    public final C1254c f6060g;
    public final Fragment f6061h;
    public final C3934g f6062i;

    public al(Context context, int i, Document document, ad adVar, C2495w c2495w, Fragment fragment, Account account, C1287h c1287h, C3934g c3934g) {
        super(context, i, c2495w, adVar);
        this.f6059f = document;
        this.f6061h = fragment;
        this.f6060g = c1287h.mo2016a(account.name);
        this.f6062i = c3934g;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6059f.f14885a.f12099f, this.a.getString(C7582R.string.preregistration_add), (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        m5894c();
        this.f6062i.m18636a(this.f6059f, this.f6060g, true, this.f6061h, this.a);
    }

    public final int mo1200a() {
        return 295;
    }
}
