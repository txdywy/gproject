package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzdw extends zza {
    public static final Creator CREATOR = new af();
    public final int f28658a;
    public final boolean f28659b;
    public final boolean f28660c;

    public zzdw(int i, boolean z, boolean z2) {
        this.f28658a = i;
        this.f28659b = z;
        this.f28660c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28658a);
        C5130b.m23846a(parcel, 3, this.f28659b);
        C5130b.m23846a(parcel, 4, this.f28660c);
        C5130b.m23853b(parcel, a);
    }
}
