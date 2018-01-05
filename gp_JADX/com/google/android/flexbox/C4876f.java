package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.flexbox.FlexboxLayout.LayoutParams;

final class C4876f implements Creator {
    C4876f() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LayoutParams[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LayoutParams(parcel);
    }
}
