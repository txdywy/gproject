package com.android.vending.licensing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0022b;

public abstract class C0647c extends C0022b implements ILicensingService {
    public C0647c() {
        attachInterface(this, "com.android.vending.licensing.ILicensingService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        C0645a c0645a;
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c0645a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
            if (queryLocalInterface instanceof C0645a) {
                c0645a = (C0645a) queryLocalInterface;
            } else {
                c0645a = new C0646b(readStrongBinder);
            }
        }
        mo3903a(readLong, readString, c0645a);
        return true;
    }
}
