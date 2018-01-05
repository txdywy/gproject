package com.android.vending.p056b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0635f extends C0022b implements C0634e {
    public C0635f() {
        attachInterface(this, "com.android.vending.billing.IFirstPartyInAppBillingService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        int a;
        Parcelable a2;
        switch (i) {
            case 1:
                a = mo2466a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            case 2:
                a2 = mo2467a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 3:
                a2 = mo2469a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 4:
                a2 = mo2468a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            case 5:
                a = mo2471b(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            case 6:
                parcel.readString();
                parcel.readInt();
                parcel.readString();
                parcel.readString();
                a = mo2465a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                break;
            case 7:
                a2 = mo2470a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a2);
                break;
            default:
                return false;
        }
        return true;
    }
}
