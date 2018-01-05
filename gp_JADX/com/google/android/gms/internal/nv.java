package com.google.android.gms.internal;

import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.C5328c;
import com.google.android.gms.udc.UdcCacheResponse;

public final class nv implements C4980w, C5328c {
    public final Status f27212a;
    public final UdcCacheResponse f27213b;

    public nv(Status status, UdcCacheResponse udcCacheResponse) {
        this.f27212a = status;
        this.f27213b = udcCacheResponse;
    }

    public final UdcCacheResponse mo4843a() {
        return this.f27213b;
    }

    public final Status mo4505b() {
        return this.f27212a;
    }
}
