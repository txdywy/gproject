package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzeh extends zza {
    public static final Creator CREATOR = new am();
    public final int f28671a;
    public final ParcelFileDescriptor f28672b;

    public zzeh(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f28671a = i;
        this.f28672b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i | 1;
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28671a);
        C5130b.m23842a(parcel, 3, this.f28672b, i2);
        C5130b.m23853b(parcel, a);
    }
}
