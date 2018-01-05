package com.google.android.finsky.bh;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.ConnectionResult;

public final class com.google.android.finsky.bh.g implements com.google.android.gms.common.api.r
{

    public final com.google.android.finsky.bh.b a;

    g(com.google.android.finsky.bh.b p0) {
        this.a = p0;
    }

    public final void a(ConnectionResult p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.c("Could not connect to GMS for Auto connection state: %s", v1);
        this.a.a();
    }

}
