package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzcqw extends zza {
    public static final Creator CREATOR = new gr();
    public final String f27820a;
    public final zzcqt f27821b;
    public final String f27822c;
    public final long f27823d;

    public zzcqw(String str, zzcqt com_google_android_gms_internal_zzcqt, String str2, long j) {
        this.f27820a = str;
        this.f27821b = com_google_android_gms_internal_zzcqt;
        this.f27822c = str2;
        this.f27823d = j;
    }

    public final String toString() {
        String str = this.f27822c;
        String str2 = this.f27820a;
        String valueOf = String.valueOf(this.f27821b);
        return new StringBuilder(((String.valueOf(str).length() + 21) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f27820a);
        C5130b.m23842a(parcel, 3, this.f27821b, i);
        C5130b.m23844a(parcel, 4, this.f27822c);
        C5130b.m23839a(parcel, 5, this.f27823d);
        C5130b.m23853b(parcel, a);
    }
}
