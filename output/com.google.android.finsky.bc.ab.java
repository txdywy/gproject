package com.google.android.finsky.bc;

import android.content.Intent;
import com.google.android.finsky.aa.b;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.bc.ab implements com.google.android.finsky.bc.m
{

    public final com.google.android.finsky.bc.aa a;

    ab(com.google.android.finsky.bc.aa p0) {
        this.a = p0;
    }

    public final void c() {
        v4 = this.a.e.e();
        this.a.e.d().a(new Intent("com.google.android.gms.family.v2.ACCEPT_TOS").setPackage((String)com.google.android.finsky.aa.b.eX.b()).putExtra("accountName", this.a.e.a()).putExtra("appId", v4.a).putExtra("tosRequired", 1).putExtra("tosContinueButton", this.a.e.a(3)).putExtra("tosContent", this.a.e.a(2)).putExtra("predefinedTheme", v4.b), 3);
    }

}
