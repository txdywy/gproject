package com.google.android.finsky.billing.addresschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.view.MenuItem;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.layout.actionbar.a;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.i;

protected class AddressChallengeActivity extends com.google.android.finsky.activities.b implements com.google.android.finsky.billing.addresschallenge.d
{

    public final com.google.android.finsky.navigationmanager.a G;
    public com.google.android.finsky.billing.addresschallenge.c H;
    public final com.google.android.finsky.d.a t;

    AddressChallengeActivity() {
        com.google.android.finsky.activities.b();
        this.G = com.google.android.finsky.m.a.k().c(this);
        this.t = com.google.android.finsky.m.a.aR();
    }

    public static Intent a(int p0, com.google.wireless.android.finsky.a.a.i p1, Bundle p2, com.google.android.finsky.d.w p3) {
        v0 = new Intent(com.google.android.finsky.m.a.b, AddressChallengeActivity);
        v0.putExtra("backend", p0);
        v0.putExtra("challenge", ParcelableProto.a(p1));
        v0.putExtra("extra_parameters", p2);
        p3.a().a(v0);
        return v0;
    }

    public final Fragment a(Bundle p0, String p1) {
        return this.H_().a(p0, p1);
    }

    public final void a(Bundle p0, String p1, Fragment p2) {
        this.H_().a(p0, p1, p2);
    }

    public final void a(boolean p0, Bundle p1) {
        if (p0 != 0) {
            this.setResult(0);
            this.finish();
        }
        else {
            v0 = new Intent();
            v0.putExtra("challenge_response", p1);
            this.setResult(-1, v0);
            this.finish();
        }
    }

    public final void b(Fragment p0) {
        v0 = this.H_().a();
        v0.a(2131755313, p0);
        v0.d();
    }

    public final void k() {
        this.setResult(0);
        this.finish();
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130968647);
        v0 = new com.google.android.finsky.layout.actionbar.a(this.G, this);
        v0.a(this.getIntent().getIntExtra("backend", 0), 0);
        v0.a(0, -1);
        this.H = new com.google.android.finsky.billing.addresschallenge.c(this, (com.google.wireless.android.finsky.a.a.i)ParcelableProto.a(this.getIntent(), "challenge"), this.getIntent().getBundleExtra("extra_parameters"), this.t.a(p0, this.getIntent()));
        if (p0 != 0) {
            if (p0.containsKey("address_widget")) {
                this.H.h = (com.google.android.finsky.billing.addresschallenge.e)this.H.b.a(p0, "address_widget");
                if (this.H.h != 0)
                    this.H.h.d = this.H;
            }
            this.H.g = this.H.a.a(p0, this.H.g);
        }
        else {
            v1 = this.H.d.getString("authAccount");
            v5 = new com.google.android.finsky.billing.addresschallenge.e();
            v6 = new Bundle();
            v6.putString("authAccount", v1);
            v6.putParcelable("address_challenge", ParcelableProto.a(this.H.c));
            this.H.g.b(v1).a(v6);
            v5.f(v6);
            v5.c = this.H.d.getBundle("AddressChallengeFlow.previousState");
            this.H.h = v5;
            this.H.h.d = this.H;
            this.H.b.b(this.H.h);
        }
    }

    public boolean onOptionsItemSelected(MenuItem p0) {
        v0 = 1;
        if (p0.getItemId() == 16908332)
            this.G.b(this.t.a(0), 1);
        else
            v0 = super.onOptionsItemSelected(p0);
        return v0;
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        if (this.H != 0) {
            if (this.H.h != 0)
                this.H.b.a(p0, "address_widget", this.H.h);
            this.H.g.a(p0);
        }
    }

}
