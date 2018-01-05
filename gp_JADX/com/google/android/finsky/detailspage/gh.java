package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraSecondary;

final class gh implements Creator {
    gh() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DetailsExtraSecondary[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DetailsExtraSecondary(parcel.readString(), parcel.readString());
    }
}
