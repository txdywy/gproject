package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;
import com.google.android.gms.wearable.PutDataRequest;

public final class au extends ng implements at {
    au(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    public final void mo5103a(ao aoVar) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) aoVar);
        m23095b(8, cw_);
    }

    public final void mo5104a(ao aoVar, Uri uri) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) aoVar);
        ni.m25194a(cw_, (Parcelable) uri);
        m23095b(7, cw_);
    }

    public final void mo5105a(ao aoVar, Uri uri, int i) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) aoVar);
        ni.m25194a(cw_, (Parcelable) uri);
        cw_.writeInt(i);
        m23095b(40, cw_);
    }

    public final void mo5106a(ao aoVar, PutDataRequest putDataRequest) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) aoVar);
        ni.m25194a(cw_, (Parcelable) putDataRequest);
        m23095b(6, cw_);
    }

    public final void mo5107a(ao aoVar, zzd com_google_android_gms_wearable_internal_zzd) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) aoVar);
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_wearable_internal_zzd);
        m23095b(16, cw_);
    }

    public final void mo5108a(ao aoVar, String str, String str2, byte[] bArr) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) aoVar);
        cw_.writeString(str);
        cw_.writeString(str2);
        cw_.writeByteArray(bArr);
        m23095b(12, cw_);
    }

    public final void mo5109b(ao aoVar, Uri uri, int i) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) aoVar);
        ni.m25194a(cw_, (Parcelable) uri);
        cw_.writeInt(i);
        m23095b(41, cw_);
    }
}
