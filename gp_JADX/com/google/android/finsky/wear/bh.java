package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5624k;

final class bh implements C1643x {
    bh() {
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        if (!((C5624k) c4980w).mo4505b().m23271a()) {
            FinskyLog.m21665c("request checkin message failed status=%d", Integer.valueOf(((C5624k) c4980w).mo4505b().f25631g));
        }
    }
}
