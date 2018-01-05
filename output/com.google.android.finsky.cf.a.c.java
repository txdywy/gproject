package com.google.android.finsky.cf.a;

import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.view.View;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.cf.b;

public final class com.google.android.finsky.cf.a.c implements View$OnClickListener
{

    public final com.google.android.finsky.aa.n a;
    public final int b;
    public final com.google.android.finsky.cf.a.b c;

    c(com.google.android.finsky.cf.a.b p0, com.google.android.finsky.aa.n p1, int p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        if (this.c.c.f != 0)
            this.c.c.f.b();
        this.c.c.g.a(3);
        this.a.a(Boolean.TRUE);
        this.c.c.e.a();
        this.c.c.g = Snackbar.a(this.c.c.c, 2131952610, this.b);
        this.c.c.g.a();
    }

}
