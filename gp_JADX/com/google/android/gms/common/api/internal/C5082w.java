package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.mx;
import com.google.android.gms.internal.zzedc;
import java.lang.ref.WeakReference;

final class C5082w extends mx {
    public final WeakReference f25909a;

    C5082w(C5075p c5075p) {
        this.f25909a = new WeakReference(c5075p);
    }

    public final void mo4589a(zzedc com_google_android_gms_internal_zzedc) {
        C5075p c5075p = (C5075p) this.f25909a.get();
        if (c5075p != null) {
            c5075p.f25878a.m23392a(new C5083x(c5075p, c5075p, com_google_android_gms_internal_zzedc));
        }
    }
}
