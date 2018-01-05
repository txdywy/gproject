package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C5257d implements Creator {
    C5257d() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        return readStrongBinder != null ? new MessengerCompat(readStrongBinder) : null;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MessengerCompat[i];
    }
}
