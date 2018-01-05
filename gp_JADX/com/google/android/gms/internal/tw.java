package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class tw extends ng implements tv {
    public tw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String mo4886a() {
        Parcel a = m23094a(1, cw_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean mo4887b() {
        Parcel cw_ = cw_();
        ni.m25195a(cw_, true);
        cw_ = m23094a(2, cw_);
        boolean a = ni.m25196a(cw_);
        cw_.recycle();
        return a;
    }
}
