package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzfs extends zza {
    public static final Creator CREATOR = new be();
    public final int f28686a;
    public final zzdg f28687b;

    public zzfs(int i, zzdg com_google_android_gms_wearable_internal_zzdg) {
        this.f28686a = i;
        this.f28687b = com_google_android_gms_wearable_internal_zzdg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28686a);
        C5130b.m23842a(parcel, 3, this.f28687b, i);
        C5130b.m23853b(parcel, a);
    }
}
