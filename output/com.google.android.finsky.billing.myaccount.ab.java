package com.google.android.finsky.billing.myaccount;

import com.google.wireless.android.finsky.dfe.c.a.bh;

public class com.google.android.finsky.billing.myaccount.ab
{

    public final com.google.wireless.android.finsky.dfe.c.a.bh a;
    public final int b;

    ab() {
        this.a = 0;
        this.b = 0;
    }

    ab(com.google.wireless.android.finsky.dfe.c.a.bh p0) {
        this.a = p0;
        if (p0.a == 0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            this.b = 1;
        else {
            if (p0.a != 1)
                throw new RuntimeException("Unexpected row content");
            this.b = 2;
        }
    }

}
