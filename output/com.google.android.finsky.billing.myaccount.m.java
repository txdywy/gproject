package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.billing.profile.m;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.myaccount.m implements View$OnClickListener
{

    public final com.google.android.finsky.billing.myaccount.l a;

    m(com.google.android.finsky.billing.myaccount.l p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.q.b(new com.google.android.finsky.d.d(this.a.f).a(2623));
        this.a.d.a(new Intent("android.intent.action.VIEW", com.google.android.finsky.billing.profile.m.a));
    }

}
