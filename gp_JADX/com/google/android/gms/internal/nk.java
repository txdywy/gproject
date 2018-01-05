package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class nk extends nh implements nj {
    public static nj m25199a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof nj ? (nj) queryLocalInterface : new nl(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
