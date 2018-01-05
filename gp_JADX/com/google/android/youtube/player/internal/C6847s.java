package com.google.android.youtube.player.internal;

import android.os.IBinder;
import android.os.Parcel;

final class C6847s implements C6846r {
    public IBinder f33852a;

    C6847s(IBinder iBinder) {
        this.f33852a = iBinder;
    }

    public final IBinder mo5730a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
            this.f33852a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            return readStrongBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void mo5731a(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f33852a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f33852a;
    }
}
