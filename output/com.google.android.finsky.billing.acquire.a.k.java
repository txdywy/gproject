package com.google.android.finsky.billing.acquire.a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.google.android.finsky.billing.acquire.d;
import com.google.android.finsky.billing.c.b;
import com.google.android.finsky.billing.c.d;
import com.google.android.finsky.billing.c.g;
import com.google.android.finsky.dialogbuilder.a.l;
import com.google.android.finsky.dialogbuilder.b.f;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.finsky.dialogbuilder.j;
import com.google.android.finsky.providers.d;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.finsky.dfe.c.a.cj;
import com.google.wireless.android.finsky.dfe.c.a.dm;
import com.google.wireless.android.finsky.dfe.c.a.z;

public final class com.google.android.finsky.billing.acquire.a.k extends com.google.android.finsky.dialogbuilder.a.l
{

    public com.google.android.finsky.dialogbuilder.j a;
    public final com.google.wireless.android.finsky.dfe.c.a.z b;
    public final com.google.android.finsky.billing.c.b c;
    public final com.google.android.finsky.dialogbuilder.b.f d;

    k(LayoutInflater p0, com.google.wireless.android.finsky.dfe.c.a.z p1, com.google.android.finsky.billing.c.b p2, com.google.android.finsky.dialogbuilder.b.f p3) {
        com.google.android.finsky.dialogbuilder.a.l(p0);
        ((com.google.android.finsky.billing.acquire.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.acquire.d)).a(this);
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final int a() {
        return 2130969582;
    }

    public final void a(com.google.android.finsky.dialogbuilder.e p0, View p1) {
        v0 = (EditText)p1.findViewById(2131756950);
        this.a.a(this.b.a, v0, p0);
        if (this.c.e != 0 && !this.c.e.booleanValue())
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            v1 = (PlayTextView)p1.findViewById(2131755736);
            if (this.c.k != 0)
                this.a.a(this.b.e, v1, p0, new Object[0]);
            else {
                if (this.c.h == 1100 || this.c.h == 1003)
                    v2 = 1;
                else
                    v2 = 0;
                if (v2 != 0)
                    this.a.a(this.b.b, v1, p0, new Object[0]);
                else if (this.c.h == 910)
                    this.a.a(this.b.c, v1, p0, new Object[0]);
                else
                    this.a.a(this.b.d, v1, p0, new Object[0]);
            }
        }
        if (this.b.a != 0 && this.b.a.d != 0 && this.b.a.d.d()) {
            this.d.a(this.b.a.d.b, 0);
            v0.addTextChangedListener(new com.google.android.finsky.billing.acquire.a.l(this, p1));
        }
        v2 = new com.google.android.finsky.billing.acquire.a.m(v0);
        this.c.d = v2;
        v2.a(this.c.i);
        if (this.c.l == 0) {
            new com.google.android.finsky.billing.c.d(this.c).execute(new Void[0]);
            this.c.l = 1;
        }
    }

}
