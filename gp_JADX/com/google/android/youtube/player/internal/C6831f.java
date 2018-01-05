package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class C6831f extends Binder implements C6830e {
    public C6831f() {
        attachInterface(this, "com.google.android.youtube.player.internal.IConnectionCallbacks");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                mo5674a(parcel.readString(), parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.youtube.player.internal.IConnectionCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
