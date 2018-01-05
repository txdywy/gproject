package com.google.android.finsky.bc;

import android.content.Intent;
import com.google.android.finsky.aa.C0955b;

final class C1572d implements C1569m {
    public final /* synthetic */ C1571c f8387a;

    C1572d(C1571c c1571c) {
        this.f8387a = c1571c;
    }

    public final void mo2338c() {
        String a = this.f8387a.e.mo2344a();
        String a2 = this.f8387a.e.mo2345a(3);
        String a3 = this.f8387a.e.mo2345a(2);
        C1567a e = this.f8387a.e.mo2349e();
        this.f8387a.e.mo2348d().m9154a(new Intent("com.google.android.gms.family.v2.CREATE").setPackage((String) C0955b.eX.m28964b()).putExtra("accountName", a).putExtra("appId", e.f8376a).putExtra("tosRequired", true).putExtra("tosContinueButton", a2).putExtra("tosContent", a3).putExtra("predefinedTheme", e.f8377b), 1);
    }
}
