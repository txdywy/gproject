package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.internal.dr;

public class C5107g {
    public static C5107g f25970a;
    public final Context f25971b;

    private C5107g(Context context) {
        this.f25971b = context.getApplicationContext();
    }

    public static C5107g m23705a(Context context) {
        am.m23733a((Object) context);
        synchronized (C5107g.class) {
            if (f25970a == null) {
                C5138l.m23862a(context);
                f25970a = new C5107g(context);
            }
        }
        return f25970a;
    }

    static C5139m m23706a(PackageInfo packageInfo, C5139m... c5139mArr) {
        int i = 0;
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C5140n c5140n = new C5140n(packageInfo.signatures[0].toByteArray());
        while (i < c5139mArr.length) {
            if (c5139mArr[i].equals(c5140n)) {
                return c5139mArr[i];
            }
            i++;
        }
        return null;
    }

    private static boolean m23707a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            C5139m a;
            if (z) {
                a = C5107g.m23706a(packageInfo, C5142p.f26087a);
            } else {
                a = C5107g.m23706a(packageInfo, C5142p.f26087a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    private static boolean m23708b(PackageInfo packageInfo, boolean z) {
        boolean z2 = false;
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        } else {
            C5139m c5140n = new C5140n(packageInfo.signatures[0].toByteArray());
            String str = packageInfo.packageName;
            z2 = z ? C5138l.m23866b(str, c5140n) : C5138l.m23864a(str, c5140n);
            if (!z2) {
                Log.d("GoogleSignatureVerifier", "Cert not in list. atk=" + z);
            }
        }
        return z2;
    }

    @Deprecated
    public final boolean m23709a(PackageInfo packageInfo) {
        if (packageInfo != null) {
            if (C5107g.m23707a(packageInfo, false)) {
                return true;
            }
            if (C5107g.m23707a(packageInfo, true)) {
                if (C5105f.m23696f(this.f25971b)) {
                    return true;
                }
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            }
        }
        return false;
    }

    public final boolean m23710a(String str) {
        try {
            PackageInfo b = dr.f26667b.m24299a(this.f25971b).m24298b(str, 64);
            if (b == null) {
                return false;
            }
            if (C5105f.m23696f(this.f25971b)) {
                return C5107g.m23708b(b, true);
            }
            boolean b2 = C5107g.m23708b(b, false);
            if (!b2 && C5107g.m23708b(b, true)) {
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            }
            return b2;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
