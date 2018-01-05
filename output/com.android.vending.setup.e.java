package com.android.vending.setup;

import android.os.Parcel;

public final class com.android.vending.setup.e implements Parcelable$Creator
{

    e() {
    }

    public final Object createFromParcel(Parcel p0) {
        return new RestoreConfig(p0);
    }

    public final Object[] newArray(int p0) {
        return new RestoreConfig[p0];
    }

}
