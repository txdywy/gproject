package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ag implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = C5129a.m23814a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzdy(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdy[i];
    }
}
