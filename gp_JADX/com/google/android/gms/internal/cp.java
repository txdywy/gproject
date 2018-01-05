package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class cp extends ng implements co {
    public cp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.checkin.internal.ICheckinService");
    }

    public final String mo4708a() {
        Parcel a = m23094a(1, cw_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
