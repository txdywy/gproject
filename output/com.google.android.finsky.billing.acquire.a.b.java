package com.google.android.finsky.billing.acquire.a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.acquire.d;
import com.google.android.finsky.dialogbuilder.a.l;
import com.google.android.finsky.dialogbuilder.b.j;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.finsky.dialogbuilder.j;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.cg;
import com.google.wireless.android.finsky.dfe.c.a.i;

public final class com.google.android.finsky.billing.acquire.a.b extends com.google.android.finsky.dialogbuilder.a.l
{

    public com.google.android.finsky.dialogbuilder.j a;
    public com.google.android.finsky.bg.l b;
    public final com.google.wireless.android.finsky.dfe.c.a.i c;
    public final com.google.android.finsky.dialogbuilder.b.j d;

    b(LayoutInflater p0, com.google.wireless.android.finsky.dfe.c.a.i p1, com.google.android.finsky.dialogbuilder.b.j p2) {
        com.google.android.finsky.dialogbuilder.a.l(p0);
        ((com.google.android.finsky.billing.acquire.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.acquire.d)).a(this);
        this.c = p1;
        this.d = p2;
    }

    public final int a() {
        return 2130969563;
    }

    public final void a(com.google.android.finsky.dialogbuilder.e p0, View p1) {
        if (this.c.b == 0)
            v1 = 0;
        else
            v1 = this.c.b.b;
        if (v1 != 0) {
            v0 = (FifeImageView)p1.findViewById(2131755855);
            this.b.a(v0, v1, -1);
            com.google.android.finsky.dialogbuilder.j.a(this.c.b.c, v0, p0);
        }
        this.a.a(this.c.c, (TextView)p1.findViewById(2131756147), p0, new Object[0]);
        this.a.a(this.c.d, (TextView)p1.findViewById(2131756148), p0, new Object[0]);
        this.a.a(this.c.e, (TextView)p1.findViewById(2131756150), p0, new Object[0]);
        this.a.a(this.c.f, (TextView)p1.findViewById(2131756151), p0, new Object[0]);
        this.a.a(this.c.g, (TextView)p1.findViewById(2131755852), p0, new Object[0]);
        this.a.a(this.c.h, (TextView)p1.findViewById(2131755853), p0, new Object[0]);
        this.a.a(this.c.i, (TextView)p1.findViewById(2131756152), p0, new Object[0]);
        if (this.c.e != 0) {
            v0 = (TextView)p1.findViewById(2131756150);
            v4 = 2130837709;
            v2 = 2130837708;
        }
        else {
            v0 = (TextView)p1.findViewById(2131756151);
            v4 = 2130837742;
            v2 = 2130837740;
        }
        com.google.android.finsky.dialogbuilder.j.a(v0, p1, v2, this.c.j, v4, this.c.k, this.d);
    }

}
