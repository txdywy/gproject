package com.google.android.finsky.family.library;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C3054e implements Creator {
    C3054e() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FamilyLibraryFilterOption[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FamilyLibraryFilterOption(parcel);
    }
}
