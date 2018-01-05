package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public class am extends Binder implements al {
    public am() {
        attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1598968902:
                parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
