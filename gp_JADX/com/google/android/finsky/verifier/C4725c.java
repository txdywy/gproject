package com.google.android.finsky.verifier;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C4725c extends C0021a implements C4723a {
    public C4725c(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.verifier.ISingleUserSettingsService");
    }

    public final boolean mo4332a(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken = transactAndReadException(1, obtainAndWriteInterfaceToken);
        boolean a = C0883c.m5517a(obtainAndWriteInterfaceToken);
        obtainAndWriteInterfaceToken.recycle();
        return a;
    }

    public final long mo4333b(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken = transactAndReadException(2, obtainAndWriteInterfaceToken);
        long readLong = obtainAndWriteInterfaceToken.readLong();
        obtainAndWriteInterfaceToken.recycle();
        return readLong;
    }
}
