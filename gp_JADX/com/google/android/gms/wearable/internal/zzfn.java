package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzfn extends zza {
    public static final Creator CREATOR = new bb();
    public final String f28680a;
    public final String f28681b;
    public final int f28682c;
    public final boolean f28683d;

    public zzfn(String str, String str2, int i, boolean z) {
        this.f28680a = str;
        this.f28681b = str2;
        this.f28682c = i;
        this.f28683d = z;
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof zzfn) ? false : ((zzfn) obj).f28680a.equals(this.f28680a);
    }

    public final int hashCode() {
        return this.f28680a.hashCode();
    }

    public final String toString() {
        String str = this.f28681b;
        String str2 = this.f28680a;
        int i = this.f28682c;
        return new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length()).append("Node{").append(str).append(", id=").append(str2).append(", hops=").append(i).append(", isNearby=").append(this.f28683d).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28680a);
        C5130b.m23844a(parcel, 3, this.f28681b);
        C5130b.m23854b(parcel, 4, this.f28682c);
        C5130b.m23846a(parcel, 5, this.f28683d);
        C5130b.m23853b(parcel, a);
    }
}
