package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class lx extends ng implements lw {
    lx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    public final void mo4809a(int i, Bundle bundle) {
        Parcel cw_ = cw_();
        cw_.writeInt(i);
        ni.m25194a(cw_, (Parcelable) bundle);
        m23095b(11, cw_);
    }

    public final void mo4810a(lu luVar) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) luVar);
        m23095b(2, cw_);
    }

    public final void mo4811a(lu luVar, String str, int i, byte[] bArr) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) luVar);
        cw_.writeString(str);
        cw_.writeInt(i);
        cw_.writeByteArray(bArr);
        m23095b(10, cw_);
    }

    public final void mo4812a(lu luVar, String str, int[] iArr, String str2) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) luVar);
        cw_.writeString(str);
        cw_.writeIntArray(iArr);
        cw_.writeInt(2);
        cw_.writeString(str2);
        m23095b(3, cw_);
    }

    public final void mo4813a(lu luVar, byte[] bArr, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) luVar);
        cw_.writeByteArray(bArr);
        cw_.writeString(str);
        m23095b(7, cw_);
    }

    public final void mo4814b(lu luVar) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) luVar);
        m23095b(9, cw_);
    }
}
