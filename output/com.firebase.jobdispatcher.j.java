package com.firebase.jobdispatcher;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class com.firebase.jobdispatcher.j implements com.firebase.jobdispatcher.v
{

    public final IBinder a;

    j(IBinder p0) {
        this.a = p0;
    }

    public final void a(int p0) {
        v1 = Parcel.obtain();
        v2 = Parcel.obtain();
        try {
            v1.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            v1.writeInt(p0);
            this.a.transact(2, v1, v2, 0);
            v2.readException();
        }
        catch (RemoteException ex) {
            try {
                throw new RuntimeException(ex);
            }
            catch (Throwable ex) {
                v1.recycle();
                v2.recycle();
                throw ex;
            }
            v1.recycle();
            v2.recycle();
            throw ex;
        }
        catch (Throwable ex) {
            v1.recycle();
            v2.recycle();
            throw ex;
        }
        v1.recycle();
        v2.recycle();
    }

}
