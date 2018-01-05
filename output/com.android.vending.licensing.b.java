package com.android.vending.licensing;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;

public final class com.android.vending.licensing.b extends com.google.android.a.a implements com.android.vending.licensing.a
{

    b(IBinder p0) {
        com.google.android.a.a(p0, "com.android.vending.licensing.ILicenseResultListener");
    }

    public final void a(int p0, String p1, String p2) {
        v0 = this.obtainAndWriteInterfaceToken();
        v0.writeInt(p0);
        v0.writeString(p1);
        v0.writeString(p2);
        this.transactOneway(1, v0);
    }

}
