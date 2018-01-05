package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p261b.C4740a;

public class an extends C4740a {
    public static boolean f24387f = false;
    public Context f24388a;
    public ab f24389b;
    public C1461c f24390c;
    public final PackageVerificationService f24391d;
    public final C4756h f24392e = new C4756h();

    public an(PackageVerificationService packageVerificationService) {
        this.f24391d = packageVerificationService;
        ((ac) C3947d.m18649a(ac.class)).mo1980a(this);
    }

    protected final boolean mo4343a() {
        FinskyLog.m21659a("Restoring notifications", new Object[0]);
        synchronized (an.class) {
            if (f24387f) {
            } else {
                f24387f = true;
                if (ag.m15238b(this.f24390c.dj())) {
                    this.f24392e.m22365a(new ao(this));
                } else {
                    for (ac acVar : this.f24391d.f24308a.m15219a(true, false).values()) {
                        if (acVar.f15496j == 3 && !acVar.f15492f) {
                            PackageInfo packageInfo;
                            String str = acVar.f15487a;
                            try {
                                packageInfo = this.f24391d.getPackageManager().getPackageInfo(str, 512);
                            } catch (NameNotFoundException e) {
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                ac a = this.f24392e.m22363a(str, packageInfo, null, true);
                                if (a != null && a.f15496j == 3) {
                                    m22071a(this.f24391d, this.f24389b, packageInfo, a.f15489c, a.f15508v, a.f15507u, a.f15497k);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    static void m22071a(PackageVerificationService packageVerificationService, ab abVar, PackageInfo packageInfo, byte[] bArr, byte[] bArr2, boolean z, String str) {
        CharSequence charSequence;
        String str2 = packageInfo.packageName;
        PendingIntent a = PackageVerificationService.m22002a((Context) packageVerificationService, str2, bArr, bArr2);
        PendingIntent b = PackageVerificationService.m22005b(packageVerificationService, str2, bArr, bArr2);
        boolean z2 = (packageInfo.applicationInfo.flags & 1) != 0;
        CharSequence loadLabel = packageInfo.applicationInfo.loadLabel(packageVerificationService.getPackageManager());
        if (loadLabel == null) {
            charSequence = packageInfo.packageName;
        } else {
            charSequence = loadLabel;
        }
        if (((Boolean) C0955b.cD.m28964b()).booleanValue() && z && !packageInfo.applicationInfo.enabled) {
            abVar.mo3787a(charSequence.toString(), str2, str, 0, a, b, z2);
        } else {
            abVar.mo3804b(charSequence.toString(), str2, str, 0, a, b, z2);
        }
    }

    protected final void mo4344c() {
        synchronized (an.class) {
            f24387f = false;
        }
        FinskyLog.m21659a("Done restoring notifications", new Object[0]);
    }
}
