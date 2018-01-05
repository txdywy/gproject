package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.widget.TextView;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.hv;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.c.a.dy;

protected final class ReactivateSubscriptionActivityNew extends com.google.android.finsky.billing.myaccount.bo
{

    public com.google.android.finsky.cv.a.hv n;

    ReactivateSubscriptionActivityNew() {
        com.google.android.finsky.billing.myaccount.bo();
    }

    protected final void a(Intent p0) {
        this.n = (com.google.android.finsky.cv.a.hv)ParcelableProto.a(p0, "SubscriptionActionActivity.dialog");
    }

    protected final void a(com.google.android.finsky.billing.myaccount.br p0) {
        v0 = new com.google.wireless.android.finsky.dfe.c.a.dy();
        v0.a = p0.d;
        p0.b.a(v0, p0.ah, p0);
        p0.b(1, 0);
    }

    protected final boolean a(TextView p0, TextView p1, PlayActionButtonV2 p2, PlayActionButtonV2 p3) {
        p0.setText(this.n.b);
        if (this.n.bl_())
            p1.setText(this.n.c);
        p2.a(0, this.n.d, this);
        p3.a(0, this.n.e, this);
        return this.n.bl_();
    }

    protected final int f() {
        return 330;
    }

    protected final int h() {
        return 2941;
    }

    protected final int i() {
        return 2942;
    }

    protected final int j() {
        return 1431;
    }

    protected final int k() {
        return 1430;
    }

    protected final String l() {
        return "reactivateSubscription";
    }

    protected final int m() {
        return 2131952978;
    }

}
