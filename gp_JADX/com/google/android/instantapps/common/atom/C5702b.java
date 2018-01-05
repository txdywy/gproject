package com.google.android.instantapps.common.atom;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C5702b implements Creator {
    C5702b() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AtomReference[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AtomReference(parcel);
    }
}
