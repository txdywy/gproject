package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.dynamic.C5164d;
import com.google.android.gms.dynamite.DynamiteModule;

final class C5138l {
    public static aa f26080a;
    public static final Object f26081b = new Object();
    public static Context f26082c;

    static synchronized void m23862a(Context context) {
        synchronized (C5138l.class) {
            if (f26082c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f26082c = context.getApplicationContext();
            }
        }
    }

    private static boolean m23863a() {
        if (f26080a != null) {
            return true;
        }
        am.m23733a(f26082c);
        synchronized (f26081b) {
            if (f26080a == null) {
                try {
                    aa aaVar;
                    IBinder a = DynamiteModule.m23913a(f26082c, DynamiteModule.f26115h, "com.google.android.gms.googlecertificates").m23923a("com.google.android.gms.common.GoogleCertificatesImpl");
                    if (a == null) {
                        aaVar = null;
                    } else {
                        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        aaVar = queryLocalInterface instanceof aa ? (aa) queryLocalInterface : new ab(a);
                    }
                    f26080a = aaVar;
                } catch (Throwable e) {
                    Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", e);
                    return false;
                }
            }
        }
        return true;
    }

    static boolean m23864a(String str, C5139m c5139m) {
        return C5138l.m23865a(str, c5139m, false);
    }

    private static boolean m23865a(String str, C5139m c5139m, boolean z) {
        boolean z2 = false;
        if (C5138l.m23863a()) {
            am.m23733a(f26082c);
            try {
                z2 = f26080a.mo4609a(new zzl(str, c5139m, z), C5164d.m23906a(f26082c.getPackageManager()));
            } catch (Throwable e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return z2;
    }

    static boolean m23866b(String str, C5139m c5139m) {
        return C5138l.m23865a(str, c5139m, true);
    }
}
