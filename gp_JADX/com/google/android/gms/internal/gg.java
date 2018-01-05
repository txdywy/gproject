package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class gg implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        String str5 = null;
        boolean z = true;
        boolean z2 = false;
        long j3 = -2147483648L;
        String str6 = null;
        long j4 = 0;
        long j5 = 0;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 6:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                case 7:
                    j2 = C5129a.m23825f(parcel, readInt);
                    break;
                case 8:
                    str5 = C5129a.m23827h(parcel, readInt);
                    break;
                case 9:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 10:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 11:
                    j3 = C5129a.m23825f(parcel, readInt);
                    break;
                case 12:
                    str6 = C5129a.m23827h(parcel, readInt);
                    break;
                case 13:
                    j4 = C5129a.m23825f(parcel, readInt);
                    break;
                case 14:
                    j5 = C5129a.m23825f(parcel, readInt);
                    break;
                case 15:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzcqe(str, str2, str3, str4, j, j2, str5, z, z2, j3, str6, j4, j5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcqe[i];
    }
}
