package com.google.android.libraries.social.licenses;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6182a implements Creator {
    C6182a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new License[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new License(parcel);
    }
}
