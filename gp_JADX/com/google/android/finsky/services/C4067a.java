package com.google.android.finsky.services;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.android.vending.p058d.C0642b;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.ag;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.by;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

final class C4067a extends C0642b {
    public final /* synthetic */ DetailsService f20426a;

    C4067a(DetailsService detailsService) {
        this.f20426a = detailsService;
    }

    public final Bundle mo3901a(String str) {
        Account cY = C1473m.f7980a.cY();
        if (cY == null) {
            return null;
        }
        return m18995a(str, cY);
    }

    public final Bundle mo3902a(String str, Bundle bundle) {
        if (bundle == null) {
            FinskyLog.m21659a("Missing extraParams", new Object[0]);
            return null;
        }
        Account b = C1473m.f7980a.mo2041U().mo1183b(bundle.getString("account_name"));
        if (b != null) {
            return m18995a(str, b);
        }
        FinskyLog.m21659a("Could not locate account %s", FinskyLog.m21655a(r1));
        return null;
    }

    private final Bundle m18995a(String str, Account account) {
        C1473m c1473m = C1473m.f7980a;
        C2482j a = c1473m.mo2049a(account);
        if (((Boolean) C0955b.at.m28964b()).booleanValue()) {
            String a2 = C2744a.m14785a(this.f20426a, str, C0955b.as, a, 512);
            if (a2 == null) {
                return null;
            }
            FinskyLog.m21659a("Received app details request for %s from %s", str, a2);
            String a3 = C1289l.m7694a(str);
            C1254c ap = C1473m.f7980a.ap();
            C0660x agVar = new ag();
            ap.mo1599a(a3, true, true, null, null, agVar, (C0657w) agVar);
            try {
                cv cvVar = ((by) agVar.get()).c;
                if (cvVar == null) {
                    FinskyLog.m21659a("No doc in details response for %s", str);
                    C2744a.m14787a(a, 512, str, 1306, a2);
                    return null;
                }
                DfeToc dn = c1473m.dn();
                c1473m.mo2256o();
                c1473m.mo2029I().f18022b.m11209c();
                c1473m.ah().mo2820c();
                Bundle bundle = new Bundle();
                if (c1473m.mo2249j(account.name).mo2294a(12628789)) {
                    DetailsService.m18991a(this.f20426a, new Document(cvVar), account, dn, a2, a, this.f20426a.f20416a, bundle);
                } else {
                    Semaphore semaphore = new Semaphore(0);
                    new Handler(Looper.getMainLooper()).post(new C4068b(this, cvVar, account, dn, a2, a, bundle, semaphore));
                    try {
                        if (!semaphore.tryAcquire(((Long) C0955b.il.m28964b()).longValue(), TimeUnit.MILLISECONDS)) {
                            FinskyLog.m21665c("Details service timed out", new Object[0]);
                        }
                    } catch (InterruptedException e) {
                        FinskyLog.m21665c("Details service interrupted", new Object[0]);
                    }
                }
                if (bundle.isEmpty()) {
                    return null;
                }
                return bundle;
            } catch (InterruptedException e2) {
                FinskyLog.m21659a("Interrupted while trying to retrieve app details", new Object[0]);
                C2744a.m14787a(a, 512, str, 1304, a2);
                return null;
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                String simpleName = cause == null ? null : cause.getClass().getSimpleName();
                FinskyLog.m21659a("Unable to retrieve app details: %s", simpleName);
                C2744a.m14787a(a, 512, str, 1305, a2);
                return null;
            }
        }
        FinskyLog.m21659a("API access is blocked for all apps", new Object[0]);
        C2744a.m14787a(a, 512, str, 1303, null);
        return null;
    }
}
