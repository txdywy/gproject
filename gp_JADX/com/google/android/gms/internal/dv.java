package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.p277c.C4981b;
import com.google.android.gms.p277c.p278a.C4976b;

final class dv implements C4981b {
    public final Status f26670a;
    public final C4976b f26671b;

    public dv(DataHolder dataHolder) {
        this.f26670a = new Status(dataHolder.f25953e);
        this.f26671b = new C4976b(dataHolder);
    }

    public final void mo4500a() {
        this.f26671b.mo4500a();
    }

    public final Status mo4505b() {
        return this.f26670a;
    }

    public final C4976b mo4506c() {
        return this.f26671b;
    }
}
