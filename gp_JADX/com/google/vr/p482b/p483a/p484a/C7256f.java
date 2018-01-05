package com.google.vr.p482b.p483a.p484a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;
import com.google.vr.p479a.p480a.C7241d;
import com.google.vr.p479a.p480a.C7242e;
import com.google.vr.p479a.p480a.C7243f;
import com.google.vr.p479a.p480a.C7244g;
import com.google.vr.p479a.p480a.C7247j;
import com.google.vr.p479a.p480a.C7249l;

public final class C7256f extends a implements C7255e {
    C7256f(IBinder iBinder) {
        super(iBinder, "com.google.vr.libraries.payments.api.IVrPaymentsApi");
    }

    public final C7251b mo6353a() {
        C7251b c7251b;
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            c7251b = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.libraries.payments.api.IActivityDelegate");
            if (queryLocalInterface instanceof C7251b) {
                c7251b = (C7251b) queryLocalInterface;
            } else {
                c7251b = new C7254d(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c7251b;
    }

    public final C7243f mo6352a(String str) {
        C7243f c7243f;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            c7243f = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.INativeEntity");
            if (queryLocalInterface instanceof C7243f) {
                c7243f = (C7243f) queryLocalInterface;
            } else {
                c7243f = new C7244g(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c7243f;
    }

    public final C7247j mo6356b() {
        C7247j c7247j;
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            c7247j = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.IObjectWrapper");
            if (queryLocalInterface instanceof C7247j) {
                c7247j = (C7247j) queryLocalInterface;
            } else {
                c7247j = new C7249l(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c7247j;
    }

    public final void mo6355a(String str, C7247j c7247j) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        c.a(obtainAndWriteInterfaceToken, c7247j);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    public final void mo6357b(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    public final C7241d mo6358c() {
        C7241d c7241d;
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            c7241d = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.internal.lullaby.INativeDispatcher");
            if (queryLocalInterface instanceof C7241d) {
                c7241d = (C7241d) queryLocalInterface;
            } else {
                c7241d = new C7242e(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c7241d;
    }

    public final void mo6354a(C7259i c7259i) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, c7259i);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }
}
