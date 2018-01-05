package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

@C5302b
public final class zzajs extends zza {
    public static final Creator CREATOR = new ar();
    public String f27782a;
    public int f27783b;
    public int f27784c;
    public boolean f27785d;
    public boolean f27786e;

    zzajs(String str, int i, int i2, boolean z, boolean z2) {
        this.f27782a = str;
        this.f27783b = i;
        this.f27784c = i2;
        this.f27785d = z;
        this.f27786e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f27782a);
        C5130b.m23854b(parcel, 3, this.f27783b);
        C5130b.m23854b(parcel, 4, this.f27784c);
        C5130b.m23846a(parcel, 5, this.f27785d);
        C5130b.m23846a(parcel, 6, this.f27786e);
        C5130b.m23853b(parcel, a);
    }
}
