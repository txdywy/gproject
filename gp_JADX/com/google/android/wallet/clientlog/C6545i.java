package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6545i implements Creator {
    C6545i() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Session[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Session(parcel);
    }
}
