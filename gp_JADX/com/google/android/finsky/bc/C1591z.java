package com.google.android.finsky.bc;

import android.content.Intent;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;

public final class C1591z extends C1568y {
    public C1591z(C1585q c1585q) {
        super(c1585q);
    }

    public final void mo2336a() {
        String a = this.e.mo2344a();
        C1567a e = this.e.mo2349e();
        this.e.mo2348d().m9154a(new Intent("com.google.android.gms.family.v2.INVITE_MEMBER").setPackage((String) C0955b.eX.m28964b()).putExtra("accountName", a).putExtra("appId", e.f8376a).putExtra("predefinedTheme", e.f8377b), 2);
    }

    public final void mo2337a(int i, Intent intent) {
        FinskyLog.m21659a("result code=" + i, new Object[0]);
        m9098e();
    }
}
