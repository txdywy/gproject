package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo$DetailedState;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.support.v4.os.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.at.e;
import com.google.android.finsky.at.k;
import com.google.android.finsky.d.a;
import com.google.android.finsky.hygiene.v;
import com.google.android.finsky.m;
import com.google.android.play.utils.b.a;

protected final class com.google.android.finsky.activities.r extends com.google.android.finsky.at.e
{

    public static final com.google.android.finsky.d.a af;
    public com.google.android.finsky.activities.s ag;

    static {
        com.google.android.finsky.activities.r.af = com.google.android.finsky.m.a.aR();
    }

    r() {
        com.google.android.finsky.at.e();
    }

    public static void a(android.support.v4.app.ab p0) {
        v0 = p0.a("bg_data_dialog");
        if (v0 != 0)
            ((android.support.v4.app.p)v0).a(0);
    }

    public static void a(android.support.v4.app.ab p0, Activity p1) {
        if (p0.a("bg_data_dialog") == 0) {
            v6 = new com.google.android.finsky.activities.r();
            if (p1 instanceof com.google.android.finsky.activities.s)
                v6.ag = (com.google.android.finsky.activities.s)p1;
            v4 = new Object[1];
            v4[0] = com.google.android.finsky.aa.b.ab.b();
            new com.google.android.finsky.at.k().c(2131951768).e(2131951767).b(p1.getString(2131951766, v4)).a(0).a(320, 0, -1, -1, com.google.android.finsky.activities.r.af.a(0)).a(v6);
            v6.a(p0, "bg_data_dialog");
        }
    }

    public static boolean b(Context p0) {
        if (android.support.v4.os.a.a())
            v0 = 0;
        else {
            v2 = ((ConnectivityManager)p0.getSystemService("connectivity")).getAllNetworkInfo();
            v0 = 0;
            while (v0 < v2.length) {
                if (v2[v0] != 0) {
                    if (v2[v0].getDetailedState() == NetworkInfo$DetailedState.BLOCKED) {
                        v0 = com.google.android.finsky.m.a.aW().h();
                        return v0;
                    }
                }
                v0 = v0 + 1;
            }
            v0 = 0;
        }
        return v0;
    }

    protected final void W() {
        super.W();
        if (this.ag != 0)
            this.ag.o();
    }

}
