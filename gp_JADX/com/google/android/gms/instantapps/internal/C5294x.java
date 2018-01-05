package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5294x implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int a = C5129a.m23814a(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                case 6:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new SharedLibInfo(str3, i, str2, str, j, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SharedLibInfo[i];
    }
}
