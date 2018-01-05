package com.google.android.p254g.p255a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C4881g extends C0021a implements C4318e {
    public C4881g(IBinder iBinder) {
        super(iBinder, "com.google.android.vending.verifier.IVerifyAppsDataCallback");
    }

    public final void mo4122a(boolean z, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5516a(obtainAndWriteInterfaceToken, z);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
