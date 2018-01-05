package com.google.android.finsky.verifier.impl;

import android.app.Activity;
import com.android.volley.C0700r;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.impl.p262a.C4731c;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;

class VerifyAppsInstallTask$7 extends ActivityListener {
    public final /* synthetic */ C4735g f24337a;
    public final /* synthetic */ bx f24338b;

    VerifyAppsInstallTask$7(bx bxVar, C4735g c4735g) {
        this.f24338b = bxVar;
        this.f24337a = c4735g;
    }

    public final /* synthetic */ void mo4338b(Activity activity) {
        PackageWarningDialog packageWarningDialog = (PackageWarningDialog) activity;
        bb.m21791a();
        this.f24338b.f24487A = null;
        if (packageWarningDialog.isFinishing()) {
            C4699c c4699c;
            this.f24338b.m22241a(packageWarningDialog.f24320v);
            synchronized (this.f24338b) {
                c4699c = this.f24338b.f24488B;
            }
            bx bxVar = this.f24338b;
            boolean z = packageWarningDialog.f24322x;
            byte[] bArr = this.f24337a.f24367d;
            bb.m21791a();
            if (bxVar.f24516y.get()) {
                int i;
                FinskyLog.m21659a("User selected %d for id=%d", Integer.valueOf(bxVar.m22255f()), Integer.valueOf(bxVar.f24506o));
                if (bxVar.m22255f() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                C4731c.m22039a().m22040a((C0700r) bxVar.f24492a.mo1a(), bxVar.f24507p, i, false, z, false, bArr);
                bxVar.f24516y.set(false);
            }
            if (packageWarningDialog.f24320v == 1) {
                if (c4699c != null) {
                    this.f24338b.f24499h.f24308a.m15229b(this.f24338b.f24507p, c4699c.f24145d.f24199b);
                }
                cs.m22283c(this.f24338b.f24499h);
            }
            if (c4699c != null) {
                C4809e b;
                bx bxVar2 = this.f24338b;
                if (ag.m15237a(bxVar2.f24494c.dj())) {
                    int e = bxVar2.m22254e();
                    ag agVar = bxVar2.f24499h.f24309b;
                    b = agVar.m15242b(new cm(bxVar2, agVar, c4699c, e));
                } else {
                    b = null;
                }
                b.mo4398a(new ck(this));
                return;
            }
            this.f24338b.m22069l();
        }
    }

    public final /* synthetic */ void mo4337a(Activity activity) {
        PackageWarningDialog packageWarningDialog = (PackageWarningDialog) activity;
        bb.m21791a();
        if (this.f24338b.m22070m()) {
            packageWarningDialog.finish();
        } else {
            this.f24338b.f24487A = packageWarningDialog;
        }
    }
}
