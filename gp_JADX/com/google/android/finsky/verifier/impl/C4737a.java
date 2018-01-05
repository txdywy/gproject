package com.google.android.finsky.verifier.impl;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C4737a implements Creator {
    C4737a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityListener[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return (ActivityListener) parcel.readStrongBinder();
    }
}
