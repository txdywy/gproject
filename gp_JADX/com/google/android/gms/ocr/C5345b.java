package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5345b implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int a = C5129a.m23814a(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str7 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str7 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    i3 = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 5:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 6:
                    str6 = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    str5 = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 9:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 10:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 11:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 12:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new CreditCardOcrResult(str7, i3, i2, i, str6, str5, z, str4, str3, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CreditCardOcrResult[i];
    }
}
