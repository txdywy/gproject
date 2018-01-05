package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6500h implements Creator {
    C6500h() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAttestationResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new GetAttestationResult(parcel.readLong(), parcel.readLong());
    }
}
