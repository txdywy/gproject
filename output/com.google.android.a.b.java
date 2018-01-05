package com.google.android.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public class com.google.android.a.b extends Binder implements IInterface
{

    b() {
        Binder();
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean routeToSuperOrEnforceInterface(int p0, Parcel p1, Parcel p2, int p3) {
        if (p0 > 16777215)
            v0 = super.onTransact(p0, p1, p2, p3);
        else {
            p1.enforceInterface(this.getInterfaceDescriptor());
            v0 = 0;
        }
        return v0;
    }

}
