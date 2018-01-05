package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C0749p extends C0021a implements C0738n {
    C0749p(IBinder iBinder) {
        super(iBinder, "com.firebase.jobdispatcher.IJobCallback");
    }

    public final void mo1112a(Bundle bundle, int i) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        obtainAndWriteInterfaceToken.writeInt(i);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
