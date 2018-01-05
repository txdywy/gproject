package com.google.android.finsky.zapp.p267a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;
import java.util.List;

public final class C4837f extends C0021a implements C4835d {
    public C4837f(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.zapp.protocol.IPlayModuleService");
    }

    public final void mo4411a(String str, List list, C4838g c4838g) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeTypedList(list);
        C0883c.m5514a(obtainAndWriteInterfaceToken, (IInterface) c4838g);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }

    public final void mo4410a(String str, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactOneway(3, obtainAndWriteInterfaceToken);
    }
}
