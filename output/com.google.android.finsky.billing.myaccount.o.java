package com.google.android.finsky.billing.myaccount;

import android.support.v7.widget.em;
import android.support.v7.widget.en;
import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import java.util.ArrayList;

public final class com.google.android.finsky.billing.myaccount.o implements View$OnClickListener
{

    public final com.google.android.finsky.billing.myaccount.p a;
    public final com.google.android.finsky.billing.myaccount.l b;

    o(com.google.android.finsky.billing.myaccount.l p0, com.google.android.finsky.billing.myaccount.p p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.q.b(new com.google.android.finsky.d.d(this.b.f).a(2631));
        v4 = ((Integer)this.a.b).intValue();
        this.b.o.remove(v4);
        ((com.google.android.finsky.billing.myaccount.p)this.b.o.get(v4 - 1)).c = 0;
        v0 = 0;
        while (v0 < this.b.p.size()) {
            if (v0 == this.b.p.size() - 1)
                v2 = 1;
            else
                v2 = 0;
            this.b.o.add(v4 + v0, new com.google.android.finsky.billing.myaccount.p(1, this.b.p.get(v0), v2));
            v0 = v0 + 1;
        }
        this.b.a.b();
    }

}
