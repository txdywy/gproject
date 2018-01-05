package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C5207n implements Creator {
    C5207n() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OneoffTask[i];
    }
}
