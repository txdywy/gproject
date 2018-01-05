package com.google.android.finsky.verifier.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class di extends C0971t {
    public Context f24593a;

    protected final void mo1167a() {
        super.mo1167a();
        ((ac) C3947d.m18649a(ac.class)).mo1991a(this);
    }

    protected final void mo1170a(C1254c c1254c, C2495w c2495w) {
        long longValue;
        Object obj;
        Intent intent;
        Intent intent2 = new Intent("com.google.android.vending.verifier.intent.action.VERIFY_INSTALLED_PACKAGES");
        intent2.setComponent(new ComponentName(this.f24593a, VerifyInstalledPackagesReceiver.class));
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
        Object obj2 = (longValue5 >= longValue4 + longValue || longValue4 >= longValue + longValue5) ? 1 : null;
        Object obj3 = (!((Boolean) C0955b.cl.m28964b()).booleanValue() || ((Boolean) C0954a.f5815K.m5760a()).booleanValue() || (longValue5 < longValue3 + longValue2 && longValue3 < longValue5 + longValue2)) ? null : 1;
        if (obj2 != null) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 != null || obj3 == null) {
            obj = null;
        } else {
            obj = 1;
            intent2.putExtra("lite_run", true);
        }
        intent2.putExtra("is_routine_hygiene", true);
        if (obj2 == null && r2 == null) {
            intent = null;
        } else {
            intent = intent2;
        }
        if (intent != null) {
            if (((Boolean) C0955b.by.m28964b()).booleanValue()) {
                obj = 1;
            } else {
                FinskyLog.m21659a("Skipping verification because disabled", new Object[0]);
                obj = null;
            }
            if (obj != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C4740a dkVar = new dk(intent);
                dkVar.m22064a(new dj(countDownLatch));
                if (!dkVar.mo4343a()) {
                    dkVar.m22069l();
                }
                try {
                    if (!countDownLatch.await(3, TimeUnit.MINUTES)) {
                        FinskyLog.m21667d("Timeout while verifying installed packages", new Object[0]);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    FinskyLog.m21669e("Thread was interrupted", new Object[0]);
                }
            }
        }
    }
}
