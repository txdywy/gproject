package com.google.android.finsky.verifier.impl;

import android.app.Activity;
import android.content.pm.PackageInfo;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.cu;

class VerifyParentInstallTask$1 extends ActivityListener {
    public final /* synthetic */ CharSequence f24344a;
    public final /* synthetic */ CharSequence f24345b;
    public final /* synthetic */ PackageInfo f24346c;
    public final /* synthetic */ eb f24347d;

    VerifyParentInstallTask$1(eb ebVar, CharSequence charSequence, CharSequence charSequence2, PackageInfo packageInfo) {
        this.f24347d = ebVar;
        this.f24344a = charSequence;
        this.f24345b = charSequence2;
        this.f24346c = packageInfo;
    }

    public final /* synthetic */ void mo4338b(Activity activity) {
        boolean z = true;
        int i = 0;
        PackageWarningDialog packageWarningDialog = (PackageWarningDialog) activity;
        bb.m21791a();
        if (packageWarningDialog.isFinishing()) {
            int i2 = packageWarningDialog.f24320v;
            this.f24347d.m22347a(i2);
            if (packageWarningDialog.f24321w) {
                cu cuVar = this.f24347d.f24661i;
                if (i2 != 1) {
                    z = false;
                }
                cuVar.a |= 16;
                cuVar.f = z;
                if (i2 == -1) {
                    this.f24347d.m22348a(this.f24344a, this.f24345b);
                    eb ebVar = this.f24347d;
                    String str = this.f24346c.packageName;
                    C2129c a = ebVar.f24653a.mo2657a(str);
                    if (a != null) {
                        i = a.f10824r;
                    }
                    ebVar.f24653a.mo2678e(str, i | 32);
                }
            }
            this.f24347d.m22069l();
        }
    }

    public final /* synthetic */ void mo4337a(Activity activity) {
        PackageWarningDialog packageWarningDialog = (PackageWarningDialog) activity;
        bb.m21791a();
        if (this.f24347d.m22070m()) {
            packageWarningDialog.finish();
        }
    }
}
