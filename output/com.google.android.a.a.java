package com.google.android.a;

import android.os.IBinder;
import android.os.Parcel;

public class com.google.android.a.a implements IInterface
{

    public final String mDescriptor;
    public final IBinder mRemote;

    a(IBinder p0, String p1) {
        this.mRemote = p0;
        this.mDescriptor = p1;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public Parcel obtainAndWriteInterfaceToken() {
        v0 = Parcel.obtain();
        v0.writeInterfaceToken(this.mDescriptor);
        return v0;
    }

    public Parcel transactAndReadException(int p0, Parcel p1) {
        v1 = Parcel.obtain();
        try {
            this.mRemote.transact(p0, p1, v1, 0);
            v1.readException();
        }
        catch (RuntimeException ex) {
            try {
                v1.recycle();
                throw ex;
            }
            catch (Throwable ex) {
                p1.recycle();
                throw ex;
            }
            p1.recycle();
            throw ex;
        }
        catch (Throwable ex) {
            p1.recycle();
            throw ex;
        }
        p1.recycle();
        return v1;
    }

    public void transactAndReadExceptionReturnVoid(int p0, Parcel p1) {
        v1 = Parcel.obtain();
        try {
            this.mRemote.transact(p0, p1, v1, 0);
            v1.readException();
        }
        catch (Throwable ex) {
            p1.recycle();
            v1.recycle();
            throw ex;
        }
        p1.recycle();
        v1.recycle();
    }

    public void transactOneway(int p0, Parcel p1) {
        try {
            this.mRemote.transact(p0, p1, 0, 1);
        }
        catch (Throwable ex) {
            p1.recycle();
            throw ex;
        }
        p1.recycle();
    }

}
