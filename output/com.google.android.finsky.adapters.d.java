package com.google.android.finsky.adapters;

import android.os.Parcel;

public final class com.google.android.finsky.adapters.d implements Parcelable$Creator
{

    d() {
    }

    public final Object createFromParcel(Parcel p0) {
        v5 = new CardRecyclerViewAdapter$ItemEntry();
        v5.a = p0.readInt();
        v5.b = p0.readInt();
        v5.c = p0.readInt();
        v5.d = p0.readInt();
        v5.e = p0.readInt();
        return v5;
    }

    public final Object[] newArray(int p0) {
        return new CardRecyclerViewAdapter$ItemEntry[p0];
    }

}
