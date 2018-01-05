package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import com.google.android.finsky.cq.d;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.d.a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.lightpurchase.z implements Runnable
{

    public final int a;
    public final Intent b;
    public final LightPurchaseFlowActivity c;

    z(LightPurchaseFlowActivity p0, int p1, Intent p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        if (this.b != 0)
            this.c.C = this.c.t.a(this.b.getExtras(), this.c.C);
        else
            FinskyLog.e("The result intent should always be set by AppPermissionActivity", new Object[0]);
        if (this.a == -1) {
            v5 = new Object[1];
            v5[0] = this.c.J;
            FinskyLog.a("Permissions accepted: %s", v5);
            if (this.b.getBooleanExtra("AppsPermissionsActivity.acceptedNewBuckets", 0)) {
                com.google.android.finsky.m.a.aV();
                com.google.android.finsky.cq.d.a(com.google.android.finsky.m.a.c(), this.c.K.b);
            }
            this.c.T = (Document)this.b.getParcelableExtra("AppsPermissionsActivity.doc");
            v0 = this.c.T.e(this.c.L);
            if (v0 == 0) {
                v4 = new Object[1];
                v4[0] = Integer.valueOf(this.c.L);
                FinskyLog.d("Offer not found: type=%d", v4);
                this.c.l();
                v0 = 0;
            }
            else {
                this.c.N = v0.n;
                this.c.V = this.b.getIntExtra("AppsPermissionsActivity.appVersion", 0);
                this.c.W = this.b.getStringExtra("AppsPermissionsActivity.appTitle");
                this.c.af = this.b.getBundleExtra("AppsPermissionsActivity.appDownloadSizeWarningArguments");
                v0 = 1;
            }
            if (v0 != 0) {
                if (this.c.ao != 0 && this.c.D())
                    this.c.F();
                else if (!this.c.h(1)) {
                    if (this.c.am == 0)
                        this.c.i(1);
                    else if (this.c.an != 0 && this.c.D())
                        this.c.F();
                    else if (this.c.C())
                        this.c.E();
                    else
                        this.c.B();
                }
            }
        }
        else {
            v2 = new Object[1];
            v2[0] = this.c.J;
            FinskyLog.a("Permissions declined: %s", v2);
            this.c.l();
        }
    }

}
