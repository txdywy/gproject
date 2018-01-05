package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.List;

public final class C5625b implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int a = C5129a.m23814a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    list = C5129a.m23821c(parcel, readInt, zzfn.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzai(str, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }
}
