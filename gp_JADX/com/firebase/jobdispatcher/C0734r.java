package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0734r extends C0022b implements C0733q {
    public C0734r() {
        attachInterface(this, "com.firebase.jobdispatcher.IRemoteJobService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                C0738n c0738n;
                Bundle bundle = (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0738n = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.firebase.jobdispatcher.IJobCallback");
                    if (queryLocalInterface instanceof C0738n) {
                        c0738n = (C0738n) queryLocalInterface;
                    } else {
                        c0738n = new C0749p(readStrongBinder);
                    }
                }
                mo1110a(bundle, c0738n);
                break;
            case 2:
                mo1111a((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR), C0883c.m5517a(parcel));
                break;
            default:
                return false;
        }
        return true;
    }
}
