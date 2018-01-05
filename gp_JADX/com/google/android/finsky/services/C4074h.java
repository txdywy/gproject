package com.google.android.finsky.services;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C4074h extends C0022b implements C4073g {
    public C4074h() {
        attachInterface(this, "com.google.android.finsky.services.IPackageUpdateService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        Parcelable a = mo3905a(parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        C0883c.m5518b(parcel2, a);
        return true;
    }
}
