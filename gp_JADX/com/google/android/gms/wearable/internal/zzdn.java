package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzdn extends zza {
    public static final Creator CREATOR = new ab();
    public final int f28650a;
    public final zzai f28651b;

    public zzdn(int i, zzai com_google_android_gms_wearable_internal_zzai) {
        this.f28650a = i;
        this.f28651b = com_google_android_gms_wearable_internal_zzai;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28650a);
        C5130b.m23842a(parcel, 3, this.f28651b, i);
        C5130b.m23853b(parcel, a);
    }
}
