package com.android.vending.p055a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C0626b extends C0021a implements C0625a {
    C0626b(IBinder iBinder) {
        super(iBinder, "com.android.vending.appdiscoveryservice.IAppDiscoveryReceiver");
    }

    public final void mo1050a(int i, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final void mo1049a(int i, int i2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
