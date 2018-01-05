package com.google.android.finsky.billing.changesubscriptionprice;

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
import com.google.common.a.m;
import com.google.wireless.android.finsky.dfe.c.a.as;
import com.google.wireless.android.finsky.dfe.c.a.at;

public final class com.google.android.finsky.billing.changesubscriptionprice.b extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.android.volley.x
{

    public com.google.android.finsky.api.h a;
    public com.google.android.finsky.api.c b;
    public final com.google.wireless.android.finsky.dfe.c.a.as c;
    public com.google.wireless.android.finsky.dfe.c.a.at d;
    public VolleyError e;

    b() {
        com.google.android.finsky.billing.common.s();
        this.c = new com.google.wireless.android.finsky.dfe.c.a.as();
    }

    public static com.google.android.finsky.billing.changesubscriptionprice.b a(String p0, com.google.android.finsky.cv.a.ax p1) {
        if (!TextUtils.isEmpty(p0))
            v0 = 1;
        else
            v0 = 0;
        if (v0 == 0)
            throw new IllegalArgumentException(String.valueOf("accountName is required"));
        com.google.common.a.m.a(p1);
        v0 = new Bundle();
        v0.putString("account_name", p0);
        v0.putParcelable("docid", ParcelableProto.a(p1));
        v1 = new com.google.android.finsky.billing.changesubscriptionprice.b();
        v1.f(v0);
        return v1;
    }

    public final void a(VolleyError p0) {
        this.e = p0;
        this.b(3, 0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        ((com.google.android.finsky.billing.changesubscriptionprice.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.changesubscriptionprice.a)).a(this);
        this.b = this.a.a(this.q.getString("account_name"));
        this.c.a = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "docid");
    }

    public final void b_(Object p0) {
        this.d = (com.google.wireless.android.finsky.dfe.c.a.at)p0;
        this.b(2, 0);
    }

}
