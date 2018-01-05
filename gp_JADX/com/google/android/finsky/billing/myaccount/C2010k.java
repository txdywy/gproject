package com.google.android.finsky.billing.myaccount;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.em;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;

public final class C2010k extends C1998e {
    public ab f_;

    public final void mo1292a(Activity activity) {
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1758a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        m6251a(this.f_.dn());
    }

    protected final em ai() {
        return new C1996a(this.bn, this.bp, this, this.a, this.bw);
    }

    protected final int aj() {
        return C7582R.string.account;
    }

    protected final int ao() {
        return 10;
    }
}
