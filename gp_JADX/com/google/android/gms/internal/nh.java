package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class nh extends Binder implements IInterface {
    public final boolean m22919a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    public IBinder asBinder() {
        return this;
    }
}
