package com.google.android.finsky.bi.p150a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.utils.FinskyLog;
import p002a.C0002a;

public final class C1639a implements C0983h {
    public final Context f8562a;
    public final C0002a f8563b;

    public C1639a(Context context, C0002a c0002a) {
        this.f8562a = context;
        this.f8563b = c0002a;
    }

    public final void mo1175b(String str, boolean z) {
        int i = 0;
        if ("com.google.android.gms".equals(str)) {
            Intent intent = new Intent("com.google.android.gms.GMS_UPDATED");
            intent.setPackage("com.google.android.gms");
            this.f8562a.sendBroadcast(intent);
            try {
                int i2;
                int i3 = this.f8562a.getPackageManager().getApplicationInfo(str, 0).flags;
                if ((i3 & 1) != 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if ((i3 & 128) != 0) {
                    i = 1;
                }
                if (i2 == 0 || r0 != 0) {
                    m9329a(str, 1, "install/update");
                } else {
                    m9329a(str, 2, "downgrade");
                }
            } catch (NameNotFoundException e) {
                FinskyLog.m21665c("NameNotFoundException getting info for %s", str);
            }
        }
    }

    public final void mo1176c(String str, boolean z) {
        if (!z && "com.google.android.gms".equals(str)) {
            m9329a(str, 2, "removed");
        }
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }

    private final void m9329a(String str, int i, String str2) {
        ((C3646a) this.f8563b.mo1a()).m17248a(new C1640b(this, str, i, str2));
    }
}
