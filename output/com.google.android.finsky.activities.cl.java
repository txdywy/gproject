package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import java.util.List;

protected final class com.google.android.finsky.activities.cl extends com.google.android.finsky.activities.dc
{

    public List h_;
    public com.google.android.finsky.by.o u;

    cl(DfeToc p0, Account p1) {
        com.google.android.finsky.activities.dc(p0, p1);
        this.u = com.google.android.finsky.m.a.Y();
    }

    public final void a(Document p0, Document p1, boolean p2, String p3, boolean p4, Intent p5, View[] p6) {
        this.h_ = this.u.b(p0, this.M, com.google.android.finsky.m.a.ah().a(this.C));
        super.a(p0, p1, p2, p3, p4, p5, p6);
    }

    protected final boolean t_() {
        com.google.android.finsky.m.a.ah();
        if (this.u.a(this.h_, this.C) == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
