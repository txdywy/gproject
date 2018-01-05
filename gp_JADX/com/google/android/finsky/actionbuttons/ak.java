package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

final class ak extends C0996o {
    public final Document f6055f;
    public final C3748a f6056g;
    public final Account f6057h;
    public final String f6058i;

    ak(Context context, int i, Document document, String str, Account account, C3748a c3748a, ad adVar, C2495w c2495w) {
        super(context, i, c2495w, adVar);
        this.f6055f = document;
        this.f6056g = c3748a;
        this.f6057h = account;
        this.f6058i = str;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        bl e = this.f6055f.m14649e(1);
        playActionButtonV2.mo2588a(this.f6055f.f14885a.f12099f, this.a.getString(C7582R.string.preorder, new Object[]{e.f11917g}), this.f6056g.mo3624a(this.f6057h, this.f6055f, this.f6055f.m14649e(1).f11926p, null, this.f6058i, 234, this.d, this.c));
        playActionButtonV2.setActionStyle(this.b);
        m5893b();
    }

    public final int mo1200a() {
        return 234;
    }
}
