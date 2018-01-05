package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;

public final class com.google.android.finsky.billing.myaccount.bu extends com.google.android.finsky.billing.common.s
{

    public com.google.android.finsky.api.h a;
    public String b;
    public com.google.android.finsky.api.c c;

    bu() {
        com.google.android.finsky.billing.common.s();
    }

    protected static com.google.android.finsky.billing.myaccount.bu a(String p0) {
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        v1 = new com.google.android.finsky.billing.myaccount.bu();
        v1.f(v0);
        return v1;
    }

    static void a(int p0, Throwable p1, com.google.android.finsky.d.w p2) {
        v0 = new com.google.android.finsky.d.c(346);
        if (p0 == 0)
            v0.a(1);
        else
            v0.a(0).a(p0).a(p1);
        p2.a(v0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        this.c = this.a.a(this.q.getString("authAccount"));
    }

}
