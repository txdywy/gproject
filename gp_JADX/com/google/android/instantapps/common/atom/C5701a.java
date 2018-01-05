package com.google.android.instantapps.common.atom;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C5701a implements Creator {
    C5701a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AtomId[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AtomId(parcel);
    }
}
