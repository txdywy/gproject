package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzl;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class ab extends ng implements aa {
    public ab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean mo4609a(zzl com_google_android_gms_common_zzl, C5161a c5161a) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_common_zzl);
        ni.m25193a(cw_, (IInterface) c5161a);
        cw_ = m23094a(5, cw_);
        boolean a = ni.m25196a(cw_);
        cw_.recycle();
        return a;
    }
}
