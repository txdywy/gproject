package com.google.android.finsky.utils;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ah implements Creator {
    ah() {
    }

    private static ParcelableProtoArray m21695a(Parcel parcel) {
        try {
            return new ParcelableProtoArray(parcel);
        } catch (Throwable e) {
            throw new IllegalArgumentException("Exception when unmarshalling proto array", e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableProtoArray[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m21695a(parcel);
    }
}
