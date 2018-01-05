package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzef extends zza {
    public static final Creator CREATOR = new al();
    public final int f28669a;
    public final zzdg f28670b;

    public zzef(int i, zzdg com_google_android_gms_wearable_internal_zzdg) {
        this.f28669a = i;
        this.f28670b = com_google_android_gms_wearable_internal_zzdg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28669a);
        C5130b.m23842a(parcel, 3, this.f28670b, i);
        C5130b.m23853b(parcel, a);
    }
}
