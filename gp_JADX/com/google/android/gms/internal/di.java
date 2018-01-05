package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class di extends nh implements dh {
    public di() {
        attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo4709a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
