package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.C5650l;

public final class zzfc extends zza implements C5650l {
    public static final Creator CREATOR = new az();
    public final int f28676a;
    public final String f28677b;
    public final byte[] f28678c;
    public final String f28679d;

    public zzfc(int i, String str, byte[] bArr, String str2) {
        this.f28676a = i;
        this.f28677b = str;
        this.f28678c = bArr;
        this.f28679d = str2;
    }

    public final String mo5126a() {
        return this.f28677b;
    }

    public final String mo5127b() {
        return this.f28679d;
    }

    public final String toString() {
        int i = this.f28676a;
        String str = this.f28677b;
        String valueOf = String.valueOf(this.f28678c == null ? "null" : Integer.valueOf(this.f28678c.length));
        return new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()).append("MessageEventParcelable[").append(i).append(",").append(str).append(", size=").append(valueOf).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28676a);
        C5130b.m23844a(parcel, 3, this.f28677b);
        C5130b.m23847a(parcel, 4, this.f28678c);
        C5130b.m23844a(parcel, 5, this.f28679d);
        C5130b.m23853b(parcel, a);
    }
}
