package com.google.android.libraries.bind.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C5897f implements Creator {
    C5897f() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Data[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Data(parcel.readSparseArray(null));
    }
}
