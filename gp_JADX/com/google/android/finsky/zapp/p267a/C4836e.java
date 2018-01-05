package com.google.android.finsky.zapp.p267a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;
import java.util.List;

public abstract class C4836e extends C0022b implements C4835d {
    public C4836e() {
        attachInterface(this, "com.google.android.finsky.zapp.protocol.IPlayModuleService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                C4838g c4838g;
                String readString = parcel.readString();
                List createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c4838g = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
                    if (queryLocalInterface instanceof C4838g) {
                        c4838g = (C4838g) queryLocalInterface;
                    } else {
                        c4838g = new C4840i(readStrongBinder);
                    }
                }
                mo4411a(readString, createTypedArrayList, c4838g);
                break;
            case 3:
                mo4410a(parcel.readString(), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
