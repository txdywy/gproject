package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5659v implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a = C5129a.m23814a(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 5:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 6:
                    z3 = C5129a.m23822c(parcel, readInt);
                    break;
                case 7:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 8:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 9:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 10:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new ConnectionConfiguration(str4, str3, i2, i, z3, z2, str2, z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
