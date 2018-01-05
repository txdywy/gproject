package com.google.android.finsky.bk;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1634r;

final class C2111e implements C1634r {
    C2111e() {
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        FinskyLog.m21667d("LightweightNetworkQuality connection failed with: %s", connectionResult);
    }
}
