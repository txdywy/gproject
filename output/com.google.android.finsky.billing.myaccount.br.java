package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.android.volley.x;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.b.w;

public final class com.google.android.finsky.billing.myaccount.br extends com.google.android.finsky.billing.common.s implements com.android.volley.w
{

    public com.google.android.finsky.api.h a;
    public final com.android.volley.x ah;
    public com.google.android.finsky.api.c b;
    public String c;
    public com.google.android.finsky.cv.a.ax d;
    public com.google.wireless.android.finsky.b.w e;
    public VolleyError f;
    public final com.android.volley.x g;

    br() {
        com.google.android.finsky.billing.common.s();
        this.g = new com.google.android.finsky.billing.myaccount.bs(this);
        this.ah = new com.google.android.finsky.billing.myaccount.bt(this);
    }

    public static com.google.android.finsky.billing.myaccount.br a(String p0, String p1, com.google.android.finsky.cv.a.ax p2) {
        if (TextUtils.isEmpty(p0))
            throw new IllegalArgumentException("accountName is required");
        if (p1 == 0)
            throw new IllegalArgumentException("docidStr is required");
        if (p2 == 0)
            throw new IllegalArgumentException("fullDocid is required");
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        v0.putString("SubscriptionActionSidecar.docidStr", p1);
        v0.putParcelable("SubscriptionActionSidecar.docid", ParcelableProto.a(p2));
        v1 = new com.google.android.finsky.billing.myaccount.br();
        v1.f(v0);
        return v1;
    }

    public final void a(VolleyError p0) {
        this.f = p0;
        this.b(3, 0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        this.b = this.a.a(this.q.getString("authAccount"));
        this.c = this.q.getString("SubscriptionActionSidecar.docidStr");
        this.d = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "SubscriptionActionSidecar.docid");
    }

}
