package com.google.android.finsky.billing;

import android.accounts.Account;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.IBinder;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.a.ag;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.promptforfop.SetupWizardPromptForFopActivity;
import com.google.android.finsky.dp.c;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.google.wireless.android.finsky.dfe.nano.aw;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class BillingAccountService extends Service
{

    BillingAccountService() {
        Service();
    }

    private static int a(com.google.android.finsky.api.c p0, int p1) {
        v0 = new int[1];
        v0[0] = p1;
        v1 = new Semaphore(0);
        com.google.android.finsky.m.a.R().a(p0, 0, 0, new com.google.android.finsky.billing.b(v1, v0));
        try {
            if (!v1.tryAcquire(45, TimeUnit.SECONDS))
                v0[0] = -4;
        }
        catch (InterruptedException ex) {
            v0[0] = -4;
        }
        return v0[0];
    }

    static int a(Throwable p0) {
        if (p0 instanceof ServerError)
            v0 = -1;
        else if (p0 instanceof NetworkError)
            v0 = -2;
        else if (p0 instanceof AuthFailureError)
            v0 = -3;
        else if (p0 instanceof TimeoutError)
            v0 = -4;
        else
            v0 = 0;
        return v0;
    }

    final Bundle a(Account p0) {
  4:    v4 = new Bundle();
 11:    v5 = com.google.android.finsky.m.a.b(p0.name);
 17:    v0 = new com.android.volley.a.ag();
 20:    v5.d(v0, v0);
 27:    v0 = (com.google.wireless.android.finsky.dfe.nano.aw)v0.get();
 33:    if (v0.a & 1)
 35:        v2 = 1;
        else
 72:        v2 = 0;
 36:    if (v2 != 0) goto 74;
 43:    FinskyLog.e("No available promo offer status returned.", new Object[0]);
 46:    v0 = -1;
 47:    if (v0 == 1)
 49:        v0 = BillingAccountService.a(v5, v0);
 55:    v4.putInt("result_code", v0);
 60:    v1 = new Object[1];
 66:    v1[0] = Integer.valueOf(v0);
 68:    FinskyLog.a("CheckPromoOffers result: %d", v1);
 71:    return v4;
 76:    switch (v0.c) {
            case 3:
 87:            v4.putParcelable("available_offer_redemption_intent", SetupWizardPromptForFopActivity.a(p0));
 90:            v0 = 1;
129:            break;
            default:
 79:            v0 = 3;
129:            break;
        }
 95:    v6 = new Object[1];
101:    v6[0] = ex.getMessage();
103:    FinskyLog.d("Interrupted while requesting /checkPromoOffers: %s", v6);
106:    v0 = -4;
107:    goto 47;
109:    v0 = ex.getCause();
115:    v6 = new Object[1];
117:    v6[0] = v0;
119:    FinskyLog.d("Error while requesting /checkPromoOffers: %s", v6);
122:    v0 = BillingAccountService.a(v0);
126:    goto 47;
127:    try
            run 74...90
        catch (InterruptedException ex) {
 74:        goto 92;
        }
        catch (ExecutionException ex) {
 74:        goto 108;
        }
128:    try
            run 23...46
        catch (InterruptedException ex) {
 23:        goto 92;
        }
        catch (ExecutionException ex) {
 23:        goto 108;
        }
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public IBinder onBind(Intent p0) {
        return new com.google.android.finsky.billing.a(this);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
