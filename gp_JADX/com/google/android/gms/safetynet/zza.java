package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;

public final class zza extends com.google.android.gms.common.internal.safeparcel.zza {
    public static final Creator CREATOR = new C5574i();
    public final String f28501a;

    public zza(String str) {
        this.f28501a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28501a);
        C5130b.m23853b(parcel, a);
    }
}
