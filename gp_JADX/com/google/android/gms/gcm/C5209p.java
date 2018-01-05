package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C5209p implements Creator {
    C5209p() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PeriodicTask(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PeriodicTask[i];
    }
}
