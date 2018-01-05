package com.android.internal.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C0593a implements Creator {
    C0593a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PkgUsageStats[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PkgUsageStats(parcel);
    }
}
