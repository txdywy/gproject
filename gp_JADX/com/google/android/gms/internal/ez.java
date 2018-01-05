package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class ez extends ng implements ey {
    ez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzclh mo4718a(zzclf com_google_android_gms_internal_zzclf) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzclf);
        Parcel a = m23094a(1, cw_);
        zzclh com_google_android_gms_internal_zzclh = (zzclh) ni.m25192a(a, zzclh.CREATOR);
        a.recycle();
        return com_google_android_gms_internal_zzclh;
    }
}
