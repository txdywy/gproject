package com.google.android.finsky.ce;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import android.provider.Settings$Secure;
import android.provider.Settings$SettingNotFoundException;
import android.support.v4.e.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.ce.a
{

    public static final boolean a;
    public final ConnectivityManager b;
    public final com.google.android.finsky.ba.c c;
    public final com.google.android.finsky.as.a d;
    public final long e;
    public final long f;

    static {
        if (Build$VERSION.SDK_INT >= 16)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.finsky.ce.a.a = v0;
    }

    a(Context p0, com.google.android.finsky.ba.c p1, com.google.android.finsky.as.a p2) {
        this.b = (ConnectivityManager)p0.getSystemService("connectivity");
        this.c = p1;
        this.d = p2;
        this.f = com.google.android.finsky.ce.a.a(p0.getContentResolver());
        this.e = Math.min(com.google.android.finsky.ce.a.b(p0.getContentResolver()), this.f);
    }

    private static long a(ContentResolver p0) {
        try {
            v2 = Settings$Secure.getLong(p0, "download_manager_max_bytes_over_mobile");
            if (v2 <= 0) {
                v0 = ((Long)com.google.android.finsky.aa.b.aW.b()).longValue();
                return v0;
            }
        }
        catch (Settings$SettingNotFoundException ex) {
            v0 = ((Long)com.google.android.finsky.aa.b.aW.b()).longValue();
            return v0;
        }
        if (v2 < ((Long)com.google.android.finsky.aa.b.aW.b()).longValue()) {
            v0 = v2;
            return v0;
        }
        v0 = ((Long)com.google.android.finsky.aa.b.aW.b()).longValue();
        return v0;
    }

    private static long b(ContentResolver p0) {
        try {
            v2 = Settings$Secure.getLong(p0, "download_manager_recommended_max_bytes_over_mobile");
            if (v2 <= 0) {
                v0 = ((Long)com.google.android.finsky.aa.b.aV.b()).longValue();
                return v0;
            }
        }
        catch (Settings$SettingNotFoundException ex) {
            v0 = ((Long)com.google.android.finsky.aa.b.aV.b()).longValue();
            return v0;
        }
        if (v2 < ((Long)com.google.android.finsky.aa.b.aV.b()).longValue()) {
            v0 = v2;
            return v0;
        }
        v0 = ((Long)com.google.android.finsky.aa.b.aV.b()).longValue();
        return v0;
    }

    public final boolean a() {
        v0 = 0;
        if (this.d.f == 0) {
            if (this.d.g != 0) {
                v2 = this.c();
                v4 = new Object[2];
                v4[0] = Boolean.valueOf(this.e());
                v4[1] = Boolean.valueOf(v2);
                FinskyLog.a("Wear network status: has network %s, unmetered %s", v4);
                if (v2 == 0)
                    v0 = 1;
            }
            else if (!this.f()) {
                v2 = this.b.getNetworkInfo(1);
                if (v2 == 0 || !v2.isConnected())
                    v0 = 1;
            }
        }
        return v0;
    }

    public final boolean b() {
        if (this.d.g != 0) {
            v0 = this.c();
            v4 = new Object[2];
            v4[0] = Boolean.valueOf(this.e());
            v4[1] = Boolean.valueOf(v0);
            FinskyLog.a("Wear network status: has network %s, unmetered %s", v4);
        }
        else {
            v0 = this.b.getNetworkInfo(1);
            if (v0 != 0 && v0.isConnected())
                v0 = 1;
            else
                v0 = 0;
        }
        return v0;
    }

    public final boolean c() {
        v0 = 1;
        if (!this.f() && ((!this.e()) || android.support.v4.e.a.a(this.b)))
            v0 = 0;
        return v0;
    }

    public final boolean d() {
        v0 = 0;
        if (this.b.getNetworkInfo(0) != 0)
            v0 = 1;
        return v0;
    }

    public final boolean e() {
        v0 = this.b.getActiveNetworkInfo();
        if (v0 != 0 && v0.isConnected())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean f() {
        v0 = 0;
        if (this.c.dj().a(12629326)) {
            v1 = this.b.getActiveNetworkInfo();
            if (v1 != 0 && v1.isConnected() && v1.getType() == 9)
                v0 = 1;
        }
        return v0;
    }

}
