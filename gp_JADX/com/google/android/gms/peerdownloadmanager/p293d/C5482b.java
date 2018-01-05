package com.google.android.gms.peerdownloadmanager.p293d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;
import java.util.List;

public final class C5482b extends C0021a implements C5481a {
    public C5482b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.peerdownloadmanager.internal.IResourceHost");
    }

    public final void mo5024a(C5368c c5368c, List list, List list2, boolean z) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5514a(obtainAndWriteInterfaceToken, (IInterface) c5368c);
        obtainAndWriteInterfaceToken.writeStringList(list);
        obtainAndWriteInterfaceToken.writeStringList(list2);
        C0883c.m5516a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
