package com.google.android.finsky.billing.legacyauth;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C1881h implements Creator {
    C1881h() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2 = false;
        boolean z3 = parcel.readInt() != 0;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new AuthState(z3, readString, readString2, readInt, z, z2, parcel.readString(), parcel.readString());
    }
}
