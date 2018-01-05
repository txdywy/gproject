package com.google.android.finsky.billing;

import android.accounts.Account;
import android.os.Bundle;
import android.os.StrictMode;
import com.android.vending.p056b.C0631b;
import com.android.volley.AuthFailureError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

final class C1663a extends C0631b {
    public final /* synthetic */ BillingAccountService f8634a;

    C1663a(BillingAccountService billingAccountService) {
        this.f8634a = billingAccountService;
    }

    public final int mo2369a(String str) {
        StrictMode.noteSlowCall("BillingAccountService.hasValidCreditCard");
        if (C1473m.f7980a.mo2249j(str).mo2294a(12630240)) {
            if (C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(371).m13210a(-6));
            }
            return -1;
        }
        int[] iArr = new int[1];
        Semaphore semaphore = new Semaphore(0);
        Account b = C1473m.f7980a.mo2041U().mo1183b(str);
        if (b == null) {
            String str2 = "Received invalid account name: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            FinskyLog.m21667d(valueOf, new Object[0]);
            if (C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(371).m13210a(-5));
            }
            return -5;
        }
        try {
            C1473m.f7980a.mo2112b(b.name).mo1621b(new C1786c(iArr, semaphore), new C1813d(iArr, semaphore));
            if (!semaphore.tryAcquire(45, TimeUnit.SECONDS)) {
                iArr[0] = -4;
            }
            int i = iArr[0];
            if (C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(371).m13210a(i));
            }
            return iArr[0];
        } catch (InterruptedException e) {
            FinskyLog.m21665c("Timed out while waiting for response.", new Object[0]);
            if (!C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                return -4;
            }
            C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(371).m13210a(-4));
            return -4;
        }
    }

    public final Bundle mo2370b(String str) {
        Bundle bundle;
        StrictMode.noteSlowCall("BillingAccountService.getOffers");
        if (C1473m.f7980a.mo2249j(str).mo2294a(12630241)) {
            bundle = new Bundle();
            bundle.putInt("result_code", -6);
            if (C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(372).m13210a(bundle.getInt("result_code")));
            }
        } else {
            Account b = C1473m.f7980a.mo2041U().mo1183b(str);
            if (b == null) {
                FinskyLog.m21667d("Received invalid account name: %s", FinskyLog.m21655a(str));
                bundle = new Bundle();
                bundle.putInt("result_code", -5);
                if (C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                    C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(372).m13210a(bundle.getInt("result_code")));
                }
            } else {
                try {
                    bundle = this.f8634a.m9350a(b);
                    if (C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                        C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(372).m13210a(bundle.getInt("result_code")));
                    }
                } catch (AuthFailureError e) {
                    try {
                        bundle = this.f8634a.m9350a(b);
                        if (C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                            C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(372).m13210a(bundle.getInt("result_code")));
                        }
                    } catch (AuthFailureError e2) {
                        bundle = new Bundle();
                        bundle.putInt("result_code", -3);
                        if (C1473m.f7980a.mo2249j(str).mo2294a(12630239)) {
                            C1473m.f7980a.aR().m13185b(str).m13367a(new C2474c(372).m13210a(bundle.getInt("result_code")));
                        }
                    }
                }
            }
        }
        return bundle;
    }
}
