package com.google.android.gms.herrevad;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5252i implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        Bundle bundle = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                case 4:
                    j2 = C5129a.m23825f(parcel, readInt);
                    break;
                case 5:
                    j3 = C5129a.m23825f(parcel, readInt);
                    break;
                case 6:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 7:
                    bundle = C5129a.m23829j(parcel, readInt);
                    break;
                case 8:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 9:
                    i3 = C5129a.m23824e(parcel, readInt);
                    break;
                case 10:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 11:
                    z3 = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new NetworkQualityReport(i, j, j2, j3, i2, bundle, z, i3, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NetworkQualityReport[i];
    }
}
