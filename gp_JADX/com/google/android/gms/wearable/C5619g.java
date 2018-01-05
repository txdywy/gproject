package com.google.android.gms.wearable;

import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C5104j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.C5648y;

public final class C5619g extends C5104j implements C4980w {
    public final Status f28574d;

    public C5619g(DataHolder dataHolder) {
        super(dataHolder);
        this.f28574d = new Status(dataHolder.f25953e);
    }

    protected final /* synthetic */ Object mo5063a(int i, int i2) {
        return new C5648y(this.a, i, i2);
    }

    public final Status mo4505b() {
        return this.f28574d;
    }

    protected final String mo5064d() {
        return "path";
    }
}
