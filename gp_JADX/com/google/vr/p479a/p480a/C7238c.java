package com.google.vr.p479a.p480a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.b;

public abstract class C7238c extends b implements C7237b {
    public C7238c() {
        attachInterface(this, "com.google.vr.internal.lullaby.IEventHandler");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 3) {
            return false;
        }
        C7245h c7245h;
        parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c7245h = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.INativeEvent");
            if (queryLocalInterface instanceof C7245h) {
                c7245h = (C7245h) queryLocalInterface;
            } else {
                c7245h = new C7246i(readStrongBinder);
            }
        }
        mo6307a(c7245h);
        parcel2.writeNoException();
        return true;
    }
}
