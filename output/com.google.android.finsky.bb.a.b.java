package com.google.android.finsky.bb.a;

import android.content.Intent;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.bb.a.b implements Runnable
{

    public final Intent a;
    public final com.google.android.finsky.navigationmanager.a b;
    public final com.google.android.finsky.d.w c;
    public final com.google.android.finsky.bb.a.a d;

    b(com.google.android.finsky.bb.a.a p0, Intent p1, com.google.android.finsky.navigationmanager.a p2, com.google.android.finsky.d.w p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        if (this.a == 0)
            v0 = 0;
        else
            v0 = this.a.getStringExtra("completionRedirectUrl");
        if (v0 != 0)
            this.b.b(v0, this.c);
        else if (this.b.y())
            this.b.a(this.d.d.dn(), this.c);
    }

}
