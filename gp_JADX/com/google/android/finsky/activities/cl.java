package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import java.util.List;

public final class cl extends dc {
    public List h_;
    public C2233o f6629u = C1473m.f7980a.mo2045Y();

    public cl(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    public final void mo1317a(Document document, Document document2, boolean z, String str, boolean z2, Intent intent, View... viewArr) {
        this.h_ = this.f6629u.m11653b(document, this.M, C1473m.f7980a.ah().mo2811a(this.C));
        super.mo1317a(document, document2, z, str, z2, intent, viewArr);
    }

    protected final boolean t_() {
        C1473m.f7980a.ah();
        return this.f6629u.m11643a(this.h_, this.C) == null;
    }
}
