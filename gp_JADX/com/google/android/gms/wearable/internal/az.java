package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class az implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C5129a.m23814a(parcel);
        String str2 = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                case 5:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzfc(i, str2, bArr, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfc[i];
    }
}
