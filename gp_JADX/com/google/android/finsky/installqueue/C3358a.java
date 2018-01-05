package com.google.android.finsky.installqueue;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C3358a implements Creator {
    C3358a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InstallConstraint[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new InstallConstraint(parcel);
    }
}
