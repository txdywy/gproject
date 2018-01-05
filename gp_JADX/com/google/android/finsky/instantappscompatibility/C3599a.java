package com.google.android.finsky.instantappscompatibility;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C3599a implements Creator {
    C3599a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InstantAppInfo[0];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new InstantAppInfo(parcel);
    }
}
