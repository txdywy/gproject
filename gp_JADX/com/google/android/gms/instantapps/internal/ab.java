package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ab implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        byte[] bArr = null;
        int a = C5129a.m23814a(parcel);
        int i = 0;
        int[] iArr = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    strArr = C5129a.m23833n(parcel, readInt);
                    break;
                case 6:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 7:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                case 8:
                    iArr = C5129a.m23832m(parcel, readInt);
                    break;
                case 9:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new AtomInfo(str2, str, strArr, iArr, i, bArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AtomInfo[i];
    }
}
