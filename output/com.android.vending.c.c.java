package com.android.vending.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;

public final class com.android.vending.c.c extends com.google.android.a.a implements com.android.vending.c.a
{

    c(IBinder p0) {
        com.google.android.a.a(p0, "com.android.vending.contentfilters.IContentFiltersService");
    }

    public final Bundle a(int[] p0) {
        v0 = this.obtainAndWriteInterfaceToken();
        v0.writeIntArray(p0);
        v1 = this.transactAndReadException(1, v0);
        v1.recycle();
        return (Bundle)com.google.android.a.c.a(v1, Bundle.CREATOR);
    }

}
