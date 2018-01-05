package com.google.vr.p479a.p480a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;

public final class C7244g extends a implements C7243f {
    public C7244g(IBinder iBinder) {
        super(iBinder, "com.google.vr.internal.lullaby.INativeEntity");
    }

    public final long mo6311a() {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        long readLong = transactAndReadException.readLong();
        transactAndReadException.recycle();
        return readLong;
    }

    public final void mo6312a(C7245h c7245h) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, c7245h);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    public final void mo6315a(String str, C7237b c7237b) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        c.a(obtainAndWriteInterfaceToken, c7237b);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    public final void mo6314a(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    public final void mo6313a(C7247j c7247j) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, c7247j);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    public final C7245h mo6317b(String str) {
        C7245h c7245h;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            c7245h = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.INativeEvent");
            if (queryLocalInterface instanceof C7245h) {
                c7245h = (C7245h) queryLocalInterface;
            } else {
                c7245h = new C7246i(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c7245h;
    }

    public final long mo6316b() {
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
        long readLong = transactAndReadException.readLong();
        transactAndReadException.recycle();
        return readLong;
    }
}
