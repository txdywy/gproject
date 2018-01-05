package com.google.android.finsky.activities;

import android.content.RestrictionsManager;
import android.os.Build$VERSION;
import android.support.v4.app.u;
import com.google.android.finsky.as.b;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.br.b;
import com.google.android.finsky.m;

public final class com.google.android.finsky.activities.o implements com.google.android.finsky.as.c
{

    public final boolean a;
    public final com.google.android.finsky.activities.b b;

    o(com.google.android.finsky.activities.b p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(boolean p0) {
        if (p0 != 0) {
            if (com.google.android.finsky.m.a.dj().a(12603770) && Build$VERSION.SDK_INT >= 21) {
                if (!((RestrictionsManager)this.b.getSystemService("restrictions")).hasRestrictionsProvider()) {
                    this.b.startActivity(com.google.android.finsky.m.a.bo().c(this.b));
                    this.b.finish();
                }
                else {
                    v0 = com.google.android.finsky.m.a.Q().a(this.b);
                    if (v0 != 0)
                        this.b.startActivityForResult(v0, 24);
                    else
                        this.b.f(this.a);
                }
            }
            else {
                this.b.startActivity(com.google.android.finsky.m.a.bo().c(this.b));
                this.b.finish();
            }
        }
        else
            this.b.f(this.a);
    }

}
