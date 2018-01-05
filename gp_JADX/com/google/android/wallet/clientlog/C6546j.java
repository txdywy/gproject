package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6546j implements Creator {
    C6546j() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TimedEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TimedEvent(parcel);
    }
}
