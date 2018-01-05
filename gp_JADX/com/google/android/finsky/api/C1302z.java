package com.google.android.finsky.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C1302z implements Creator {
    C1302z() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VoucherParams[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new VoucherParams(parcel);
    }
}
