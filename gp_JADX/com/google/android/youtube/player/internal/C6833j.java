package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class C6833j extends Binder implements C6832i {
    public C6833j() {
        attachInterface(this, "com.google.android.youtube.player.internal.IOnFullscreenListener");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                mo5688a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.youtube.player.internal.IOnFullscreenListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
