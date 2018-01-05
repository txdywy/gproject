package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class gc extends ng implements gb {
    gc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdm.internal.INetworkQualityService");
    }

    public final void mo4725a(fd fdVar) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) fdVar);
        m23095b(2, cw_);
    }

    public final void mo4726a(String str, Bundle bundle, Bundle bundle2) {
        Parcel cw_ = cw_();
        cw_.writeString(str);
        ni.m25194a(cw_, (Parcelable) bundle);
        ni.m25194a(cw_, (Parcelable) bundle2);
        m23095b(1, cw_);
    }
}
