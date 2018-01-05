package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzbt;

public final class zzeda extends zza {
    public static final Creator CREATOR = new ne();
    public int f27834a;
    public zzbt f27835b;

    zzeda(int i, zzbt com_google_android_gms_common_internal_zzbt) {
        this.f27834a = i;
        this.f27835b = com_google_android_gms_common_internal_zzbt;
    }

    public zzeda(zzbt com_google_android_gms_common_internal_zzbt) {
        this(1, com_google_android_gms_common_internal_zzbt);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f27834a);
        C5130b.m23842a(parcel, 2, this.f27835b, i);
        C5130b.m23853b(parcel, a);
    }
}
