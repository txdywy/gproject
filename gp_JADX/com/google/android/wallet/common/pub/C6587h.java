package com.google.android.wallet.common.pub;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6587h implements Creator {
    C6587h() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UiConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new UiConfig(parcel.readInt(), parcel.readInt());
    }
}
