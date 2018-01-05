package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcCacheRequest;

public final class np extends ng implements no {
    np(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.udc.internal.IUdcService");
    }

    public final void mo4829a(nm nmVar, UdcCacheRequest udcCacheRequest) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) nmVar);
        ni.m25194a(cw_, (Parcelable) udcCacheRequest);
        m23095b(8, cw_);
    }
}
