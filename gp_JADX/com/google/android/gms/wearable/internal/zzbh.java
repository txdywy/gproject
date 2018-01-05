package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbh extends zza {
    public static final Creator CREATOR = new C5629f();
    public final int f28636a;

    public zzbh(int i) {
        this.f28636a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28636a);
        C5130b.m23853b(parcel, a);
    }
}
