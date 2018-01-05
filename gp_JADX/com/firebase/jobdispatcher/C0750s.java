package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C0750s extends C0021a implements C0733q {
    C0750s(IBinder iBinder) {
        super(iBinder, "com.firebase.jobdispatcher.IRemoteJobService");
    }

    public final void mo1110a(Bundle bundle, C0738n c0738n) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        C0883c.m5514a(obtainAndWriteInterfaceToken, (IInterface) c0738n);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }

    public final void mo1111a(Bundle bundle, boolean z) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        C0883c.m5516a(obtainAndWriteInterfaceToken, z);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }
}
