package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzfy extends zza {
    public static final Creator CREATOR = new bg();
    public final int f28689a;
    public final int f28690b;

    public zzfy(int i, int i2) {
        this.f28689a = i;
        this.f28690b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28689a);
        C5130b.m23854b(parcel, 3, this.f28690b);
        C5130b.m23853b(parcel, a);
    }
}
