package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class PackageStorageInfo extends zza {
    public static final Creator CREATOR = new bd();
    public final String f28580a;
    public final String f28581b;
    public final long f28582c;

    public PackageStorageInfo(String str, String str2, long j) {
        this.f28580a = str;
        this.f28581b = str2;
        this.f28582c = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28580a);
        C5130b.m23844a(parcel, 3, this.f28581b);
        C5130b.m23839a(parcel, 4, this.f28582c);
        C5130b.m23853b(parcel, a);
    }
}
