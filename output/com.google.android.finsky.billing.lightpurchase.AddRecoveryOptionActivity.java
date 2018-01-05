package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.u;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.c.a.ak;
import com.google.wireless.android.finsky.dfe.c.a.an;
import com.google.wireless.android.finsky.dfe.nano.gq;

protected class AddRecoveryOptionActivity extends com.google.android.finsky.billing.common.h implements View$OnClickListener
{

    public final com.google.android.finsky.dx.a n;
    public PlayActionButtonV2 o;
    public PlayActionButtonV2 p;
    public Account q;
    public String r;

    AddRecoveryOptionActivity() {
        com.google.android.finsky.billing.common.h();
        this.n = com.google.android.finsky.m.a.au();
    }

    private final void h() {
        v3 = this.n.h(this.q.name);
        if (v3 != 0)
            v3 = Math.min(v3.c + 1, this.n.i(this.q.name));
        else
            v3 = 1;
        v2 = new com.google.wireless.android.finsky.dfe.nano.gq();
        v2.f = new com.google.wireless.android.finsky.dfe.c.a.an();
        v5 = new com.google.wireless.android.finsky.dfe.c.a.ak();
        v5.a(0);
        v5.a(System.currentTimeMillis());
        v5.a(v3);
        v2.f.c = v5;
        this.n.a(this.q.name, v2, 11, 0, 0);
        this.setResult(0);
    }

    protected final int f() {
        return 6340;
    }

    protected void onActivityResult(int p0, int p1, Intent p2) {
        if (p0 != 1) {
            FinskyLog.e("The request code is not correct. This should never happen!", new Object[0]);
            this.finish();
        }
        if (p1 == 0)
            this.h();
        else {
            this.n.j(this.q.name);
            this.setResult(-1);
        }
        this.finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.h();
    }

    public void onClick(View p0) {
        if (p0 == this.o) {
            this.E.b(new com.google.android.finsky.d.d(this).a(6342));
            this.startActivityForResult(AuthenticatedWebViewActivity.a(this.q, this.r, (String)com.google.android.finsky.aa.b.da.b(), this.E), 1);
        }
        else if (p0 == this.p) {
            this.E.b(new com.google.android.finsky.d.d(this).a(6343));
            this.h();
            this.finish();
        }
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        v1 = this.getIntent();
        this.q = (Account)v1.getParcelableExtra("AddRecoveryOptionPromptDialog.account");
        this.r = v1.getStringExtra("AddRecoveryOptionPromptDialog.initialUrl");
        this.setContentView(2130968622);
        this.o = (PlayActionButtonV2)this.findViewById(2131755791);
        this.p = (PlayActionButtonV2)this.findViewById(2131755776);
    }

    protected void onResume() {
        super.onResume();
        com.google.android.finsky.bg.a.a(this, this.getString(2131952942), this.findViewById(2131755114), 0);
    }

    protected void onStart() {
        super.onStart();
        this.o.a(3, 2131951948, this);
        this.o.setVisibility(0);
        this.p.a(3, 2131953187, this);
        this.p.setVisibility(0);
        v2 = new Object[1];
        v2[0] = this.B;
        com.google.android.finsky.bg.ae.a((TextView)this.findViewById(2131755334), this.getString(2131952941, v2));
    }

}
