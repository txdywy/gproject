package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzdp extends zza {
    public static final Creator CREATOR = new ac();
    public final int f28652a;
    public final ParcelFileDescriptor f28653b;

    public zzdp(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f28652a = i;
        this.f28653b = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28652a);
        C5130b.m23842a(parcel, 3, this.f28653b, i);
        C5130b.m23853b(parcel, a);
    }
}
