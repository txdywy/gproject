package com.google.android.finsky.dfemodel;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.utils.ParcelableProto;

final class C2727r implements Creator {
    C2727r() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Document[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Document((cv) ParcelableProto.m21674a(parcel));
    }
}
