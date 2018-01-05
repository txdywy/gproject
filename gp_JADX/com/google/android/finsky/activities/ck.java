package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class ck extends cu {
    public List f6627a;
    public C2233o f6628u = C1473m.f7980a.mo2045Y();

    public ck(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    public final void mo1317a(Document document, Document document2, boolean z, String str, boolean z2, Intent intent, View... viewArr) {
        this.f6627a = this.f6628u.m11653b(document, this.M, C1473m.f7980a.ah().mo2811a(this.C));
        super.mo1317a(document, document2, z, str, z2, intent, viewArr);
    }

    protected final void mo1318a(boolean z) {
        super.mo1318a(z);
        mo1323c((int) C7582R.id.download_button).setVisibility(8);
        mo1329q();
    }

    protected final boolean t_() {
        return this.f6628u.m11643a(this.f6627a, this.C) == null;
    }

    protected final boolean mo1332a(PlayActionButtonV2 playActionButtonV2, PlayActionButtonV2 playActionButtonV22, PlayActionButtonV2 playActionButtonV23, PlayActionButtonV2 playActionButtonV24, PlayActionButtonV2 playActionButtonV25, PlayActionButtonV2 playActionButtonV26, WishlistPlayActionButton wishlistPlayActionButton) {
        return m6341a(playActionButtonV2, playActionButtonV22, playActionButtonV23, playActionButtonV24, playActionButtonV25, wishlistPlayActionButton);
    }
}
