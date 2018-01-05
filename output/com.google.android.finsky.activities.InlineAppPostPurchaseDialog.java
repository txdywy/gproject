package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import com.google.android.finsky.a.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.d;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.notification.b;
import com.google.android.finsky.v.b;

public final class InlineAppPostPurchaseDialog extends com.google.android.finsky.activities.b implements com.google.android.finsky.pagesystem.e
{

    public final com.google.android.finsky.notification.b G;
    public com.google.android.finsky.m H;
    public com.google.android.finsky.activities.ef I;
    public Document J;
    public com.google.android.finsky.navigationmanager.a K;
    public boolean L;
    public final com.google.android.finsky.d.a t;

    InlineAppPostPurchaseDialog() {
        com.google.android.finsky.activities.b();
        this.t = com.google.android.finsky.m.a.aR();
        this.G = new com.google.android.finsky.activities.ee(this);
    }

    public final com.google.android.finsky.v.b A() {
        return 0;
    }

    public final void a(int p0, int p1, int p2, boolean p3) {
    }

    public final void a(int p0, int p1, boolean p2) {
    }

    public final void a(int p0, boolean p1) {
    }

    public final void a(String p0, String p1, com.google.android.finsky.d.w p2) {
    }

    public final void a_(com.google.android.finsky.d.w p0) {
    }

    public final void c(int p0) {
    }

    public final void c(String p0) {
    }

    public final void d(String p0) {
    }

    public final com.google.android.finsky.a.c l() {
        return 0;
    }

    public final void m() {
        this.finish();
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        if (p0 == 100) {
            if (p1 != -1) {
                this.startActivity((Intent)this.getIntent().getParcelableExtra("relaunchInitialDialogIntent"));
                this.finish();
            }
        }
        else
            super.onActivityResult(p0, p1, p2);
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.L = com.google.android.finsky.m.a.dj().a(12641721);
        v1 = this.getIntent();
        this.J = (Document)v1.getParcelableExtra("document");
        this.setContentView(2130968996);
        this.H = com.google.android.finsky.m.a;
        this.K = this.H.k().b(this);
        v2 = this.H_();
        this.I = (com.google.android.finsky.activities.ef)v2.a(2131755313);
        if (this.I == 0) {
            this.C = this.t.a(p0, v1);
            this.I = com.google.android.finsky.activities.ef.a(this.H, this.J, this.H.bt().a(this.J.a.c).a(this.H.cZ()), this.C, (Intent)v1.getParcelableExtra("relaunchInitialDialogIntent"));
            v0 = v2.a();
            v0.a(2131755313, this.I);
            v0.c();
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.L != 0)
            com.google.android.finsky.m.a.r().b(this.G);
    }

    protected void onResume() {
        super.onResume();
        if (this.L != 0 && this.L != 0)
            com.google.android.finsky.m.a.r().a(this.G);
    }

    public final com.google.android.finsky.navigationmanager.a y_() {
        return this.K;
    }

    public final void z() {
    }

}
