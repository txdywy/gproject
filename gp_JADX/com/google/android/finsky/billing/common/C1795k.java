package com.google.android.finsky.billing.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C1795k implements Creator {
    C1795k() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PurchaseError[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PurchaseError(parcel.readInt(), parcel.readInt());
    }
}
