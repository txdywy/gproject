package com.firebase.jobdispatcher;

import android.os.IBinder;
import android.os.Parcel;

final class C0745j implements C0744v {
    public final IBinder f4687a;

    public C0745j(IBinder iBinder) {
        this.f4687a = iBinder;
    }

    public final void mo1117a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(i);
            this.f4687a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
