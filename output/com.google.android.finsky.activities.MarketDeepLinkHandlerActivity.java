package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.inlinedetails.f;
import com.google.android.finsky.inlinedetails.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;

protected final class MarketDeepLinkHandlerActivity extends InlineAppDetailsDialog implements com.google.android.finsky.inlinedetails.i
{

    public Intent X;
    public com.google.android.finsky.inlinedetails.j Y;
    public com.google.android.finsky.inlinedetails.f Z;
    public boolean aa;

    MarketDeepLinkHandlerActivity() {
        InlineAppDetailsDialog();
    }

    protected final void B() {
        if (com.google.android.finsky.m.a.dj().a(12629616))
            com.google.android.finsky.m.a.aP().a(this.C, 1722);
        super.B();
    }

    protected final boolean C() {
        com.google.android.finsky.m.a.aJ();
        com.google.android.finsky.m.a.G();
        this.Z = new com.google.android.finsky.inlinedetails.f(this, new com.google.android.finsky.activities.ej(this, com.google.android.finsky.m.a, com.google.android.finsky.m.a, com.google.android.finsky.m.a.bn(), com.google.android.finsky.m.a.I(), com.google.android.finsky.m.a.cx(), com.google.android.finsky.m.a.cW()), this, com.google.android.finsky.m.a, com.google.android.finsky.m.a.I(), com.google.android.finsky.m.a.Q(), com.google.android.finsky.m.a.O(), com.google.android.finsky.m.a.bK(), com.google.android.finsky.m.a.bo(), this.C);
        this.Z.a(this.S);
        return 1;
    }

    protected final void D() {
        if (this.x != 0) {
            this.aa = 1;
            FinskyLog.c("Activity state was saved; inline flow deferred.", new Object[0]);
        }
        else
            super.D();
    }

    protected final boolean E() {
        if (this.Y != 0 && this.Y.a != 0 && this.X != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final String F() {
        if (!this.E())
            v0 = 0;
        else
            v0 = this.X.getAction();
        return v0;
    }

    public final void a(com.google.android.finsky.inlinedetails.j p0) {
        this.Y = p0;
        this.X = p0.a();
        this.C.a(this.X);
        if (p0.a != 0) {
            this.J();
            this.D();
        }
        else {
            this.startActivity(this.X);
            this.finish();
        }
    }

    protected final String e(String p0) {
        if (!this.E())
            v0 = 0;
        else
            v0 = this.X.getStringExtra(p0);
        return v0;
    }

    protected final boolean f(String p0) {
        v0 = 0;
        if (this.E())
            v0 = this.X.getBooleanExtra(p0, 0);
        return v0;
    }

    protected final Bundle g(String p0) {
        if (!this.E())
            v0 = 0;
        else
            v0 = this.X.getBundleExtra(p0);
        return v0;
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        if (!this.Z.a(p0, p1))
            super.onActivityResult(p0, p1, p2);
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        if (p0 != 0 && p0.getBoolean("is_content_view_created"))
            this.H();
    }

    protected void onDestroy() {
        super.onDestroy();
        this.Z.a(this.Y);
    }

    public void onPostResume() {
        super.onPostResume();
        if (this.aa != 0) {
            this.aa = 0;
            FinskyLog.c("Continue deferred inline flow", new Object[0]);
            this.D();
        }
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putBoolean("is_content_view_created", this.G());
    }

    protected final com.google.android.finsky.d.w y() {
        return com.google.android.finsky.m.a.dd().a("deep_link");
    }

}
