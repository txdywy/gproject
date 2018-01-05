package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.bb;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class ai extends ng implements ah {
    ai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.instantapps.internal.IInstantAppsService");
    }

    public final void mo4668a(bb bbVar, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) bbVar);
        cw_.writeString(str);
        m23095b(4, cw_);
    }

    public final void mo4669a(bb bbVar, String str, boolean z) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) bbVar);
        cw_.writeString(str);
        ni.m25195a(cw_, z);
        m23095b(24, cw_);
    }

    public final void mo4670a(af afVar) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) afVar);
        m23095b(13, cw_);
    }

    public final void mo4671a(af afVar, Intent intent) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) afVar);
        ni.m25194a(cw_, (Parcelable) intent);
        m23095b(2, cw_);
    }

    public final void mo4672b(bb bbVar, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) bbVar);
        cw_.writeString(str);
        m23095b(23, cw_);
    }

    public final void mo4673c(bb bbVar, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) bbVar);
        cw_.writeString(str);
        m23095b(20, cw_);
    }
}
