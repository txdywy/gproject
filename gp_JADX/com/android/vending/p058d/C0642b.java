package com.android.vending.p058d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0642b extends C0022b implements C0641a {
    public C0642b() {
        attachInterface(this, "com.android.vending.details.IDetailsService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        Parcelable a;
        switch (i) {
            case 1:
                a = mo3901a(parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 2:
                a = mo3902a(parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            default:
                return false;
        }
        return true;
    }
}
