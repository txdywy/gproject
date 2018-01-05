package com.google.android.finsky.billing.promptforfop;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.profile.t;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.promptforfop.a extends com.google.android.finsky.billing.common.h implements com.google.android.finsky.billing.promptforfop.e
{

    public byte[] C;
    public Account n;

    a() {
        com.google.android.finsky.billing.common.h();
    }

    public static void a(Account p0, byte[] p1, Intent p2) {
        p2.putExtra("PromptForFopBaseActivity.account", p0);
        com.google.android.finsky.billing.promptforfop.a.a(p2, p0.name);
        p2.putExtra("PromptForFopBaseActivity.server_logs_cookie", p1);
    }

    protected abstract void a(int p0, int p1);

    protected abstract int h();

    protected abstract Fragment i();

    protected abstract int j();

    protected abstract int k();

    protected abstract int l();

    public final void n() {
        com.google.android.finsky.aa.a.V.b(this.n.name).a(Boolean.valueOf(1));
        this.a(2131953140, 1005);
    }

    public final void o() {
        this.E.a(new com.google.android.finsky.d.c(this.j()).a(this.C));
        com.google.android.finsky.billing.profile.t.a(this.n.name);
        this.setResult(-1);
        this.finish();
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        v0 = com.google.android.finsky.m.a.bK();
        if (v0.b()) {
            v0.f();
            this.finish();
        }
        else {
            this.setContentView(this.h());
            this.n = (Account)this.getIntent().getParcelableExtra("PromptForFopBaseActivity.account");
            if (this.n == 0)
                this.n = com.google.android.finsky.m.a.U().b(this.B);
            this.C = this.getIntent().getByteArrayExtra("PromptForFopBaseActivity.server_logs_cookie");
            if (p0 == 0) {
                v1 = com.google.android.finsky.aa.a.U.b(this.n.name);
                v1.a(Integer.valueOf(((Integer)v1.a()).intValue() + 1));
            }
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.H_().a("PromptForFopBaseActivity.fragment") == 0)
            this.H_().a().a(2131755313, this.i(), "PromptForFopBaseActivity.fragment").c();
    }

    public final void p() {
        this.E.a(new com.google.android.finsky.d.c(this.k()).a(this.C));
        this.a(2131953138, 1004);
    }

    public final void q() {
        this.E.a(new com.google.android.finsky.d.c(this.l()).a(this.C));
        com.google.android.finsky.aa.a.Q.b(this.n.name).c();
        v2 = new Object[1];
        v2[0] = FinskyLog.a(this.n.name);
        FinskyLog.a("Invalidated has_fop cache. (account=%s)", v2);
        com.google.android.finsky.billing.profile.t.a(this.n.name);
        this.a(2131953140, 1003);
    }

}
