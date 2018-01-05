package com.google.vr.p479a.p480a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;

public final class C7242e extends a implements C7241d {
    public C7242e(IBinder iBinder) {
        super(iBinder, "com.google.vr.internal.lullaby.INativeDispatcher");
    }

    public final void mo6310a(String str, String str2, C7237b c7237b) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        c.a(obtainAndWriteInterfaceToken, c7237b);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    public final void mo6309a(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    public final long mo6308a() {
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
        long readLong = transactAndReadException.readLong();
        transactAndReadException.recycle();
        return readLong;
    }
}
