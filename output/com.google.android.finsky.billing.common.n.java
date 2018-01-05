package com.google.android.finsky.billing.common;

import android.os.Parcel;

public final class com.google.android.finsky.billing.common.n implements Parcelable$Creator
{

    n() {
    }

    public final Object createFromParcel(Parcel p0) {
        return new PurchaseParams(p0);
    }

    public final Object[] newArray(int p0) {
        return new PurchaseParams[p0];
    }

}
