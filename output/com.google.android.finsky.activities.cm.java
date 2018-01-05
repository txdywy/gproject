package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.view.View$OnClickListener;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;

protected final class com.google.android.finsky.activities.cm extends com.google.android.finsky.activities.cu
{

    public final boolean a;

    cm(DfeToc p0, Account p1) {
        com.google.android.finsky.activities.cu(p0, p1);
        this.a = com.google.android.finsky.m.a.dj().a(12624692);
    }

    protected final View$OnClickListener a(Document p0) {
        return new com.google.android.finsky.activities.co(this, p0);
    }

    protected final View$OnClickListener a(Document p0, Account p1) {
        return new com.google.android.finsky.activities.cn(this, p0, p1);
    }

    public final void a(Document p0, Document p1, boolean p2, String p3, boolean p4, Intent p5, View[] p6) {
        if (this.a != 0)
            v3 = 0;
        else
            v3 = p2;
        super.a(p0, p1, v3, p3, p4, p5, p6);
    }

    protected final boolean a(PlayActionButtonV2 p0, PlayActionButtonV2 p1, PlayActionButtonV2 p2, PlayActionButtonV2 p3, PlayActionButtonV2 p4, PlayActionButtonV2 p5, WishlistPlayActionButton p6) {
        if (this.a != 0) {
            p6.setVisibility(4);
            v0 = 1;
        }
        else
            v0 = this.a(p0, p1, p2, p3, p4, p6);
        return v0;
    }

    protected final boolean f() {
        if (this.a == 0 && super.f())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final boolean t_() {
        if (this.a == 0 && super.t_())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
