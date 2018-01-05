package com.google.android.finsky.bk;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.w;

public final class com.google.android.finsky.bk.f implements com.google.android.gms.common.api.x
{

    public final com.google.android.finsky.bk.d a;

    f(com.google.android.finsky.bk.d p0) {
        this.a = p0;
    }

    public final void a(com.google.android.gms.common.api.w p0) {
        if (!((Status)p0).a()) {
            v1 = new Object[1];
            v1[0] = (Status)p0;
            FinskyLog.d("herrevad logNetworkQualityData failed: %s", v1);
        }
        this.a.h.g();
    }

}
