package com.google.android.finsky.services;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.android.vending.licensing.C0645a;
import com.android.vending.licensing.C0647c;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class C4077k extends C0647c {
    public final Context f20437a;
    public final C1287h f20438b;

    public C4077k(Context context, C1287h c1287h) {
        this.f20437a = context;
        this.f20438b = c1287h;
    }

    public final void mo3903a(long j, String str, C0645a c0645a) {
        try {
            PackageInfo packageInfo = this.f20437a.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo.applicationInfo.uid != C4077k.getCallingUid()) {
                LicensingService.m18993a(c0645a, 259, null, null);
                return;
            }
            int i = packageInfo.versionCode;
            C3646a I = C1473m.f7980a.mo2029I();
            I.f18022b.m11209c();
            C3647b a = I.m17243a(str);
            if (a == null) {
                FinskyLog.m21669e("Unexpected null appState for %s", str);
                LicensingService.m18993a(c0645a, 258, null, null);
                return;
            }
            Account b;
            if (a.f18029d != null) {
                b = C1473m.f7980a.mo2041U().mo1183b(a.f18029d.f10815i);
                if (b != null) {
                    m19002a(j, str, c0645a, i, b);
                    return;
                }
            }
            C2206c ah = C1473m.f7980a.ah();
            ah.mo2820c();
            List a2 = ah.mo2813a(str, a.f18028c.f11417b);
            if (a2.isEmpty()) {
                b = C1473m.f7980a.mo2041U().mo1189e();
                if (b != null) {
                    m19002a(j, str, c0645a, i, b);
                    return;
                } else {
                    LicensingService.m18993a(c0645a, 1, null, null);
                    return;
                }
            }
            m19002a(j, str, c0645a, i, (Account) a2.get(0));
        } catch (NameNotFoundException e) {
            LicensingService.m18993a(c0645a, 258, null, null);
        }
    }

    private final void m19002a(long j, String str, C0645a c0645a, int i, Account account) {
        this.f20438b.mo2016a(account.name).mo1612a(str, i, j, new C4078l(c0645a), new C4079m(c0645a));
    }
}
