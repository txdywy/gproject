package com.google.android.finsky.billing.b;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.view.View;
import com.google.android.finsky.billing.common.i;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.wallet.c.b.a;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.instrumentmanager.c.a;
import com.google.android.wallet.nfc.b;
import com.google.wireless.android.finsky.dfe.c.a.co;
import com.google.wireless.android.finsky.dfe.c.a.v;

public final class com.google.android.finsky.billing.b.r extends com.google.android.finsky.billing.b.q
{

    public final Account a;
    public final Fragment b;

    r(Account p0, Fragment p1) {
        com.google.android.finsky.billing.b.q();
        this.a = p0;
        this.b = p1;
    }

    public final View a(com.google.wireless.android.finsky.dfe.c.a.v p0, com.google.android.finsky.d.w p1) {
        v0 = this.b.j().a("PhoneOrchestrationUiHost.fragmentTag");
        if (v0 != 0)
            return v0.R;
        switch (p0.c) {
            case 1:
                v0 = 2132017932;
                break;
            case 2:
                v0 = 2132017937;
                break;
            case 3:
                v0 = 2132017934;
                break;
            case 4:
                v0 = 2132017938;
                break;
            case 5:
                v0 = 2132017936;
                break;
            case 6:
                v0 = 2132017933;
                break;
            case 7:
                v0 = 2132017935;
                break;
            default:
                FinskyLog.c("Unknown theme specified.", new Object[0]);
                v0 = 2132017935;
                break;
        }
        v0 = new com.google.android.wallet.common.pub.i(v0).a();
        if (p0.b == 1)
            v0 = com.google.android.wallet.instrumentmanager.c.a.a(this.a, p0.e, p0.f, v0, Bundle.EMPTY);
        else {
            if (p0.b != 2)
                throw new IllegalArgumentException("Unknown Orchestration FragmentType");
            v0 = com.google.android.wallet.c.b.a.a(this.a, com.google.android.finsky.billing.common.i.a(p0.h), v0, Bundle.EMPTY);
        }
        this.b.j().a().a(v0, "PhoneOrchestrationUiHost.fragmentTag").e();
        if (p0.k != 0)
            p1.a(new com.google.android.finsky.d.c(p0.k.b).a, 0);
        return v0.R;
    }

    public final void a() {
        v0 = this.b.j().a("PhoneOrchestrationUiHost.fragmentTag");
        if (v0 != 0)
            this.b.j().a().a(v0).c();
    }

    public final void a(Intent p0) {
        v0 = this.b.j().a("PhoneOrchestrationUiHost.fragmentTag");
        if (v0 instanceof com.google.android.wallet.nfc.b)
            com.google.android.wallet.common.pub.e.a((com.google.android.wallet.nfc.b)v0, p0);
    }

}
