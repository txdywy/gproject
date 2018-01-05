package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5292v implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String[] strArr = null;
        int a = C5129a.m23814a(parcel);
        String[] strArr2 = null;
        String[] strArr3 = null;
        String[] strArr4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    strArr4 = C5129a.m23833n(parcel, readInt);
                    break;
                case 2:
                    strArr3 = C5129a.m23833n(parcel, readInt);
                    break;
                case 3:
                    strArr = C5129a.m23833n(parcel, readInt);
                    break;
                case 4:
                    strArr2 = C5129a.m23833n(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new Permissions(strArr4, strArr3, strArr2, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Permissions[i];
    }
}
