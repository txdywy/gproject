package com.google.android.finsky.verifier;

import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C4724b extends C0022b implements C4723a {
    public C4724b() {
        attachInterface(this, "com.google.android.finsky.verifier.ISingleUserSettingsService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                boolean a = mo4332a(parcel.readString());
                parcel2.writeNoException();
                C0883c.m5516a(parcel2, a);
                return true;
            case 2:
                long b = mo4333b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeLong(b);
                return true;
            default:
                return false;
        }
    }
}
