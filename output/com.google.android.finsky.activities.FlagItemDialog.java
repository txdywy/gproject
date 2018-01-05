package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.finsky.a.c;
import com.google.android.finsky.at.b;
import com.google.android.finsky.d.w;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.actionbar.a;
import com.google.android.finsky.layout.actionbar.m;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.d;
import com.google.android.finsky.pagesystem.j;
import com.google.android.finsky.v.b;
import com.google.android.play.search.PlaySearchToolbar;

public final class FlagItemDialog extends com.google.android.finsky.activities.b implements com.google.android.finsky.pagesystem.e
{

    public com.google.android.finsky.navigationmanager.a G;
    public com.google.android.finsky.layout.actionbar.a H;

    FlagItemDialog() {
        com.google.android.finsky.activities.b();
        this.G = com.google.android.finsky.m.a.k().c(this);
    }

    public final com.google.android.finsky.v.b A() {
        return 0;
    }

    public final void a(int p0, int p1, int p2, boolean p3) {
    }

    public final void a(int p0, int p1, boolean p2) {
        this.H.a(p0, p2);
        this.H.a(p1);
    }

    public final void a(int p0, boolean p1) {
        this.H.a(p0, p1);
    }

    public final void a(String p0, String p1, com.google.android.finsky.d.w p2) {
        com.google.android.finsky.at.b.a(this.H_(), 0, p0, p1, p2, 0);
    }

    public final void a_(com.google.android.finsky.d.w p0) {
        this.H.a(p0);
    }

    public final void c(int p0) {
        this.H.a(1, p0);
    }

    public final void c(String p0) {
        this.H.a(p0);
    }

    public final void d(String p0) {
    }

    public final com.google.android.finsky.a.c l() {
        return 0;
    }

    public final void m() {
        this.finish();
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130968781);
        v0 = (Toolbar)this.findViewById(2131755286);
        if (v0 != 0) {
            if (v0 instanceof FinskySearchToolbar)
                ((FinskySearchToolbar)v0).a(new com.google.android.finsky.layout.actionbar.m(this));
            this.a(v0);
        }
        this.H = new com.google.android.finsky.layout.actionbar.a(this.G, this);
        if (this.H_().a(2131755313) == 0) {
            v1 = new com.google.android.finsky.activities.de();
            v1.a(com.google.android.finsky.m.a.dn(), this.getIntent().getStringExtra("url"));
            v0 = this.H_().a();
            v0.a(2131755313, v1);
            v0.c();
        }
    }

    public boolean onOptionsItemSelected(MenuItem p0) {
        if (p0.getItemId() == 16908332) {
            this.finish();
            v0 = 1;
        }
        else
            v0 = super.onOptionsItemSelected(p0);
        return v0;
    }

    public final com.google.android.finsky.navigationmanager.a y_() {
        return 0;
    }

    public final void z() {
        this.H.a(0, -1);
    }

}
