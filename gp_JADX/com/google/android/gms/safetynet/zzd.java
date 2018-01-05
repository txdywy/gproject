package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzd extends zza {
    public static final Creator CREATOR = new C5576k();
    public final long f28502a;
    public final HarmfulAppsData[] f28503b;

    public zzd(long j, HarmfulAppsData[] harmfulAppsDataArr) {
        this.f28502a = j;
        this.f28503b = harmfulAppsDataArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23839a(parcel, 2, this.f28502a);
        C5130b.m23849a(parcel, 3, this.f28503b, i);
        C5130b.m23853b(parcel, a);
    }
}
