package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.herrevad.NetworkQualityReport;

public final class fg extends ng implements ff {
    fg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
    }

    public final void mo4720a(NetworkQualityReport networkQualityReport) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) networkQualityReport);
        m23095b(1, cw_);
    }
}
