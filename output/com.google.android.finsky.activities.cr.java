package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.br.a;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.activities.cr implements View$OnClickListener
{

    public final Account a;
    public final com.google.android.finsky.activities.cq b;

    cr(com.google.android.finsky.activities.cq p0, Account p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.d(286);
        v1 = com.google.android.finsky.m.a.bn();
        if (!v1.a(this.b.B.getPackageManager()))
            this.b.z.b(2);
        else {
            com.google.android.finsky.aa.b.ea.b();
            if (this.b.a != 0)
                v0 = (String)com.google.android.finsky.aa.b.ec.b();
            else
                v0 = v1.a();
            this.b.B.startActivity(v1.a(2, v0, this.a.name));
        }
    }

}
