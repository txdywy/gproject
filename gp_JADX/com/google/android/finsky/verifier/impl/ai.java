package com.google.android.finsky.verifier.impl;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ai implements Creator {
    ai() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableBinder[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableBinder(parcel.readStrongBinder());
    }
}
