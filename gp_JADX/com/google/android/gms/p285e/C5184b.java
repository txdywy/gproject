package com.google.android.gms.p285e;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.internal.fx;

final class C5184b implements C1634r {
    C5184b() {
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        if (fx.f26763a) {
            Log.d("Herrevad", "failed to connect to network quality service");
        }
        if (connectionResult.f25611c != 7 && connectionResult.f25611c != 8) {
            C5183a.f26122a = false;
        }
    }
}
