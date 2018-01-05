package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cq.C2363d;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;

final class C1993z implements Runnable {
    public final /* synthetic */ int f10115a;
    public final /* synthetic */ Intent f10116b;
    public final /* synthetic */ LightPurchaseFlowActivity f10117c;

    C1993z(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.f10117c = lightPurchaseFlowActivity;
        this.f10115a = i;
        this.f10116b = intent;
    }

    public final void run() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f10117c;
        int i = this.f10115a;
        Intent intent = this.f10116b;
        if (intent != null) {
            lightPurchaseFlowActivity.C = lightPurchaseFlowActivity.f9671t.m13182a(intent.getExtras(), lightPurchaseFlowActivity.C);
        } else {
            FinskyLog.m21669e("The result intent should always be set by AppPermissionActivity", new Object[0]);
        }
        if (i == -1) {
            boolean z;
            FinskyLog.m21659a("Permissions accepted: %s", lightPurchaseFlowActivity.f9653J);
            if (intent.getBooleanExtra("AppsPermissionsActivity.acceptedNewBuckets", false)) {
                C1473m.f7980a.aV();
                C2363d.m11989a(C1473m.f7980a.mo2169c(), lightPurchaseFlowActivity.f9654K.f11833b);
            }
            Document document = (Document) intent.getParcelableExtra("AppsPermissionsActivity.doc");
            int intExtra = intent.getIntExtra("AppsPermissionsActivity.appVersion", 0);
            String stringExtra = intent.getStringExtra("AppsPermissionsActivity.appTitle");
            Bundle bundleExtra = intent.getBundleExtra("AppsPermissionsActivity.appDownloadSizeWarningArguments");
            lightPurchaseFlowActivity.f9663T = document;
            bl e = lightPurchaseFlowActivity.f9663T.m14649e(lightPurchaseFlowActivity.f9655L);
            if (e == null) {
                FinskyLog.m21667d("Offer not found: type=%d", Integer.valueOf(lightPurchaseFlowActivity.f9655L));
                lightPurchaseFlowActivity.m10087l();
                z = false;
            } else {
                lightPurchaseFlowActivity.f9657N = e.f11924n;
                lightPurchaseFlowActivity.f9665V = intExtra;
                lightPurchaseFlowActivity.f9666W = stringExtra;
                lightPurchaseFlowActivity.af = bundleExtra;
                z = true;
            }
            if (!z) {
                return;
            }
            if (lightPurchaseFlowActivity.ao && lightPurchaseFlowActivity.m10068D()) {
                lightPurchaseFlowActivity.m10070F();
                return;
            } else if (!lightPurchaseFlowActivity.m10084h(true)) {
                if (!lightPurchaseFlowActivity.am) {
                    lightPurchaseFlowActivity.m10085i(true);
                    return;
                } else if (lightPurchaseFlowActivity.an && lightPurchaseFlowActivity.m10068D()) {
                    lightPurchaseFlowActivity.m10070F();
                    return;
                } else if (lightPurchaseFlowActivity.m10067C()) {
                    lightPurchaseFlowActivity.m10069E();
                    return;
                } else {
                    lightPurchaseFlowActivity.m10066B();
                    return;
                }
            } else {
                return;
            }
        }
        FinskyLog.m21659a("Permissions declined: %s", lightPurchaseFlowActivity.f9653J);
        lightPurchaseFlowActivity.m10087l();
    }
}
