package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class mw implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = C5129a.m23814a(parcel);
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    intent = (Intent) C5129a.m23816a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzecs(i2, i, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzecs[i];
    }
}
