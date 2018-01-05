package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

public abstract class dx extends nh implements dw {
    public dx() {
        attachInterface(this, "com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1001:
                mo4713a((DataHolder) ni.m25192a(parcel, DataHolder.CREATOR));
                break;
            case 1002:
                parcel.readInt();
                mo4712a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
