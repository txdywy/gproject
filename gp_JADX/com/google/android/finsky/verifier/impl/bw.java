package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.C4726d;
import com.google.android.p254g.p255a.C4318e;
import java.util.concurrent.TimeUnit;

public final class bw implements C4726d {
    public Context f24484a;
    public C1461c f24485b;
    public ForegroundCoordinator f24486c;

    public bw() {
        ((ac) C3947d.m18649a(ac.class)).mo1987a(this);
    }

    public final void mo4359a(boolean z) {
        long longValue;
        Intent intent = new Intent("com.google.android.vending.verifier.intent.action.VERIFY_INSTALLED_PACKAGES");
        intent.setComponent(new ComponentName(this.f24484a, VerifyInstalledPackagesReceiver.class));
        long longValue2 = ((Long) C0955b.bN.m28964b()).longValue();
        long longValue3 = ((Long) C0954a.f5817M.m5760a()).longValue();
        long longValue4 = ((Long) C0954a.f5814J.m5760a()).longValue();
        long longValue5 = ((Long) C0955b.bM.m28964b()).longValue();
        if (((Boolean) C0954a.f5815K.m5760a()).booleanValue()) {
            longValue = ((Long) C0955b.bO.m28964b()).longValue();
        } else if (((Boolean) C0954a.f5816L.m5760a()).booleanValue()) {
            longValue = ((Long) C0955b.bP.m28964b()).longValue();
        } else {
            longValue = longValue5;
        }
        longValue5 = C4678i.m21812a();
        Object obj = (longValue5 >= longValue4 + longValue || longValue4 >= longValue + longValue5) ? 1 : null;
        Object obj2 = (!((Boolean) C0955b.cl.m28964b()).booleanValue() || ((Boolean) C0954a.f5815K.m5760a()).booleanValue() || (longValue5 < longValue3 + longValue2 && longValue3 < longValue5 + longValue2)) ? null : 1;
        if (z || !this.f24486c.m16017a()) {
            obj = obj != null ? 1 : null;
        } else {
            obj = null;
            obj2 = (!((Boolean) C0955b.cl.m28964b()).booleanValue() || (longValue5 < longValue3 + longValue2 && longValue3 < longValue5 + longValue2)) ? null : 1;
        }
        if (obj != null || r2 == null) {
            obj2 = null;
        } else {
            obj2 = 1;
            intent.putExtra("lite_run", true);
        }
        if (obj != null && z) {
            intent.putExtra("foreground", true);
        }
        if (obj != null || r2 != null) {
            this.f24484a.sendBroadcast(intent);
        }
    }

    public final boolean mo4360a() {
        Intent intent = new Intent("com.google.android.vending.verifier.intent.action.VERIFY_INSTALLED_PACKAGES");
        ((Long) C0955b.bN.m28964b()).longValue();
        ((Long) C0954a.f5817M.m5760a()).longValue();
        ((Long) C0954a.f5814J.m5760a()).longValue();
        ((Long) C0955b.bM.m28964b()).longValue();
        if (((Boolean) C0954a.f5815K.m5760a()).booleanValue()) {
            ((Long) C0955b.bO.m28964b()).longValue();
        } else if (((Boolean) C0954a.f5816L.m5760a()).booleanValue()) {
            ((Long) C0955b.bP.m28964b()).longValue();
        }
        C4678i.m21812a();
        if (((Boolean) C0955b.cl.m28964b()).booleanValue()) {
            ((Boolean) C0954a.f5815K.m5760a()).booleanValue();
        }
        if (new dk(intent).m22066a(TimeUnit.MINUTES.toMillis(3))) {
            return true;
        }
        FinskyLog.m21667d("Timeout while verifying installed packages", new Object[0]);
        return false;
    }

    public final void mo4362b() {
        if (this.f24485b.dj().mo2294a(12633445) || ((Boolean) C0955b.cm.m28964b()).booleanValue()) {
            Intent intent = new Intent("com.google.android.vending.verifier.UPDATE_SAFE_BROWSING");
            intent.setClass(this.f24484a, PackageVerificationService.class);
            this.f24484a.startService(intent);
        }
    }

    public final void mo4365c() {
        bg a = bg.m22121a();
        if (((Boolean) C0955b.bB.m28964b()).booleanValue() && a.m22128c().mo4350c() && a.m22128c().mo4349b() == 0) {
            int i = 1;
        } else {
            boolean z = false;
        }
        if (i != 0) {
            a.m22128c().mo4348a(1, Boolean.valueOf(false));
        }
    }

    public final void mo4357a(C4318e c4318e) {
        Intent intent = new Intent("com.google.android.vending.verifier.ACTION_GET_VERIFY_APPS_DATA");
        intent.putExtra("verify_apps_data_callback", new ParcelableBinder(c4318e.asBinder()));
        intent.putExtra("verify_apps_data_flags", 3);
        new br(intent).m22066a(TimeUnit.MINUTES.toMillis(3));
    }

    public final Intent mo4356a(Context context, String str, String str2, String str3, int i, PendingIntent pendingIntent) {
        return PackageWarningDialog.m22007a(context, 2, str, str2, str3, i, 1, null, pendingIntent);
    }

    public final Intent mo4355a(Context context, String str, String str2, String str3, int i) {
        return PackageWarningDialog.m22007a(context, 3, str, str2, str3, i, 0, null, null);
    }

    public final boolean mo4361a(Context context) {
        return cs.m22282b(context);
    }

    public final void mo4363b(Context context) {
        cs.m22274a(context);
    }

    public final void mo4358a(String str, byte[] bArr) {
        Intent intent = new Intent("com.google.android.vending.verifier.UNINSTALL_PACKAGE");
        intent.setClass(this.f24484a, PackageVerificationService.class);
        intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", str);
        intent.putExtra("digest", bArr);
        this.f24484a.startService(intent);
    }

    public final boolean mo4367d() {
        return bg.m22121a().m22129d();
    }

    public final void mo4366c(Context context) {
        cq a = cq.m22272a(context);
        if (!a.f24561e) {
            FinskyLog.m21659a("Setup app restrictions monitor", new Object[0]);
            a.f24558b.registerReceiver(a.f24562f, a.f24560d);
            a.m22273a();
            a.f24561e = true;
        }
    }

    public final boolean mo4368e() {
        return bg.m22121a().m22128c().mo4354g();
    }

    public final void mo4364b(boolean z) {
        if (z) {
            bg.m22121a().m22126a(z);
        }
    }

    public final void mo4369f() {
        Intent intent = new Intent("com.google.android.finsky.verifier.ACTION_RESTORE_NOTIFICATIONS");
        intent.setClass(this.f24484a, PackageVerificationService.class);
        this.f24484a.startService(intent);
    }
}
