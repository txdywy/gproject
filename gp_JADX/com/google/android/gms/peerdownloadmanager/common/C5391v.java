package com.google.android.gms.peerdownloadmanager.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C5391v implements Creator {
    C5391v() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scheduler[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Scheduler(parcel);
    }
}
