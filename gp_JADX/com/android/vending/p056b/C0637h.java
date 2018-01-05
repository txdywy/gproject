package com.android.vending.p056b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0637h extends C0022b implements C0636g {
    public C0637h() {
        attachInterface(this, "com.android.vending.billing.IInAppBillingService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        int a;
        Parcelable a2;
        switch (i) {
            case 1:
                a = mo2478a(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            case 2:
                a2 = mo2479a(parcel.readInt(), parcel.readString(), parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 3:
                a2 = mo2482a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 4:
                a2 = mo2480a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 5:
                a = mo2485b(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            case 6:
                parcel.readInt();
                parcel.readString();
                parcel.readString();
                a = mo2477a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            case 7:
                a2 = mo2484a(parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 8:
                a2 = mo2483a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 9:
                a2 = mo2481a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 10:
                a = mo2486b(parcel.readInt(), parcel.readString(), parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            case 11:
                a2 = mo2487b(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 12:
                a = mo2488c(parcel.readInt(), parcel.readString(), parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            default:
                return false;
        }
        return true;
    }
}
