package com.google.android.finsky.bi;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.c.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

public final class com.google.android.finsky.bi.b implements com.google.android.gms.common.api.q, com.google.android.gms.common.api.r
{

    public final Context a;
    public com.google.android.gms.common.api.o b;
    public com.google.android.finsky.bi.d c;
    public boolean d;
    public Account e;

    b(Context p0) {
        this.a = p0;
    }

    public final void a(int p0) {
        if (this.d != 0 && this.c != 0)
            this.c.a();
    }

    public final void a(Bundle p0) {
        com.google.android.gms.c.a.a(this.b).a(new com.google.android.finsky.bi.c(this));
    }

    public final void a(ConnectionResult p0) {
        if (this.d != 0 && this.c != 0)
            this.c.a();
        if (p0.c != 1 && p0.c != 2 && p0.c != 3) {
            v1 = new Object[1];
            v1[0] = p0;
            FinskyLog.c("onConnectionFailed result: %s", v1);
        }
    }

}
