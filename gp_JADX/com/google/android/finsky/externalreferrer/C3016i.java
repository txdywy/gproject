package com.google.android.finsky.externalreferrer;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C3016i implements Creator {
    C3016i() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExternalReferrerStatus[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ExternalReferrerStatus(parcel);
    }
}
