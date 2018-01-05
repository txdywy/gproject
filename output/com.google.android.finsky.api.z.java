package com.google.android.finsky.api;

import android.os.Parcel;

public final class com.google.android.finsky.api.z implements Parcelable$Creator
{

    z() {
    }

    public final Object createFromParcel(Parcel p0) {
        return new VoucherParams(p0);
    }

    public final Object[] newArray(int p0) {
        return new VoucherParams[p0];
    }

}
