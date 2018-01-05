package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C7914z implements Creator {
    C7914z() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UnguessableToken[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        if (readLong == 0 || readLong2 == 0) {
            return null;
        }
        return new UnguessableToken(readLong, readLong2);
    }
}
