package com.google.android.finsky.services;

import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C4072f extends C0022b implements C4071e {
    public C4072f() {
        attachInterface(this, "com.google.android.finsky.services.IMarketCatalogService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        boolean a = mo3904a(parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        C0883c.m5516a(parcel2, a);
        return true;
    }
}
