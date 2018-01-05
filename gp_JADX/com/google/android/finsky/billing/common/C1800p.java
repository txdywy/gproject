package com.google.android.finsky.billing.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C1800p implements Creator {
    C1800p() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RedeemCodeResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RedeemCodeResult(parcel);
    }
}
