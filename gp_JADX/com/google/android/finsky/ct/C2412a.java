package com.google.android.finsky.ct;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.ads.adshield.C4891a;
import com.google.android.gms.dynamic.C5164d;
import java.util.Locale;

public final class C2412a {
    public C4891a f11713a;

    public final String m12118a(Context context, String str) {
        if (m12120a()) {
            try {
                C4891a c4891a = this.f11713a;
                String valueOf = String.valueOf(C0955b.m5748a().m28964b());
                return c4891a.f25238a.mo4869a(C5164d.m23906a((Object) context), new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length()).append(valueOf).append(str).toString());
            } catch (RemoteException e) {
                FinskyLog.m21667d("Error accessing AdShield: %s", e);
            }
        }
        return null;
    }

    public final String m12117a(Context context) {
        String str = null;
        if (m12120a()) {
            try {
                str = this.f11713a.f25238a.mo4870a(C5164d.m23906a((Object) context), null);
            } catch (RemoteException e) {
                FinskyLog.m21667d("Error accessing AdShield: %s", e);
            }
        }
        return str;
    }

    final synchronized void m12121b(Context context) {
        StrictMode.noteSlowCall("AdUtils.setAdShieldClient");
        if (!m12120a()) {
            String str = "";
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (NameNotFoundException e) {
                FinskyLog.m21669e("Can't find our own package", new Object[0]);
            }
            try {
                this.f11713a = new C4891a(String.format(Locale.US, "Android-Finsky/%s", new Object[]{str}), context);
            } catch (Exception e2) {
                FinskyLog.m21665c("Failed to instantiate ad shield client", new Object[0]);
            }
        }
    }

    public final synchronized boolean m12120a() {
        return this.f11713a != null;
    }

    public final void m12119a(Context context, Runnable runnable) {
        if (!m12120a()) {
            bb.m21792a(new C2413b(this, context, runnable), new Void[0]);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
