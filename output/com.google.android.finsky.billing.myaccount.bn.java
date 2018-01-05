package com.google.android.finsky.billing.myaccount;

import android.view.View;
import com.google.android.finsky.billing.myaccount.layout.a;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.myaccount.bn implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public int b;
    public com.google.android.finsky.billing.myaccount.layout.a c;

    bn(com.google.android.finsky.d.w p0) {
        this.a = p0;
        this.b = -1;
    }

    public final void onClick(View p0) {
        if (((com.google.android.finsky.billing.myaccount.layout.a)p0).g == 0) {
            this.a.b(new com.google.android.finsky.d.d((com.google.android.finsky.billing.myaccount.layout.a)p0));
            ((com.google.android.finsky.billing.myaccount.layout.a)p0).b();
            if (this.c != 0)
                this.c.b();
            this.b = ((com.google.android.finsky.billing.myaccount.layout.a)p0).getRowPosition();
            this.c = (com.google.android.finsky.billing.myaccount.layout.a)p0;
        }
    }

}
