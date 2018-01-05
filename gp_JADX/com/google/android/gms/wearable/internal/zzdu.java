package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzdu extends zza {
    public static final Creator CREATOR = new ae();
    public final int f28656a;
    public final boolean f28657b;

    public zzdu(int i, boolean z) {
        this.f28656a = i;
        this.f28657b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28656a);
        C5130b.m23846a(parcel, 3, this.f28657b);
        C5130b.m23853b(parcel, a);
    }
}
