package com.google.android.finsky.installer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C3320f extends C0021a implements C3318d {
    public C3320f(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.installer.IMultiUserCoordinatorService");
    }

    public final void mo3466a(C3308g c3308g) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5514a(obtainAndWriteInterfaceToken, (IInterface) c3308g);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final boolean mo3467a(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken = transactAndReadException(2, obtainAndWriteInterfaceToken);
        boolean a = C0883c.m5517a(obtainAndWriteInterfaceToken);
        obtainAndWriteInterfaceToken.recycle();
        return a;
    }

    public final void mo3468b(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void mo3465a() {
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
    }
}
