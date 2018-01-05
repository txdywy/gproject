package com.google.android.finsky.bk;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.ConnectionResult;

public final class com.google.android.finsky.bk.e implements com.google.android.gms.common.api.r
{

    e() {
    }

    public final void a(ConnectionResult p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.d("LightweightNetworkQuality connection failed with: %s", v1);
    }

}
