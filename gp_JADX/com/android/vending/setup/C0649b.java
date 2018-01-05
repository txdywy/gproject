package com.android.vending.setup;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0649b extends C0022b implements C0648a {
    public C0649b() {
        attachInterface(this, "com.android.vending.setup.IPlaySetupService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        Parcelable a;
        switch (i) {
            case 1:
                a = mo3992a();
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 2:
                mo3999b();
                parcel2.writeNoException();
                break;
            case 3:
                boolean c = mo4000c();
                parcel2.writeNoException();
                C0883c.m5516a(parcel2, c);
                break;
            case 4:
                a = mo3994a(parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 5:
                mo4001d();
                parcel2.writeNoException();
                break;
            case 6:
                a = mo4002e();
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 7:
                mo4003f();
                parcel2.writeNoException();
                break;
            case 8:
                a = mo3993a((RestoreConfig) C0883c.m5513a(parcel, RestoreConfig.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 9:
                a = mo3995a(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 10:
                mo3998a(parcel.readString(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 11:
                a = mo4004g();
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 12:
                a = mo3996a(parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 13:
                mo3997a((ResultReceiver) C0883c.m5513a(parcel, ResultReceiver.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
