package com.google.android.finsky.verifier.impl;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import java.util.Arrays;
import java.util.List;

public class az extends C4740a {
    public Context f24412c;
    public C1461c f24413d;
    public C4817d f24414e;
    public C3851f f24415f;
    public C3849a f24416g;
    public final C4756h f24417h = new C4756h();
    public final PackageVerificationService f24418i;
    public final Intent f24419j;

    public az(PackageVerificationService packageVerificationService, Intent intent) {
        this.f24418i = packageVerificationService;
        this.f24419j = intent;
        ((ac) C3947d.m18649a(ac.class)).mo1984a(this);
    }

    protected boolean mo4343a() {
        PackageInfo packageInfo;
        String stringExtra = this.f24419j.getStringExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME");
        byte[] byteArrayExtra = this.f24419j.getByteArrayExtra("digest");
        boolean booleanExtra = this.f24419j.getBooleanExtra("only_disable", false);
        try {
            packageInfo = this.f24418i.getPackageManager().getPackageInfo(stringExtra, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            if (ag.m15238b(this.f24413d.dj())) {
                C4722z a = this.f24417h.m22364a(stringExtra, packageInfo);
                if (a == null || !Arrays.equals(a.f24294d, byteArrayExtra)) {
                    return false;
                }
                ab abVar = (ab) ag.m15236a(this.f24418i.f24309b.m15243b(new ba(byteArrayExtra)));
                if (abVar == null || abVar.f24103d == 0) {
                    return false;
                }
            }
            ac b = this.f24417h.m22368b(stringExtra, packageInfo);
            if (b == null || !Arrays.equals(b.f15489c, byteArrayExtra) || b.f15496j == 0) {
                return false;
            }
            if (m22097a(packageInfo, byteArrayExtra, booleanExtra, null)) {
                return true;
            }
        }
        return false;
    }

    protected final void m22094a(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            Intent intent = new Intent();
            intent.putExtra("pressed_uninstall_action", z);
            intent.putExtra("dialog_not_shown", 2);
            try {
                pendingIntent.send(this.f24418i, 0, intent);
            } catch (CanceledException e) {
                FinskyLog.m21665c("Couldn't send result of uninstall due to canceled PendingIntent", new Object[0]);
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    protected final boolean m22097a(PackageInfo packageInfo, byte[] bArr, boolean z, PendingIntent pendingIntent) {
        if (packageInfo == null || packageInfo.applicationInfo == null || bArr == null) {
            return false;
        }
        String charSequence;
        String locale;
        boolean z2;
        C3851f c3851f = (packageInfo.applicationInfo.flags & 1) != 0 ? 1 : null;
        CharSequence loadLabel = packageInfo.applicationInfo.loadLabel(this.f24418i.getPackageManager());
        if (loadLabel != null) {
            charSequence = loadLabel.toString();
            locale = this.f24418i.getResources().getConfiguration().locale.toString();
        } else {
            charSequence = null;
            locale = null;
        }
        String str = packageInfo.packageName;
        List<ComponentName> activeAdmins = ((DevicePolicyManager) this.f24412c.getSystemService("device_policy")).getActiveAdmins();
        if (activeAdmins != null) {
            for (ComponentName packageName : activeAdmins) {
                if (packageName.getPackageName().equals(str)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if ((c3851f != null || z2 || z) && packageInfo.applicationInfo.enabled) {
            int i;
            str = packageInfo.packageName;
            if (c3851f != null) {
                i = 3;
            } else {
                i = 2;
            }
            C0983h beVar = new be(str);
            try {
                this.f24415f.mo3818a(beVar);
                this.f24412c.getPackageManager().setApplicationEnabledSetting(str, i, 0);
                for (int i2 = 0; ((long) i2) < 120; i2++) {
                    if (!beVar.f24446b) {
                        FinskyLog.m21659a("Waiting for package changed broadcast: " + i2, new Object[0]);
                        try {
                            synchronized (beVar) {
                                beVar.wait(1000);
                            }
                        } catch (InterruptedException e) {
                        }
                    }
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e2) {
                }
                FinskyLog.m21659a("Received package changed broadcast, resume uninstall package", new Object[0]);
            } catch (RuntimeException e3) {
                FinskyLog.m21667d("Error disabling application: %s", e3);
            } finally {
                c3851f = this.f24415f;
                c3851f.mo3819b(beVar);
            }
        }
        if (z) {
            return false;
        }
        if (c3851f == null) {
            return this.f24416g.mo3824a(packageInfo.packageName, false, new bb(this, packageInfo, pendingIntent, bArr, z2, charSequence, locale));
        } else {
            m22095a(packageInfo.packageName, bArr, charSequence, locale);
            return false;
        }
    }

    final void m22095a(String str, byte[] bArr, String str2, String str3) {
        this.f24418i.f24308a.m15224a(str, bArr, str2, str3);
        if (ag.m15237a(this.f24413d.dj())) {
            ag agVar = this.f24418i.f24309b;
            ag.m15236a(agVar.m15242b(new bd(agVar, str, bArr)));
        }
    }
}
