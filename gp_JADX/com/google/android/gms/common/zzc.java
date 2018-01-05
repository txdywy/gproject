package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzc extends zza {
    public static final Creator CREATOR = new C5137k();
    public String f26095a;
    public int f26096b;

    public zzc(String str, int i) {
        this.f26095a = str;
        this.f26096b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 1, this.f26095a);
        C5130b.m23854b(parcel, 2, this.f26096b);
        C5130b.m23853b(parcel, a);
    }
}
