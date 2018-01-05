package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class SharedLibInfo extends zza {
    public static final Creator CREATOR = new C5294x();
    public final String f26440a;
    public final int f26441b;
    public final String f26442c;
    public final String f26443d;
    public final long f26444e;
    public final byte[] f26445f;

    public SharedLibInfo(String str, int i, String str2, String str3, long j, byte[] bArr) {
        this.f26440a = str;
        this.f26441b = i;
        this.f26442c = str2;
        this.f26443d = str3;
        this.f26444e = j;
        this.f26445f = bArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 1, this.f26440a);
        C5130b.m23854b(parcel, 2, this.f26441b);
        C5130b.m23844a(parcel, 3, this.f26442c);
        C5130b.m23844a(parcel, 4, this.f26443d);
        C5130b.m23839a(parcel, 5, this.f26444e);
        C5130b.m23847a(parcel, 6, this.f26445f);
        C5130b.m23853b(parcel, a);
    }
}
