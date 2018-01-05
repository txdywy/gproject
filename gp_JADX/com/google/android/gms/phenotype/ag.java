package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ag implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int a = C5129a.m23814a(parcel);
        long j = 0;
        double d = 0.0d;
        int i2 = 0;
        String str = null;
        boolean z = false;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                case 4:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 5:
                    C5129a.m23817a(parcel, readInt, 8);
                    d = parcel.readDouble();
                    break;
                case 6:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                case 8:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 9:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new Flag(str2, j, z, d, str, bArr, i2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Flag[i];
    }
}
