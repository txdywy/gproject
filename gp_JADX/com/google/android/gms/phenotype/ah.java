package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ah implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        Flag flag = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    flag = (Flag) C5129a.m23816a(parcel, readInt, Flag.CREATOR);
                    break;
                case 5:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new FlagOverride(str2, str, flag, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FlagOverride[i];
    }
}
