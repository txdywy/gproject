package com.google.android.finsky.billing.acquire.a;

import android.view.View;
import com.google.android.finsky.dialogbuilder.b.j;
import com.google.wireless.android.finsky.dfe.c.a.j;

public final class com.google.android.finsky.billing.acquire.a.e implements View$OnClickListener
{

    public final com.google.android.finsky.billing.acquire.a.c a;

    e(com.google.android.finsky.billing.acquire.a.c p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        v1 = new String[2];
        v1[0] = this.a.b.e;
        v1[1] = this.a.b.f;
        this.a.c.a(v1);
    }

}
