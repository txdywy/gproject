package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.Channel;

public final class zzas extends zza implements Channel {
    public static final Creator CREATOR = new C5628e();
    public final String f28633a;
    public final String f28634b;
    public final String f28635c;

    public zzas(String str, String str2, String str3) {
        this.f28633a = (String) am.m23733a((Object) str);
        this.f28634b = (String) am.m23733a((Object) str2);
        this.f28635c = (String) am.m23733a((Object) str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas com_google_android_gms_wearable_internal_zzas = (zzas) obj;
        return this.f28633a.equals(com_google_android_gms_wearable_internal_zzas.f28633a) && ad.m23722a(com_google_android_gms_wearable_internal_zzas.f28634b, this.f28634b) && ad.m23722a(com_google_android_gms_wearable_internal_zzas.f28635c, this.f28635c);
    }

    public final int hashCode() {
        return this.f28633a.hashCode();
    }

    public final String toString() {
        String str = this.f28633a;
        String str2 = this.f28634b;
        String str3 = this.f28635c;
        return new StringBuilder(((String.valueOf(str).length() + 43) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("ChannelImpl{, token='").append(str).append("', nodeId='").append(str2).append("', path='").append(str3).append("'}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28633a);
        C5130b.m23844a(parcel, 3, this.f28634b);
        C5130b.m23844a(parcel, 4, this.f28635c);
        C5130b.m23853b(parcel, a);
    }
}
