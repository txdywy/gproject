package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzclf extends zza {
    public static final Creator CREATOR = new ew();
    public int f27787a;
    public String f27788b;
    public String f27789c;

    zzclf(int i, String str, String str2) {
        this.f27787a = i;
        this.f27788b = str;
        this.f27789c = str2;
    }

    public zzclf(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f27787a);
        C5130b.m23844a(parcel, 2, this.f27788b);
        C5130b.m23844a(parcel, 3, this.f27789c);
        C5130b.m23853b(parcel, a);
    }
}
