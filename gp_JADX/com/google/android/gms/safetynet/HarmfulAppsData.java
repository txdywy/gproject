package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class HarmfulAppsData extends zza {
    public static final Creator CREATOR = new C5575j();
    public final String f28484a;
    public final byte[] f28485b;
    public final int f28486c;

    public HarmfulAppsData(String str, byte[] bArr, int i) {
        this.f28484a = str;
        this.f28485b = bArr;
        this.f28486c = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28484a);
        C5130b.m23847a(parcel, 3, this.f28485b);
        C5130b.m23854b(parcel, 4, this.f28486c);
        C5130b.m23853b(parcel, a);
    }
}
