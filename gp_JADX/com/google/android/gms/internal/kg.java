package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class kg extends ng implements kf {
    kg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void mo4765a(kd kdVar, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) kdVar);
        cw_.writeString(str);
        m23095b(3, cw_);
    }

    public final void mo4766a(kd kdVar, String str, int i, String[] strArr, byte[] bArr) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) kdVar);
        cw_.writeString(str);
        cw_.writeInt(i);
        cw_.writeStringArray(strArr);
        cw_.writeByteArray(bArr);
        m23095b(1, cw_);
    }

    public final void mo4767a(kd kdVar, String str, int i, String[] strArr, byte[] bArr, String str2, String str3) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) kdVar);
        cw_.writeString(str);
        cw_.writeInt(i);
        cw_.writeStringArray(strArr);
        cw_.writeByteArray(bArr);
        cw_.writeString(str2);
        cw_.writeString(str3);
        m23095b(13, cw_);
    }

    public final void mo4768a(kd kdVar, String str, String str2, String str3) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) kdVar);
        cw_.writeString(str);
        cw_.writeString(str2);
        cw_.writeString(str3);
        m23095b(11, cw_);
    }

    public final void mo4769b(kd kdVar, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) kdVar);
        cw_.writeString(str);
        m23095b(5, cw_);
    }

    public final void mo4770c(kd kdVar, String str) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) kdVar);
        cw_.writeString(str);
        cw_.writeString(null);
        m23095b(6, cw_);
    }
}
