package com.google.android.finsky.installer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C3319e extends C0022b implements C3318d {
    public C3319e() {
        attachInterface(this, "com.google.android.finsky.installer.IMultiUserCoordinatorService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                C3308g c3308g;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c3308g = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.finsky.installer.IMultiUserCoordinatorServiceListener");
                    if (queryLocalInterface instanceof C3308g) {
                        c3308g = (C3308g) queryLocalInterface;
                    } else {
                        c3308g = new C3321i(readStrongBinder);
                    }
                }
                mo3466a(c3308g);
                parcel2.writeNoException();
                break;
            case 2:
                boolean a = mo3467a(parcel.readString());
                parcel2.writeNoException();
                C0883c.m5516a(parcel2, a);
                break;
            case 3:
                mo3468b(parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                mo3465a();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
