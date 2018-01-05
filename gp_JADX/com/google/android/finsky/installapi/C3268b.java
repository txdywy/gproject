package com.google.android.finsky.installapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C3268b extends C0022b implements C3267a {
    public C3268b() {
        attachInterface(this, "com.google.android.finsky.installapi.IPlayInstallService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        Parcelable a;
        switch (i) {
            case 1:
                a = mo3401a(parcel.readString(), parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 2:
                a = mo3400a(parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) C0883c.m5513a(parcel, ParcelFileDescriptor.CREATOR), (ResultReceiver) C0883c.m5513a(parcel, ResultReceiver.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            case 3:
                a = mo3399a(parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C0883c.m5518b(parcel2, a);
                break;
            default:
                return false;
        }
        return true;
    }
}
