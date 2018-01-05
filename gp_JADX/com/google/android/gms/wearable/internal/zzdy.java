package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzdy extends zza {
    public static final Creator CREATOR = new ag();
    public final int f28661a;
    public final boolean f28662b;

    public zzdy(int i, boolean z) {
        this.f28661a = i;
        this.f28662b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28661a);
        C5130b.m23846a(parcel, 3, this.f28662b);
        C5130b.m23853b(parcel, a);
    }
}
