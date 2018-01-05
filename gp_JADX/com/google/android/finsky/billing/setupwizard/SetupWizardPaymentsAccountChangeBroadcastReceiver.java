package com.google.android.finsky.billing.setupwizard;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.p028a.C0233w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;

public class SetupWizardPaymentsAccountChangeBroadcastReceiver extends C0233w {
    public void onReceive(Context context, Intent intent) {
        Account[] d = C1473m.f7980a.mo2041U().mo1188d();
        FinskyLog.m21659a("accountsLength=" + d.length, new Object[0]);
        if (d.length != 0) {
            String str = d[0].name;
            Intent intent2 = new Intent(context, SetupWizardPaymentsEnablementService.class);
            intent2.putExtra("accountName", str);
            C0233w.m1137a(context, intent2);
            FinskyLog.m21659a("Disabling component", new Object[0]);
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, SetupWizardPaymentsAccountChangeBroadcastReceiver.class), 2, 1);
        }
    }
}
