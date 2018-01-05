package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6501i implements Creator {
    C6501i() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPropertiesResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new GetPropertiesResult(parcel.readString(), parcel.readLong(), parcel.readLong());
    }
}
