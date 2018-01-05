package com.google.android.finsky.bc;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.support.v4.a.a.f;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.m;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.pagesystem.b;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.bc.v extends com.google.android.finsky.bc.p implements View$OnClickListener, com.android.volley.w, com.google.android.finsky.d.ad
{

    public final com.google.wireless.android.a.a.a.a.ce ah;
    public View ai;
    public TextView aj;
    public View ak;
    public com.google.android.finsky.bc.k al;

    v() {
        com.google.android.finsky.bc.p();
        this.ah = com.google.android.finsky.d.j.a(this.ap());
    }

    protected final int Z() {
        return 2130968847;
    }

    public View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = super.a(p0, p1, p2);
        this.ai = v1.findViewById(2131755791);
        this.ai.setOnClickListener(this);
        this.ai.setBackgroundColor(android.support.v4.a.a.f.b(v1.getResources(), this.ag.e().c, 0));
        this.aj = (TextView)v1.findViewById(2131755792);
        this.aj.setText(this.c(2131951948).toUpperCase(this.i().getConfiguration().locale));
        this.ak = v1.findViewById(2131755796);
        this.ak.setVisibility(8);
        v0 = (ViewGroup)v1.findViewById(2131755793);
        v0.addView(p0.inflate(this.aj(), v0, 0));
        return v1;
    }

    protected final void a(View p0, int p1, int p2) {
        ((TextView)p0.findViewById(p1)).setText(this.ag.a(p2));
    }

    public final void a(VolleyError p0) {
        this.ai.setEnabled(1);
        this.ak.setVisibility(8);
        if (this.bt != 0)
            Snackbar.a(this.bt, com.google.android.finsky.api.m.a(this.bn, p0), 0).a();
    }

    protected abstract int aj();

    protected abstract void ao();

    protected abstract int ap();

    public final void b(Bundle p0) {
        super.b(p0);
        if (p0 == 0)
            this.bw.a(new com.google.android.finsky.d.p().b(this));
    }

    public void d() {
        super.d();
        this.aj = 0;
        this.ak = 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.ah;
    }

    public void onClick(View p0) {
        this.aj.setEnabled(0);
        this.ak.setVisibility(0);
        this.ao();
    }

}
