package com.google.android.finsky.cm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.cm.j extends BroadcastReceiver
{

    public final String a;
    public final int b;
    public final com.google.android.finsky.cm.d c;
    public final com.google.android.finsky.cm.e d;

    j(com.google.android.finsky.cm.e p0, String p1, int p2, com.google.android.finsky.cm.d p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        BroadcastReceiver();
    }

    public final void onReceive(Context p0, Intent p1) {
        this.d.a.unregisterReceiver(this);
        v5 = p1.getIntExtra("android.content.pm.extra.STATUS", -2147483648);
        if (v5 == 0) {
            this.d.g.b(this.a);
            this.d.a(this.b, this.a);
            this.d.a(new com.google.android.finsky.cm.l(this.c));
        }
        else if (v5 == -1) {
            this.d.a(this.b, this.a);
            this.d.a(new com.google.android.finsky.cm.m(this.c));
        }
        else {
            this.d.a(this.b, this.a);
            if (v5 == -2147483648)
                v0 = 977;
            else
                v0 = -500 - v5;
            v6 = new Object[3];
            v6[0] = Integer.valueOf(v0);
            v6[1] = this.a;
            v6[2] = p1.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
            FinskyLog.d("Error %d while installing %s: %s", v6);
            this.d.a(new com.google.android.finsky.cm.n(this.c, v0));
        }
    }

}
