package com.google.android.play.p122c.p246b.p247a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;
import java.util.List;

public final class C6280d extends C0021a implements C6279c {
    C6280d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    public final void mo5370a(int i, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }

    public final void mo5373b(int i, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactOneway(3, obtainAndWriteInterfaceToken);
    }

    public final void mo5374c(int i, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactOneway(4, obtainAndWriteInterfaceToken);
    }

    public final void mo5375d(int i, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactOneway(5, obtainAndWriteInterfaceToken);
    }

    public final void mo5371a(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactOneway(6, obtainAndWriteInterfaceToken);
    }

    public final void mo5372a(List list) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeTypedList(list);
        transactOneway(7, obtainAndWriteInterfaceToken);
    }
}
