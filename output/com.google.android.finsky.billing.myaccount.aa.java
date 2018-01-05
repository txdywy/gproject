package com.google.android.finsky.billing.myaccount;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.widget.bg;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.recyclerview.g;
import com.google.wireless.android.finsky.dfe.c.a.bh;
import com.google.wireless.android.finsky.dfe.c.a.bj;

public final class com.google.android.finsky.billing.myaccount.aa extends com.google.android.finsky.recyclerview.g implements com.google.android.finsky.billing.myaccount.ac
{

    aa(ViewGroup p0) {
        com.google.android.finsky.recyclerview.g(new TextView(p0.getContext()));
    }

    public final void a(com.google.android.finsky.billing.myaccount.ab p0, com.google.android.finsky.d.ad p1, com.google.android.finsky.d.w p2) {
        com.google.android.finsky.billing.myaccount.w.a(p0, p1);
        if (p0.a.a == 1)
            v1 = p0.a.e;
        else
            v1 = 0;
        v0 = (TextView)this.a;
        com.google.android.finsky.bg.ae.a(v0, v1.b);
        if (2 == v1.c) {
            android.support.v4.widget.bg.a(v0, 16974257);
            v0.setTextAlignment(4);
            v0.setBackgroundColor(-1);
            v1 = v0.getResources().getDimensionPixelSize(2131624010);
            v2 = v0.getResources().getDimensionPixelSize(2131624011);
            v0.setPadding(v1, v2, v1, v2);
            v0.setTypeface(Typeface.DEFAULT);
        }
        else if (1 == v1.c) {
            android.support.v4.widget.bg.a(v0, 16974259);
            v0.setTextAlignment(2);
            v0.setBackgroundColor(16777215);
            v1 = v0.getResources().getDimensionPixelSize(2131624012);
            v2 = v0.getResources().getDimensionPixelSize(2131624013);
            v0.setPadding(v1, v2, v1, v2);
            v0.setTypeface(com.google.android.finsky.billing.myaccount.w.c);
        }
        else {
            android.support.v4.widget.bg.a(v0, 16974253);
            v0.setTextAlignment(0);
            v0.setPadding(0, 0, 0, 0);
            v0.setTypeface(Typeface.DEFAULT);
        }
    }

}
