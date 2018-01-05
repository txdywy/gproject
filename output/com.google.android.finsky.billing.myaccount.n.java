package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.ParcelableProtoArray;

public final class com.google.android.finsky.billing.myaccount.n implements View$OnClickListener
{

    public final View a;
    public final com.google.android.finsky.billing.myaccount.l b;

    n(com.google.android.finsky.billing.myaccount.l p0, View p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.q.b(new com.google.android.finsky.d.d(this.b.f).a(2629));
        v2 = this.b.r.cZ();
        v5 = new Intent(this.a.getContext(), SwitchFamilyInstrumentActivity);
        v5.putExtra("SwitchFamilyInstrumentActivity.instruments", ParcelableProtoArray.a(this.b.w));
        com.google.android.finsky.billing.common.h.a(v5, v2);
        this.b.q.b(v2).a(v5);
        this.b.d.startActivityForResult(v5, 11);
    }

}
