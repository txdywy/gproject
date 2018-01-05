package com.google.android.finsky.verifier.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dy.C2917a;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ad;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class C4756h {
    public Context f24678a;
    public C1461c f24679b;
    public C4817d f24680c;
    public ad f24681d;
    public ag f24682e;

    public C4756h() {
        ((ac) C3947d.m18649a(ac.class)).mo1994a(this);
    }

    public final C4722z m22364a(String str, PackageInfo packageInfo) {
        String str2 = null;
        C4722z c4722z = (C4722z) ag.m15236a(this.f24682e.m15243b(new C4757i(packageInfo)));
        if (c4722z != null && c4722z.f24293c == packageInfo.lastUpdateTime) {
            return c4722z;
        }
        File file = new File(packageInfo.applicationInfo.publicSourceDir);
        String charSequence;
        if (!file.exists()) {
            FinskyLog.m21665c("Cannot find file for %s", charSequence);
            return null;
        } else if (file.canRead()) {
            try {
                byte[] bArr = C4688t.m21836a(file).f24072b;
                CharSequence loadLabel = packageInfo.applicationInfo.loadLabel(this.f24678a.getPackageManager());
                if (loadLabel != null) {
                    charSequence = loadLabel.toString();
                    str2 = this.f24678a.getResources().getConfiguration().locale.toString();
                } else {
                    charSequence = null;
                }
                C4697a c4697a = new C2917a().m15207a(bArr).m15206a(packageInfo.packageName).m15205a(packageInfo.versionCode).m15208b(charSequence).m15209c(str2).f15486a;
                C4722z c4722z2 = new C4722z();
                c4722z2.m21969a(bArr);
                c4722z2.m21967a(packageInfo.packageName);
                c4722z2.m21966a(packageInfo.lastUpdateTime);
                if (!(c4722z == null || !c4722z.f24296f || packageInfo.applicationInfo.enabled)) {
                    c4722z2.m21973b(true);
                }
                ag.m15236a(this.f24682e.m15243b(new C4758j(this, c4697a, c4722z2)));
                m22363a(str, packageInfo, bArr, false);
                return c4722z2;
            } catch (IOException e) {
                FinskyLog.m21665c("Error while calculating sha256 for file=%s, error=%s", charSequence, e);
                return null;
            }
        } else {
            FinskyLog.m21665c("Cannot read file for %s", charSequence);
            return null;
        }
    }

    final ac m22368b(String str, PackageInfo packageInfo) {
        return m22363a(str, packageInfo, null, true);
    }

    final ac m22363a(String str, PackageInfo packageInfo, byte[] bArr, boolean z) {
        byte[] bArr2;
        boolean z2;
        int i;
        Object obj;
        CharSequence loadLabel;
        String str2;
        String str3;
        ac a = this.f24681d.m15217a(str);
        if (a != null) {
            if ((packageInfo.lastUpdateTime != a.f15488b ? 1 : null) == null) {
                if (!z) {
                    return a;
                }
                m22362a(packageInfo, a.f15489c, a.f15502p, a.f15503q);
                return a;
            }
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        long j = 0;
        String str4 = applicationInfo.publicSourceDir;
        String str5 = null;
        int i2 = 0;
        String str6 = null;
        String str7 = null;
        long j2 = 0;
        boolean z3 = false;
        if (bArr == null) {
            File file = new File(str4);
            if (!file.exists()) {
                FinskyLog.m21665c("Cannot find file for %s", str4);
                bArr2 = bArr;
            } else if (file.canRead()) {
                j = file.length();
                try {
                    bArr2 = C4688t.m21836a(file).f24072b;
                } catch (IOException e) {
                    FinskyLog.m21665c("Error while calculating sha256 for file=%s, error=%s", str4, e);
                }
            } else {
                FinskyLog.m21665c("Cannot read file for %s", str4);
                bArr2 = bArr;
            }
            if (bArr2 == null) {
                return null;
            }
            z2 = false;
            i = -1;
            obj = (a == null && a.f15488b == 0 && Arrays.equals(bArr2, a.f15489c)) ? 1 : null;
            Object obj2 = (a == null && a.f15507u && !packageInfo.applicationInfo.enabled) ? 1 : null;
            if (!(obj == null && obj2 == null)) {
                str5 = a.f15493g;
                i2 = a.f15496j;
                str6 = a.f15497k;
                str7 = a.f15498l;
                j2 = a.f15499m;
                z3 = a.f15507u;
                if (obj != null) {
                    z2 = a.f15494h;
                    i = a.f15495i;
                }
            }
            loadLabel = packageInfo.applicationInfo.loadLabel(this.f24678a.getPackageManager());
            str2 = null;
            str3 = null;
            if (loadLabel != null) {
                str2 = loadLabel.toString();
                str3 = this.f24678a.getResources().getConfiguration().locale.toString();
            }
            boolean z4 = applicationInfo.publicSourceDir.equals(applicationInfo.sourceDir);
            m22362a(packageInfo, bArr2, str2, str3);
            a = new ac(applicationInfo.packageName, packageInfo.lastUpdateTime, bArr2, j, z4, str5, z2, i, i2, str6, str7, j2, str2, str3, z3);
            this.f24681d.m15220a(a);
            return a;
        }
        bArr2 = bArr;
        if (bArr2 == null) {
            return null;
        }
        z2 = false;
        i = -1;
        if (a == null) {
        }
        if (a == null) {
        }
        str5 = a.f15493g;
        i2 = a.f15496j;
        str6 = a.f15497k;
        str7 = a.f15498l;
        j2 = a.f15499m;
        z3 = a.f15507u;
        if (obj != null) {
            z2 = a.f15494h;
            i = a.f15495i;
        }
        loadLabel = packageInfo.applicationInfo.loadLabel(this.f24678a.getPackageManager());
        str2 = null;
        str3 = null;
        if (loadLabel != null) {
            str2 = loadLabel.toString();
            str3 = this.f24678a.getResources().getConfiguration().locale.toString();
        }
        if (applicationInfo.publicSourceDir.equals(applicationInfo.sourceDir)) {
        }
        m22362a(packageInfo, bArr2, str2, str3);
        a = new ac(applicationInfo.packageName, packageInfo.lastUpdateTime, bArr2, j, z4, str5, z2, i, i2, str6, str7, j2, str2, str3, z3);
        this.f24681d.m15220a(a);
        return a;
    }

    private final void m22362a(PackageInfo packageInfo, byte[] bArr, String str, String str2) {
        if (ag.m15237a(this.f24679b.dj())) {
            ag.m15236a(this.f24682e.m15242b(new C4766r(this, this.f24682e, packageInfo, bArr, str, str2)));
        }
    }

    public final void m22365a(C4741s c4741s) {
        List<ab> list = (List) ag.m15236a(this.f24682e.m15243b(C4759k.f24687a));
        if (list != null) {
            for (ab abVar : list) {
                if (abVar.f24103d != 0) {
                    C4697a c4697a = (C4697a) ag.m15236a(this.f24682e.m15243b(new C4760l(abVar)));
                    if (c4697a != null) {
                        try {
                            PackageInfo packageInfo = this.f24678a.getPackageManager().getPackageInfo(c4697a.f24090c, 0);
                            if (packageInfo != null) {
                                C4722z a = m22364a(c4697a.f24090c, packageInfo);
                                if (a != null && Arrays.equals(a.f24294d, abVar.f24101b)) {
                                    c4741s.mo4345a(a, abVar, packageInfo);
                                }
                            }
                        } catch (NameNotFoundException e) {
                        }
                    }
                }
            }
        }
    }

    final void m22366a(String str, byte[] bArr, boolean z) {
        if (ag.m15237a(this.f24679b.dj())) {
            ag.m15236a(this.f24682e.m15241a(new C4762n(str, bArr, z)));
        }
        this.f24681d.m15225a(str, bArr, z);
    }

    final boolean m22367a(String str) {
        if (ag.m15238b(this.f24679b.dj())) {
            Boolean bool = (Boolean) ag.m15236a(this.f24682e.m15241a(new C4765q(str)));
            if (bool == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        }
        ac a = this.f24681d.m15217a(str);
        return a != null && a.f15507u;
    }
}
