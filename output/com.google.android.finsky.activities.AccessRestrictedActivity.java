package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.p;
import android.support.v4.app.u;
import com.google.android.finsky.at.k;
import com.google.android.finsky.d.a;
import com.google.android.finsky.m;

protected class AccessRestrictedActivity extends android.support.v4.app.u implements com.google.android.finsky.at.m
{

    public final com.google.android.finsky.d.a n;

    AccessRestrictedActivity() {
        android.support.v4.app.u();
        this.n = com.google.android.finsky.m.a.aR();
    }

    public final void a(int p0, Bundle p1) {
        this.finish();
    }

    public final void b(int p0, Bundle p1) {
        this.finish();
    }

    public final void f_(int p0) {
    }

    protected void onResume() {
        super.onResume();
        v6 = new com.google.android.finsky.at.k();
        v6.a(this.getIntent().getIntExtra("AccessRestrictedActivity.messageId", 2131952437)).d(2131952688).a(1).a(308, 0, -1, -1, this.n.a(0));
        v6.a().a(this.H_(), "access_restricted_dialog");
    }

}
