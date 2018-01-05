package com.google.android.finsky.zapp.p267a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;
import java.util.List;

public final class C4840i extends C0021a implements C4838g {
    C4840i(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
    }

    public final void mo4412a(int i, List list, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeTypedList(list);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }
}
