package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5293w implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C5129a.m23814a(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str7 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    str6 = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    str5 = C5129a.m23827h(parcel, readInt);
                    break;
                case 6:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 9:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new Route(str7, i, str6, str5, str4, str3, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Route[i];
    }
}
