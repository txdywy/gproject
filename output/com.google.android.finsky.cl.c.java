package com.google.android.finsky.cl;

import a.a;
import android.content.Context;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.api.l;
import com.google.android.finsky.billing.common.d;
import com.google.android.finsky.br.a;
import com.google.android.finsky.installer.b.a.d;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.utils.i;
import com.google.android.finsky.z.d;
import com.google.android.finsky.z.e;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.l.a.a;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.cl.c implements com.google.android.finsky.installqueue.q
{

    public final Context a;
    public final a.a b;
    public final a.a c;
    public final a.a d;
    public final com.google.android.finsky.z.d e;

    c(Context p0, a.a p1, a.a p2, a.a p3, com.google.android.finsky.z.d p4) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
    }

    private final void a(InstallRequest p0, String p1, String p2) {
        ((com.google.android.finsky.notification.ab)this.c.a()).a(p0.a.c, 0, 0, p1, 2130903044, ((com.google.android.finsky.br.a)this.d.a()).a(p0.a.c, com.google.android.finsky.api.l.a(p0.a.c)), p2);
    }

    public final com.google.android.finsky.z.e a(com.google.android.finsky.installqueue.m p0) {
        v4 = TimeUnit.MILLISECONDS.toSeconds(com.google.android.finsky.utils.i.a()) + TimeUnit.MINUTES.toSeconds((long)((Integer)com.google.android.finsky.aa.b.ie.b()).intValue());
        this.b.a();
        v3 = com.google.android.finsky.cl.a.a();
        if (v3 == 0) {
            if (((Integer)com.google.android.finsky.billing.common.d.b.a()).intValue() == 4)
                com.google.android.finsky.billing.common.d.b.a(Integer.valueOf(1));
            v1 = new Object[1];
            v1[0] = p0.d.a.h;
            this.a(p0.d, this.a.getString(2131952683, v1), "err");
            v0 = this.e.a(0);
        }
        else {
            if (v3.e < v4) {
                v3.b = v3.b | 4;
                v3.e = v4;
            }
            if (v3.e - TimeUnit.MILLISECONDS.toSeconds(com.google.android.finsky.utils.i.a()) > TimeUnit.MINUTES.toSeconds((long)((Integer)com.google.android.finsky.aa.b.if.b()).intValue()))
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                v1 = new Object[1];
                v1[0] = p0.d.a.h;
                this.a(p0.d, this.a.getString(2131952684, v1), "progress");
            }
            this.b.a();
            v0 = this.e.a(com.google.android.finsky.cl.a.a(p0.d, v3));
        }
        return v0;
    }

}
