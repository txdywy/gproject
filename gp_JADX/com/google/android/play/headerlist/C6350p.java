package com.google.android.play.headerlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6350p implements Creator {
    C6350p() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }
}
