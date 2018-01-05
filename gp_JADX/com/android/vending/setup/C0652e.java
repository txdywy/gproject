package com.android.vending.setup;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C0652e implements Creator {
    C0652e() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RestoreConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RestoreConfig(parcel);
    }
}
