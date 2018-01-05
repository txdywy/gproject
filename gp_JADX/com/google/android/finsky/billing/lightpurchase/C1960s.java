package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C1960s implements Creator {
    C1960s() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GiftEmailParams[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new GiftEmailParams(parcel);
    }
}
