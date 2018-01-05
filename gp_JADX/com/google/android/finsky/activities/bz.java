package com.google.android.finsky.activities;

import android.support.v4.app.ab;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1508k;
import com.squareup.leakcanary.C7582R;

final class bz implements OnClickListener {
    public final /* synthetic */ bq f6587a;

    bz(bq bqVar) {
        this.f6587a = bqVar;
    }

    public final void onClick(View view) {
        ab abVar = this.f6587a.A.f730B;
        if (abVar.mo283a("deactivate_dialog") == null) {
            this.f6587a.m6350d(216);
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.deactivate_device_admin_msg).m8860d((int) C7582R.string.ok);
            c1508k.mo2272a().m625a(abVar, "deactivate_dialog");
        }
    }
}
