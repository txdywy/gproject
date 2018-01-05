package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5565x implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        Flag[] flagArr = null;
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    flagArr = (Flag[]) C5129a.m23820b(parcel, readInt, Flag.CREATOR);
                    break;
                case 4:
                    strArr = C5129a.m23833n(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new Configuration(i, flagArr, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}
