package com.google.android.finsky.activities;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.activities.ey implements View$OnClickListener
{

    public final MainActivity a;

    ey(MainActivity p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        v0 = com.google.android.finsky.m.a.db();
        if (v0 == 0) {
            FinskyLog.a("No account, restarting activity after network error", new Object[0]);
            this.a.x();
        }
        else {
            v0 = com.google.android.finsky.m.a.U().b(v0);
            v2 = new Object[1];
            v2[0] = FinskyLog.a(v0.name);
            FinskyLog.a("b/5160617: Reinitialize account %s on retry button click", v2);
            this.a.a(v0, 0, 0, "toc_auth_error");
            this.a.D();
            this.a.t();
        }
    }

}
