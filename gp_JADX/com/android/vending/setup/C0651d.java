package com.android.vending.setup;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0651d extends C0022b implements C0650c {
    public C0651d() {
        attachInterface(this, "com.android.vending.setup.IPlaySetupServiceV2");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        Parcelable a;
        switch (i) {
            case 1:
                mo4011a((ResultReceiver) C0883c.m5513a(parcel, ResultReceiver.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo4010a();
                parcel2.writeNoException();
                break;
            case 3:
                boolean b = mo4016b();
                parcel2.writeNoException();
                C0883c.m5516a(parcel2, b);
                break;
            case 4:
                a = mo4007a(parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 5:
                a = mo4014b(parcel.readString());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 6:
                a = mo4008a(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 7:
                a = mo4009a(parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 8:
                mo4012a((Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 9:
                mo4015b((ResultReceiver) C0883c.m5513a(parcel, ResultReceiver.CREATOR));
                parcel2.writeNoException();
                break;
            case 12:
                a = mo4005a((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 13:
                a = mo4006a((ResultReceiver) C0883c.m5513a(parcel, ResultReceiver.CREATOR), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 14:
                a = mo4013b((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            default:
                return false;
        }
        return true;
    }
}
