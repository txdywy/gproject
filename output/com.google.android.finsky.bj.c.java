package com.google.android.finsky.bj;

import android.app.Activity;
import com.google.android.finsky.accounts.c;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.b;

public final class com.google.android.finsky.bj.c implements Runnable
{

    public final String a;
    public final Activity b;
    public final com.google.android.finsky.bj.b c;

    c(com.google.android.finsky.bj.b p0, String p1, Activity p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        v0 = new GoogleHelp(this.a);
        v0.c = this.c.b.cY();
        v0.q = com.google.android.finsky.bj.b.a;
        new com.google.android.gms.googlehelp.b(this.b).a(v0.a(com.google.android.finsky.bj.b.a(this.b), this.b.getCacheDir()).a());
    }

}
