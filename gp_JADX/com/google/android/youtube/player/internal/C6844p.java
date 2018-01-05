package com.google.android.youtube.player.internal;

import android.os.IBinder;
import android.os.Parcel;

final class C6844p implements C6843o {
    public IBinder f33851a;

    C6844p(IBinder iBinder) {
        this.f33851a = iBinder;
    }

    public final void mo5729a(C6830e c6830e, String str, String str2, String str3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
            obtain.writeStrongBinder(c6830e != null ? c6830e.asBinder() : null);
            obtain.writeInt(1201);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(0);
            this.f33851a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f33851a;
    }
}
