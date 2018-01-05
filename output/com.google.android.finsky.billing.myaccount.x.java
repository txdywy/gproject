package com.google.android.finsky.billing.myaccount;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.recyclerview.g;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.av;
import com.google.wireless.android.finsky.dfe.c.a.bh;

public final class com.google.android.finsky.billing.myaccount.x extends com.google.android.finsky.recyclerview.g implements com.google.android.finsky.billing.myaccount.ac
{

    public final TextView t;
    public final TextView u;
    public final FifeImageView v;
    public final FifeImageView w;
    public final com.google.android.finsky.billing.myaccount.w x;

    x(com.google.android.finsky.billing.myaccount.w p0, LayoutInflater p1, ViewGroup p2) {
        this.x = p0;
        com.google.android.finsky.recyclerview.g(p1.inflate(2130968720, p2, 0));
        this.t = (TextView)this.a.findViewById(2131755114);
        this.u = (TextView)this.a.findViewById(2131755307);
        this.v = (FifeImageView)this.a.findViewById(2131755530);
        this.w = (FifeImageView)this.a.findViewById(2131755531);
    }

    public final void a(com.google.android.finsky.billing.myaccount.ab p0, com.google.android.finsky.d.ad p1, com.google.android.finsky.d.w p2) {
        v1 = 1;
        com.google.android.finsky.billing.myaccount.w.a(p0, p1);
        if (p0.a.a == 0)
            v5 = p0.a.d;
        else
            v5 = 0;
        if (v5.a & 1)
            v3 = 1;
        else
            v3 = 0;
        if (v3 != 0) {
            this.t.setVisibility(0);
            com.google.android.finsky.bg.ae.a(this.t, v5.b);
        }
        else
            this.t.setVisibility(8);
        if (v5.a & 2)
            v3 = 1;
        else
            v3 = 0;
        if (v3 != 0) {
            this.u.setVisibility(0);
            com.google.android.finsky.bg.ae.a(this.u, v5.c);
        }
        else
            this.u.setVisibility(8);
        if (v5.d != 0) {
            this.v.setVisibility(0);
            this.x.e.a(this.v, v5.d, -1);
            if (v5.a & 4)
                v3 = 1;
            else
                v3 = 0;
            if (v3 != 0)
                this.v.setContentDescription(v5.g);
        }
        else
            this.v.setVisibility(8);
        if (v5.e != 0) {
            this.w.setVisibility(0);
            this.x.e.a(this.w, v5.e, -1);
            if (!(v5.a & 8))
                v1 = 0;
            if (v1 != 0)
                this.w.setContentDescription(v5.h);
        }
        else
            this.w.setVisibility(8);
        if (v5.f != 0)
            this.a.setOnClickListener(new com.google.android.finsky.billing.myaccount.y(this, p0, p1, p2, v5));
        else {
            this.a.setOnClickListener(0);
            this.a.setClickable(0);
        }
    }

}
