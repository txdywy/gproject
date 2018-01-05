package com.google.android.finsky.be;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.am.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.b;

public final class com.google.android.finsky.be.d implements View$OnClickListener
{

    public final Intent a;
    public final com.google.android.finsky.be.a b;

    d(com.google.android.finsky.be.a p0, Intent p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.ap = 1;
        this.b.bw.b(new com.google.android.finsky.d.d(this.b.as));
        this.b.f.a(this.b.bu, this.b.bw, this.a);
        if (com.google.android.finsky.m.a.dj().a(12631833)) {
            Snackbar.a(this.b.R, this.b.c(2131952036), 0).a();
            this.b.bp.a(this.b.k_, this.b.bw);
        }
        else
            this.b.aj();
    }

}
