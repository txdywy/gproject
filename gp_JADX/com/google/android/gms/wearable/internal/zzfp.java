package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzfp extends zza {
    public static final Creator CREATOR = new bc();
    public final int f28684a;
    public final zzas f28685b;

    public zzfp(int i, zzas com_google_android_gms_wearable_internal_zzas) {
        this.f28684a = i;
        this.f28685b = com_google_android_gms_wearable_internal_zzas;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28684a);
        C5130b.m23842a(parcel, 3, this.f28685b, i);
        C5130b.m23853b(parcel, a);
    }
}
