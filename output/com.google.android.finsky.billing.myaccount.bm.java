package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.c.a.dz;

public final class com.google.android.finsky.billing.myaccount.bm extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.android.volley.x
{

    public com.google.android.finsky.api.h a;
    public com.google.android.finsky.api.c b;
    public com.google.android.finsky.cv.a.ax c;
    public com.google.wireless.android.finsky.dfe.c.a.dz d;
    public VolleyError e;

    bm() {
        com.google.android.finsky.billing.common.s();
    }

    public static com.google.android.finsky.billing.myaccount.bm a(String p0, com.google.android.finsky.cv.a.ax p1) {
        if (TextUtils.isEmpty(p0))
            throw new IllegalArgumentException("accountName is required");
        if (p1 == 0)
            throw new IllegalArgumentException("fullDocid is required");
        v0 = new Bundle();
        v0.putString("ReactivateSubscription.authAccount", p0);
        v0.putParcelable("ReactivateSubscription.docid", ParcelableProto.a(p1));
        v1 = new com.google.android.finsky.billing.myaccount.bm();
        v1.f(v0);
        return v1;
    }

    public final void a(VolleyError p0) {
        this.e = p0;
        this.b(3, 0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        this.b = this.a.a(this.q.getString("ReactivateSubscription.authAccount"));
        this.c = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "ReactivateSubscription.docid");
    }

    public final void b_(Object p0) {
        this.d = (com.google.wireless.android.finsky.dfe.c.a.dz)p0;
        this.b(2, 0);
    }

}
