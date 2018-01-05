package com.google.android.finsky.setup;

import android.content.Intent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.utils.FinskyLog;

final class C4184q implements Runnable {
    public final /* synthetic */ Intent f21107a;
    public final /* synthetic */ PlaySetupService f21108b;

    C4184q(PlaySetupService playSetupService, Intent intent) {
        this.f21108b = playSetupService;
        this.f21107a = intent;
    }

    public final void run() {
        boolean z = true;
        PlaySetupService playSetupService = this.f21108b;
        playSetupService.f20550c--;
        C1003o c1003o = this.f21108b;
        Intent intent = this.f21107a;
        if (intent.hasExtra("package_name") && intent.hasExtra("version_code") && intent.hasExtra("title")) {
            String stringExtra = intent.getStringExtra("package_name");
            int intExtra = intent.getIntExtra("version_code", 0);
            String stringExtra2 = intent.getStringExtra("title");
            boolean booleanExtra = intent.getBooleanExtra("critical", false);
            if (c1003o.f20552e != null) {
                FinskyLog.m21669e("Received command to early-update %s while already handling %s", stringExtra, c1003o.f20552e);
            }
            c1003o.f20552e = stringExtra;
            c1003o.f20554g = booleanExtra;
            C3300k o = C1473m.f7980a.mo2256o();
            if (!c1003o.f20555h) {
                C1473m.f7980a.bw().mo3481a(c1003o);
                c1003o.f20555h = true;
            }
            o.mo3431a(stringExtra);
            o.mo3440a(stringExtra, false, false, false);
            o.mo3451e(stringExtra);
            o.mo3452f(stringExtra);
            o.mo3432a(stringExtra, intExtra, null, stringExtra2, 1, null, c1003o.f20548a.m13184a("early_update"));
        } else {
            FinskyLog.m21669e("Unknown command intent %s", intent);
            z = false;
        }
        if (!z) {
            this.f21108b.m19076a();
        }
    }
}
