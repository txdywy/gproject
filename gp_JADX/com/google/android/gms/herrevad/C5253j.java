package com.google.android.gms.herrevad;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5253j implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        int a = C5129a.m23814a(parcel);
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    j2 = C5129a.m23825f(parcel, readInt);
                    break;
                case 5:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new PredictedNetworkQuality(i2, i, j2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PredictedNetworkQuality[i];
    }
}
