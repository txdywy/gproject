package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ao.a;
import com.google.android.finsky.billing.d.a;
import com.google.android.finsky.billing.d.b;
import com.google.android.finsky.billing.d.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.g;
import java.util.Iterator;
import java.util.List;

protected final class com.google.android.finsky.billing.lightpurchase.aw extends com.google.android.finsky.billing.lightpurchase.f
{

    public final com.google.android.finsky.billing.d.b g;

    aw(com.google.android.finsky.ao.a p0, com.google.android.finsky.by.o p1, com.google.android.finsky.installqueue.g p2, com.google.android.finsky.accounts.c p3, com.google.android.finsky.billing.d.b p4) {
        com.google.android.finsky.billing.lightpurchase.f(p0, p1, p2, p3, 0);
        this.g = p4;
    }

    protected final void a(Account p0, List p1) {
        v1 = this.g.a();
        v2 = p1.iterator();
        while (v2.hasNext())
            v1.a(new com.google.android.finsky.billing.d.c(p0, (Document)v2.next()));
        v1.a(new com.google.android.finsky.billing.lightpurchase.ax(this));
    }

}
