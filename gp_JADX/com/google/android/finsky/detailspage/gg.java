package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraPrimary;
import com.google.android.finsky.utils.ParcelableProto;

final class gg implements Creator {
    gg() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DetailsExtraPrimary[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = true;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        bd bdVar = (bd) ParcelableProto.m21674a(parcel);
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new DetailsExtraPrimary(readString, readString2, readString3, bdVar, z);
    }
}
