package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.activities.cn implements View$OnClickListener
{

    public final Document a;
    public final Account b;
    public final com.google.android.finsky.activities.cm c;

    cn(com.google.android.finsky.activities.cm p0, Document p1, Account p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.c.d(224);
        if (!com.google.android.finsky.m.a.bn().a(this.c.B.getPackageManager(), this.a.a.f))
            this.c.z.b(this.a.a.f);
        else
            this.c.B.startActivity(com.google.android.finsky.m.a.bn().b(this.c.B, this.a, this.b.name));
    }

}
