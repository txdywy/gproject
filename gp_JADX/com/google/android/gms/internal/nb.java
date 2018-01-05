package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5110o;

public final class nb extends ng implements na {
    nb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void mo4821a(int i) {
        Parcel cw_ = cw_();
        cw_.writeInt(i);
        m23095b(7, cw_);
    }

    public final void mo4822a(C5110o c5110o, int i, boolean z) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c5110o);
        cw_.writeInt(i);
        ni.m25195a(cw_, z);
        m23095b(9, cw_);
    }

    public final void mo4823a(zzeda com_google_android_gms_internal_zzeda, my myVar) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzeda);
        ni.m25193a(cw_, (IInterface) myVar);
        m23095b(12, cw_);
    }
}
