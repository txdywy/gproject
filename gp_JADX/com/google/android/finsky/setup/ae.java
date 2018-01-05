package com.google.android.finsky.setup;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ae implements Creator {
    ae() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PreloadWrapper[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PreloadWrapper(parcel);
    }
}
