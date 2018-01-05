package com.google.android.p254g.p255a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C4739d extends C0022b implements C4738c {
    public C4739d() {
        attachInterface(this, "com.google.android.vending.verifier.IPackageVerificationApiService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C4318e c4318e = null;
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                C4879a c4879a;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.vending.verifier.IListHarmfulAppsCallback");
                    if (queryLocalInterface instanceof C4879a) {
                        c4879a = (C4879a) queryLocalInterface;
                    } else {
                        c4879a = new C4880b(readStrongBinder);
                    }
                }
                mo4340a(c4879a);
                break;
            case 2:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.vending.verifier.IVerifyAppsDataCallback");
                    if (queryLocalInterface instanceof C4318e) {
                        c4318e = (C4318e) queryLocalInterface;
                    } else {
                        c4318e = new C4881g(readStrongBinder);
                    }
                }
                mo4341a(c4318e, parcel.readLong());
                break;
            case 3:
                C4318e c4318e2;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c4318e2 = null;
                } else {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.vending.verifier.IVerifyAppsDataCallback");
                    if (queryLocalInterface instanceof C4318e) {
                        c4318e2 = (C4318e) queryLocalInterface;
                    } else {
                        Object c4881g = new C4881g(readStrongBinder);
                    }
                }
                mo4342a(c4318e2, (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
