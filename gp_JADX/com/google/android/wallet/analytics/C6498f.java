package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6498f implements Creator {
    C6498f() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CreditCardEntryAction[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CreditCardEntryAction(parcel);
    }
}
