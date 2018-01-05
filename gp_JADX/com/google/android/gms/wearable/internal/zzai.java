package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public final class zzai extends zza {
    public static final Creator CREATOR = new C5625b();
    public final String f28627a;
    public final List f28628b;

    public zzai(String str, List list) {
        Object obj = new Object();
        this.f28627a = str;
        this.f28628b = list;
        am.m23733a(this.f28627a);
        am.m23733a(this.f28628b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzai com_google_android_gms_wearable_internal_zzai = (zzai) obj;
        if (this.f28627a == null ? com_google_android_gms_wearable_internal_zzai.f28627a != null : !this.f28627a.equals(com_google_android_gms_wearable_internal_zzai.f28627a)) {
            return false;
        }
        if (this.f28628b != null) {
            if (this.f28628b.equals(com_google_android_gms_wearable_internal_zzai.f28628b)) {
                return true;
            }
        } else if (com_google_android_gms_wearable_internal_zzai.f28628b == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f28627a != null ? this.f28627a.hashCode() : 0) + 31) * 31;
        if (this.f28628b != null) {
            i = this.f28628b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.f28627a;
        String valueOf = String.valueOf(this.f28628b);
        return new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(valueOf).length()).append("CapabilityInfo{").append(str).append(", ").append(valueOf).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28627a);
        C5130b.m23855b(parcel, 3, this.f28628b);
        C5130b.m23853b(parcel, a);
    }
}
