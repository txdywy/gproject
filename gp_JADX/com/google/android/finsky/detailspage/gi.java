package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailspage.TextModule.DetailsIconDescription;
import com.google.android.finsky.utils.ParcelableProto;

final class gi implements Creator {
    gi() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DetailsIconDescription[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DetailsIconDescription((bd) ParcelableProto.m21674a(parcel), parcel.readString());
    }
}
