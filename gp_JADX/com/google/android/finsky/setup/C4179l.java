package com.google.android.finsky.setup;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C4179l implements Creator {
    C4179l() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PackageSetupStatus[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PackageSetupStatus(parcel);
    }
}
