package com.google.android.finsky.dfemodel;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.gp;

final class C2725p implements Creator {
    C2725p() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DfeToc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DfeToc((gp) ParcelableProto.m21674a(parcel));
    }
}
