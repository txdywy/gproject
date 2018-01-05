package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.co;
import java.util.List;
import java.util.concurrent.FutureTask;

final class br extends bl {
    public final List f28592b;

    br(co coVar, List list) {
        super(coVar);
        this.f28592b = list;
    }

    public final void mo5072a(zzfs com_google_android_gms_wearable_internal_zzfs) {
        m26761a(new C5639p(bi.m26760a(com_google_android_gms_wearable_internal_zzfs.f28686a), com_google_android_gms_wearable_internal_zzfs.f28687b));
        if (com_google_android_gms_wearable_internal_zzfs.f28686a != 0) {
            for (FutureTask cancel : this.f28592b) {
                cancel.cancel(true);
            }
        }
    }
}
