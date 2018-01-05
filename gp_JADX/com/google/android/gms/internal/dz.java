package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class dz extends ng implements dy {
    dz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
    }

    public final void mo4714a(dw dwVar) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) dwVar);
        m23095b(1002, cw_);
    }
}
