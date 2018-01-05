package com.google.android.libraries.play.entertainment.story.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bf implements Creator {
    bf() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StateSaver[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        StateSaver stateSaver = new StateSaver(parcel.readInt());
        stateSaver.f30524b = parcel.readParcelable(getClass().getClassLoader());
        return stateSaver;
    }
}
