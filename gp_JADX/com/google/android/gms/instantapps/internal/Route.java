package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class Route extends zza {
    public static final Creator CREATOR = new C5293w();
    public final String f26433a;
    public final int f26434b;
    public final String f26435c;
    public final String f26436d;
    public final String f26437e;
    public final String f26438f;
    public final String f26439g;

    public Route(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f26433a = am.m23735a(str);
        this.f26434b = i;
        this.f26435c = str2;
        this.f26436d = str3;
        this.f26437e = str4;
        this.f26438f = str6;
        this.f26439g = str7;
        zzbp com_google_android_gms_instantapps_internal_zzbp;
        if (!TextUtils.isEmpty(str2)) {
            com_google_android_gms_instantapps_internal_zzbp = new zzbp(str2, 0);
        } else if (!TextUtils.isEmpty(str3)) {
            com_google_android_gms_instantapps_internal_zzbp = new zzbp(str3, 1);
        } else if (!TextUtils.isEmpty(str4)) {
            com_google_android_gms_instantapps_internal_zzbp = new zzbp(str4, 2);
        } else if (!TextUtils.isEmpty(str5)) {
            com_google_android_gms_instantapps_internal_zzbp = new zzbp(str5, 3);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26433a);
        C5130b.m23854b(parcel, 3, this.f26434b);
        C5130b.m23844a(parcel, 4, this.f26435c);
        C5130b.m23844a(parcel, 5, this.f26436d);
        C5130b.m23844a(parcel, 6, this.f26437e);
        C5130b.m23844a(parcel, 7, this.f26438f);
        C5130b.m23844a(parcel, 8, this.f26439g);
        C5130b.m23844a(parcel, 9, this.f26437e);
        C5130b.m23853b(parcel, a);
    }
}
