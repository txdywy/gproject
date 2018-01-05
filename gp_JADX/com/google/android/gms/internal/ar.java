package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ar implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = C5129a.m23814a(parcel);
        String str = null;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 5:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 6:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzajs(str, i2, i, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzajs[i];
    }
}
