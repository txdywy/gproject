package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class dk extends ng implements dj {
    dk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void mo4711a(dh dhVar) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) dhVar);
        m23096c(1, cw_);
    }
}
