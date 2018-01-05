package com.google.android.libraries.flowlayoutmanager;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C5930m implements Creator {
    C5930m() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }
}
