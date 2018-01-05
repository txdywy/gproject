package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5268g implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        Intent intent = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    intent = (Intent) C5129a.m23816a(parcel, readInt, Intent.CREATOR);
                    break;
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new InstantAppIntentData(intent, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InstantAppIntentData[i];
    }
}
