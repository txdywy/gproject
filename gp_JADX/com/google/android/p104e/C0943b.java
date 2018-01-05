package com.google.android.p104e;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C0943b extends C0021a implements C0942a {
    public C0943b(IBinder iBinder) {
        super(iBinder, "com.google.android.nfcprovision.ISchoolOwnedService");
    }

    public final boolean mo1161a() {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        boolean a = C0883c.m5517a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }
}
