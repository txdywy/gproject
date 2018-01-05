package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;
import java.util.List;

public final class as extends ng implements aq {
    as(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    public final void mo5094a(DataHolder dataHolder) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) dataHolder);
        m23096c(1, cw_);
    }

    public final void mo5095a(zzai com_google_android_gms_wearable_internal_zzai) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_wearable_internal_zzai);
        m23096c(8, cw_);
    }

    public final void mo5096a(zzaq com_google_android_gms_wearable_internal_zzaq) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_wearable_internal_zzaq);
        m23096c(7, cw_);
    }

    public final void mo5097a(zzfc com_google_android_gms_wearable_internal_zzfc) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_wearable_internal_zzfc);
        m23096c(2, cw_);
    }

    public final void mo5098a(zzfn com_google_android_gms_wearable_internal_zzfn) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_wearable_internal_zzfn);
        m23096c(3, cw_);
    }

    public final void mo5099a(zzl com_google_android_gms_wearable_internal_zzl) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_wearable_internal_zzl);
        m23096c(9, cw_);
    }

    public final void mo5100a(zzt com_google_android_gms_wearable_internal_zzt) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_wearable_internal_zzt);
        m23096c(6, cw_);
    }

    public final void mo5101a(List list) {
        Parcel cw_ = cw_();
        cw_.writeTypedList(list);
        m23096c(5, cw_);
    }

    public final void mo5102b(zzfn com_google_android_gms_wearable_internal_zzfn) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) com_google_android_gms_wearable_internal_zzfn);
        m23096c(4, cw_);
    }
}
