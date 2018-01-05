package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5162b;
import com.google.android.gms.internal.ng;

public final class C5132u extends ng implements C5128s {
    public C5132u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final C5161a mo4624a() {
        Parcel a = m23094a(1, cw_());
        C5161a a2 = C5162b.m23905a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int mo4625b() {
        Parcel a = m23094a(2, cw_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
