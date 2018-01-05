package com.android.vending.p056b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0633d extends C0022b implements C0632c {
    public C0633d() {
        attachInterface(this, "com.android.vending.billing.IBillingService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable a = mo2458a((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        C0883c.m5518b(parcel2, a);
        return true;
    }
}
