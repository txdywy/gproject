package com.android.vending.p056b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0631b extends C0022b implements C0630a {
    public C0631b() {
        attachInterface(this, "com.android.vending.billing.IBillingAccountService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                int a = mo2369a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 2:
                Parcelable b = mo2370b(parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, b);
                return true;
            default:
                return false;
        }
    }
}
