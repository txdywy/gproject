package com.google.android.gms.peerdownloadmanager.p293d;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C5369d extends C0022b implements C5368c {
    public C5369d() {
        attachInterface(this, "com.google.android.gms.peerdownloadmanager.internal.IResourceHostCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        mo4982a((ParcelFileDescriptor) C0883c.m5513a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
