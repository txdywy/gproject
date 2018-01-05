package com.google.android.finsky.billing.setupwizard;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.a.w;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;

public class SetupWizardPaymentsAccountChangeBroadcastReceiver extends android.support.v4.a.w
{

    SetupWizardPaymentsAccountChangeBroadcastReceiver() {
        android.support.v4.a.w();
    }

    public void onReceive(Context p0, Intent p1) {
        v0 = com.google.android.finsky.m.a.U().d();
        FinskyLog.a(26 + "accountsLength=" + v0.length, new Object[0]);
        if (v0.length != 0) {
            v1 = new Intent(p0, SetupWizardPaymentsEnablementService);
            v1.putExtra("accountName", v0[0].name);
            SetupWizardPaymentsAccountChangeBroadcastReceiver.a(p0, v1);
            FinskyLog.a("Disabling component", new Object[0]);
            p0.getPackageManager().setComponentEnabledSetting(new ComponentName(p0, SetupWizardPaymentsAccountChangeBroadcastReceiver), 2, 1);
        }
    }

}
