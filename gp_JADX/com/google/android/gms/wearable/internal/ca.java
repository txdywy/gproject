package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ca implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte b = (byte) 0;
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        String str7 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 6:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    str5 = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    str6 = C5129a.m23827h(parcel, readInt);
                    break;
                case 9:
                    b = C5129a.m23823d(parcel, readInt);
                    break;
                case 10:
                    b2 = C5129a.m23823d(parcel, readInt);
                    break;
                case 11:
                    b3 = C5129a.m23823d(parcel, readInt);
                    break;
                case 12:
                    b4 = C5129a.m23823d(parcel, readInt);
                    break;
                case 13:
                    str7 = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzt(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }
}
