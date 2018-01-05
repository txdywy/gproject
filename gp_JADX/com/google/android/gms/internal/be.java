package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class be extends ng implements bd {
    be(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporter");
    }

    public final void mo4699a(Bundle bundle) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) bundle);
        m23095b(1, cw_);
    }
}
