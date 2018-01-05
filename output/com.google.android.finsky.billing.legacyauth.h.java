package com.google.android.finsky.billing.legacyauth;

import android.os.Parcel;

public final class com.google.android.finsky.billing.legacyauth.h implements Parcelable$Creator
{

    h() {
    }

    public final Object createFromParcel(Parcel p0) {
        v6 = 0;
        if (p0.readInt() != 0)
            v1 = 1;
        else
            v1 = 0;
        if (p0.readInt() != 0)
            v5 = 1;
        else
            v5 = 0;
        if (p0.readInt() != 0)
            v6 = 1;
        return new AuthState(v1, p0.readString(), p0.readString(), p0.readInt(), v5, v6, p0.readString(), p0.readString());
    }

    public final Object[] newArray(int p0) {
        return new AuthState[p0];
    }

}
