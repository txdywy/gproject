package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;
import java.util.List;

protected final class com.google.android.finsky.activities.ck extends com.google.android.finsky.activities.cu
{

    public List a;
    public com.google.android.finsky.by.o u;

    ck(DfeToc p0, Account p1) {
        com.google.android.finsky.activities.cu(p0, p1);
        this.u = com.google.android.finsky.m.a.Y();
    }

    public final void a(Document p0, Document p1, boolean p2, String p3, boolean p4, Intent p5, View[] p6) {
        this.a = this.u.b(p0, this.M, com.google.android.finsky.m.a.ah().a(this.C));
        super.a(p0, p1, p2, p3, p4, p5, p6);
    }

    protected final void a(boolean p0) {
        super.a(p0);
        this.c(2131755590).setVisibility(8);
        this.q();
    }

    protected final boolean a(PlayActionButtonV2 p0, PlayActionButtonV2 p1, PlayActionButtonV2 p2, PlayActionButtonV2 p3, PlayActionButtonV2 p4, PlayActionButtonV2 p5, WishlistPlayActionButton p6) {
        return this.a(p0, p1, p2, p3, p4, p6);
    }

    protected final boolean t_() {
        if (this.u.a(this.a, this.C) == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
