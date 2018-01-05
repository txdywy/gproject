package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;

public final class bg extends ng implements bf {
    bg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
    }

    public final IBinder mo4700a(C5161a c5161a) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_ = m23094a(1, cw_);
        IBinder readStrongBinder = cw_.readStrongBinder();
        cw_.recycle();
        return readStrongBinder;
    }
}
