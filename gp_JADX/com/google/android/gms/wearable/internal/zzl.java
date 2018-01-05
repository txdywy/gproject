package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzl extends zza {
    public static final Creator CREATOR = new by();
    public byte f28691a;
    public final byte f28692b;
    public final String f28693c;

    public zzl(byte b, byte b2, String str) {
        this.f28691a = b;
        this.f28692b = b2;
        this.f28693c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzl com_google_android_gms_wearable_internal_zzl = (zzl) obj;
        return this.f28691a != com_google_android_gms_wearable_internal_zzl.f28691a ? false : this.f28692b != com_google_android_gms_wearable_internal_zzl.f28692b ? false : this.f28693c.equals(com_google_android_gms_wearable_internal_zzl.f28693c);
    }

    public final int hashCode() {
        return ((((this.f28691a + 31) * 31) + this.f28692b) * 31) + this.f28693c.hashCode();
    }

    public final String toString() {
        byte b = this.f28691a;
        byte b2 = this.f28692b;
        String str = this.f28693c;
        return new StringBuilder(String.valueOf(str).length() + 73).append("AmsEntityUpdateParcelable{, mEntityId=").append(b).append(", mAttributeId=").append(b2).append(", mValue='").append(str).append("'}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23837a(parcel, 2, this.f28691a);
        C5130b.m23837a(parcel, 3, this.f28692b);
        C5130b.m23844a(parcel, 4, this.f28693c);
        C5130b.m23853b(parcel, a);
    }
}
