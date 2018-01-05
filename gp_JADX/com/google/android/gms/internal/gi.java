package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class gi implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        zzcvg com_google_android_gms_internal_zzcvg = null;
        long j = 0;
        boolean z = false;
        String str3 = null;
        zzcqw com_google_android_gms_internal_zzcqw = null;
        long j2 = 0;
        zzcqw com_google_android_gms_internal_zzcqw2 = null;
        long j3 = 0;
        zzcqw com_google_android_gms_internal_zzcqw3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    com_google_android_gms_internal_zzcvg = (zzcvg) C5129a.m23816a(parcel, readInt, zzcvg.CREATOR);
                    break;
                case 5:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                case 6:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 7:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    com_google_android_gms_internal_zzcqw = (zzcqw) C5129a.m23816a(parcel, readInt, zzcqw.CREATOR);
                    break;
                case 9:
                    j2 = C5129a.m23825f(parcel, readInt);
                    break;
                case 10:
                    com_google_android_gms_internal_zzcqw2 = (zzcqw) C5129a.m23816a(parcel, readInt, zzcqw.CREATOR);
                    break;
                case 11:
                    j3 = C5129a.m23825f(parcel, readInt);
                    break;
                case 12:
                    com_google_android_gms_internal_zzcqw3 = (zzcqw) C5129a.m23816a(parcel, readInt, zzcqw.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzcqh(i, str, str2, com_google_android_gms_internal_zzcvg, j, z, str3, com_google_android_gms_internal_zzcqw, j2, com_google_android_gms_internal_zzcqw2, j3, com_google_android_gms_internal_zzcqw3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcqh[i];
    }
}
