package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbn extends zza {
    public static final Creator CREATOR = new C5631h();
    public final int f28638a;

    public zzbn(int i) {
        this.f28638a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28638a);
        C5130b.m23853b(parcel, a);
    }
}
