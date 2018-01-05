package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public final class zzed extends zza {
    public static final Creator CREATOR = new ak();
    public final int f28667a;
    public final List f28668b;

    public zzed(int i, List list) {
        this.f28667a = i;
        this.f28668b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28667a);
        C5130b.m23855b(parcel, 3, this.f28668b);
        C5130b.m23853b(parcel, a);
    }
}
