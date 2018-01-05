package com.google.android.finsky.billing;

import android.accounts.Account;
import android.os.Bundle;
import android.os.StrictMode;
import com.android.vending.b.b;
import com.android.volley.AuthFailureError;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.billing.a extends com.android.vending.b.b
{

    public final BillingAccountService a;

    a(BillingAccountService p0) {
        this.a = p0;
        com.android.vending.b.b();
    }

    public final int a(String p0) {
        v0 = -4;
        StrictMode.noteSlowCall("BillingAccountService.hasValidCreditCard");
        if (com.google.android.finsky.m.a.j(p0).a(12630240)) {
            if (com.google.android.finsky.m.a.j(p0).a(12630239))
                com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(371).a(-6));
            v0 = -1;
        }
        else {
            v2 = new int[1];
            v3 = new Semaphore(0);
            v4 = com.google.android.finsky.m.a.U().b(p0);
            if (v4 == 0) {
                v0 = String.valueOf(p0);
                if (v0.length() != 0)
                    v0 = "Received invalid account name: ".concat(v0);
                else
                    v0 = new String("Received invalid account name: ");
                FinskyLog.d(v0, new Object[0]);
                if (com.google.android.finsky.m.a.j(p0).a(12630239))
                    com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(371).a(-5));
                v0 = -5;
            }
            else {
                try {
                    com.google.android.finsky.m.a.b(v4.name).b(new com.google.android.finsky.billing.c(v2, v3), new com.google.android.finsky.billing.d(v2, v3));
                    if (!v3.tryAcquire(45, TimeUnit.SECONDS))
                        v2[0] = -4;
                    if (com.google.android.finsky.m.a.j(p0).a(12630239))
                        com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(371).a(v2[0]));
                    v0 = v2[0];
                }
                catch (InterruptedException ex) {
                    FinskyLog.c("Timed out while waiting for response.", new Object[0]);
                    if (com.google.android.finsky.m.a.j(p0).a(12630239))
                        com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(371).a(-4));
                }
            }
        }
        return v0;
    }

    public final Bundle b(String p0) {
        StrictMode.noteSlowCall("BillingAccountService.getOffers");
        if (com.google.android.finsky.m.a.j(p0).a(12630241)) {
            v0 = new Bundle();
            v0.putInt("result_code", -6);
            if (com.google.android.finsky.m.a.j(p0).a(12630239))
                com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(372).a(v0.getInt("result_code")));
        }
        else {
            v1 = com.google.android.finsky.m.a.U().b(p0);
            if (v1 == 0) {
                v1 = new Object[1];
                v1[0] = FinskyLog.a(p0);
                FinskyLog.d("Received invalid account name: %s", v1);
                v0 = new Bundle();
                v0.putInt("result_code", -5);
                if (com.google.android.finsky.m.a.j(p0).a(12630239))
                    com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(372).a(v0.getInt("result_code")));
            }
            else {
                v0 = this.a.a(v1);
                if (com.google.android.finsky.m.a.j(p0).a(12630239))
                    com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(372).a(v0.getInt("result_code")));
            }
        }
        return v0;
        try {
            v0 = this.a.a(v1);
            if (com.google.android.finsky.m.a.j(p0).a(12630239))
                com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(372).a(v0.getInt("result_code")));
        }
        catch (AuthFailureError ex) {
            v0 = this.a.a(v1);
            if (com.google.android.finsky.m.a.j(p0).a(12630239))
                com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(372).a(v0.getInt("result_code")));
        }
        return v0;
        try {
            v0 = this.a.a(v1);
            if (com.google.android.finsky.m.a.j(p0).a(12630239))
                com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(372).a(v0.getInt("result_code")));
        }
        catch (AuthFailureError ex) {
            v0 = new Bundle();
            v0.putInt("result_code", -3);
            if (com.google.android.finsky.m.a.j(p0).a(12630239))
                com.google.android.finsky.m.a.aR().b(p0).a(new com.google.android.finsky.d.c(372).a(v0.getInt("result_code")));
        }
        return v0;
    }

}
