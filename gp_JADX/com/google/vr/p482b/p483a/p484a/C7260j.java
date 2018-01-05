package com.google.vr.p482b.p483a.p484a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.vr.p479a.p480a.C7247j;
import com.google.vr.p479a.p480a.C7249l;

public abstract class C7260j extends b implements C7259i {
    public C7260j() {
        attachInterface(this, "com.google.vr.libraries.payments.api.IVrPaymentsCallback");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.IObjectWrapper") instanceof C7247j))) {
            C7249l c7249l = new C7249l(readStrongBinder);
        }
        mo6360a(readInt);
        parcel2.writeNoException();
        return true;
    }
}
