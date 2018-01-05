package com.google.android.gms.wearable;

import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C5104j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.C5642s;

public final class C5616d extends C5104j implements C4980w {
    public final Status f28573d;

    public C5616d(DataHolder dataHolder) {
        super(dataHolder);
        this.f28573d = new Status(dataHolder.f25953e);
    }

    protected final /* synthetic */ Object mo5063a(int i, int i2) {
        return new C5642s(this.a, i, i2);
    }

    public final Status mo4505b() {
        return this.f28573d;
    }

    protected final String mo5064d() {
        return "path";
    }
}
