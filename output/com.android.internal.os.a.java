package com.android.internal.os;

import android.os.Parcel;

public final class com.android.internal.os.a implements Parcelable$Creator
{

    a() {
    }

    public final Object createFromParcel(Parcel p0) {
        return new PkgUsageStats(p0);
    }

    public final Object[] newArray(int p0) {
        return new PkgUsageStats[p0];
    }

}
