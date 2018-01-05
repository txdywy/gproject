package com.google.android.finsky.bc;

import android.content.Intent;
import com.google.android.finsky.aa.C0955b;

final class ab implements C1569m {
    public final /* synthetic */ aa f8382a;

    ab(aa aaVar) {
        this.f8382a = aaVar;
    }

    public final void mo2338c() {
        String a = this.f8382a.e.mo2344a();
        String a2 = this.f8382a.e.mo2345a(3);
        String a3 = this.f8382a.e.mo2345a(2);
        C1567a e = this.f8382a.e.mo2349e();
        this.f8382a.e.mo2348d().m9154a(new Intent("com.google.android.gms.family.v2.ACCEPT_TOS").setPackage((String) C0955b.eX.m28964b()).putExtra("accountName", a).putExtra("appId", e.f8376a).putExtra("tosRequired", true).putExtra("tosContinueButton", a2).putExtra("tosContent", a3).putExtra("predefinedTheme", e.f8377b), 3);
    }
}
