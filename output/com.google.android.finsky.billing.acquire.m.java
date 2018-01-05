package com.google.android.finsky.billing.acquire;

import android.content.Intent;
import com.google.android.finsky.billing.common.r;
import com.google.android.finsky.cv.a.is;

public final class com.google.android.finsky.billing.acquire.m implements com.google.android.finsky.billing.b.p
{

    public final com.google.android.finsky.billing.acquire.i a;

    m(com.google.android.finsky.billing.acquire.i p0) {
        this.a = p0;
    }

    public final void a(boolean p0, com.google.android.finsky.cv.a.is p1) {
        if (p1 == 0) {
            new com.google.android.finsky.billing.acquire.f();
            p1 = com.google.android.finsky.billing.acquire.f.a(com.google.android.finsky.billing.acquire.g.b);
        }
        new com.google.android.finsky.billing.common.r();
        v0 = com.google.android.finsky.billing.common.r.a(p1);
        if (v0 == 0)
            v0 = 0;
        else
            v0 = new Intent().putExtras(v0);
        if (p0 != 0)
            v1 = -1;
        else
            v1 = 0;
        this.a.setResult(v1, v0);
        this.a.ac = p0;
        this.a.ad = v0.getIntExtra("RESPONSE_CODE", com.google.android.finsky.billing.acquire.g.b.d);
        this.a.finish();
    }

}
