package com.android.vending.p055a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0628d extends C0022b implements C0627c {
    public C0628d() {
        attachInterface(this, "com.android.vending.appdiscoveryservice.IAppDiscoveryService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                C0625a c0625a;
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                boolean a = C0883c.m5517a(parcel);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0625a = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.android.vending.appdiscoveryservice.IAppDiscoveryReceiver");
                    if (queryLocalInterface instanceof C0625a) {
                        c0625a = (C0625a) queryLocalInterface;
                    } else {
                        c0625a = new C0626b(readStrongBinder);
                    }
                }
                mo1686a(readInt, readInt2, readInt3, a, readString, c0625a);
                break;
            case 2:
                mo1685a(parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
