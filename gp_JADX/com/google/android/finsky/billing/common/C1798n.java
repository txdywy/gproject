package com.google.android.finsky.billing.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C1798n implements Creator {
    C1798n() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PurchaseParams[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PurchaseParams(parcel);
    }
}
