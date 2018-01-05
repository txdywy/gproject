package com.android.vending.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;

public final class com.android.vending.a.b extends com.google.android.a.a implements com.android.vending.a.a
{

    b(IBinder p0) {
        com.google.android.a.a(p0, "com.android.vending.appdiscoveryservice.IAppDiscoveryReceiver");
    }

    public final void a(int p0, int p1) {
        v0 = this.obtainAndWriteInterfaceToken();
        v0.writeInt(p0);
        v0.writeInt(p1);
        this.transactAndReadExceptionReturnVoid(2, v0);
    }

    public final void a(int p0, Bundle p1) {
        v0 = this.obtainAndWriteInterfaceToken();
        v0.writeInt(p0);
        com.google.android.a.c.a(v0, p1);
        this.transactAndReadExceptionReturnVoid(1, v0);
    }

}
