package com.google.android.finsky.boothandler;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.hygiene.v;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.scheduler.ak;
import com.google.android.finsky.volley.e;
import com.google.android.finsky.w.a;
import com.google.android.play.utils.b.a;

public final class BootCompletedReceiver extends com.google.android.finsky.w.a
{

    public com.google.android.finsky.accounts.c a;
    public com.google.android.finsky.ba.c b;
    public com.google.android.finsky.hygiene.v c;
    public com.google.android.finsky.scheduler.ak d;
    public com.google.android.finsky.volley.e e;

    BootCompletedReceiver() {
        com.google.android.finsky.w.a();
    }

    private final void b() {
        this.e.a(new com.google.android.finsky.boothandler.a(this), "device_rebooted");
    }

    public final void a() {
        ((com.google.android.finsky.boothandler.b)com.google.android.finsky.providers.d.a(com.google.android.finsky.boothandler.b)).a(this);
    }

    public final void a(Context p0, Intent p1) {
        if (!this.b.dj().a(12634957))
            this.d.a();
        v0 = this.a.cY();
        if (v0 == 0) {
            if (((Boolean)com.google.android.finsky.aa.b.aA.b()).booleanValue())
                this.b();
        }
        else if (this.b.j(v0.name).a(12629845) && !((Boolean)com.google.android.finsky.aa.b.io.b()).booleanValue())
            this.c.d();
        else
            this.b();
    }

}
