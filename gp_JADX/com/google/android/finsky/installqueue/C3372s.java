package com.google.android.finsky.installqueue;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C3372s implements Creator {
    C3372s() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeWindow[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TimeWindow(parcel);
    }
}
