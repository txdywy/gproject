package com.google.android.p008a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class C0022b extends Binder implements IInterface {
    public IBinder asBinder() {
        return this;
    }

    public boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }
}
