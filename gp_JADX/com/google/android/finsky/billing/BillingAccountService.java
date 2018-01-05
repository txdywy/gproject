package com.google.android.finsky.billing;

import android.accounts.Account;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.billing.promptforfop.SetupWizardPromptForFopActivity;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.finsky.dfe.nano.aw;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class BillingAccountService extends Service {
    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public IBinder onBind(Intent intent) {
        return new C1663a(this);
    }

    final Bundle m9350a(Account account) {
        int i;
        Bundle bundle = new Bundle();
        C1254c b = C1473m.f7980a.mo2112b(account.name);
        ag agVar = new ag();
        b.mo1638d(agVar, agVar);
        try {
            aw awVar = (aw) agVar.get();
            if (((awVar.a & 1) != 0 ? 1 : 0) != 0) {
                switch (awVar.c) {
                    case 3:
                        bundle.putParcelable("available_offer_redemption_intent", SetupWizardPromptForFopActivity.m10860a(account));
                        i = 1;
                        break;
                    default:
                        i = 3;
                        break;
                }
            }
            FinskyLog.m21669e("No available promo offer status returned.", new Object[0]);
            i = -1;
        } catch (InterruptedException e) {
            FinskyLog.m21667d("Interrupted while requesting /checkPromoOffers: %s", e.getMessage());
            i = -4;
        } catch (ExecutionException e2) {
            FinskyLog.m21667d("Error while requesting /checkPromoOffers: %s", e2.getCause());
            i = m9349a(r0);
        }
        if (i == 1) {
            i = m9348a(b, i);
        }
        bundle.putInt("result_code", i);
        FinskyLog.m21659a("CheckPromoOffers result: %d", Integer.valueOf(i));
        return bundle;
    }

    private static int m9348a(C1254c c1254c, int i) {
        int[] iArr = new int[]{i};
        Semaphore semaphore = new Semaphore(0);
        C1473m.f7980a.mo2038R().m15108a(c1254c, false, false, new C1778b(semaphore, iArr));
        try {
            if (!semaphore.tryAcquire(45, TimeUnit.SECONDS)) {
                iArr[0] = -4;
            }
        } catch (InterruptedException e) {
            iArr[0] = -4;
        }
        return iArr[0];
    }

    static int m9349a(Throwable th) {
        if (th instanceof ServerError) {
            return -1;
        }
        if (th instanceof NetworkError) {
            return -2;
        }
        if (th instanceof AuthFailureError) {
            return -3;
        }
        if (th instanceof TimeoutError) {
            return -4;
        }
        return 0;
    }
}
