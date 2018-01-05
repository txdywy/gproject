package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5628e implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C5129a.m23814a(parcel);
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzas(str3, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzas[i];
    }
}
