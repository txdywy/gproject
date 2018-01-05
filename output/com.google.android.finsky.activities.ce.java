package com.google.android.finsky.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.at.k;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.m;

public final class com.google.android.finsky.activities.ce implements View$OnClickListener
{

    public final String a;
    public final ViewGroup b;
    public final com.google.android.finsky.activities.bq c;

    ce(com.google.android.finsky.activities.bq p0, String p1, ViewGroup p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.c.d(2911);
        if (com.google.android.finsky.m.a.q().e()) {
            this.c.b.p(this.a);
            this.b.setVisibility(0);
        }
        else {
            v0 = new com.google.android.finsky.at.k();
            v0.a(2131952603).d(2131952688);
            v0.a().a(this.c.A.B, "download_no_network_dialog");
        }
    }

}
