package com.google.android.finsky.instantappsquickinstall;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C3618r implements Creator {
    C3618r() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ValidatedQuickInstallRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ValidatedQuickInstallRequest(parcel.readString(), (Intent) parcel.readParcelable(Intent.class.getClassLoader()));
    }
}
