package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
public final class zzdz extends zza {
    public static final Creator CREATOR = new ai();
    public final int f28663a;
    public final ConnectionConfiguration f28664b;

    public zzdz(int i, ConnectionConfiguration connectionConfiguration) {
        this.f28663a = i;
        this.f28664b = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28663a);
        C5130b.m23842a(parcel, 3, this.f28664b, i);
        C5130b.m23853b(parcel, a);
    }
}
