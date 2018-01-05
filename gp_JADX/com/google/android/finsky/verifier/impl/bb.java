package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.finsky.packagemanager.C3280e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.p259a.p260a.ac;
import com.google.android.finsky.verifier.p259a.p260a.ae;

final class bb implements C3280e {
    public final /* synthetic */ PackageInfo f24434a;
    public final /* synthetic */ PendingIntent f24435b;
    public final /* synthetic */ byte[] f24436c;
    public final /* synthetic */ boolean f24437d;
    public final /* synthetic */ String f24438e;
    public final /* synthetic */ String f24439f;
    public final /* synthetic */ az f24440g;

    bb(az azVar, PackageInfo packageInfo, PendingIntent pendingIntent, byte[] bArr, boolean z, String str, String str2) {
        this.f24440g = azVar;
        this.f24434a = packageInfo;
        this.f24435b = pendingIntent;
        this.f24436c = bArr;
        this.f24437d = z;
        this.f24438e = str;
        this.f24439f = str2;
    }

    public final void mo3412a(String str, int i) {
        if (!str.equals(this.f24434a.packageName)) {
            FinskyLog.m21665c("Encountered unexpected uninstallation result for %s while waiting for uninstallation for %s", str, this.f24434a.packageName);
            this.f24440g.m22094a(this.f24435b, false);
            this.f24440g.m22069l();
        } else if (i != 1) {
            Context context = this.f24440g.f24418i;
            String str2 = this.f24434a.packageName;
            Integer valueOf = Integer.valueOf(this.f24434a.versionCode);
            byte[] bArr = this.f24436c;
            Integer valueOf2 = Integer.valueOf(i);
            ae aeVar = new ae();
            aeVar.f24124b = new ac();
            aeVar.f24124b.m21860a(true);
            aeVar.f24124b.m21865b(9);
            if (str2 != null) {
                aeVar.f24124b.m21859a(str2);
            }
            if (valueOf != null) {
                aeVar.f24124b.m21866c(valueOf.intValue());
            }
            if (bArr != null) {
                aeVar.f24124b.m21861a(bArr);
            }
            if (valueOf2 != null) {
                ac acVar = aeVar.f24124b;
                int intValue = valueOf2.intValue();
                acVar.f24109a |= 128;
                acVar.f24118j = intValue;
            }
            bf.m22118a(context, aeVar, true);
            if (!this.f24437d) {
                PackageVerificationService.m22004a(this.f24440g.f24412c, str, this.f24436c, true);
            }
            this.f24440g.m22094a(this.f24435b, false);
            this.f24440g.m22069l();
        } else {
            this.f24440g.m22094a(this.f24435b, true);
            com.google.android.finsky.utils.bb.m21792a(new bc(this, i), new Void[0]);
        }
    }
}
