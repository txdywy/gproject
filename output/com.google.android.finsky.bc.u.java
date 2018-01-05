package com.google.android.finsky.bc;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.finsky.pagesystem.b;

public final class com.google.android.finsky.bc.u
{

    public y[] a;
    public int b;
    public Activity c;
    public com.google.android.finsky.bc.q d;
    public boolean e;
    public boolean f;

    u(com.google.android.finsky.bc.q p0) {
        this.d = p0;
    }

    public final void a() {
        v0 = new Intent();
        if (this.f != 0)
            v0.putExtra("family_created", 1);
        if (this.e != 0) {
            v1 = this.d.g();
            if (!TextUtils.isEmpty(v1))
                v0.putExtra("completionRedirectUrl", v1);
            this.c.setResult(-1, v0);
        }
        else
            this.c.setResult(0, v0);
        this.c.finish();
    }

    public final void a(Intent p0, int p1) {
        this.c.startActivityForResult(p0, p1);
    }

    public final void a(com.google.android.finsky.bc.p p0, boolean p1) {
        p0.ag = this.d;
        p0.a(((com.google.android.finsky.bc.s)this.c).n());
        ((com.google.android.finsky.bc.s)this.c).a(p0, p1);
    }

    public final void b() {
        this.b = this.b + 1;
        if (this.b >= this.a.length)
            this.a();
        else
            this.a[this.b].a();
    }

}
