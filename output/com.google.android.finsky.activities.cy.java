package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.view.View;
import com.google.android.finsky.at.k;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.activities.cy implements View$OnClickListener
{

    public final Document a;
    public final Account b;
    public final com.google.android.finsky.activities.cu c;

    cy(com.google.android.finsky.activities.cu p0, Document p1, Account p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        if (this.c.A.B.a("DetailsSummaryViewBinder.confirm_cancel_dialog") == 0) {
            this.c.d(235);
            v2 = new Object[1];
            v2[0] = this.a.a.g;
            v7 = new com.google.android.finsky.at.k();
            v7.a(this.c.B.getResources().getString(2131951845, v2)).d(2131953511).e(2131952618).a(305, this.a.a.D, 245, 246, this.c.S);
            v0 = new Bundle();
            v0.putParcelable("DetailsSummaryViewBinder.doc", this.a);
            v0.putString("DetailsSummaryViewBinder.ownerAccountName", this.b.name);
            v7.a(this.c.A, 7, v0);
            v7.a().a(this.c.A.B, "DetailsSummaryViewBinder.confirm_cancel_dialog");
        }
    }

}
