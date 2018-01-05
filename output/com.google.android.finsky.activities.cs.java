package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.activities.cs implements View$OnClickListener
{

    public final Account a;
    public final com.google.android.finsky.activities.cq b;

    cs(com.google.android.finsky.activities.cq p0, Account p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        v0 = com.google.android.finsky.m.a.bn();
        this.b.d(285);
        if (!v0.a(this.b.B.getPackageManager(), this.b.D.a.f))
            this.b.z.b(this.b.D.a.f);
        else {
            v0 = v0.a(this.b.B, this.b.D, this.a.name);
            v0.addFlags(268435456);
            this.b.B.startActivity(v0);
        }
    }

}
