package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.widget.TextView;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.ai;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.ParcelableProto;

protected final class CancelSubscriptionActivityNew extends com.google.android.finsky.billing.myaccount.bo
{

    public com.google.android.finsky.cv.a.ai n;

    CancelSubscriptionActivityNew() {
        com.google.android.finsky.billing.myaccount.bo();
    }

    protected final void a(Intent p0) {
        this.n = (com.google.android.finsky.cv.a.ai)ParcelableProto.a(p0, "SubscriptionActionActivity.dialog");
    }

    protected final void a(com.google.android.finsky.billing.myaccount.br p0) {
        p0.b.a(p0.c, p0.d, p0.g, p0);
        p0.b(1, 0);
    }

    protected final boolean a(TextView p0, TextView p1, PlayActionButtonV2 p2, PlayActionButtonV2 p3) {
        p0.setText(this.n.b);
        if (this.n.aD_())
            p1.setText(this.n.c);
        p2.a(0, this.n.d, this);
        p3.a(0, this.n.e, this);
        return this.n.aD_();
    }

    protected final int f() {
        return 304;
    }

    protected final int h() {
        return 243;
    }

    protected final int i() {
        return 244;
    }

    protected final int j() {
        return 851;
    }

    protected final int k() {
        return 850;
    }

    protected final String l() {
        return "cancelSubscription";
    }

    protected final int m() {
        return 2131951805;
    }

}
