package com.google.android.finsky.billing.updatesubscriptioninstrument;

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
import com.google.wireless.android.finsky.a.a.bc;
import com.google.wireless.android.finsky.a.a.bd;

public final class com.google.android.finsky.billing.updatesubscriptioninstrument.c extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.android.volley.x
{

    public com.google.android.finsky.api.h a;
    public com.google.android.finsky.api.c b;
    public final com.google.wireless.android.finsky.a.a.bc c;
    public com.google.wireless.android.finsky.a.a.bd d;
    public VolleyError e;

    c() {
        com.google.android.finsky.billing.common.s();
        this.c = new com.google.wireless.android.finsky.a.a.bc();
    }

    public static com.google.android.finsky.billing.updatesubscriptioninstrument.c a(String p0, com.google.android.finsky.cv.a.ax p1) {
        if (TextUtils.isEmpty(p0))
            throw new IllegalArgumentException("accountName is required");
        if (p1 == 0)
            throw new IllegalArgumentException("docid is required");
        v0 = new Bundle();
        v0.putString("UpdateSubscriptionInstrument.authAccount", p0);
        v0.putParcelable("UpdateSubscriptionInstrument.docid", ParcelableProto.a(p1));
        v1 = new com.google.android.finsky.billing.updatesubscriptioninstrument.c();
        v1.f(v0);
        return v1;
    }

    final void a(int p0) {
        if (p0 != 0) {
            this.c.h = com.google.wireless.android.finsky.a.a.bc.a(p0);
            this.c.b = this.c.b | 16;
        }
    }

    public final void a(VolleyError p0) {
        this.e = p0;
        this.b(3, 0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        ((com.google.android.finsky.billing.updatesubscriptioninstrument.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.updatesubscriptioninstrument.a)).a(this);
        this.b = this.a.a(this.q.getString("UpdateSubscriptionInstrument.authAccount"));
        this.c.f = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "UpdateSubscriptionInstrument.docid");
    }

    public final void b_(Object p0) {
        this.d = (com.google.wireless.android.finsky.a.a.bd)p0;
        this.b(2, 0);
    }

}
