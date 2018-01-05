package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class gw extends ng implements gu {
    gw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void mo4749a(long j, String str, String str2, String str3) {
        Parcel cw_ = cw_();
        cw_.writeLong(j);
        cw_.writeString(str);
        cw_.writeString(str2);
        cw_.writeString(str3);
        m23095b(10, cw_);
    }

    public final void mo4750a(zzcqe com_google_android_gms_internal_zzcqe) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqe);
        m23095b(4, cw_);
    }

    public final void mo4751a(zzcqh com_google_android_gms_internal_zzcqh, zzcqe com_google_android_gms_internal_zzcqe) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqh);
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqe);
        m23095b(12, cw_);
    }

    public final void mo4752a(zzcqw com_google_android_gms_internal_zzcqw, zzcqe com_google_android_gms_internal_zzcqe) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqw);
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqe);
        m23095b(1, cw_);
    }

    public final void mo4753a(zzcqw com_google_android_gms_internal_zzcqw, String str, String str2) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqw);
        cw_.writeString(str);
        cw_.writeString(str2);
        m23095b(5, cw_);
    }

    public final void mo4754a(zzcvg com_google_android_gms_internal_zzcvg, zzcqe com_google_android_gms_internal_zzcqe) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcvg);
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqe);
        m23095b(2, cw_);
    }

    public final byte[] mo4755a(zzcqw com_google_android_gms_internal_zzcqw, String str) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqw);
        cw_.writeString(str);
        cw_ = m23094a(9, cw_);
        byte[] createByteArray = cw_.createByteArray();
        cw_.recycle();
        return createByteArray;
    }

    public final String mo4756b(zzcqe com_google_android_gms_internal_zzcqe) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_internal_zzcqe);
        cw_ = m23094a(11, cw_);
        String readString = cw_.readString();
        cw_.recycle();
        return readString;
    }
}
