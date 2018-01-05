package com.google.android.e;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;

public final class com.google.android.e.b extends com.google.android.a.a implements com.google.android.e.a
{

    b(IBinder p0) {
        com.google.android.a.a(p0, "com.google.android.nfcprovision.ISchoolOwnedService");
    }

    public final boolean a() {
        v0 = this.transactAndReadException(1, this.obtainAndWriteInterfaceToken());
        v0.recycle();
        return com.google.android.a.c.a(v0);
    }

}
