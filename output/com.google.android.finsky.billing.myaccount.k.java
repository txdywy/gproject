package com.google.android.finsky.billing.myaccount;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.em;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.providers.d;

public final class com.google.android.finsky.billing.myaccount.k extends com.google.android.finsky.billing.myaccount.e
{

    public com.google.android.finsky.dfemodel.ab f_;

    k() {
        com.google.android.finsky.billing.myaccount.e();
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        super.a(p0);
    }

    protected final android.support.v7.widget.em ai() {
        return new com.google.android.finsky.billing.myaccount.a(this.bn, this.bp, this, this.a, this.bw);
    }

    protected final int aj() {
        return 2131951653;
    }

    protected final int ao() {
        return 10;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.a(this.f_.dn());
    }

}
