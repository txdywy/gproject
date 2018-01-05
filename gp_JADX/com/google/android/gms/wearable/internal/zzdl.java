package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public final class zzdl extends zza {
    public static final Creator CREATOR = new aa();
    public final int f28648a;
    public final List f28649b;

    public zzdl(int i, List list) {
        this.f28648a = i;
        this.f28649b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28648a);
        C5130b.m23855b(parcel, 3, this.f28649b);
        C5130b.m23853b(parcel, a);
    }
}
