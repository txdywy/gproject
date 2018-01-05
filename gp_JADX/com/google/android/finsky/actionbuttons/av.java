package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class av extends C0996o {
    public final Document f6100f;
    public final C3748a f6101g;
    public final Account f6102h;
    public final String f6103i;

    av(Context context, int i, Document document, Account account, C3748a c3748a, String str, ad adVar, C2495w c2495w) {
        super(context, i, c2495w, adVar);
        this.f6100f = document;
        this.f6101g = c3748a;
        this.f6102h = account;
        this.f6103i = str;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6100f.f14885a.f12099f, this.a.getResources().getString(C7582R.string.update), this.f6101g.mo3624a(this.f6102h, this.f6100f, 1, null, this.f6103i, 217, this.d, this.c));
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final int mo1200a() {
        return 217;
    }
}
