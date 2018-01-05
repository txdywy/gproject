package com.google.android.finsky.billing.storedvalue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.m;

public final class com.google.android.finsky.billing.storedvalue.a extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.google.android.finsky.dfemodel.w
{

    public com.google.android.finsky.dfemodel.j a;
    public VolleyError b;

    a() {
        com.google.android.finsky.billing.common.s();
    }

    static com.google.android.finsky.billing.storedvalue.a a(String p0, String p1) {
        v0 = new Bundle();
        v0.putString("list_url", p1);
        v0.putString("authAccount", p0);
        v1 = new com.google.android.finsky.billing.storedvalue.a();
        v1.f(v0);
        return v1;
    }

    public final void a(VolleyError p0) {
        this.b = p0;
        this.b(3, 0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        com.google.android.finsky.m.a.aO();
        this.a = com.google.android.finsky.dfemodel.l.a(com.google.android.finsky.m.a.b(this.q.getString("authAccount")), this.q.getString("list_url"), 0, 1);
        this.a.a(this);
        this.a.a(this);
    }

    public final void m_() {
        if (this.a.a != 0 && this.a.a.a() > 0)
            this.b(2, 0);
        else
            this.b(3, 1);
    }

}
