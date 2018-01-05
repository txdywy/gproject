package com.google.android.p254g.p255a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C4880b extends C0021a implements C4879a {
    public C4880b(IBinder iBinder) {
        super(iBinder, "com.google.android.vending.verifier.IListHarmfulAppsCallback");
    }

    public final void mo4463a(boolean z, byte[] bArr) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5516a(obtainAndWriteInterfaceToken, z);
        obtainAndWriteInterfaceToken.writeByteArray(bArr);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
