package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;

public final class tq extends ng implements tp {
    tq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder mo4879a(String str, C5161a c5161a) {
        Parcel cw_ = cw_();
        cw_.writeString(str);
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_ = m23094a(2, cw_);
        IBinder readStrongBinder = cw_.readStrongBinder();
        cw_.recycle();
        return readStrongBinder;
    }
}
