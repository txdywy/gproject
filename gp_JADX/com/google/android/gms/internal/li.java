package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class li extends ng implements lh {
    li(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
    }

    public final void mo4793a(lf lfVar) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) lfVar);
        m23096c(1, cw_);
    }
}
