package com.android.vending.licensing;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p008a.C0021a;

public final class C0646b extends C0021a implements C0645a {
    C0646b(IBinder iBinder) {
        super(iBinder, "com.android.vending.licensing.ILicenseResultListener");
    }

    public final void mo1052a(int i, String str, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
