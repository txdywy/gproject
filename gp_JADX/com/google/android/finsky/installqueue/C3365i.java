package com.google.android.finsky.installqueue;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C3365i implements Creator {
    C3365i() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InstallRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new InstallRequest(parcel);
    }
}
