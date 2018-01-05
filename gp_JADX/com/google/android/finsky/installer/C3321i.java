package com.google.android.finsky.installer;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p008a.C0021a;

public final class C3321i extends C0021a implements C3308g {
    C3321i(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.installer.IMultiUserCoordinatorServiceListener");
    }

    public final void mo3463a(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }

    public final void mo3464b(String str) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }
}
