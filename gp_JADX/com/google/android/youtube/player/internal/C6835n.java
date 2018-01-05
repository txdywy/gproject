package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class C6835n extends Binder implements C6834m {
    public C6835n() {
        attachInterface(this, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                mo5689a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                mo5690a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                mo5691b();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                mo5693c();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                mo5694d();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                mo5692b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
