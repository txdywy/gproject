package com.google.android.finsky.services;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C4076j extends C0022b implements C4075i {
    public C4076j() {
        attachInterface(this, "com.google.android.finsky.services.IPlayGearheadService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable a = mo3906a(parcel.readString());
        parcel2.writeNoException();
        C0883c.m5518b(parcel2, a);
        return true;
    }
}
