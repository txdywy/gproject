package com.google.android.p254g.p255a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C4319f extends C0022b implements C4318e {
    public C4319f() {
        attachInterface(this, "com.google.android.vending.verifier.IVerifyAppsDataCallback");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo4122a(C0883c.m5517a(parcel), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
        return true;
    }
}
