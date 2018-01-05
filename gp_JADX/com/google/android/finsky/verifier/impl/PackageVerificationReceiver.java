package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

public class PackageVerificationReceiver extends BroadcastReceiver {
    public C2471a f24305a;

    public PackageVerificationReceiver() {
        ((ac) C3947d.m18649a(ac.class)).mo1974a(this);
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PACKAGE_NEEDS_VERIFICATION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                int i;
                int i2 = extras.getInt("android.content.pm.extra.VERIFICATION_ID");
                if (VERSION.SDK_INT < 17) {
                    FinskyLog.m21659a("Skipping verification because SDK=%d", Integer.valueOf(VERSION.SDK_INT));
                    i = 0;
                } else {
                    i = 1;
                }
                if (i != 0) {
                    FinskyLog.m21659a("Verification requested, id = %d", Integer.valueOf(i2));
                    if (((Boolean) C0955b.cC.m28964b()).booleanValue()) {
                        C2495w a = this.f24305a.m13178a(null);
                        a.m13367a(new C2474c(2620));
                        Bundle bundle = new Bundle();
                        a.m13377a(bundle);
                        intent.putExtra("logging_context", bundle);
                    }
                    PackageVerificationService.m22003a(context, intent);
                    return;
                }
                context.getPackageManager().verifyPendingInstall(i2, 1);
                return;
            }
            return;
        }
        FinskyLog.m21665c("Unexpected action %s", intent.getAction());
    }
}
