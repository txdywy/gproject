package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5614b;

final class ae implements C1643x {
    public final /* synthetic */ C4805z f24777a;

    ae(C4805z c4805z) {
        this.f24777a = c4805z;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (!((C5614b) c4980w).mo4505b().m23271a()) {
            FinskyLog.m21667d("Writing %s for node %s failed with error %d", this.f24777a.f25078f, this.f24777a.f25076d, Integer.valueOf(((C5614b) c4980w).mo4505b().f25631g));
        }
        this.f24777a.f25073a.mo4391c();
    }
}
