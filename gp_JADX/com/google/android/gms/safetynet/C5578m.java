package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5578m implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        DataHolder dataHolder = null;
        int a = C5129a.m23814a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    dataHolder = (DataHolder) C5129a.m23816a(parcel, readInt, DataHolder.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new SafeBrowsingData(str, dataHolder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeBrowsingData[i];
    }
}
