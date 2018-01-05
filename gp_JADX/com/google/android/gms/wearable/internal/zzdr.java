package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzdr extends zza {
    public static final Creator CREATOR = new ad();
    public final int f28654a;
    public final ParcelFileDescriptor f28655b;

    public zzdr(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f28654a = i;
        this.f28655b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28654a);
        C5130b.m23842a(parcel, 3, this.f28655b, i);
        C5130b.m23853b(parcel, a);
    }
}
