package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraCredits;

final class gf implements Creator {
    gf() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DetailsExtraCredits[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DetailsExtraCredits(parcel.readString(), parcel.readString());
    }
}
