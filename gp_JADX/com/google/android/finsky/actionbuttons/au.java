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

final class au extends C0996o implements OnClickListener {
    public final Document f6096f;
    public final Fragment f6097g;
    public final C1254c f6098h;
    public final C3934g f6099i;

    au(Context context, int i, Document document, ad adVar, Fragment fragment, Account account, C2495w c2495w, C1287h c1287h, C3934g c3934g) {
        super(context, i, c2495w, adVar);
        this.f6096f = document;
        this.f6097g = fragment;
        this.f6098h = c1287h.mo2016a(account.name);
        this.f6099i = c3934g;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6096f.f14885a.f12099f, this.a.getString(C7582R.string.preregistration_remove), (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final void onClick(View view) {
        m5894c();
        this.f6099i.m18636a(this.f6096f, this.f6098h, false, this.f6097g, this.a);
    }

    public final int mo1200a() {
        return 296;
    }
}
