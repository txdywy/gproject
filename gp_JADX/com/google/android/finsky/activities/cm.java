package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

public final class cm extends cu {
    public final boolean f6630a = C1473m.f7980a.dj().mo2294a(12624692);

    public cm(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    public final void mo1317a(Document document, Document document2, boolean z, String str, boolean z2, Intent intent, View... viewArr) {
        boolean z3;
        if (this.f6630a) {
            z3 = false;
        } else {
            z3 = z;
        }
        super.mo1317a(document, document2, z3, str, z2, intent, viewArr);
    }

    protected final OnClickListener mo1334a(Document document, Account account) {
        return new cn(this, document, account);
    }

    protected final OnClickListener mo1333a(Document document) {
        return new co(this, document);
    }

    protected final boolean mo1332a(PlayActionButtonV2 playActionButtonV2, PlayActionButtonV2 playActionButtonV22, PlayActionButtonV2 playActionButtonV23, PlayActionButtonV2 playActionButtonV24, PlayActionButtonV2 playActionButtonV25, PlayActionButtonV2 playActionButtonV26, WishlistPlayActionButton wishlistPlayActionButton) {
        if (!this.f6630a) {
            return m6341a(playActionButtonV2, playActionButtonV22, playActionButtonV23, playActionButtonV24, playActionButtonV25, wishlistPlayActionButton);
        }
        wishlistPlayActionButton.setVisibility(4);
        return true;
    }

    protected final boolean t_() {
        return !this.f6630a && super.t_();
    }

    protected final boolean mo1325f() {
        return !this.f6630a && super.mo1325f();
    }
}
