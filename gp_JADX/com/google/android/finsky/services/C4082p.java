package com.google.android.finsky.services;

import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gb;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class C4082p extends C4074h {
    public final Context f20445a;
    public final C2471a f20446b = C1473m.f7980a.aR();

    public C4082p(Context context) {
        this.f20445a = context;
    }

    public final Bundle mo3905a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (!C4671b.m21787d()) {
            FinskyLog.m21665c("Package update service called before L.", new Object[0]);
            bundle2.putBoolean("success", false);
        } else if (!m19008a()) {
            FinskyLog.m21665c("Package update service called without DO/PO.", new Object[0]);
            bundle2.putBoolean("success", false);
        } else if (!C4082p.m19009a(str)) {
            FinskyLog.m21665c("Package update service called for non-whitelisted package: %s.", str);
            bundle2.putBoolean("success", false);
        } else if (C4082p.m19011b()) {
            boolean z = bundle.getBoolean("unauthenticated");
            if (!z || C4082p.m19012c()) {
                bundle2.putBoolean("success", m19010a(str, z));
            } else {
                bundle2.putBoolean("success", false);
            }
        } else {
            bundle2.putBoolean("success", false);
        }
        return bundle2;
    }

    @TargetApi(21)
    private final boolean m19008a() {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f20445a.getSystemService("device_policy");
        String[] packagesForUid = this.f20445a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (devicePolicyManager.isDeviceOwnerApp(str) || devicePolicyManager.isProfileOwnerApp(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean m19009a(String str) {
        for (String equals : C4680k.m21818a((String) C0955b.gp.m28964b())) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean m19011b() {
        C3646a I = C1473m.f7980a.mo2029I();
        C2206c ah = C1473m.f7980a.ah();
        I.f18022b.m11209c();
        ah.mo2820c();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C1473m.f7980a.cg().m9310a(new C4083q(countDownLatch));
        try {
            countDownLatch.await(1, TimeUnit.MINUTES);
            return true;
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Timed out waiting for GearheadStateMonitor.", new Object[0]);
            return false;
        }
    }

    private static boolean m19012c() {
        C1254c ao = C1473m.f7980a.ao();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        gb[] gbVarArr = new gb[1];
        C1473m.f7980a.bI().m13571a(ao, C2693e.m14552a(), new C4084r(gbVarArr, countDownLatch));
        try {
            countDownLatch.await(30, TimeUnit.SECONDS);
            if (gbVarArr[0] != null) {
                return true;
            }
            return false;
        } catch (InterruptedException e) {
            return false;
        }
    }

    private final boolean m19010a(String str, boolean z) {
        C1254c ao;
        if (z) {
            ao = C1473m.f7980a.ao();
        } else {
            ao = C1473m.f7980a.ap();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = new boolean[1];
        ao.mo1605a(C1283d.m7689a(Arrays.asList(new String[]{str})), true, new C4085s(this, str, zArr, countDownLatch, z), new C4086t(zArr, countDownLatch));
        try {
            countDownLatch.await(30, TimeUnit.SECONDS);
            return zArr[0];
        } catch (InterruptedException e) {
            return false;
        }
    }
}
