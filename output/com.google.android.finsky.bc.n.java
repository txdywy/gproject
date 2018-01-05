package com.google.android.finsky.bc;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.a.a.f;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;

public final class com.google.android.finsky.bc.n extends com.google.android.finsky.bc.v
{

    public com.google.android.finsky.bg.l a;
    public boolean c;
    public View f;
    public TextView h;

    n() {
        com.google.android.finsky.bc.v();
        this.c = 0;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = super.a(p0, p1, p2);
        v2 = this.ag.f();
        if (v2 != 0)
            this.a.a((FifeImageView)v1.findViewById(2131755817), v2.f, v2.i);
        this.a(v1, 2131755818, 18);
        this.a(v1, 2131755819, 19);
        this.f = v1.findViewById(2131755794);
        this.f.setBackgroundColor(android.support.v4.a.a.f.b(v1.getResources(), this.ag.e().c, 0));
        this.h = (TextView)v1.findViewById(2131755795);
        this.h.setText(this.c(2131953277).toUpperCase(this.i().getConfiguration().locale));
        this.f.setOnClickListener(this);
        return v1;
    }

    public final void a(int p0, int p1, Intent p2) {
        if (p0 == 1) {
            if (p1 == -1) {
                this.ag.d().e = 1;
                this.ag.d().b();
            }
            else if (p1 == 0) {
                if (this.c == 0) {
                    this.c = 1;
                    this.f.setVisibility(0);
                    this.a(this.R, 2131755819, 21);
                }
                this.ak.setVisibility(8);
            }
        }
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.bc.t)com.google.android.finsky.providers.d.a(com.google.android.finsky.bc.t)).a(this);
        super.a(p0);
    }

    protected final int aj() {
        return 2130968855;
    }

    protected final void ao() {
    }

    protected final int ap() {
        return 5230;
    }

    public final void onClick(View p0) {
        this.aj.setEnabled(0);
        this.ak.setVisibility(0);
        if (this.c != 0 && p0 == this.ai) {
            this.h.setEnabled(0);
            this.ag.d().b();
        }
        else
            this.startActivityForResult((Intent)this.h().getIntent().getParcelableExtra("purchase_intent"), 1);
    }

}
