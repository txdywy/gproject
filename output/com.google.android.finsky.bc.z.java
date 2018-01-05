package com.google.android.finsky.bc;

import android.content.Intent;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.bc.z extends com.google.android.finsky.bc.y
{

    z(com.google.android.finsky.bc.q p0) {
        com.google.android.finsky.bc.y(p0);
    }

    public final void a() {
        v2 = this.e.e();
        this.e.d().a(new Intent("com.google.android.gms.family.v2.INVITE_MEMBER").setPackage((String)com.google.android.finsky.aa.b.eX.b()).putExtra("accountName", this.e.a()).putExtra("appId", v2.a).putExtra("predefinedTheme", v2.b), 2);
    }

    public final void a(int p0, Intent p1) {
        FinskyLog.a(23 + "result code=" + p0, new Object[0]);
        this.e();
    }

}
