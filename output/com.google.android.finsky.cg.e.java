package com.google.android.finsky.cg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.s;
import com.google.android.gms.herrevad.c;
import com.google.android.gms.herrevad.d;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.cg.e extends BroadcastReceiver
{

    public static final List a;
    public static final Object b;
    public static NetworkInfo c;
    public com.google.android.finsky.cg.d d;

    static {
        com.google.android.finsky.cg.e.a = new ArrayList();
        com.google.android.finsky.cg.e.b = new Object();
    }

    e() {
        BroadcastReceiver();
        ((com.google.android.finsky.cg.h)com.google.android.finsky.providers.d.a(com.google.android.finsky.cg.h)).a(this);
    }

    public static NetworkInfo a(Context p0) {
        enter com.google.android.finsky.cg.e.b;
        try {
            if (com.google.android.finsky.cg.e.c == 0)
                com.google.android.finsky.cg.e.b(p0);
            exit com.google.android.finsky.cg.e.b;
            return com.google.android.finsky.cg.e.c;
            exit com.google.android.finsky.cg.e.b;
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.cg.e.b;
            throw ex;
        }
    }

    public static void a() {
        enter com.google.android.finsky.cg.e.b;
        try {
            com.google.android.finsky.cg.e.c = 0;
            exit com.google.android.finsky.cg.e.b;
            return;
            exit com.google.android.finsky.cg.e.b;
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.cg.e.b;
            throw ex;
        }
    }

    private static void b(Context p0) {
        enter com.google.android.finsky.cg.e.b;
        try {
            com.google.android.finsky.cg.e.c = ((ConnectivityManager)p0.getSystemService("connectivity")).getActiveNetworkInfo();
            exit com.google.android.finsky.cg.e.b;
            return;
            exit com.google.android.finsky.cg.e.b;
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.cg.e.b;
            throw ex;
        }
    }

    public final void onReceive(Context p0, Intent p1) {
  0:    v0 = 1;
  2:    com.google.android.finsky.cg.e.b(p0);
  7:    if (this.d == 0) {
 76:        v1 = com.google.android.finsky.cg.e.a.size() - 1;
 77:        while (v1 >= 0) {
 87:            ((com.google.android.finsky.cg.f)com.google.android.finsky.cg.e.a.get(v1)).a(p0);
 92:            v1 = v1 - 1;
            }
 93:        return;
        }
 11:    com.google.android.finsky.utils.bb.a();
 23:    v2 = 0;
 24:    if (v2 >= com.google.android.finsky.cg.d.d.length) goto 97;
 32:    if (!this.d.b.dj().a(com.google.android.finsky.cg.d.d[v2])) goto 94;
 34:    v2 = 1;
 35:    if (v2 != 0) goto 104;
 48:    v2 = 0;
 49:    if (v2 >= com.google.android.finsky.cg.a.a.length) goto 102;
 57:    if (!this.d.e.e.dj().a(com.google.android.finsky.cg.a.a[v2])) goto 99;
 59:    if (v0 != 0) goto 104;
 65:    FinskyLog.a("Network quality prediction is disabled", new Object[0]);
 76:    v1 = com.google.android.finsky.cg.e.a.size() - 1;
 77:    while (v1 >= 0) {
 87:        ((com.google.android.finsky.cg.f)com.google.android.finsky.cg.e.a.get(v1)).a(p0);
 92:        v1 = v1 - 1;
        }
 93:    return;
 94:    v2 = v2 + 1;
 96:    goto 24;
 97:    v2 = 0;
 98:    goto 35;
 99:    v2 = v2 + 1;
101:    goto 49;
102:    v0 = 0;
103:    goto 59;
106:    if (this.d.c == 0)
127:        this.d.c = new com.google.android.gms.common.api.p(p0.getApplicationContext()).a(com.google.android.gms.herrevad.c.c).b();
131:    this.d.c.e();
142:    com.google.android.gms.herrevad.c.d.a(this.d.c).a(this.d);
145:    goto 68;
    }

}
