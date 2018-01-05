package com.google.android.finsky.billing.updatesubscriptioninstrument;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.billing.profile.c;
import com.google.android.finsky.billing.profile.m;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;

protected final class com.google.android.finsky.billing.updatesubscriptioninstrument.b extends com.google.android.finsky.billing.profile.c
{

    public com.google.android.finsky.ba.c aj;

    b() {
        com.google.android.finsky.billing.profile.c();
    }

    public static com.google.android.finsky.billing.updatesubscriptioninstrument.b a(Account p0, com.google.android.finsky.cv.a.ax p1, int p2) {
        v1 = new com.google.android.finsky.billing.updatesubscriptioninstrument.b();
        v1.f(com.google.android.finsky.billing.updatesubscriptioninstrument.b.a(p0, 0, p1, p2, 12, 7, 0, 0, 0));
        return v1;
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.billing.updatesubscriptioninstrument.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.updatesubscriptioninstrument.a)).a(this);
        super.a(p0);
    }

    protected final int ad() {
        return 5;
    }

    protected final void ae() {
        this.e.a(this.e.W(), (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "BillingProfileFragment.docid"), this.q.getInt("BillingProfileFragment.instrumentRank"), this.af);
    }

    protected final int af() {
        return 5581;
    }

}
