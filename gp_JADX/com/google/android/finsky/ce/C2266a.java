package com.google.android.finsky.ce;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.support.v4.p034e.C0286a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.FinskyLog;

public final class C2266a {
    public static final boolean f11248a = (VERSION.SDK_INT >= 16);
    public final ConnectivityManager f11249b;
    public final C1461c f11250c;
    public final C1503a f11251d;
    public final long f11252e;
    public final long f11253f;

    public C2266a(Context context, C1461c c1461c, C1503a c1503a) {
        this.f11249b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f11250c = c1461c;
        this.f11251d = c1503a;
        this.f11253f = C2266a.m11717a(context.getContentResolver());
        this.f11252e = Math.min(C2266a.m11718b(context.getContentResolver()), this.f11253f);
    }

    @Deprecated
    public final boolean m11719a() {
        if (this.f11251d.f8182f) {
            return false;
        }
        if (this.f11251d.f8183g) {
            FinskyLog.m21659a("Wear network status: has network %s, unmetered %s", Boolean.valueOf(m11723e()), Boolean.valueOf(m11721c()));
            if (m11721c()) {
                return false;
            }
            return true;
        } else if (m11724f()) {
            return false;
        } else {
            NetworkInfo networkInfo = this.f11249b.getNetworkInfo(1);
            if (networkInfo == null || !networkInfo.isConnected()) {
                return true;
            }
            return false;
        }
    }

    public final boolean m11720b() {
        if (this.f11251d.f8183g) {
            FinskyLog.m21659a("Wear network status: has network %s, unmetered %s", Boolean.valueOf(m11723e()), Boolean.valueOf(m11721c()));
            return m11721c();
        }
        NetworkInfo networkInfo = this.f11249b.getNetworkInfo(1);
        return networkInfo != null && networkInfo.isConnected();
    }

    public final boolean m11721c() {
        if (m11724f()) {
            return true;
        }
        if (!m11723e() || C0286a.m1605a(this.f11249b)) {
            return false;
        }
        return true;
    }

    public final boolean m11722d() {
        if (this.f11249b.getNetworkInfo(0) != null) {
            return true;
        }
        return false;
    }

    public final boolean m11723e() {
        NetworkInfo activeNetworkInfo = this.f11249b.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private static long m11717a(ContentResolver contentResolver) {
        try {
            long j = Secure.getLong(contentResolver, "download_manager_max_bytes_over_mobile");
            if (j > 0 && j < ((Long) C0955b.aW.m28964b()).longValue()) {
                return j;
            }
        } catch (SettingNotFoundException e) {
        }
        return ((Long) C0955b.aW.m28964b()).longValue();
    }

    private static long m11718b(ContentResolver contentResolver) {
        try {
            long j = Secure.getLong(contentResolver, "download_manager_recommended_max_bytes_over_mobile");
            if (j > 0 && j < ((Long) C0955b.aV.m28964b()).longValue()) {
                return j;
            }
        } catch (SettingNotFoundException e) {
        }
        return ((Long) C0955b.aV.m28964b()).longValue();
    }

    public final boolean m11724f() {
        if (!this.f11250c.dj().mo2294a(12629326)) {
            return false;
        }
        NetworkInfo activeNetworkInfo = this.f11249b.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 9) {
            return true;
        }
        return false;
    }
}
