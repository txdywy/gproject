package com.google.android.finsky.billing.acquire.a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.billing.acquire.d;
import com.google.android.finsky.dialogbuilder.a.l;
import com.google.android.finsky.dialogbuilder.b.j;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.finsky.dialogbuilder.j;
import com.google.android.finsky.providers.d;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.finsky.dfe.c.a.j;

public final class com.google.android.finsky.billing.acquire.a.c extends com.google.android.finsky.dialogbuilder.a.l
{

    public com.google.android.finsky.dialogbuilder.j a;
    public final com.google.wireless.android.finsky.dfe.c.a.j b;
    public final com.google.android.finsky.dialogbuilder.b.j c;

    c(LayoutInflater p0, com.google.wireless.android.finsky.dfe.c.a.j p1, com.google.android.finsky.dialogbuilder.b.j p2) {
        com.google.android.finsky.dialogbuilder.a.l(p0);
        ((com.google.android.finsky.billing.acquire.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.acquire.d)).a(this);
        this.b = p1;
        this.c = p2;
    }

    public final int a() {
        return 2130969564;
    }

    public final void a(com.google.android.finsky.dialogbuilder.e p0, View p1) {
        v0 = (PlayTextView)p1.findViewById(2131756934);
        if (this.b.h != 0) {
            this.a.a(this.b.h, (ImageView)p1.findViewById(2131756180), p0);
            v0.setCompoundDrawables(0, 0, 0, 0);
            v0.setCompoundDrawablePadding(0);
        }
        this.a.a(this.b.b, v0, p0, new Object[0]);
        this.a.a(this.b.c, (TextView)p1.findViewById(2131756935), p0, new Object[0]);
        this.a.a(this.b.d, (TextView)p1.findViewById(2131756936), p0, new Object[0]);
        if (this.b.d())
            this.c.a(this.b.e);
        if (this.b.g != 0)
            p1.setOnClickListener(new com.google.android.finsky.billing.acquire.a.d(this, p0));
        else {
            if (!this.b.d()) {
                if (this.b.a & 2)
                    v0 = 1;
                else
                    v0 = 0;
                if (v0 == 0)
                    return;
            }
            p1.setOnClickListener(new com.google.android.finsky.billing.acquire.a.e(this));
        }
    }

}
