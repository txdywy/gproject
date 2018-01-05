package com.google.android.play.p122c.p246b.p247a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;
import java.util.List;

public abstract class C4214b extends C0022b implements C4213a {
    public C4214b() {
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C6279c c6279c = null;
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        String readString;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        int readInt;
        switch (i) {
            case 2:
                readString = parcel.readString();
                List createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                C0883c.m5513a(parcel, Bundle.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (queryLocalInterface instanceof C6279c) {
                        c6279c = (C6279c) queryLocalInterface;
                    } else {
                        c6279c = new C6280d(readStrongBinder);
                    }
                }
                mo4022a(readString, createTypedArrayList, c6279c);
                break;
            case 3:
                readString = parcel.readString();
                readInt = parcel.readInt();
                C0883c.m5513a(parcel, Bundle.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (queryLocalInterface instanceof C6279c) {
                        c6279c = (C6279c) queryLocalInterface;
                    } else {
                        c6279c = new C6280d(readStrongBinder);
                    }
                }
                mo4020a(readString, readInt, c6279c);
                break;
            case 4:
                readString = parcel.readString();
                readInt = parcel.readInt();
                C0883c.m5513a(parcel, Bundle.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (queryLocalInterface instanceof C6279c) {
                        c6279c = (C6279c) queryLocalInterface;
                    } else {
                        c6279c = new C6280d(readStrongBinder);
                    }
                }
                mo4023b(readString, readInt, c6279c);
                break;
            case 5:
                readString = parcel.readString();
                readInt = parcel.readInt();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (queryLocalInterface instanceof C6279c) {
                        c6279c = (C6279c) queryLocalInterface;
                    } else {
                        c6279c = new C6280d(readStrongBinder);
                    }
                }
                mo4024d(readString, readInt, c6279c);
                break;
            case 6:
                readString = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
                    if (queryLocalInterface instanceof C6279c) {
                        c6279c = (C6279c) queryLocalInterface;
                    } else {
                        c6279c = new C6280d(readStrongBinder2);
                    }
                }
                mo4021a(readString, c6279c);
                break;
            default:
                return false;
        }
        return true;
    }
}
