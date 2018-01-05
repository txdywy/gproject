package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class C6837l extends Binder implements C6836k {
    public C6837l() {
        attachInterface(this, "com.google.android.youtube.player.internal.IPlaybackEventListener");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5695a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5698b();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5699c();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5697a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                mo5696a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.youtube.player.internal.IPlaybackEventListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
