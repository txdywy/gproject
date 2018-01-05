package com.google.android.finsky.billing.common;

import android.os.Parcel;

public final class com.google.android.finsky.billing.common.k implements Parcelable$Creator
{

    k() {
    }

    public final Object createFromParcel(Parcel p0) {
        return new PurchaseError(p0.readInt(), p0.readInt());
    }

    public final Object[] newArray(int p0) {
        return new PurchaseError[p0];
    }

}
