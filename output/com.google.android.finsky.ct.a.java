package com.google.android.finsky.ct;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.ads.adshield.a;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.tm;
import com.google.android.play.utils.b.a;
import java.util.Locale;

final synchronized class com.google.android.finsky.ct.a
{

    public com.google.android.gms.ads.adshield.a a;

    a() {
    }

    public final String a(Context p0) {
        v0 = 0;
        if (this.a()) {
            try {
                v0 = this.a.a.a(com.google.android.gms.dynamic.d.a(p0), 0);
            }
            catch (RemoteException ex) {
                v3 = new Object[1];
                v3[0] = ex;
                FinskyLog.d("Error accessing AdShield: %s", v3);
            }
        }
        return v0;
    }

    public final String a(Context p0, String p1) {
        if (this.a()) {
            try {
                v1 = String.valueOf(com.google.android.finsky.aa.b.a().b());
                v0 = this.a.a.a(com.google.android.gms.dynamic.d.a(p0), (String.valueOf(v1).length() + String.valueOf(p1).length()) + v1 + p1);
            }
            catch (RemoteException ex) {
                v2 = new Object[1];
                v2[0] = ex;
                FinskyLog.d("Error accessing AdShield: %s", v2);
                v0 = 0;
            }
            return v0;
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.d("Error accessing AdShield: %s", v2);
        }
        v0 = 0;
        return v0;
    }

    public final void a(Context p0, Runnable p1) {
        if (this.a()) {
            if (p1 != 0)
                p1.run();
        }
        else
            com.google.android.finsky.utils.bb.a(new com.google.android.finsky.ct.b(this, p0, p1), new Void[0]);
    }

    public final synchronized boolean a() {
        enter this;
        try {
            if (this.a != 0)
                v0 = 1;
            else
                v0 = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    final synchronized void b(Context p0) {
        enter this;
        try {
            StrictMode.noteSlowCall("AdUtils.setAdShieldClient");
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        if (!this.a()) {
            try {
                v0 = "";
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            try {
                v0 = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionName;
            }
            catch (PackageManager$NameNotFoundException ex) {
                try {
                    FinskyLog.e("Can't find our own package", new Object[0]);
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            try {
                v4 = new Object[1];
                v4[0] = v0;
                this.a = new com.google.android.gms.ads.adshield.a(String.format(Locale.US, "Android-Finsky/%s", v4), p0);
            }
            catch (Exception ex) {
                try {
                    FinskyLog.c("Failed to instantiate ad shield client", new Object[0]);
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
        }
        exit this;
    }

}
