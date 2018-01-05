package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.lightpurchase.a.g;
import com.google.android.finsky.d.w;

protected class AgeVerificationActivity extends com.google.android.finsky.billing.common.h implements com.google.android.finsky.billing.lightpurchase.a.h
{

    AgeVerificationActivity() {
        com.google.android.finsky.billing.common.h();
    }

    public final void b(boolean p0) {
        if (p0 != 0)
            v0 = -1;
        else
            v0 = 0;
        this.setResult(v0);
        this.finish();
    }

    protected final int f() {
        return 1400;
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(this.getLayoutInflater().inflate(2130968629, 0));
        if (this.H_().a("AgeVerificationActivity.host_fragment") == 0) {
            v4 = new com.google.android.finsky.billing.lightpurchase.a.g();
            v5 = new Bundle();
            v5.putString("authAccount", this.B);
            v5.putInt("AgeVerificationHostFragment.backend", this.getIntent().getIntExtra("AgeVerificationActivity.backend", -1));
            v5.putString("AgeVerificationHostFragment.docid_str", this.getIntent().getStringExtra("AgeVerificationActivity.docid_str"));
            this.E.b(this.B).a(v5);
            v4.f(v5);
            v0 = this.H_().a();
            v0.a(2131755338, v4, "AgeVerificationActivity.host_fragment");
            v0.c();
        }
    }

}
