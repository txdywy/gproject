package com.google.android.finsky.activities;

import android.content.Context;
import android.support.v4.app.p;
import android.view.View;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.br.a;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.utils.i;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.activities.fe implements View$OnClickListener
{

    public final int a;
    public final com.google.android.finsky.activities.fa b;

    fe(com.google.android.finsky.activities.fa p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.a(0);
        com.google.android.finsky.aa.a.bk.a(Long.valueOf(com.google.android.finsky.utils.i.a() + com.google.android.finsky.activities.fa.ak));
        this.b.ap.b(new com.google.android.finsky.d.d(this.b).a(2935));
        v2 = com.google.android.finsky.m.a.bn();
        if (!v2.a(this.b.ao.getPackageManager()))
            this.b.aq.b(2);
        else {
            switch (this.a) {
                case 0:
                    v0 = (String)com.google.android.finsky.aa.b.ej.b();
                    break;
                case 1:
                    v0 = (String)com.google.android.finsky.aa.b.eh.b();
                    break;
                case 2:
                    v0 = (String)com.google.android.finsky.aa.b.ei.b();
                    break;
                default:
                    v0 = (String)com.google.android.finsky.aa.b.eg.b();
                    break;
            }
            this.b.ao.startActivity(v2.a(2, v0, this.b.am));
        }
    }

}
