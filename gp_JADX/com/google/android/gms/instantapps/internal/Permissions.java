package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class Permissions extends zza {
    public static final Creator CREATOR = new C5292v();
    public final String[] f26429a;
    public final String[] f26430b;
    public final String[] f26431c;
    public final String[] f26432d;

    public Permissions(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.f26429a = strArr;
        this.f26430b = strArr2;
        this.f26432d = strArr3;
        this.f26431c = strArr4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23850a(parcel, 1, this.f26429a);
        C5130b.m23850a(parcel, 2, this.f26430b);
        C5130b.m23850a(parcel, 3, this.f26431c);
        C5130b.m23850a(parcel, 4, this.f26432d);
        C5130b.m23853b(parcel, a);
    }
}
