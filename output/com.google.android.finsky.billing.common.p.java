package com.google.android.finsky.billing.common;

import android.os.Parcel;

public final class com.google.android.finsky.billing.common.p implements Parcelable$Creator
{

    p() {
    }

    public final Object createFromParcel(Parcel p0) {
        return new RedeemCodeResult(p0);
    }

    public final Object[] newArray(int p0) {
        return new RedeemCodeResult[p0];
    }

}
