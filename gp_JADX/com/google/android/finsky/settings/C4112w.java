package com.google.android.finsky.settings;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C4112w implements Creator {
    C4112w() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }
}
