package com.google.android.finsky.actionbuttons.layout;

import android.accounts.Account;
import android.view.View;
import com.google.android.finsky.api.c;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.a;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.layout.a implements View$OnClickListener
{

    public final Document a;
    public final Account b;
    public final com.google.android.finsky.d.ad c;
    public final com.google.android.finsky.navigationmanager.a d;
    public final com.google.android.finsky.api.c e;
    public final WishlistPlayActionButton f;

    a(WishlistPlayActionButton p0, Document p1, Account p2, com.google.android.finsky.d.ad p3, com.google.android.finsky.navigationmanager.a p4, com.google.android.finsky.api.c p5) {
        this.f = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
    }

    public final void onClick(View p0) {
        if (this.f.d.a(this.a, this.b))
            v0 = 205;
        else
            v0 = 204;
        v1 = this.c;
        if (v1 == 0)
            v1 = this.d.n();
        this.f.b.dc().a(v0, 0, v1);
        this.f.d.a(this.f, this.a, this.e);
    }

}
