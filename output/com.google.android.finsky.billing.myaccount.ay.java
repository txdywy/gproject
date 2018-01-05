package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.myaccount.ay implements View$OnClickListener
{

    public final com.google.android.finsky.billing.myaccount.an a;

    ay(com.google.android.finsky.billing.myaccount.an p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.j.b(new com.google.android.finsky.d.d(this.a.l).a(2692));
        this.a.k.putString("EmailAdapter.editEmailText", 0);
        this.a.f(1);
    }

}
