package com.google.vr.p482b.p483a.p484a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;
import com.google.vr.p479a.p480a.C7247j;

public final class C7258h extends a implements C7257g {
    public C7258h(IBinder iBinder) {
        super(iBinder, "com.google.vr.libraries.payments.api.IVrPaymentsApiProvider");
    }

    public final C7255e mo6359a(C7247j c7247j, C7247j c7247j2, C7251b c7251b, C7259i c7259i, C7247j c7247j3) {
        C7255e c7255e;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, c7247j);
        c.a(obtainAndWriteInterfaceToken, c7247j2);
        c.a(obtainAndWriteInterfaceToken, c7251b);
        c.a(obtainAndWriteInterfaceToken, c7259i);
        c.a(obtainAndWriteInterfaceToken, c7247j3);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            c7255e = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.libraries.payments.api.IVrPaymentsApi");
            if (queryLocalInterface instanceof C7255e) {
                c7255e = (C7255e) queryLocalInterface;
            } else {
                c7255e = new C7256f(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return c7255e;
    }
}
