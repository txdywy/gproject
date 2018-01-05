package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;

public final class zi extends ng implements zh {
    zi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    public final IBinder mo4965a(C5161a c5161a) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_ = m23094a(1, cw_);
        IBinder readStrongBinder = cw_.readStrongBinder();
        cw_.recycle();
        return readStrongBinder;
    }
}
