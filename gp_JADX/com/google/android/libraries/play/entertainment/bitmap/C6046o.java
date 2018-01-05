package com.google.android.libraries.play.entertainment.bitmap;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6046o implements Creator {
    C6046o() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ImageInfo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ImageInfo(parcel);
    }
}
