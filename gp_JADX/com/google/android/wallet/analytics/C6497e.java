package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6497e implements Creator {
    C6497e() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppValidationResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AppValidationResult(parcel);
    }
}
