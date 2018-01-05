package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import com.google.android.gms.udc.UdcCacheResponse.UdcSetting;
import java.util.List;

public final class C5611k implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int[] iArr = null;
        int a = C5129a.m23814a(parcel);
        boolean z = false;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    list = C5129a.m23821c(parcel, readInt, UdcSetting.CREATOR);
                    break;
                case 3:
                    iArr = C5129a.m23832m(parcel, readInt);
                    break;
                case 4:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new UdcCacheResponse(list, iArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UdcCacheResponse[i];
    }
}
