package com.google.android.finsky.billing.setupwizard;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.android.volley.a.ag;
import com.google.android.finsky.api.c;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.google.wireless.android.finsky.dfe.nano.aq;
import java.util.concurrent.ExecutionException;

public class SetupWizardPaymentsEnablementService extends IntentService
{

    public final com.google.android.finsky.d.a a;

    SetupWizardPaymentsEnablementService() {
        IntentService("SuwPaymentEnableService");
        this.a = com.google.android.finsky.m.a.aR();
    }

    private static void a(com.google.android.finsky.d.w p0, Throwable p1) {
        v0 = 1;
        v1 = new com.google.android.finsky.d.c(370);
        if (p1 == 0)
            v1.a(1);
        else {
            if (!(p1 instanceof VolleyError))
                v0 = 2;
            v1.a(0).a(v0).a(p1);
        }
        p0.a(v1);
    }

    private final void a(Class p0, boolean p1) {
        if (p1 != 0)
            v0 = 1;
        else
            v0 = 2;
        this.getPackageManager().setComponentEnabledSetting(new ComponentName(this, p0), v0, 1);
    }

    private static boolean a(com.google.android.finsky.d.w p0, com.google.android.finsky.api.c p1) {
        p0.a(new com.google.android.finsky.d.c(369));
        v0 = new com.android.volley.a.ag();
        p1.b(v0, v0);
        try {
            v0 = (com.google.wireless.android.finsky.dfe.nano.aq)v0.get();
            SetupWizardPaymentsEnablementService.a(p0, 0);
            v4 = new Object[2];
            v4[0] = Boolean.valueOf(v0.d());
            v4[1] = Boolean.valueOf(v0.b);
            FinskyLog.a("hasUserHasValidInstrument=%b getUserHasValidInstrument=%b", v4);
            if (v0.d() && v0.b == 0)
                v0 = 1;
            else
                v0 = 0;
        }
        catch (InterruptedException ex) {
            v1 = new Object[1];
            v1[0] = ex;
            FinskyLog.c("InterruptedException %s", v1);
            SetupWizardPaymentsEnablementService.a(p0, ex);
            v0 = 0;
        }
        catch (ExecutionException ex) {
            v1 = new Object[1];
            v1[0] = ex.getCause();
            FinskyLog.c("ExecutionException cause=%s", v1);
            SetupWizardPaymentsEnablementService.a(p0, ex.getCause());
            v0 = 0;
        }
        return v0;
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

    protected void onHandleIntent(Intent p0) {
        try {
            v0 = p0.getStringExtra("accountName");
            if (TextUtils.isEmpty(v0)) {
                FinskyLog.d("No account received", new Object[0]);
                SetupWizardPaymentsAccountChangeBroadcastReceiver.a(p0);
            }
            else {
                try {
                    FinskyLog.a("Processing account", new Object[0]);
                    v1 = this.a.a(p0.getExtras(), this.a.b(v0));
                    if (SetupWizardPaymentsEnablementService.a(v1, com.google.android.finsky.m.a.b(v0))) {
                        FinskyLog.a("Enabling Payments optional step", new Object[0]);
                        this.a(PaymentsOptionalStepShimActivity, 1);
                        v1.a(new com.google.android.finsky.d.c(368));
                    }
                    FinskyLog.a("Disabling component", new Object[0]);
                    this.a(SetupWizardPaymentsEnablementService, 0);
                }
                catch (Throwable ex) {
                    SetupWizardPaymentsAccountChangeBroadcastReceiver.a(p0);
                    throw ex;
                }
                SetupWizardPaymentsAccountChangeBroadcastReceiver.a(p0);
            }
        }
        catch (Throwable ex) {
            SetupWizardPaymentsAccountChangeBroadcastReceiver.a(p0);
            throw ex;
        }
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
