package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzdj extends zza {
    public static final Creator CREATOR = new C5649z();
    public final int f28646a;
    public final int f28647b;

    public zzdj(int i, int i2) {
        this.f28646a = i;
        this.f28647b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28646a);
        C5130b.m23854b(parcel, 3, this.f28647b);
        C5130b.m23853b(parcel, a);
    }
}
