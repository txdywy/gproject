package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.List;

public final class C4970f implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        boolean z = false;
        int a = C5129a.m23814a(parcel);
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
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
                    l = C5129a.m23826g(parcel, readInt);
                    break;
                case 4:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 5:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 6:
                    list = C5129a.m23834o(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new TokenData(i, str, l, z2, z, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
